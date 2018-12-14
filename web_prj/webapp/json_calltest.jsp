<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $("#listBtn").click(function(){
	    	$.ajax({ 
						url:"/list",
						type:"post",
						//contentType: "application/json; charset=UTF-8", 
						data:"empno="+$("#empno").val(), //empno=7733  
						success:function(gsonStr){
								console.log(gsonStr);	//"[{"empno
								var gsonObj = JSON.parse(gsonStr);
								console.log(gsonObj);		//[{"empno
								
								var htmlStr = "<ul>";
					 			$.map(gsonObj, function(vv, idx){
						  		htmlStr += "<li>" + vv.empno + " " + vv.ename+ "</li>";
						  	});
						  	htmlStr += "</ul>";
						  	$("#resdiv").html(htmlStr);
						}
				});
    });
    
    $("#viewBtn").click(function(){
    		//var prm = $("form").serialize();  //empno=7782&ename=smith
	    	$.ajax({ 
					url:"/view",
					type:"post",
					contentType: "application/json; charset=UTF-8", 
					data: JSON.stringify({"empno" : $("#empno").val()}) , //"{"empno":7733}"
					//String으로 내보냄
					//data:prm //"empno="+$("#empno").val(), //empno=7733
					//JSON 객체로 들어온 경우
					resultType:"json" ,
					success:function(jsonObj){
									console.log(jsonObj);		//{"empno
									var htmlStr = "<ul>";
						 			htmlStr += "<li>" + jsonObj.empno + " " + jsonObj.ename+ "</li>";
							  	htmlStr += "</ul>";
							  	
							  	$("#resdiv").html(htmlStr);
							}
					}); 
	
					/* String으로 결과 들어온 경우 
					success:function(jsonStr){
									console.log(jsonStr);	//"{"empno
									var jsonObj = JSON.parse(jsonStr);
									console.log(jsonObj);		//{"empno
									var htmlStr = "<ul>";
						 			htmlStr += "<li>" + jsonObj.empno + " " + jsonObj.ename+ "</li>";
							  	htmlStr += "</ul>";
							  	
							  	$("#resdiv").html(htmlStr);
							}
					}); */
	    });
    
});
</script>
</head>
<body>
<form>
<input type="button" id="listBtn" value="list"><br> 
<input type="text" name="empno" id="empno">
<input type="button" id="viewBtn" value="view">
</form><br>

<div id="resdiv"></div>
</body>
</html>