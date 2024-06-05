package com.sharath.hibernate.repo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sharath.hibernate.configuration.TrimmerConfiguration;
import com.sharath.hibernate.dto.TrimmerDto;

public class TrimmerRepoImpl implements TrimmerRepo {

	@Override
	public boolean save(TrimmerDto... dto) {

		Session s = TrimmerConfiguration.getSessionFactory().openSession();
		System.out.println(s);
		if (s != null) {
			Transaction transaction = s.beginTransaction();
			for (TrimmerDto dd : dto) {
				s.save(dd);

			}
			transaction.commit();
			s.close();
			return true;
		}

		return false;
	}

	@Override
	public List readAll() {
		Session s = TrimmerConfiguration.getSessionFactory().openSession();
		Transaction transaction = s.beginTransaction();
		Criteria c = s.createCriteria(TrimmerDto.class);
		List s1 = c.list();
		transaction.commit();
		s.close();
		return s1;
	}

	@Override
	public List readById(int... id) {

		Session s = TrimmerConfiguration.getSessionFactory().openSession();
		List<TrimmerDto> list = new ArrayList<TrimmerDto>();
		Transaction transaction = s.beginTransaction();

		for (int id1 : id) {
			list.add(s.get(TrimmerDto.class, id1));
		}
		transaction.commit();
		s.close();
		return list;
	}

	@Override
	public boolean updateColorByName(String color, String name) {

		Session s = TrimmerConfiguration.getSessionFactory().openSession();
		Transaction transaction = s.beginTransaction();
		List<TrimmerDto> list = readAll();
		if (!list.isEmpty()) {
			for (TrimmerDto dd : list) {
				if (name.equals(dd.getBrand())) {
					dd.setColor(color);
					s.update(dd);
				}
			}
			transaction.commit();
			s.close();
			return true;
		}

		return false;
	}

	@Override
	public boolean deleteByNameColorAndPrice(String name, String color, int price) {

		Session s = TrimmerConfiguration.getSessionFactory().openSession();
		Transaction transaction = s.beginTransaction();
		List<TrimmerDto> list = readAll();

		for (TrimmerDto dd : list) {

			if (name.equalsIgnoreCase(dd.getBrand()) && color.equalsIgnoreCase(color) && price == dd.getPrice()) {
				s.delete(dd);
			}
		}

		transaction.commit();
		s.close();

		return true;
	}

}
