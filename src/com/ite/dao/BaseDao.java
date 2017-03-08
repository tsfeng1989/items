package com.ite.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
@Repository
public class BaseDao {

	@Resource
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	//ִ����ӵĹ�������
		public Object addObject(Object obj){
			try {
				getSession().save(obj);
				return obj;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		//ִ���޸ĵĹ�������
		public boolean updateObject(Object obj){
			try {
				getSession().update(obj);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}

		//ִ��ɾ���Ĺ�������
		public boolean deleteObject(Object obj){
			try {
				getSession().delete(obj);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
		
		/**
		 * ��������Id��ȡ����ķ���
		 * @param cls ���������
		 * @param id  Id����
		 * @return
		 */
		@SuppressWarnings("rawtypes")
		public Object get(Class cls,Serializable id){
			Object obj = null;
			try {
				obj=getSession().get(cls, id);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return obj;
		}
		
		//������ѯ����
		public List executeQuery(String hql){
			List l = getSession().createQuery(hql).list();
			System.out.println("---BaseDao---"+l);

			return  l; 
		}
		
		/**
		 * ִ��Դ��SQL���
		 * @param sql
		 * @return SQLQuery 
		 */
		public SQLQuery executeSQL(String sql){
			return getSession().createSQLQuery(sql);
		}
}
