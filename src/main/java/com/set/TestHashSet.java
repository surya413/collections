package com.set;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	
  public static void main(String[] args) {
	  Empolyee emp1=new Empolyee(10,"surya","50k","tcs");
	  Empolyee emp2=new Empolyee(10,"surya","50k","tcs");
	  Empolyee emp3=new Empolyee(10,"surya","50k","tcs");
	  Empolyee emp4=new Empolyee(10,"surya","50k","tcs");

        Set s=new HashSet();
        s.add(emp1);
        s.add(emp2);
        s.add(emp3);
        s.add(emp4);
        System.out.println(s);

	  
	  
	  
	
}
}
  class Empolyee{
	  private int id;
	  private String name;
	  private String salary;
	  private String company;
	public Empolyee(int id, String name, String salary, String company) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.company = company;
	
	  
  }
	@Override
	public String toString() {
		return "Empolyee [id=" + id + ", name=" + name + ", salary=" + salary + ", company=" + company + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
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
		Empolyee other = (Empolyee) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}
	
}
//hashset is hash  bolck
  //capacity 16  
  //load factor defalt 0.75
  
  