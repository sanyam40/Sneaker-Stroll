<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Sign Up</title>
    <style>
    
    body {
    background :url(https://wallpaperaccess.com/full/3940531.jpg) no-repeat center fixed;
    background-size: cover;

    font-family: "Roboto", sans-serif;
  }
  
  .signup-box {
    width: 360px;
    height: 620px;
    margin: auto;
    background: rgba(255,255,255,0.25);
    border-radius: 3px;
  }
  
  
  h1 {
    text-align: center;
    padding-top: 15px;
  }
  
  h4 {
    text-align: center;
  }
  
  form {
    width: 300px;
    margin-left: 20px;
  }
  
  form label {
    display: flex;
    margin-top: 20px;
    font-size: 18px;
    
  }
  
  form input {
    width: 100%;
    padding: 7px;
    border: none;
    border: 1px solid gray;
    border-radius: 6px;
    outline: none;
  }
  input[type="button"] {
    width: 320px;
    height: 35px;
    margin-top: 20px;
    border: none;
    background-color: #49c1a2;
    color: white;
    font-size: 18px;
  }
  p {
    text-align: center;
    padding-top: 20px;
    font-size: 15px;
    color: white;
  }
    
    </style>
    
  </head>
  <body>
    <div class="signup-box">
      <h1>Sign Up</h1>
      <h4>It's free and only takes a minute</h4>
      <form:form action="signup" method="post" modelAttribute="user">
        <label for="firstName">FirstName</label>
		<form:input type="text" path="firstName" />
		<form:errors path="firstName" cssClass="error"/>
		<br>
		<label for="lastName">LastName</label>
		<form:input type="text" path="lastName" />
		<form:errors path="lastName" cssClass="error"/>
		<br>
		<label for="email">Email</label>
		<form:input type="text" path="email" />
		<form:errors path="email" cssClass="error"/>
		<br>
		<label for="password">password</label>
		<form:input type="password" path="password" />
		<form:errors path="password" cssClass="error"></form:errors>
		<br>
		<input type="submit" value="Login" />
      </form:form>
      <p>
        By clicking the Sign Up button,you agree to our <br />
        <a href="#" style="color: rgb(127, 5, 249)">Terms and Condition</a> and <a href="#" style="color: rgb(127, 5, 249);">Policy Privacy</a>
      </p>
    </div>
    <p class="para-2">
     Already have an account? <a href="login.html" style="color: rgb(127, 5, 249);">Login here</a>
    </p>
  </body>
</html>