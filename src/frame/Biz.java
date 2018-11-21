package frame;

import java.util.ArrayList;

public interface Biz<K,V> {
	public void register(V v);
	public void remove(K k);
	public void modify(V v);
	public V get (K k);
	public ArrayList<V> get();
	
}
