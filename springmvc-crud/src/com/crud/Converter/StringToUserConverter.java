package com.crud.Converter;

import org.springframework.core.convert.converter.*;

import com.crud.pojo.User;

public class StringToUserConverter implements Converter<String,User>{
public User convert(String source) {
	String[] array=source.split("-");
	if(array!=null && array.length==2)
	{
		User user=new User();
		user.setName(array[0]);
		user.setAge(Integer.parseInt(array[1]));
		return user;
	}
	return null;
}
}
