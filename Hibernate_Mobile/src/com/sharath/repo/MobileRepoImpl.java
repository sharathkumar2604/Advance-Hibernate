package com.sharath.repo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sharath.config.MobileConfiguration;
import com.sharath.dto.MobileDto;

public class MobileRepoImpl implements MobileRepo, Comparator<MobileDto> {

	@Override
	public boolean saveAndSaveAll(MobileDto... dtos) {

		Session session = MobileConfiguration.getSessionConn().openSession();

		if (session != null) {
			Transaction transaction = session.beginTransaction();

			for (MobileDto d : dtos) {
				session.save(d);
			}

			transaction.commit();
			session.close();
			return true;
		}

		return false;
	}

	@Override
	public List<MobileDto> readAll() {

		Session session = MobileConfiguration.getSessionConn().openSession();

		Criteria c = session.createCriteria(MobileDto.class);

		List<MobileDto> l = c.list();

		return l;

	}

	@Override
	public List<MobileDto> readByName(String... name) {

		List<MobileDto> readAl = readAll();
		List<MobileDto> result = new ArrayList<MobileDto>();

		for (String nam : name) {
			for (MobileDto d : readAl) {
				if (nam.equalsIgnoreCase(d.getName())) {
					result.add(d);

				}

			}
		}

		return result;
	}

	@Override
	public List<MobileDto> readById(int... id) {

		Session session = MobileConfiguration.getSessionConn().openSession();
		List<MobileDto> l = new ArrayList<MobileDto>();
		for (int d : id) {
			MobileDto dto = session.get(MobileDto.class, d);
			l.add(dto);
		}
		return l;
	}

	@Override
	public int compare(MobileDto o1, MobileDto o2) {

		Integer i1 = o1.getId();
		Integer i2 = o2.getId();

		return i1.compareTo(i2);
	}

	@Override
	public boolean updatePriceByName(int price, String name) {

		Session session = MobileConfiguration.getSessionConn().openSession();
		List<MobileDto> list = readAll();

		if (session != null) {
			Transaction transaction = session.beginTransaction();
			for (MobileDto d : list) {

				if (name.equalsIgnoreCase(d.getName())) {
					d.setPrice(price);
					session.update(d);
				}
			}
			transaction.commit();
			session.close();

			return true;
		}

		return false;
	}

	@Override
	public boolean deleteByName(String name) {

		Session session = MobileConfiguration.getSessionConn().openSession();
		List<MobileDto> list = readAll();

		if (session != null) {
			Transaction transaction = session.beginTransaction();
			for (MobileDto d : list) {

				if (name.equalsIgnoreCase(d.getName())) {
					session.remove(d);
				}
			}
			transaction.commit();
			session.close();

			return true;
		}

		return false;
	}

}
