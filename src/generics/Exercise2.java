package generics;

import java.util.Map;
import java.util.TreeMap;

public class Exercise2 {
	
	public static void main(String args[]) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("phone", "maria@gmail.com");
		cookies.put("phone", "90909090");
		
		cookies.remove("email");
		cookies.put("phone", "90909876");
		
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number:" + cookies.get("phone"));
		System.out.println("Size: " + cookies.size());
		
		
		System.out.println("All Cookies: ");
		for(String key : cookies.keySet()) {
			System.out.println("key: " + ": " + cookies.get(key));
		}
	}

}
