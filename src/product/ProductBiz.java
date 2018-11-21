package product;

import java.util.ArrayList;

import frame.Biz;
import frame.Dao;

public class ProductBiz implements Biz<String, Product> {
	
	
	Dao dao;
	
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void register(Product v) {
		// TODO Auto-generated method stub
		dao.insert(v);
	}

	@Override
	public void remove(String k) {
		// TODO Auto-generated method stub
		dao.delete(k);
	}

	@Override
	public void modify(Product v) {
		// TODO Auto-generated method stub
		dao.update(v);
	}

	@Override
	public Product get(String k) {
		// TODO Auto-generated method stub
		return (Product)dao.select(k);
	}

	@Override
	public ArrayList<Product> get() {
		// TODO Auto-generated method stub
		return dao.select();
	}

}
