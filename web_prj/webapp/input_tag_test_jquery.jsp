<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $("#checkBtn").click(function(){
	   /*  
	   if( $("#uid").val() ==""  ) {
	    	alert("아이디를 입력");
	        $("#uid").focus();
	    } else {
	    		$("[name=myform]").submit();
	    		$("#myform").submit();
	    }
	   */
	   console.log("uid:"   	+	$("#uid").val() );
	    console.log("uid:"   	+	$("[name='uid']").val() );
	    
	    console.log("upw:"  	+	$("#upw").val() );
	    console.log("bseq:" 	+	$("#bseq").val() );
	    console.log("ufile:"	+	$("#ufile").val() );
	    console.log("tel:"		+	$("#tel").val() );
	    console.log("tel:"		+	$("#tel option:selected").val() );
	    
	    console.log("content:"+	$("#content").val() );
	   
	    console.log("gen:"+	$("input[type='radio'][name='gen']:checked").val() );
	    console.log("gen:"+	$(":input:radio[name='gen']:checked").val() );
	   	console.log("gen:"+	$(":radio[name='gen']:checked").val() );
	    console.log("gen:"+	$("[name='gen']:checked").val() );
	    console.log("gen:"+	$(".gen:checked").val() );
	    
   
    $.each( $("[name='habit']:checked") , function(){
    		console.log($(this).val() + "");
    });
    
    
    $("[name='myform']").submit();
    
    /////id접근에러XXXXX("gen:"+ $("#gen:checked").val());
   
    });
});
</script>
</head>
<body>

<form name="myform" method="post" action="/input_tag_jquery">
<input type="text" id="uid" class="uid" name="uid"><br>
<input type="password" id="upw" name="upw"><br>

<input type="checkbox" name="habit" value="book">독서
<input type="checkbox" name="habit" value="mnt">등산
<input type="checkbox" name="habit" value="fish">낚시
<br>
<input type="radio" class="gen" name="gen" value="m">남성
<input type="radio" class="gen" name="gen" value="f">여성
<br>
 
*hidden:(<input type="hidden" id="bseq" name="bseq" value="1">)<br>
<input type="file" name="ufile" id="ufile" value="첨부파일선택"><br>

<!-- / -->
<select name="tel" id="tel">
	<option value="011">SKT</option>
	<option value="019">LGT</option>
	<option value="016">KT</option>
</select> <br>

<textarea cols="40" rows="3" id="content" name="content">여기글씨..</textarea><br>

<hr>
<!-- 버튼류 -->
<input type="button" id="checkBtn" value="일반버튼"> 
</form>


</body>
</html>
