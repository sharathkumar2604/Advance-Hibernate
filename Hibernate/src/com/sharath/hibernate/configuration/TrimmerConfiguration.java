package com.sharath.hibernate.configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.dialect.Dialect;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

import com.sharath.hibernate.dto.TrimmerDto;

public class TrimmerConfiguration {

	public static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory()

	{
		if (sessionFactory == null) {
			Configuration config = new Configuration();
			Properties prop = new Properties();
			prop.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate");
			prop.put(Environment.USER, "root");
			prop.put(Environment.PASS, "Sathish@123@");
			prop.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			prop.put(Environment.SHOW_SQL, true);
			prop.put(Environment.HBM2DDL_AUTO, "update");
			config.setProperties(prop);
			config.addAnnotatedClass(TrimmerDto.class);
//System.out.println("askdhfsadkfj");
			ServiceRegistry service = new StandardServiceRegistryBuilder().applySettings(config.getProperties())
					.build();

			sessionFactory = config.buildSessionFactory(service);

			return sessionFactory;

		}

		return sessionFactory;

	}

}
