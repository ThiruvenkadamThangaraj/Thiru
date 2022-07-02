package com.test.thiru;


@FunctionalInterface
interface FunctionalInterfaceDemo {
	void houseOwner();
	default String rentMethod(String s) {
		return "House Rented to Mr. " +s;
	}
	
	
}
