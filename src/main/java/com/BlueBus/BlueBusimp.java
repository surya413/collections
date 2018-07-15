package com.BlueBus;

import java.util.Set;
import java.util.TreeSet;

public class BlueBusimp {
      public static void main(String[] args) {
    	  BlueBus bus1 = new BlueBus(101,"surya","a/c","10pm","6am","750","1");
    	  BlueBus bus2 = new BlueBus(102,"sagar","sleeper","9pm","5am","650","2");
    	  BlueBus bus3 = new BlueBus(103,"prasad","a/c","10pm","6am","750","3");
    	  BlueBus bus4 = new BlueBus(104,"dinnu","sleeper","9pm","5am","850","3");
    	  BlueBus bus5 = new BlueBus(105,"livan","a/c","10pm","6am","750","5");
    	  BlueBus bus6 = new BlueBus(106,"raju","a/c","10pm","6am","750","6");
    	      Set<BlueBus> set = new TreeSet<>(new TreeSetCompartor());
    	      set.add(bus1);
    	      set.add(bus2);
    	      set.add(bus3);
    	      set.add(bus4);
    	      set.add(bus5);
    	      set.add(bus6);
System.out.println(set);
	}
	
	
}
