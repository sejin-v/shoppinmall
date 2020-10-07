<%@page import="com.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	MemberDTO dto=(MemberDTO)session.getAttribute("login");
	if(dto!=null){
%>
<link rel="stylesheet"  href="css/mystyle.css" />
<h1>환영합니다 <%=dto.getUserid() %></h1>
<div class="top">
<a href="LogoutServlet">로그아웃</a>
<a href="CartListServlet">장바구니</a>
<a href="MyPageServlet">mypage</a>
</div >
<%}else{ %>
<div class="top">
<a href="LoginUIServlet">로그인</a>
<a href="MemberUIServlet">회원가입</a>

</div>
<%} %>