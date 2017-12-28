package com.crud.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.pojo.User;

@Controller
public class testHandler {
	//前端通过一个文本框描述用户信息name和age
	//String->User 写一个类型转换器 Converter<S,T>原类型 目标类型  ConverterFactory GenericConverter
@RequestMapping("/testConversionService")
public String testConversionService(User user) {
	System.out.println(user.getName()+" "+user.getAge());
	return "success";
}
}
