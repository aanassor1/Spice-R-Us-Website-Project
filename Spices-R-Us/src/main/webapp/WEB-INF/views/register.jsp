<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="<c:url value='/css/register.css' />" />
  <title>Spices-R-Us | Register</title>
</head>

  <body>

    <!-- Registration Form -->

    <h1><b>Register</b></h1>

    <form:form action="/registerUser" modelAttribute="spiceUser" id="registerForm" method="POST">
    
      <div class="user-box">


      <form:label path="email"><b><span>Email</span></b></form:label>
      <form:input type="email" path="email" />
      <form:errors path="email" />
      <br><br>

      <form:label path="firstName"><b><span>First Name</span></b></form:label>
      <form:input path="firstName" />
      <form:errors path="firstName" />
      <br><br>

      <form:label path="lastName"><b><span>Last Name</span></b></form:label>
      <form:input path="lastName" />
      <form:errors path="lastName" />
      <br><br>
  
      <form:label path="username"><b><span>Username</span></b></form:label>
      <form:input path="username" />
      <form:errors path="username" />
      <br><br>

      <form:label path="password"><b><span>Password</span></b></form:label>
      <form:input type="password" path="password" />
      <form:errors path="password" />
      <br><br>

      <form:label path="confirmPassword"><b><span>Confirm password</span></b></form:label>
      <form:input type="password" path="confirmPassword" />
      <form:errors path="confirmPassword" />
      <br>


      </div>

      <div class="submit">
      <input type="submit" value="Sign Up" />
      </div>
      <br>
      
      <!-- Link to /login jsp -->
      <a href = /login>Already have an account? Login here</a>

    </form:form>

  </body>
  </html>