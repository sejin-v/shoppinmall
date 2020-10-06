package com.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.dto.GoodsDTO;

public class GoodsDAO {

   public List<GoodsDTO> goodsList(SqlSession session, String gCategory) {
	   List<GoodsDTO> list =session.selectList("GoodsMapper.goodsList",gCategory);
	   return list;
   }
   public GoodsDTO gooodsRetrieve(SqlSession session, String gCode) {
	   GoodsDTO dto=session.selectOne("GoodsMapper.gooodsRetrieve",gCode);
	   return dto;
   }
}
