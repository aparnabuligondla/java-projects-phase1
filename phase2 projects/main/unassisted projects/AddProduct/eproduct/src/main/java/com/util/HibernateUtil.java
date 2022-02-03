package com.util;


	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;

	import com.eproduct.EProduct;

	public class HibernateUtil {
		
		public static SessionFactory buildSessionFactory() {
			
			//step1
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(EProduct.class);
			
			//step2
			SessionFactory sf = cfg.buildSessionFactory();
			
			
			return sf;
			
		}

	}
