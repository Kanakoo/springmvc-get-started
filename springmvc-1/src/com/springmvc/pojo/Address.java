package com.springmvc.pojo;

public class Address {
private int cityid;
private String city;
private String street;
public Address() {}
public Address(int cityid, String city, String street) {
	super();
	this.cityid = cityid;
	this.city = city;
	this.street = street;
}
public int getCityid() {
	return cityid;
}
public void setCityid(int cityid) {
	this.cityid = cityid;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
@Override
public String toString() {
	return "Address [cityid=" + cityid + ", city=" + city + ", street=" + street + "]";
}




}
