package com.crud.dao;

import java.util.HashMap;

import com.crud.pojo.Department;
import java.util.Map;

public class DepartmentDAO {
private static Map<Integer, Department> depts;
static {
	depts=new HashMap<Integer,Department>();
	depts.put(1,new Department(1,"SALES"));
	depts.put(2,new Department(2,"HR"));
}
public static Map<Integer,Department> getAllDepts() {
	return depts;
}
public static Department getDeptById(int id) {
	return depts.get(id);
}
}
