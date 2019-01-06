package model.dao;

import config.HibernateUtil;
import model.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import config.DbConfig;
import config.HibernateUtil;
import model.entity.Customer;
public class CustomerDAO {
	private Session sess;
	private Transaction ts;
	public CustomerDAO()
	{
		sess = HibernateUtil.getSessionFactory().openSession();
	}
	
		public boolean insertCustomer(Customer c)
		{
			boolean b = true;
			try
			{
				ts = sess.beginTransaction();
				sess.save(c);
				ts.commit();
			}catch(Exception ex)
			{
				ts.rollback();
				b=false;
				ex.printStackTrace();
			}
			return b;
		}

}
