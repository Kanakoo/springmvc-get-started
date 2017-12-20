package com.crud.handler;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.dao.EmployeeDAO;
@Controller
public class EmployeeHandler {
	private final String SUCCESS="success";
@RequestMapping("/allEmps")
public String allEmps(Map<String,Object> map) {
	map.put("emps", EmployeeDAO.getAllEmps());
	return SUCCESS;
}

}
