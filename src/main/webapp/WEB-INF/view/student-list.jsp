<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentManagement</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body align="center" class="p-3 mb-2 bg-secondary text-white">

	<div class="container">
		<h1 align="center">Project On CrudOperation</h1>
		<div align="center">

			<form action="showAddStudentPage">

				<input type="submit" value="Add" class="btn btn-primary">

			</form>

			</br>

			<table border="1" class="table table-dark table-striped">
				<thead>
					<td>id</td>
					<td>NAME</td>
					<td>LASTNAME</td>
					<td>MOBILE</td>
					<td>COUNTRY</td>
					<td>GENDER</td>
					<td>UPDATE</td>
					<td>DELETE</td>
				</thead>

				<c:forEach var="student" items="${students}">
					<tr>
						<td>${student.id}</td>
						<td>${student.name}</td>
						<td>${student.lastname}</td>
						<td>${student.mobile}</td>
						<td>${student.country}</td>
						<td>${student.gender}</td>

						<td><a
							href="/Student-management/updateStudent?userId=${student.id}">Update</a></td>
						<td><a
							href="/Student-management/deleteStudent?userId=${student.id}">Delete</a></td>
					</tr>
				</c:forEach>




			</table>



		</div>
	</div>
</body>
</html>