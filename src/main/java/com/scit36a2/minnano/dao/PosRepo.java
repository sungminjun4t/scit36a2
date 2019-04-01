package com.scit36a2.minnano.dao;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.scit36a2.minnano.vo.Payment;

import com.scit36a2.minnano.vo.Sales_state;


@Repository
public class PosRepo {
	//이중 insert.....
	@Autowired
	SqlSession session;

	public int insertSasSad(HashMap<String, Object> map) {
		PosDAO mapper = session.getMapper(PosDAO.class);
		int result = mapper.insertSasSad(map);
		
		return result;
	}


	
	public int insertPayment(Payment payment) {
		PosDAO mapper = session.getMapper(PosDAO.class);
		int result = mapper.insertPayment(payment);
		return result;
	}
	
	public ArrayList<HashMap<String,Object>> selectPOSone(int comp_seq)	{
		PosDAO mapper = session.getMapper(PosDAO.class);
		ArrayList<HashMap<String,Object>> result = mapper.selectPOSone(comp_seq);
		return result;
	}
	
	public ArrayList<HashMap<String, Object>>selectPOStwo(int comp_seq) {
		PosDAO dao = session.getMapper(PosDAO.class);
		ArrayList<HashMap<String,Object>> result = dao.selectPOStwo(comp_seq);
		return result;
	}
	
	public int deleteSasSadPay(int comp_seq)	{
		PosDAO mapper = session.getMapper(PosDAO.class);
		int result = mapper.deleteSasSadPay(comp_seq);
		return result;
	}
	
	public int updatePOStwo(Sales_state sales_state)	{
		PosDAO mapper = session.getMapper(PosDAO.class);
		int result = mapper.updatePOStwo(sales_state);
		return result;
		
	}
	

	
}
