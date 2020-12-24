<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CARS</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>

	<div class="container">
	
		<div class="my-5">
		<h3>WELCOME TO YOUR GARAGE</h3>
		</div>
		<div class="row">
			
			<table class="table">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">COLOR</th>
      <th scope="col">MODEL</th>
      <th scope="col">MARK</th>
      <th scope="col">PH</th>
      <th scope="col">DATE/C</th>
      <th scope="col">Actions</th>
      
      
      
    </tr>
  </thead>
  <tbody>


  	<c:forEach items="${ requestScope.cars }" var="car">
		<tr>
			<td><c:out value="${car.getId()}"></c:out></td>
			<td><c:out value="${car.getColor()}"></c:out></td>
			<td><c:out value="${car.getModel().getLabel() }"></c:out></td>
			<td><c:out value="${car.getModel().getMark().getLabel() }"></c:out></td>
			<td><c:out value="${car.getNbrch()}"></c:out></td>
			<td><c:out value="${car.getAddDate()}"></c:out></td>
			<td> <a href="/garage2/delete?id=${car.getId()}" class="btn btn-danger">delete</a> <a href="/garage2/update?id=${car.getId()}" class="btn btn-primary">update</a> </td>
			
			
		</tr>
	</c:forEach>


  </tbody>
</table>
			
			
		</div>
		
	
	</div>
	



</body>
</html>