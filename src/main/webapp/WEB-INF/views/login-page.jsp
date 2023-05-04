<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<title>Admin--Page</title>
	<style>
		body{
    background: url(https://wallpaperaccess.com/full/3940531.jpg) no-repeat center fixed;
    background-size: cover;
    font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
}

.login-box {
    width: 360px;
    height: 280px;
    margin: auto;
    border-radius: 3px;
    background: rgba(255,255,255,0.25);
  }
  
  h1 {
    text-align: center;
    padding-top: 15px;
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
  }
  .para-2 {
    text-align: center;
    color: white;
    font-size: 15px;
    margin-top: -10px;
  }
  .para-2 a {
    color: #49c1a2;
  }	</style>
</head>
<body>
	
	<div class="login-box">
      <h1>Login</h1>
      <form:form action="login" method="post" modelAttribute="user">
        <label for="email">Email : </label>
		<form:input type="text" path="email" />
		<form:errors path="email" cssClass="error"/>
		<br>
		<br>
		<label for="password">password</label>
		<form:input type="password" path="password" />
		<form:errors path="password" cssClass="error"></form:errors>
		<br>
		<br>
		<input type="submit" value="Login" />
      </form:form>
    </div>
    <p class="para-2">
      Not have an account? <a href="SignUp-page">Sign Up Here</a>
    </p>
</body>
</html>