package classes;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		//different ways to iterate an ArrayList

		ArrayList<String> names = new ArrayList<String>();
		names.add("papu");
		names.add("sonali");
		names.add("shri");
		names.add("soni");
		names.add("cinu");
		names.add("minu");
		
		// 1st way, by using Iterator
		System.out.println("---- by using Iterator -----");
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name= it.next();
			System.out.println(name);
		}		
		
		// 2nd way, by using for each in Lambda java 8 
		System.out.println("---- by using or each in Lambda java 8  -----");
		names.forEach(name ->{
			System.out.println(name);
		});
		
		
		// 3rd way, by using Iterator and for each 
		System.out.println("---- by using Iterator and for each -----");
		Iterator<String> it1 = names.iterator();
		it1.forEachRemaining(name ->{
			System.out.println(name);
		});
		
		
		// 4th way, by using for each loop
		System.out.println("---- by using for each loop -----");
		for(String name : names) {
			System.out.println(name);
		}
		
		// 5th way, by using for loop with order index
		System.out.println("---- by using for loop with order index -----");
		for(int i = 0 ; i < names.size();i++) {
			String name = names.get(i);
			System.out.println(name);
		}
		
		
		
		// 6th way, by using for each loop
		System.out.println("---- by using for each loop -----");
		
		
		
		
		
	}

}
