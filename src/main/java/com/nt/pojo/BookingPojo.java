package com.nt.pojo;
public class BookingPojo {
	
	 private  String  Destination;
	
	public BookingPojo( String destination) {
		super();
		Destination = destination;
		}
	public BookingPojo() {
		super();
	}
	
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	
}
