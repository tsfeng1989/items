package com.ite.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.ite.entity.Vip_users;
import com.ite.service.Vip_usersService;
import com.opensymphony.xwork2.ActionContext;

/**
 * 
 * @author Forever
 *
 */
@Controller("vipAction")
@Scope("prototype")
public class Vip_usersAction {
	@Resource(name="vipService")
	private Vip_usersService vipService;
	
	private Vip_users v;

	//��ѯȫ������
	public String findAll(){
		//List list = vipService.findAll();
		List list = vipService.finAllTwo();
		ActionContext.getContext().put("clist", list);
		return "list";
	}
	//�������
	public String add(){
		boolean bl = vipService.addvip(v);
		System.out.println("-----------"+bl);
		if(bl){
			return "input";
		}
		return "error";
	}
	
	//�޸���Ʒ״̬
	public String update(){
		if(vipService.update(v.getItem_id(), v.getStatus())){
			return "input";
		}
		return "error";
	}
	
	//����״̬��ѯ����
	public String findByStatus(){
		List list = vipService.findByStatus(v.getStatus());
		ActionContext.getContext().put("clist", list);
		return "list";
	}
	
	
	public Vip_users getV() {
		return v;
	}

	public void setV(Vip_users v) {
		this.v = v;
	}

	public void setVipService(Vip_usersService vipService) {
		this.vipService = vipService;
	}
}
