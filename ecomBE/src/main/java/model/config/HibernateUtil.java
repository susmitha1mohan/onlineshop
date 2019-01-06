package model.config;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import model.entity.Product;

public class HibernateUtil {
	private static StandardServiceRegistry registry;
	private static SessionFactory sf;
	
	public static SessionFactory getSessionFactory() {
		if(sf == null)
		{
			try
			{
				StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();
				
				Map<String, String> settings = new HashMap<String, String>();
				settings.put(Environment.DRIVER, "org.h2.Driver");
				settings.put(Environment.URL, "jdbc:h2:tcp://localhost/~/ECommerce");
				settings.put(Environment.USER, "sa");
				settings.put(Environment.PASS, "sa123");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.H2Dialect");
				settings.put(Environment.HBM2DDL_AUTO, "create");
				settings.put(Environment.SHOW_SQL, "true");
				
				registryBuilder.applySettings(settings);
				
				registry = registryBuilder.build();
				
				MetadataSources sources = new MetadataSources(registry);
				sources.addAnnotatedClass(Product.class);
				
				Metadata md = sources.getMetadataBuilder().build();
				sf = md.getSessionFactoryBuilder().build();
				
				
				
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return sf;
	}
	
	public static void shutdown() {
		if(registry !=null)
		{
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

}
