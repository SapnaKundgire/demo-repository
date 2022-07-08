package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private  Integer BookingId ;
	@Column(name = "Booking_Source", nullable = false)
	 private  String Source;
	@Column(name = "Booking_Destination", nullable = false)
	 private  String  Destination;
	@Column(name = "Booking_VehicleType", nullable = false)
	 private   String VehicleType;
	@Column(name = "Booking_PhoneNo", nullable = false)
	 private   Long PhoneNo;
	
	public Booking(Integer bookingId, String source, String destination, String vehicleType, Long phoneNo) {
		super();
		BookingId = bookingId;
		Source = source;
		Destination = destination;
		VehicleType = vehicleType;
		PhoneNo = phoneNo;
	}
	public Booking() {
		
	}
	public Integer getBookingId() {
		return BookingId;
	}
	public void setBookingId(Integer bookingId) {
		BookingId = bookingId;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public String getVehicleType() {
		return VehicleType;
	}
	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}
	public Long getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		PhoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Booking [BookingId=" + BookingId + ", Source=" + Source + ", Destination=" + Destination;
	}
	
	





}
