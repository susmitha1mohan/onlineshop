package model.daoimpl;
import org.hibernate.Session;

import model.config.HibernateUtil;
import model.dao.IProductDAO;
import model.entity.Product;
import org.hibernate.Session;

import model.config.HibernateUtil;
import model.dao.IProductDAO;
import model.entity.Product;

public class ProductDAOImpl implements IProductDAO {
	private Session sess;
	public ProductDAOImpl()
	{
		sess = HibernateUtil.getSessionFactory().openSession();
	}
	
	public boolean insertProduct(Product p) {
		boolean b = true;
		try
		{
			sess.beginTransaction();
			sess.save(p);
			sess.getTransaction().commit();
			
		}catch(Exception ex)
		{
			b = false;
			sess.getTransaction().rollback();
			ex.printStackTrace();
		}
		
		return b;
	}


}
