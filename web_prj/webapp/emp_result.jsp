<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.util.ArrayList"
    import = "com.kosmo.web.EmpVO"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
검색결과
<hr>
<%
ArrayList<EmpVO> list = (ArrayList<EmpVO>)request.getAttribute("KEY_LIST");
out.println(list.size()+"건 출력<br>");
for(EmpVO evo : list) {
	out.println(evo.getEmpno() + "\t" + evo.getEname());
}
%>
</body>
</html>