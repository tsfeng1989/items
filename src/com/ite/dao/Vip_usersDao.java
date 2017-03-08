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
	
	//添加数据
	public boolean addvip(Vip_users v){
		return addObject(v)!=null?true:false;
	}
	
	//查询全部数据
	public List findAll(String hql){
		List list = executeQuery(hql);
		return list;
	}
	//执行SQL语句
	public SQLQuery executionSQL(String sql){
		return executeSQL(sql);
	}
}
