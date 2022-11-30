<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Students</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">


</head>
<body >



	<div align="center"  class="table table-hover">


</br>

		<h1>Add Student</h1>
		<br>


		<form:form action="save-student" modelAttribute="student"
			method="POST" >

			<form:hidden path="id" />

			<div>
				<label class="form-label"> NAME : </label>
				<form:input path="name"   />
			</div>
			<br>
		
		
			<div >
				<label class="form-label">LAST NAME :</label>
				<form:input path="lastname" />
			</div>

			<br>


			<div>
				<label class="form-label">MOBILE :</label>
				<form:input path="mobile" />
			</div>
			<br>


			<div>
				<label class="form-label">COUNTRY : </label>
				<form:input path="country" />
			</div>
			<br>


			<div>
				<form:label path="gender">GENDER :</form:label>

				<form:radiobutton path="gender" value="M" label="Male" />
				<form:radiobutton path="gender" value="F" label="Female" />
				<form:radiobutton path="gender" value="O" label="other" />

			</div>
			<br>


			<input type="submit" value="submit" class="btn btn-success">

		</form:form>
	</div>
</body>
</html>