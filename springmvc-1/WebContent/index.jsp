<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="helloworld/hello?name=tom&age=10">请求发送到一个控制器</a>
<br/>
<a href="helloworld/aa/antStyle">ANT style</a>
<br/>
<a href="helloworld/testPathVar/12">testPathVar</a>
<br/>
<a href="helloworld/testGet/13">testGet</a>
<form method="post" action="helloworld/testPost">
<input type="submit" value="testPost"/>
</form>
<form method="post" action="helloworld/testDelete/13">
<input type="hidden" name="_method" value="DELETE"/>
<input type="submit" value="testDelete"/>
</form>
<form method="post" action="helloworld/testPut/13">
<input type="hidden" name="_method" value="put"/>
<input type="submit" value="testPut"/>
</form>
<form method="post" action="helloworld/testRequestParam">
id<input type="text" name="id"/>
name<input type="text" name="name"/>
<input type="submit" value="testRequestParam"/>
</form>
</body>
</html>