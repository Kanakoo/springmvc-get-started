package com.crud.pojo;

public class Employee {
private int id;
private String name;
private String mail;
private String gender;
private Department department;
public Employee() {}
public Employee(int id, String name, String mail, String gender, Department department) {
	super();
	this.id = id;
	this.name = name;
	this.mail = mail;
	this.gender = gender;
	this.department = department;
}
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
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}

}
