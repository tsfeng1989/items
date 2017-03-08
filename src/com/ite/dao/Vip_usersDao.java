package com.ite.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;

import com.ite.entity.Vip_users;

/**
 * 
 * @author Forever
 *
 */
@Repository("vipDao")
public class Vip_usersDao extends BaseDao{
	
	//�������
	public boolean addvip(Vip_users v){
		return addObject(v)!=null?true:false;
	}
	
	//��ѯȫ������
	public List findAll(String hql){
		List list = executeQuery(hql);
		return list;
	}
	//ִ��SQL���
	public SQLQuery executionSQL(String sql){
		return executeSQL(sql);
	}
}
