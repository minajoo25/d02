package cust;

import java.util.ArrayList;

import frame.Biz;
import frame.Dao;

public class CustBiz implements Biz<String, Cust> {
	
	Dao dao;
	
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void register(Cust v) {
		// TODO Auto-generated method stub
		dao.insert(v);
	}

	@Override
	public void remove(String k) {
		// TODO Auto-generated method stub
		dao.delete(k);
	}

	@Override
	public void modify(Cust v) {
		// TODO Auto-generated method stub
		dao.update(v);
	}

	@Override
	public Cust get(String k) {
		// TODO Auto-generated method stub
		return (Cust) dao.select(k);
	}

	@Override
	public ArrayList<Cust> get() {
		// TODO Auto-generated method stub
		return dao.select();
	}

}
