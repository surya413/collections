package com.BlueBus;


public class BlueBus implements Comparable<BlueBus>{
	
	public int compareTo(BlueBus bb) {
		int price=this.price.compareTo(bb.price);
		if(price==0) {
		int serivcename=this.serivcename.compareTo(bb.serivcename);
		if(serivcename==0) {
			int bustype=this.bustype.compareTo(bb.bustype);
			if(bustype==0) {
				return this.servicenum.compareTo(bb.servicenum);
			}
			
			return bustype;
		}
		return serivcename;
		}
		return price;
	}
	
	
	
	public BlueBus(Integer servicenum, String serivcename, String bustype, String departuretime, String arivaltiime,
			String price, String rating) {
		super();
		this.servicenum = servicenum;
		this.serivcename = serivcename;
		this.bustype = bustype;
		this.departuretime = departuretime;
		this.arivaltiime = arivaltiime;
		this.price = price;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "BlueBus [servicenum=" + servicenum + ", serivcename=" + serivcename + ", bustype=" + bustype
				+ ", departuretime=" + departuretime + ", arivaltiime=" + arivaltiime + ", price=" + price + ", rating="
				+ rating + "\n]";
	}
	private Integer servicenum;
	private String serivcename;
	private String bustype;
	private String departuretime;
	private String arivaltiime;
	private String price;
	private String rating;
	public String getSerivcename() {
		return serivcename;
	}
	public void setSerivcename(String serivcename) {
		this.serivcename = serivcename;
	}
	public int getServicenum() {
		return servicenum;
	}
	public void setServicenum(int servicenum) {
		this.servicenum = servicenum;
	}
	public String getBustype() {
		return bustype;
	}
	public void setBustype(String bustype) {
		this.bustype = bustype;
	}
	public String getDeparturetime() {
		return departuretime;
	}
	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}
	public String getArivaltiime() {
		return arivaltiime;
	}
	public void setArivaltiime(String arivaltiime) {
		this.arivaltiime = arivaltiime;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	

}
