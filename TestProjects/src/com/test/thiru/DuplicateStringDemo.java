package com.test.thiru;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateStringDemo {

	public static void main(String[] args) {

		System.out.println(findDuplicatesUsingFor("code decode"));
		System.out.println(findDuplicatesUisngArrays("code decode"));
		System.out.println(findDuplicatesUisngMap("code decode"));

	}

	
	private static Set<Character> findDuplicatesUisngMap(String name) {
		// TODO Auto-generated method stub
		Set<Character> duplicates = new LinkedHashSet<>();
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		for (int i = 0; i < name.length(); i++) {
			if (countMap.containsKey(name.charAt(i))) {
				countMap.put(name.charAt(i), countMap.get(name.charAt(i)) + 1);
			} else {
				countMap.put(name.charAt(i), 1);
			}

		}

		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				duplicates.add(entry.getKey());
			}
		}
		return duplicates;
	}


	private static Set<Character>[] findDuplicatesUisngArrays(String name) {
		Set<Character> duplicates = new LinkedHashSet<>();
		int[] arrayforChar = new int[256];
		for (int i = 0; i < name.length(); i++) {
			arrayforChar[name.charAt(i)] = arrayforChar[name.charAt(i)] + 1;
		}
		
		for(int i=0;i<256;i++) {
			duplicates.add((char) i);
		}
		
		return null;
	}
	 
	private static Set<Character> findDuplicatesUsingFor(String name) {

		Set<Character> duplicates = new LinkedHashSet<>();
		for (int i = 0; i < name.length(); i++) {
			for (int j = i + 1; j < name.length(); j++) {
				if (name.charAt(i) == name.charAt(j)) {
					duplicates.add(name.charAt(j));

				}

			}

		}
		return duplicates;

	}

}
