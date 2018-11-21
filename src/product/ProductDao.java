package product;

import java.util.ArrayList;

import frame.Dao;

public class ProductDao implements Dao<String, Product> {

	@Override
	public void insert(Product v) {
		// TODO Auto-generated method stub
		System.out.println(v);
		System.out.println("Inserted ...");
	}

	@Override
	public void delete(String k) {
		// TODO Auto-generated method stub
		System.out.println(k);
		System.out.println("Deleted...");
	}

	@Override
	public void update(Product v) {
		// TODO Auto-generated method stub
		System.out.println(v);
		System.out.println("Updated ...");
	}

	@Override
	public Product select(String k) {
		// TODO Auto-generated method stub
		return new Product("id01","pwd01","james",10);
	}

	@Override
	public ArrayList<Product> select() {
		// TODO Auto-generated method stub
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product("id34","pwd34","Kim",34));
		list.add(new Product("id35","pwd35","Lee",35));
		list.add(new Product("id36","pwd36","Han",36));
		list.add(new Product("id37","pwd37","Hong",37));
		list.add(new Product("id38","pwd38","Jun",38));
		return list;
	}

}
