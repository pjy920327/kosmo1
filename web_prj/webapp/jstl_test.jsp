<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.ArrayList, com.kosmo.web.EmpVO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
		prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	function loopTest() {
		for(var i=0; i<5; i++) {
			console.log(i);
		}
	}
</script>

<script>
$(document).ready(  function(){
		var arr = ['abc', 'ddd','doc'];  //new Array();
		console.log(arr[0]);
		
		//for (int idx=0; idx<arr.length; idx++) {
		//	String vv = arr[idx];
		//  out.println(idx + ":" + vv);
	  $.each(arr, function (idx, vv){
    	console.log(idx + ":" + vv);
    });
    $(arr).each(myfunc);
    function myfunc (idx, vv){
    	console.log(idx + ":--:" + vv);
    }
    //------------------------------------
               //json표기법:키땡땡밸류
    var map = {"uid":"kim" , "upw":"111"};
    console.log(map.uid + "----");
    var marr = $.makeArray( map );
    console.log(marr);
    //------------------------------------
    var maps =[{"uid":"kim" , "upw":"111"},
  						 {"uid":"lee" , "upw":"222"},
  						 {"uid":"park", "upw":"333"}
  						];
  	$.each(maps, function(idx, vv){ 
  			//vv {"uid":"kim" , "upw":"111"}
  			console.log(".each maps: " + vv.uid);
  			//maps[idx].uid
		});
  	$.map(maps, function(vv, idx){
  		console.log(".map maps: " + vv.uid);
  	});
  	 
  	//for(idx in maps) {
  	for(var idx=0; idx<maps.length; idx++) {
  		console.log(maps[idx].uid);
  	}
  	
  	//maps[1].uid
    
});

/* function myfunc (idx, vv){
	console.log(idx + ":--:" + vv);
} */
</script>

</head>
<body>

<%
int tot = Integer.parseInt(request.getAttribute("KEY_TOTAL").toString());
//out.println(tot);

ArrayList<EmpVO> list 
	= (ArrayList<EmpVO>)request.getAttribute("KEY_LIST");
for(int i=0; i<list.size();i++) {
	//out.println(list.get(i).getEname());
}
%>
<hr>
//java el html script
el: ${KEY_TOTAL}건<br>
<c:forEach var="vovo" items="${KEY_LIST}" >
	${vovo.empno} ${vovo.ename} <br> 
</c:forEach>
<hr>


<%
EmpVO vo = (EmpVO)request.getAttribute("KEY_VO");
//out.println(vo.getEmpno());
//out.println(vo.getEname());
%>
el : ${KEY_VO.empno} ${KEY_VO.ename}<br>
<hr>


<%
//String uid = request.getParameter("uid");
//out.println(uid);
%>
el로 받은값: ${param.uid} <br>
<hr>


<%
for(int i=0; i<10; i++) {
	//out.println(i);	
}
%>
<c:forEach var="i" begin="0" end="9" step="1">
	${i}
</c:forEach>


<%if(10>9) {  %>
크다.
<%} %>
<c:if test="${10>9}">
크다.
</c:if>

</body>
</html>