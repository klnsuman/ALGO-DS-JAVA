package cache;

public interface ICache {
	public void add(String key,Integer value);
	public void display();
	public int get(String key);
	public int capacity();
}