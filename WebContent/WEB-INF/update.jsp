<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add new car</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h3>
			Update car
		</h3>
		<hr/>
		
		<div>
			<form method="post" action="/garage2/update">
			<input type="hidden" name="idc" value="${ requestScope.idc }" />
			  <div class="mb-3">
			    <label for="exampleInputEmail1" class="form-label">COLOR</label>
			    <input type="text" class="form-control" name="color" value="${ requestScope.car.getColor() }"  aria-describedby="emailHelp">
		
			  </div>
			  
			  <div class="mb-3">
			    <label for="exampleInputEmail1" class="form-label">PH</label>
			    <input type="number" class="form-control" name="ph" value="${ requestScope.car.getNbrch() }"  aria-describedby="emailHelp">
		
			  </div>
			  
			  <div class="mb-3">
			    <label for="exampleInputEmail1" class="form-label">MODEL</label>
			    
			    <select class="form-control" name="modelid" selected="${ requestScope.car.getModel().getId() }">
			    	<option value="1">X6</option>
			    	<option value="2">E36</option>
			    	<option value="3">Q6</option>
			    	<option value="4">Q7</option>
			    	
			    </select>
		
			  </div>
			  
			  
			  
			  <button type="submit" class="btn btn-primary">Submit</button>
			</form>

		</div>
		
		
	</div>
	
	
	

	
	
	
	
</body>
</html>