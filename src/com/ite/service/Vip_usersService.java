package com.ite.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ite.dao.Vip_usersDao;
import com.ite.entity.Vip_users;

/**
 * 
 * @author Forever
 *
 */
@Service("vipService")
public class Vip_usersService {
	@Resource(name="vipDao")
	public Vip_usersDao vipDao;

	//�������
	public boolean addvip(Vip_users v){
		return vipDao.addvip(v);
	}
	
	//��ѯȫ������
	public List findAll(){
		String hql = "from Vip_users";
		return vipDao.findAll(hql);
	}
	
	//SQL��ѯȫ������
	public List finAllTwo(){
		String sql = "select * from tb_Vip_users";
		return vipDao.executionSQL(sql).list();
	}
	//SQL�޸���Ʒ״̬
	/**
	 * 
	 * @param id
	 * @param ״̬��0/1��
	 * @return
	 */
	public boolean update(int id,int s){
		//�ϼܣ�0���¼ܣ�1����Ҫô�ϼ�Ҫô�¼�
		if(s==0){s = 1;}
		else{s=0;}
		String sql = "update tb_Vip_users set status="+s+" where item_id="+id;
		return vipDao.executionSQL(sql).executeUpdate()>0?true:false;
		
	}
	
	public void setVipDao(Vip_usersDao vipDao) {
		this.vipDao = vipDao;
	}
}
