package com.sharath.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.sharath.dto.MobileDto;

public class MobileConfiguration {

	public static SessionFactory sf;

	public static SessionFactory getSessionConn() {

		if (sf == null) {

			Configuration con = new Configuration();
			Properties properties = new Properties();

			properties.setProperty(Environment.URL, "jdbc:mysql://localhost/hibernatee");
			properties.setProperty(Environment.USER, "root");
			properties.setProperty(Environment.PASS, "Sathish@123@");
			properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
//			properties.setProperty(Environment.HBM2DDL_AUTO, "create-drop");

			con.addAnnotatedClass(MobileDto.class);
			con.setProperties(properties);

			ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

			sf = con.buildSessionFactory(sr);

			return sf;
		}

		return sf;
	}

}
