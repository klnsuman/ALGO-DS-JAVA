package BasicThinking;

public class SubStrTest {

	public static void substr(String key){
		
		System.out.println(key);
		if(key.substring(1).length()>=1){
			substr(key.substring(1));
		}
		return;
	}
	public static void main(String[] args) {
		
		substr("Cat");
	}

}
