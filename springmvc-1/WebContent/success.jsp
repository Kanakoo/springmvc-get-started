<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
This is success page.<br/>
from request scope by ModelAndView ${requestScope.name}<br/>
from request scope by Map ${requestScope.age}<br/>
from request scope by Model ${requestScope.mail}<br/>
from request scope by ModelMap ${requestScope.city}<br/>
from session scope by ModelMap ${sessionScope.city}<br/>
<a href="result">result</a>
</body>
</html>