package com.crud.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crud.dao.DepartmentDAO;
import com.crud.dao.EmployeeDAO;
import com.crud.pojo.Employee;
import com.sun.org.apache.bcel.internal.generic.NEW;
@Controller
public class EmployeeHandler {
	private final String SUCCESS="success";
	private final String INPUT="input";
@RequestMapping("/allEmps")
public String allEmps(Map<String,Object> map) {
	map.put("emps", EmployeeDAO.getAllEmps());
	return SUCCESS;
}
@RequestMapping("/input")
public String input(Map<String,Object> map) {
	Map<Integer, String> genders=new HashMap<Integer, String>();
	genders.put(0, "boy");
	genders.put(1, "girl");
	map.put("depts", DepartmentDAO.getAllDepts());
	map.put("genders", genders);
	Employee e=new Employee();
	e.setName("John");
	map.put("command", e);
	return INPUT;
}
@RequestMapping(value="/add",method=RequestMethod.POST)
public String add(Employee e) {
	EmployeeDAO.save(e);
	return "redirect:/allEmps";
}
}
