<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com"
	crossorigin="crossorigin">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
	
</script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
<link
	href="https://fonts.googleapis.com/css2?family=Alkatra&display=swap"
	rel="stylesheet">
<script src="https://kit.fontawesome.com/0d56f5132b.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
	crossorigin="anonymous"></script>


<title>Spring Security</title>
<style type="text/css">
		.card-divider {
			border-bottom: 1px solid #ccc;
		}
		
		input::placeholder {
			font-size: 12px;
			color: red;
		}
</style>
</head>

<body>
<!-- 	<div class="d-flex justify-content-center align-items-center"
		id="login-card" style="height: 100vh;">
		<div class="card" style="width: 20em;">
			<div class="card-body">
				<h3 class="card-title" style="display: flex; justify-content: center; align-items: center; font-family: monospace;">Login</h3>
				<div class="mb-3">
					<label for="username" class="form-label" style=" font-size: 14px;">Username</label> <input
						type="text" class="form-control" id="username"
						placeholder="enter your username"  style="border: none; border-bottom: 1px solid #ccc; height: 27px; ">
				</div>
				<div class="mb-3">
					<label for="password" class="form-label" style=" font-size: 14px;">Password</label> <input
						type="password" class="form-control" id="password"
						placeholder="enter your password"  style="border: none; border-bottom: 1px solid #ccc; height: 27px;">
				</div><br><br>
				<div class="d-grid">
			    <button type="button" class="btn btn-outline-dark">logIn</button>
			    </div>
			    <br><br>
				<div class="mb-3">
				<div class="card-divider"></div><br><br>
				<p style="display: flex; justify-content: center; align-items: center; font-size: 12px">Don't have a Account</p>
				<a href="signupForm" style="display: flex; justify-content: center; align-items: center; text-decoration: none; color: black; font-weight: bold"><spam>SIGNUP</spam></a>
				</div>
			</div>
		</div>
	</div> -->
	
<%-- 	<h2> SignIn here !!</h2>
	<form:form action="saveform" method="post" modelAttribute="userdata">
		
	username :<form:input path="username"/>
	<br>
	password :<form:input path="password"/>
	<button value="loginDetails">submit</button>
	</form:form> --%>
	
	
	
	 <h1>Login Page</h1>
      <form action="/login" method="post">
         <label for="username">Username:</label>
         <input type="text" id="username" name="username"><br><br>
         <label for="password">Password:</label>
         <input type="password" id="password" name="password"><br><br>
         <input type="submit" value="Login">
      </form>
      
</body>
</html>