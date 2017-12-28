<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- form表单标签库 回显 modelAttribude指定回显 request范围 没有指定默认command-->
<h3>${e.id!=0?'UPDATE':'ADD' }</h3>
<form:form action="${e!=null?'../update':'add' }" method="post" modelAttribute="e">
<c:if test="${e!=null }">
<input type="hidden" name="_method" value="PUT"/>
<form:hidden path="id"/>
</c:if>
<table>
<tr><td>NAME</td><td><form:input path="name"/></td></tr>
<tr><td>MAIL</td><td><form:input path="mail"/></td></tr>
<c:if test="${e.id==0 }">
<tr><td>GENDER</td><td><form:radiobuttons path="gender" items="${requestScope.genders }"/></td></tr>
</c:if>
<tr><td>DEPARTMENT</td><td>
<form:select path="department.depId" items="${requestScope.depts }" itemLabel="depName" itemValue="depId"></form:select>
</td></tr>
<tr><td></td><td><input type="submit" value="${e.id!=0?'UPDATE':'ADD'}"/></td></tr>
</table>
</form:form>


</body>
</html>