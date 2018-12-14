<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	/*
	String uid = request.getParameter("uid");
	String upw = request.getParameter("upw");
	String[] habit = request.getParameterValues("habit");
	//System.out.println(habit);
	if(habit != null) {
		for(int i=0; i<habit.length;i++) {
			System.out.println(habit[i]);
		}
	}
	String gen = request.getParameter("gen");
	int bseq = Integer.parseInt(request.getParameter("bseq"));
	String ufile = request.getParameter("ufile");
	String tel = request.getParameter("tel");
	String content = request.getParameter("content");
	*/
	
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {

		var habitarr = new Array(); //["book", "fish"];

		<c:forEach var="str" items="${paramValues.habit}"> 
			habitarr.push("${str}");
			console.log("${str}")
		</c:forEach>

			var uid = "${uid}";
			
		//var habitarr = ["book", "fish"];
		$.each(habitarr, function(i, v) {
			$("[name='habit'][value='" + v + "']").attr("checked", "checked");
		});

	});
</script>
</head>
<body>
	nput_tag_result3.jsp 결과페이지...
	<hr>
	uid=kim& upw=11& habit=book& habit=mnt& gen=f& bseq=1& ufile=get.txt&
	tel=019& content=ccc

	<!-- 

$('input:checkbox[name=locationthemes]').each(function() 
{    
    if($(this).is(':checked'))
      alert($(this).val());
});


 -->

	<hr>
	<form name="myform" method="post" action="/input_tag_jquery">
		<input type="text" id="uid" class="uid" name="uid"><br> <input
			type="password" value="${param.uid}" id="upw" name="upw"><br>

		<input type="checkbox" name="habit" value="book">독서 <input
			type="checkbox" name="habit" value="mnt">등산 <input
			type="checkbox" name="habit" value="fish">낚시 <br> <input
			type="radio" class="gen" name="gen" value="m">남성 <input
			type="radio" class="gen" name="gen" value="f">여성 <br>

		*hidden:(<input type="hidden" id="bseq" name="bseq" value="1">)<br>
		<input type="file" name="ufile" id="ufile" value="첨부파일선택"><br>

		<!-- / -->
		<select name="tel" id="tel">
			<option value="011">SKT</option>
			<option value="019">LGT</option>
			<option value="016">KT</option>
		</select> <br>

		<textarea cols="40" rows="3" id="content" name="content">${param.content}</textarea>
		<br>

		<hr>
		<!-- 버튼류 -->
		<input type="button" id="checkBtn" value="일반버튼">
	</form>


</body>
</html>
