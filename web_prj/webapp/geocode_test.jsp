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
//https://maps.googleapis.com/maps/api/geocode/json?address=%EA%B0%80%EC%82%B0%EC%97%AD&key=AIzaSyDf4YKwygNTIFnJRlFUev_d1kl5aJOzfbM
$(document).ready(function(){
    $("#btn").click(function(){
	    	$.ajax({ 
						url:"https://maps.googleapis.com/maps/api/geocode/json",
						type:"get",
						data:"address=가산역&key=AIzaSyDf4YKwygNTIFnJRlFUev_d1kl5aJOzfbM",
						resultType:"json",
						success:function(resJson){
								console.log(resJson);
								var htmlStr = "";
								/* var arr = resJson.results;
								for ( var i = 0; i < arr.length()-1; i++ ) {
									var addr = arr[i].formatted_address;
							  	var lat = arr[i].geometry.location.lat;
							  	var lng = arr[i].geometry.location.lng;
									htmlStr += addr+","+lat+","+lng+"<br>";
								} */
								
								$.map(resJson.results, function(vv, idx){
										var addr = vv.formatted_address;
							  		var lat = vv.geometry.location.lat;
							  		var lng = vv.geometry.location.lng;
							  		if(idx > 0) {
							  			return false;
							  		}
						  			console.log(addr+","+lat+","+lng);
						  			htmlStr += addr+","+lat+","+lng+"<br>";
							  }); 
								$("#resdiv").html(htmlStr);
						}
				});
    });
});
</script>
</head>
<body>
<input type="button" id="btn" value="goecode"><br>
<div id="resdiv"></div>
</body>
</html>