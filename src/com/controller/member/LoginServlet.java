package com.controller.member;

import java.io.IOException;
import java.util.HashMap;

import javax.activation.MailcapCommandMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;
import com.sun.javafx.collections.MappingChange.Map;

/**
 * Servlet implementation class MemberUIServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		//id, pass이용 map 생성
		//service.login(map)이용 사용자 정보를  MemberDTO로 리턴 
		//db에 아이디 패스가 존재하면 session에 membreDTO저장
		//main.jsp로 이동, 없는 경우 LoginUIservlet으로 요청
		String userid=request.getParameter("userid");
		String passwd=request.getParameter("passwd");
		HashMap<String,String> map=new HashMap<String, String>();
		map.put("userid", userid);
		map.put("passwd", passwd);
		MemberService service=new MemberService();
		MemberDTO dto =service.login(map);
		String nextPage=null;
		
		if(dto !=null) {
			nextPage="main";
			HttpSession session=request.getSession();
			session.setAttribute("login", dto);
		}else {
			nextPage="LoginUIServlet";
		}
		response.sendRedirect(nextPage);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
