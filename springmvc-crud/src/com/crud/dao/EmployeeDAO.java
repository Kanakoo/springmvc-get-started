package com.crud.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.crud.pojo.Department;
import com.crud.pojo.Employee;

public class EmployeeDAO {
private static Map<Integer,Employee> emps;
static {
	emps=new HashMap<Integer,Employee>();
	emps.put(101, new Employee(101,"Tom","tom@xxx.com","boy",DepartmentDAO.getDeptById(2)));
	emps.put(102, new Employee(102,"Mary","Mary@xxx.com","girl",DepartmentDAO.getDeptById(2)));
	emps.put(103, new Employee(103,"Jane","Jane@xxx.com","girl",DepartmentDAO.getDeptById(1)));
	emps.put(104, new Employee(104,"Bob","Bob@xxx.com","boy",DepartmentDAO.getDeptById(2)));
	emps.put(105, new Employee(105,"Alice","Alice@xxx.com","girl",DepartmentDAO.getDeptById(1)));
	
}
//泛型 将map转换成collection
public static Collection<Employee> getAllEmps() {
	return emps.values();
}
}
