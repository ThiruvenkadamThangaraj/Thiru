package org.user.thiru;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
	public int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
			18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
			19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	/*
	 * This method used to remove duplicates and retains an order using
	 * LinkedHashSet
	 * 
	 */
	public Set<Integer> removeDuplicateWithSet(int[] ints) {
		Set<Integer> setInteger = new LinkedHashSet<Integer>();
		for (int i = 0; i < randomIntegers.length; i++) {
			setInteger.add(ints[i]);
		}
		return setInteger;
	}

	/*
	 * This method used to remove duplicates and retain an array in an sorted
	 * order.
	 * 
	 */

	public Set<Integer> removeDupInIntArray(int[] ints) {
		Set<Integer> setInteger = new TreeSet<Integer>();
		for (int i = 0; i < randomIntegers.length; i++) {
			setInteger.add(ints[i]);
		}
		return setInteger;
	}

	/*
	 * This method We used to collection to pass a parameter of any List or Set
	 * in the Collection.
	 * 
	 * 
	 */
	public Collection<Integer> removeDupInIntArray(Collection<Integer> setInteger, int[] ints) {

		for (int i = 0; i < ints.length; i++) {
			setInteger.add(ints[i]);
		}

		return setInteger;
	}

	public static void main(String[] args) {
		RemoveDuplicates remove = new RemoveDuplicates();
		System.out.println("Retained Order with LinkedHashSet" + remove.removeDuplicateWithSet(remove.randomIntegers));
		System.out.println("Sorted Order with TreeSet" + remove.removeDupInIntArray(remove.randomIntegers));
		Set<Integer> setInteger = new LinkedHashSet<Integer>();
		System.out.println("Using Collection as a Parameter and Retaining order"
				+ remove.removeDupInIntArray(setInteger, remove.randomIntegers));
	}

}
