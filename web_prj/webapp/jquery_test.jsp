<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https:/q/code.jquery.com/jquery-3.3.1.js"></script>
<script>q
/* $().____( function(){}  );
$(document).ready();

$(".yb").click(); */
$(document).ready(function(){
		//alert("d");
		
		/* $("#runBtn").click(function(){
			alert("런버튼클릭");
			scriptFunc();
		}); */
		
		/*  $(".yb").click(function(){
				alert("ddd  yb click");
		    //$(this).hide();
		    $("#btndiv").removeAttr();
		    
		    //$(this).hide();
		    var str = "";
		    str += "<input type='button' class='yb' value='a'>";
		    str += "<input type='button' class='yb' value='b'>";
		    str += "<input type='button' class='yb' value='c'>";
		    
		    $("#btndiv").html(str);
		});  */
		
		
	/*
	//동적으로 생성된 버튼이라서 이벤트 감지 못함, on으로 사용해야함
	$(".ybs").click( function(){
			alert("ybs click");
		}); 
	*/
	$(document).on("click",".ybs",function(){  
			alert("ybs click");
	});

	//$(".yb").click(function(){
	$(".yb").on("click", function(){
			alert("ddd  yb click");
	    //$(this).hide();
	    $("#btndiv").removeAttr();
 		 	var str = "";
	    str += "<input type='button' class='ybs' value='a'>";
	    str += "<input type='button' class='ybs' value='b'>";
	    str += "<input type='button' class='ybs' value='c'>";
	    
	    $("#btndiv").html(str);
	});
			
});

function scriptFunc() {
	alert("스크립트메서드");
}
</script>

</head>  
<body>
<a href="/aa.html"></a>
<input type="button" value="Script실행" 
	onClick="scriptFunc()">
<br>
<form name="myform" method="post" action="/input_tag"> 
<input type="text" id="uid" class="uid" name="uid"><br>
<input type="password" name="upw" ><br>

<input type="button" id="runBtn1" class="yb" value="jQuery실행"> 
<input type="button" id="runBtn2" class="yb" value="jQuery실행">

<div id="btndiv"></div>

</form>
</body>
</html>