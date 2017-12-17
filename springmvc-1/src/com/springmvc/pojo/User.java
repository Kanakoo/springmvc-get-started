package com.springmvc.pojo;

public class User {
private int id;
private String name;
private Address address;
/*
 * springmvc会按请求参数名和pojo属性名自动匹配 自动为该对象填充属性值 支持级联属性
 */
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", address=" + address + "]";
}

}
