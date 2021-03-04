package classes;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//create a hashMap and add value,check the size,check if any paricular key is present or not
		//if present what's the value for the key
		
		Map<String, Integer> hm= new HashMap<>();
		hm.put("papu", 40);
		hm.put("sona", 16);
		hm.put("soly", 14);
		hm.put("suni", 45);
		hm.put("monu", 35);
		hm.put("cinu", 46);
		System.out.println("Map size = "+ hm.size());
		System.out.println("Checking if the key suna is present in the map or not = "+ hm.containsKey("sona"));
		
		System.out.println("to get the value of the key Suna = "+ hm.get("sona"));
		System.out.println("to check if any paricular value is present in map = "+ hm.containsValue(16));
		System.out.println("to check if the map is empty = "+ hm.isEmpty());
//		System.out.println("to check if the map is empty = "+ hm.remove("cinu"));
		System.out.println("Map size = "+ hm.size());
		System.out.println("Map size = "+ hm.replace("cinu",20));
		System.out.println("Map size = "+ hm);
		System.out.println("Map size = "+ hm.hashCode());
	
		
	}

}
