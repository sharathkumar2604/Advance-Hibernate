package com.sharath.repo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sharath.config.AgarbhattisConfig;
import com.sharath.dto.AgarbhattisDto;

public class AgarbhattisRepoImpl implements AgarbhattisRepo {

	@Override
	public boolean saveAndSaveAll(AgarbhattisDto... dtos) {

		Session session = AgarbhattisConfig.getSessionFactory().openSession();

		if (session != null) {
			Transaction transaction = session.beginTransaction();

			for (AgarbhattisDto dto : dtos) {
				session.save(dto);
			}
			transaction.commit();
			session.close();
			return true;
		}

		return false;

	}

	@Override
	public List<AgarbhattisDto> readAll() {

		Session session = AgarbhattisConfig.getSessionFactory().openSession();

		Criteria c = session.createCriteria(AgarbhattisDto.class);

		List<AgarbhattisDto> ls = c.list();

		return ls;
	}

	@Override
	public List<AgarbhattisDto> readByName(String... name) {

		List<AgarbhattisDto> read = readAll();
		List<AgarbhattisDto> dd = new ArrayList<AgarbhattisDto>();

		for (String na : name) {
			for (AgarbhattisDto d : read) {
				if (na.equalsIgnoreCase(d.getBrand())) {
					dd.add(d);
				}
			}
		}

		return dd;
	}

	@Override
	public List<AgarbhattisDto> readById(int... id) {

		List<AgarbhattisDto> d = new ArrayList<AgarbhattisDto>();

		Session session = AgarbhattisConfig.getSessionFactory().openSession();

		for (int t : id) {
			AgarbhattisDto dto = session.get(AgarbhattisDto.class, t);
			d.add(dto);
		}

		return d;
	}

	@Override
	public boolean updatePriceByBrandAndFlover(int price, String brand, String flover) {
		Session session = AgarbhattisConfig.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		boolean b = false;
		if (session != null) {
			List<AgarbhattisDto> list = readAll();

			for (AgarbhattisDto d : list) {
				if (brand.equalsIgnoreCase(d.getBrand()) && flover.equalsIgnoreCase(d.getFlovor())) {
					d.setBrand(brand);
					session.update(d);
					b = true;
				}
			}
			if (b) {
				t.commit();
				session.close();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteByName(String brand) {
		Session session = AgarbhattisConfig.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		
		boolean b = false;
		if (session != null) {
			List<AgarbhattisDto> list = readAll();

			for (AgarbhattisDto d : list) {
				if (brand.equalsIgnoreCase(d.getBrand())) {
					session.remove(d);
					b = true;
				}
			}
			if (b) {
				t.commit();
				session.close();
				return true;
			}
		}
		return false;

}
}
