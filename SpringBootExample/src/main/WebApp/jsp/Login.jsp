<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">

<link href="./jsp/Login.css" rel="stylesheet">
</head>
<body>
 <div class="container">
       <div class="card card-container">
          <header>
           <div class="login-head">
              <h1 class="login-head-content"><i class="fa fa-user"></i>  User Login</h1>
           </div>
           </header>
           <form:form class="form-signin" >
               <span id="reauth-email" class="reauth-email"></span>
               <form:input type="email" id="inputEmail" class="form-control" placeholder="Email" required autofocus/>
               <form:input type="password" id="inputPassword" class="form-control" placeholder="Password" required/>
               <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit" onclick="location.href='importData.html'">Sign in</button>
           </form:form>
           <a href="SignUp.html" class="signup">New User? Sign up</a>
       </div>
    </div>
</body>
</html>