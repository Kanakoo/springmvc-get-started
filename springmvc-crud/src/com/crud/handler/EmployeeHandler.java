package com.crud.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/input/{id}")
public String input(@PathVariable("id")int id,/*@PathVariable紧跟int id*/Map<String,Object> map) {
	Map<Integer, String> genders=new HashMap<Integer, String>();
	genders.put(0, "boy");
	genders.put(1, "girl");
	map.put("depts", DepartmentDAO.getAllDepts());
	map.put("genders", genders);
	Employee e=new Employee();
	if(id!=0) {
		e=EmployeeDAO.getEmpById(id);
	}else {
	e.setName("John");
	e.setMail("John@xxx.com");
	}
	map.put("e", e);
	return INPUT;
}
@RequestMapping(value="/add",method=RequestMethod.POST)
public String add(Employee e) {
	EmployeeDAO.add(e);
	return "redirect:/allEmps";
}
@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
public String delete(@PathVariable("id")int id) {
	EmployeeDAO.delete(id);
	return "redirect:/allEmps";
}
@ModelAttribute
public void attri(Integer id,Map<String,Object> map) {
	if(id!=null) {//这里为什么id必须为integer 不能是int
		Employee e=EmployeeDAO.getEmpById(id);
		map.put("employee", e);
	}
	
}
@RequestMapping(value="/update",method=RequestMethod.PUT)
public String update(Employee e) {
	EmployeeDAO.update(e.getId(), e);
	return "redirect:/allEmps";
}
@InitBinder
public void testInitBinder(WebDataBinder binder) {
	binder.setDisallowedFields("name");//不能改变name属性
}
}
