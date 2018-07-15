package com.BlueBus;

import java.util.Comparator;

public class TreeSetCompartor implements Comparator<BlueBus>{

	public int compare(BlueBus o1, BlueBus o2) {
		return o1.getRating().compareTo(o2.getRating());
	}
	

}
