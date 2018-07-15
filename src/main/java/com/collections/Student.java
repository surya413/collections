package com.collections;

import java.util.HashSet;
import java.util.Set;

class Data {
	 
	 private Integer stuid;
	 private String stuname;
	 private String stuclg;
	public Data(int stuid, String stuname, String stuclg) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stuclg = stuclg;
	}
@Override
public int hashCode() {
	return stuid.hashCode()+stuname.hashCode()+stuclg.hashCode();
}
@Override
public boolean equals(Object obj) {
	Data d=(Data) obj;
	if(this.stuid.equals(d.stuid)&&(this.stuname.equals(d.stuname)&&(this.stuclg.equals(d.stuclg))))
	{
	return true;
	}
	else
		return false;
}
@Override
public String toString() {
	return "stuid="+ stuid+ " stuname="+ stuname+ " stuclg="+ stuclg;
}
}
public class Student{
	public static void main(String[] args) {
		Data s1=new Data(101, "surya", "scits");
		Data s2=new Data(101, "surya", "scits");
		Data s3=new Data(101, "prasad", "scits");
		Set s = new HashSet();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		System.out.println(s);

	}
	
	
}