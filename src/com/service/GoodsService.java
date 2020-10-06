package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;

import com.config.MySqlSessionFactory;
import com.dao.GoodsDAO;
import com.dao.MemberDAO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;

public class GoodsService {

	public List<GoodsDTO> goodsList(String gCategory) {
		SqlSession session = MySqlSessionFactory.getSession();
		GoodsDAO dao = new GoodsDAO();
		List<GoodsDTO>list;
		try {
			list =dao.goodsList(session, gCategory);
			session.commit();
		} finally {
			session.close();
		}
	
		return list;
	}// end idCheck
	public GoodsDTO gooodsRetrieve(String gCode) {
		SqlSession session =MySqlSessionFactory.getSession();
		GoodsDTO dto=new GoodsDTO();
		try {
			GoodsDAO dao=new GoodsDAO();
			dto=dao.gooodsRetrieve(session,gCode);
			session.commit();
		} finally {
			session.close();
		}
		return dto;
	}
}// end class
