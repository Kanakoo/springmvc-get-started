package com.crud.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Myinterceptor implements HandlerInterceptor{
	//渲染视图之后调用的方法
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	//调用业务方法之后，在渲染视图之前
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	//调用业务方法或者下一个拦截器之前需要执行的方法
	//true--拦截器方法执行完毕，继续执行下一个拦截或业务方法
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("走入到拦截器中");
		Date date=new Date();
		int hour=date.getHours();
		if(hour>=9 && hour<=17) {
			System.out.println(hour);
			return true;
		}else {
			response.sendRedirect("error.jsp");
			return false;
		}
		
	}

}
