package com.crud.handler;

import java.util.List;

import org.springframework.jdbc.support.rowset.ResultSetWrappingSqlRowSet;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.pojo.User;

@Controller
public class testHandler {
	//前端通过一个文本框描述用户信息name和age
	//String->User 写一个类型转换器 Converter<S,T>原类型 目标类型  ConverterFactory GenericConverter
@RequestMapping("/testConversionService")
public String testConversionService(User user) {
	System.out.println(user);
	return "success";
}
@RequestMapping("/testFormat")
public String testFormat(User user,BindingResult result) {
	if(result.getFieldErrorCount()>0) {
		List<FieldError> fielderrors=result.getFieldErrors();
		for(FieldError fielderror:fielderrors)
			System.out.println(fielderror.getDefaultMessage());
	}
	System.out.println(user);
	return "success";
}
}
