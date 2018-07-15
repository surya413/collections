package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
   public static void main(String[] args) {
	   Student student1 = new Student(101, "Surya", "scits");
	   Student student2 = new Student(101, "Surya", "scits");
	   Student student3= new Student(101, "ramesh", "scits");

	   Set student = new LinkedHashSet();
	   student.add(student1);
	   student.add(student2);
	   student.add(student3);
System.out.println(student);
	   
}
}
class Student{
	private int id;
	private String name;
	private String clg;
	public Student(int id, String name, String clg) {
		super();
		this.id = id;
		this.name = name;
		this.clg = clg;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", clg=" + clg + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clg == null) ? 0 : clg.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (clg == null) {
			if (other.clg != null)
				return false;
		} else if (!clg.equals(other.clg))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

//linked hashset depand hashblock and double link
//insertion 