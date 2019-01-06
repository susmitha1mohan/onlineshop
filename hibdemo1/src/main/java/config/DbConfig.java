package config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import model.entity.Customer;
import model.entity.Product;

public class DbConfig {
	private Configuration cfg;
	private SessionFactory sf;
	private Session sess;
	
	public DbConfig()
	{
		cfg = new Configuration();
		cfg.addAnnotatedClass(Product.class);
		cfg.addAnnotatedClass(Customer.class);
		sf = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
	}
	
	public Session getSess()
	{
		sess = sf.openSession();
		return sess;
	}
	

}
