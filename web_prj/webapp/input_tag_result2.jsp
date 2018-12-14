<%@ page 
language="java" 
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="java.util.ArrayList"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
forward 결과페이지...<hr>
redirect === http://localhost:8088/input_tag_result.jsp?aaa=lee&bbb=2222<br>
forward  === http://localhost:8088/input_tag   (서블릿)<br>
<hr>
<%
ArrayList<String> resMList 
	= (ArrayList<String>)request.getAttribute("KEY_MLIST");
for(String str : resMList) {
	out.println(str + "<br>");
}
out.println("<hr>");
ArrayList<String> resCList 
	= (ArrayList<String>)request.getAttribute("KEY_CLIST");
for(String str : resCList) {
	out.println(str + "<br>");
}

out.println("<hr>");
String name = (String)request.getAttribute("KEY_STRING");
out.println(name + "<br>");
/* for(int i=0; i<resList.size(); i++) {
	String str = resList.get(i);
	out.println(str);
} */

String ss = request.getParameter("uid");
out.println("userid:" + ss);
%>

</body>
</html>