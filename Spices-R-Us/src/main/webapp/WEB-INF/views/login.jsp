<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <%@
taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="<c:url value='/css/login.css' />" />
  <title>Spices-R-Us | Login</title>
</head>

<body>


<!-- Login Form -->

<h1><b>Login</b></h1>

<form:form action="/login" modelAttribute="user" id="loginForm" method="POST">
  <div class="user-box">
    <form:label path="username"><b><span>Username</span></b></form:label>
    <form:input type="text" path="username" />
  </div>
  <br>
  
  <div class="user-box">
    <form:label path="password"><b><span>Password</span></b></form:label>
    <form:input type="password" path="password" />
  </div>

  <div class="submit">
  <input type="submit" value="Login" />
  </div>
  <br>

  <!-- Link to /register jsp -->
  <a href = /register>Don't have an account?</a>
  
</form:form>

</body>
</html>