package com.ambow.ects.dao.impl;

import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.ambow.ecport.exception.ManagerProductException;
import com.ambow.ects.dao.IProductDao;
import com.ambow.ects.entity.Product;
import com.ambow.ects.util.HibernateUtils;


public class ProductDaoImp implements IProductDao {

	public Product findById(Integer id) throws ManagerProductException {
		Session session = null;
		Transaction tran = null;
		Product product = null;
		try {
			session = HibernateUtils.getSession();
			tran = session.beginTransaction();
			product = (Product) session.get(Product.class, id);
			tran.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tran.rollback();
			throw new ManagerProductException(e.getMessage());
		} finally {
			session.close();
			return product;
		}
	}

	public Collection findAll() throws ManagerProductException {
		Session session = null;
		Transaction tran = null;
		Collection list = null;
		try {
			session = HibernateUtils.getSession();
			tran = session.beginTransaction();
			list = session.createQuery(" from Product ").list();
			tran.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tran.rollback();
			throw new ManagerProductException(e.getMessage());
		} finally {
			session.close();
			return list;
		}
	}

	public Collection find(int start, int max) throws ManagerProductException {
		Session session = null;
		Transaction tran = null;
		Collection list = null;
		try {
			session = HibernateUtils.getSession();
			tran = session.beginTransaction();
			Query query = session.createQuery(" from Product ");
			query.setFirstResult(start);
			query.setMaxResults(max);
			list = query.list();
			tran.commit();
		} catch (Exception e) {
			tran.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			return list;
		}

	}

	public int getTotal() throws ManagerProductException {
		Session session = null;
		Transaction tran = null;
		int total = 0;
		try {
			session = HibernateUtils.getSession();
			tran = session.beginTransaction();
			Query query = session
					.createQuery(" select  count(*) from  Product ");
			total = ((Integer) query.uniqueResult()).intValue();
			tran.commit();
		} catch (Exception e) {
			tran.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			return total;
		}

	}
//此方法用于动态条件查询
	public Collection find(Product product) throws ManagerProductException {
		Session session = null;
		Transaction tran = null;
		Collection list = null;
		try {
			session = HibernateUtils.getSession();
			tran = session.beginTransaction();
			Criteria crit = session.createCriteria(Product.class);
			if (product.getAuthor().equals("")) {
				crit.add(Restrictions.like("author", "%"));
			} else {
				crit.add(Restrictions.like("author", "%" + product.getAuthor()
						+ "%"));
			}
			if (product.getName().equals("")) {
				crit.add(Restrictions.like("name", "%"));
			} else {
				crit.add(Restrictions.like("name", "%" + product.getName()
						+ "%"));
			}
			if (product.getPublish().equals("")) {
				crit.add(Restrictions.like("publish", "%"));
			} else {
				crit.add(Restrictions.like("publish", "%"
						+ product.getPublish() + "%"));
			}
			list = crit.list();
			tran.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tran.rollback();
		} finally {
			session.close();
			return list;
		}

	}

	/*public static void main(String[] args) throws Exception {
		ProductDaoImp imp = new ProductDaoImp();
		Product p = new Product();
		p.setAuthor("孙");
		System.out.println(imp.find(p).size());

	}*/

}
