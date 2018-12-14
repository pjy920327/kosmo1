<!-- 지시어  : page Directive -->
<%@	page 
		language="java" 
		contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"
%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<!-- bgcolor="gray" -->
<body>
<form method="post" action="/abc">
<table border="1" width="400"  bordercolor="red"
cellpadding="0" cellspacing="0">  
<tr> 
 <td colspan="2" align="center">제품코드입력(4자리)</td>
</tr>
<tr>
 <td>제품코드</td>
 <td><input type="text" name="pcode"></td>
</tr>
<tr>
 <td colspan="2" align="center">
 <input type="submit" value="입력">
 </td>
</tr>
</table>
</form>



<br>
<table border="1" width="400"  bordercolor="red"
cellpadding="0" cellspacing="0">  
<tr bgcolor="#cccccc">
 <td  align="center"><b>uid</b></td>
 <th>upw</th>
</tr>
<% for(int i=1;i<=10;i++){ %>
		<tr>
		 <td><a href="/abc?uid=kim<%=i%>&upw=111">kim<%=i%></a></td>
		 <td><%=i%></td>
		</tr>
<%}%>
<tr>
	<td colspan="2" align="center">dddd</td>
</tr>

<tr>
	<td rowspan="2">111</td>
	<td>111</td>
</tr>
<tr>
	<td align="right">333</td>
</tr>

</table>
<br>
<p align="center">
<font size="5" color="#339900">
<b>테스트</b>&lt; &gt;...
</font>
</p>
<br>앵커
<a href="/abc?uid=한글&upw=111">
<img width="100" height="100" src="/img/aaa.jpg">
</a><br>
<a href="http://www.google.com">구글</a><br>
<form method="post" action="/abc">
	<input type="text" name="uid">
	<input type="text" name="upw">
	<input type="submit" value="보내기">
</form>




<%
//스크립트릿 : scriptlet
for(int i=0; i<10; i++) {
	System.out.println(i);
	out.println(i+"<br>");	
}
%>
//---------------------------------

<%
//스크립트릿 : scriptlet
for(int i=0; i<10; i++) {
	System.out.println(i);
%>
	<%out.println(i);%><br>	
	<%=i%><br>
<%
}
%>








</body>
</html>