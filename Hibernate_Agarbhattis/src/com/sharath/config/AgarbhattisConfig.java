package com.sharath.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.sharath.dto.AgarbhattisDto;

public class AgarbhattisConfig {

	public static SessionFactory sf;

	public static SessionFactory getSessionFactory() {
		Configuration con = new Configuration();
		Properties properties = new Properties();

		if (sf == null) {

			properties.setProperty(Environment.URL, "jdbc:mysql://localhost/hibernatee");
			properties.setProperty(Environment.USER, "root");
			properties.setProperty(Environment.PASS, "Sathish@123@");
			properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
//			properties.setProperty(Environment.HBM2DDL_AUTO, "create-drop");

			con.addAnnotatedClass(AgarbhattisDto.class);
			con.setProperties(properties);

			ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

			sf = con.buildSessionFactory(registry);

			return sf;
		}
		return sf;

	}

}
