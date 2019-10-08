package cache;

public interface ICache {

	public void add(String key,Integer value);
	public void display();
	public void get(String key);
}
