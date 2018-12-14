<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 
<meta name="google-signin-client_id" content="132153140522-9kncrdhhuao0ik7fk37i3r1en8c30qle.apps.googleusercontent.com">
 -->
 <title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

</head>
<body>
<span id="namespan"></span>
<input type="button" id="loginButton" value="Sign int">
<input type="button" id="logoutButton" value="Sign out">

<input type="button" id="loginBtn" value="login.." onClick="
	if(this.value == 'login') { 
			googleAuth.signIn({
					scope:'https://www.googleapis.com/auth/calendar'
			}).then(
					function(){ 
							console.log('1.login button click');
							changeButtonVal();
					}
			);
	} else { //if(this.value == 'logout') { 
			googleAuth.signOut().then(
					function(){ 
							console.log('1.logout button click');
							changeButtonVal();
					}
			);
	}
	">

<!-- 
<div class="g-signin2" data-onsuccess="onSignIn"></div>
<script src="https://apis.google.com/js/platform.js?onload=loadAuth2AndClientLibrary" async defer></script>
 -->

<script>
$(document).ready(function(){
    //$("#btn").click(function(){
    //	 todo		
    //});
});


/**
 *  On load, called to load the auth2 library and API client library.
 */
function loadAuth2AndClientLibrary() {
  gapi.load('client:auth2', initClient);
}
		
function initClient() {
			console.log("initClient()....");
			googleAuth = gapi.auth2.init({
				client_id:'132153140522-9kncrdhhuao0ik7fk37i3r1en8c30qle.apps.googleusercontent.com'
			});
			
			googleAuth.then(
					function(){
						console.log("00.gapi.auth2.init() ok")
						changeButtonVal();
						loginButton.onclick = handleLoginButtonClick;
				    logoutButton.onclick = handleLogoutButtonClick;
					},
					function(){
						console.log("00.gapi.auth2.init() error")
					}
			);
}
function handleLoginButtonClick(event) {
  	gapi.auth2.getAuthInstance().signIn();
  	console.log('1.login button click');
		changeButtonVal();
}
function handleLogoutButtonClick(event) {
  	gapi.auth2.getAuthInstance().signOut();
  	console.log('1.logout button click');
		changeButtonVal();
}

function changeButtonVal() {
		//var loginBtn = document.querySelector("#loginBtn");
		//var nameTxt = document.querySelector("#namespan");
		var loginBtn = document.getElementById('loginBtn');
	  var nameTxt = document.getElementById('namespan');
	  
	  //---
	  var loginButton = document.getElementById('loginButton');
	  var logoutButton = document.getElementById('logoutButton');

	  
		if(googleAuth.isSignedIn.get()) {
				console.log("2.button value change : login")
				loginBtn.value = "logout";
				//---
				loginButton.style.display = 'none';
		    logoutButton.style.display = 'block';
				nameTxt.innerHTML = "<b>"+googleAuth.currentUser.get().getBasicProfile().getName()+"</b>";
		}else {
				console.log("2.button value change : logout")
				loginBtn.value = "login";
				//---
				loginButton.style.display = 'block';
			  logoutButton.style.display = 'none';
				nameTxt.innerHTML = "";
		}
}

/** ------------------------
 *  handle login/logout ButtonClick
 */


/* function onSignIn(googleUser) {
	  var profile = googleUser.getBasicProfile();
	  console.log('ID: ' + profile.getId()); // Do not send to your backend! Use an ID token instead.
	  console.log('Name: ' + profile.getName());
	  console.log('Image URL: ' + profile.getImageUrl());
	  console.log('Email: ' + profile.getEmail()); // This is null if the 'email' scope is not present.
} */
</script>

<script src="https://apis.google.com/js/api.js"
      onload="this.onload=function(){};loadAuth2AndClientLibrary()" async defer 
      onreadystatechange="if (this.readyState == 'complete') this.onload()">
</script>
    
</body>
</html>