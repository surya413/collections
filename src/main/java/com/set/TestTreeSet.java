package com.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet {
public static void main(String[] args) {
	TreeSet set = new TreeSet(new user());
	/*set.add(10);
	set.add(20);
	set.add(5);
	set.add(1);
	set.add(102);*/
	set.add("surya");
	set.add("ram");
	set.add("sagar");
	set.add("prasad");
	set.add("dinnu");

	
	System.out.println(set);
	
}
}
class user implements Comparator<String>{

	public int compare(String o1, String o2) {
		return 0;
		
	}

	/*public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}*/
	
}