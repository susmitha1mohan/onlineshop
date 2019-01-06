package model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import config.DbConfig;
import model.entity.Product;
import model.entity.ProductDetail;

public class ProductDAO {
	private DbConfig db;
	private Session sess;
	private Transaction ts;
	public ProductDAO()
	{
		db = new DbConfig();
		sess = db.getSess();
	}
	
		public boolean insertProduct(Product p)
		{
			boolean b = true;
			try
			{
				ts = sess.beginTransaction();
				sess.save(p);
				ts.commit();
			}catch(Exception ex)
			{
				ts.rollback();
				b=false;
				ex.printStackTrace();
			}
			return b;
		}
		public List<Product> getProducts()
		{
			List<Product> lp = null;
			try
			{
				sess.beginTransaction();
				lp = sess.createQuery("from Product",Product.class).getResultList();		
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
			return lp;
		}	
		
		public List<ProductDetail> getProductDetails()
		{
			List<ProductDetail> lp = null;
			try
			{
				sess.beginTransaction();
				lp = sess.createQuery("from ProductDetail",ProductDetail.class).getResultList();		
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
			return lp;
		}
		
		public boolean deleteProduct(Product p)
		{
			boolean b = true;
			try
			{
				sess.beginTransaction();
				sess.delete(p);
				sess.getTransaction().commit();
			}catch(Exception ex)
			{
				sess.getTransaction().rollback();
				b = false;
			}
			return b;
		}
		
		
			
		}


