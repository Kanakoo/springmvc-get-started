package com.springmvc.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
//默认bean的id为首字母小写的类名
@Component
public class MyView implements View{
//告知spring容器 contentType
	@Override
	public String getContentType() {
		// TODO Auto-generated method stub
		return "text/html";
	}

	@Override
	public void render(Map<String, ?> arg0, HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		response.getWriter().println("<h2>这是我的自定义视图</h2>");
	}

}
