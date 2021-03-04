package classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		// List fruits1 = new ArrayList();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("berry");
		fruits.add("mango");
		fruits.add("orange");
		fruits.add("grapes");

		System.out.println(fruits.isEmpty());// false
		System.out.println(fruits.size());// 6
		System.out.println(fruits.contains("mango"));// true

		System.out.println(fruits.get(1));// banana
		System.out.println(fruits.indexOf("apple"));// 0
		System.out.println(fruits.lastIndexOf("grapes"));// 5
		System.out.println(fruits.remove(5));// remove grapes from index 5
		System.out.println(fruits.size());// 5
		System.out.println(fruits.toString());// [apple, banana, berry, mango, orange]
		System.out.println(fruits.add("kiwi"));// adding kiwi
		System.out.println(fruits.add("guava"));
		System.out.println(fruits.size());// 7
		System.out.println("------");
		List<String> vegies = new ArrayList<>();
		vegies.add("potato");
		vegies.add("tomato");
		vegies.add("onion");
		vegies.add("chilli");
		System.out.println(vegies.size());// 4
		fruits.addAll(vegies);
		System.out.println(fruits.size());// 11
		System.out.println(fruits.containsAll(vegies));// true
		fruits.add(null);
		fruits.add(null);
		System.out.println(fruits.size());// 13
		fruits.add("duplicate");
		fruits.add("duplicate");
		System.out.println(fruits.size());// 15
		System.out.println(fruits.toString());// apple, banana, berry, mango, orange, kiwi, guava, potato, tomato,
												// onion, chilli, null, null, duplicate, duplicate]
		fruits.remove("duplicate");
		fruits.remove("duplicate");
		fruits.remove(null);
		fruits.remove(null);
		System.out.println(fruits.size());
		System.out.println("------");

		System.out.println("---- Array List iterations using iterator------");

		Iterator<String> it = fruits.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println("--- " + s);
		}

		System.out.println("--- Array List iterations using for-each loop lambda java 8 ------");

		fruits.forEach(fruit -> {
			System.out.println("****  " + fruit);
		});

		System.out.println("--- Array List iterations using for-each loop  ------");

		for (String fruit : fruits)
			System.out.println("--- " + fruit);

		System.out.println("--- Array List iterations using for loop with index ------");

		for (int i = 0; i < fruits.size(); i++) {
			System.out.println("--- " + fruits.get(i));
		}
		
		
		System.out.println("--- natrual orderof  an element in the array ------");
		System.out.println("--- Before"+fruits);
		Collections.sort(fruits);
		System.out.println("--- After"+fruits);
		
		System.out.println("--- Sort ArrayList in Descending Order ------");
		System.out.println("--- before reverse "+vegies);
		Collections.reverse(vegies);
		System.out.println("--- After reverse "+vegies);
		Collections.shuffle(vegies);
		System.out.println("--- After shuffle "+vegies);
		
		
		

	}

}
