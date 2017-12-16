package com.springmvc.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.pojo.User;

@Controller
@RequestMapping("/helloworld")
public class HelloWorld {
/*如果只有一个value属性 可以省略
 * 可以修饰方法 类
 * 
 */
	
@RequestMapping(value="/hello",method=RequestMethod.GET,
params={"name","age!=12"},headers= {"accept=text/html"})
public String hello() {
	return "success";
}
/*
 * 通配符 ？文件名中的一个字符 *文件名中任意字符（任意一个路径）  **多层路径
 */
@RequestMapping(value="/*/antStyle",method=RequestMethod.GET)
public String antStyle() {
	return "success";
}

/*
 * 占位符绑定到请求处理方法中
 */
 @RequestMapping(value="/testPathVar/{id}",method=RequestMethod.GET)
public String testPathVar(@PathVariable(value="id") int id) {
	System.out.println(id);
	return "success";
}
/*REST
 * get-->get
 * post-->寻找请求参数 是否有一个名字method这样的一个请求方式 delete put
 * 如果没有 就是post
 */
 
 //get
 @RequestMapping(value="/testGet/{id}",method=RequestMethod.GET)
 public String testGet(@PathVariable(value="id") Integer id) {
 	System.out.println("正在获取ID为"+id);
 	return "success";
 }
//post
 @RequestMapping(value="/testPost",method=RequestMethod.POST)
 public String testPost() {
 	return "success";
 }
 //delete
 @RequestMapping(value="/testDelete/{id}",method=RequestMethod.DELETE)
 public String testDelete(@PathVariable(value="id") Integer id) {
	 System.out.println("正在删除ID为"+id);
 	return "success";
 }
//put
 @RequestMapping(value="/testPut/{id}",method=RequestMethod.PUT)
 public String testPut(@PathVariable(value="id") Integer id) {
	 System.out.println("正在更新ID为"+id);
 	return "success";
 }
 /*
  * springmvc通过形参与请求参数绑定
  * 形参声明前面加入@requestparam（value=前端的name属性值）
  * 如果形参名与请求参数名一致 可以省略注解
  * @RequestParam(value="id",required=true)int id,@RequestParam(value="name")String name
  * public String testRequestParam(int id,String name)
  */
 @RequestMapping(value="/testRequestParam",method=RequestMethod.POST)
 public String testRequestParam(User user) {
	 System.out.println(user);
 	return "success";
 }
 @RequestMapping(value="/testRequestHeader",method=RequestMethod.GET)
 public String testRequestHeader(@RequestHeader("Accept")String accept,@RequestHeader("User-Agent")String u_a) {
	 System.out.println(accept+" "+u_a);
 	return "success";
 }
 @RequestMapping(value="/testCookieValue")
 public String testCookieValue(@CookieValue("JSESSIONID")String id) {
	 System.out.println(id);
 	return "success";
 }
 @RequestMapping(value="/testServletAPI")
 public String testServletAPI(HttpServletRequest req,HttpServletResponse res) {
	 System.out.println(req+" "+res);
 	return "success";
 }

 
}
