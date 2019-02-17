<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html>

<html lang="en">

	<head>
	
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
		      integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" 
		      crossorigin="anonymous">
	
		<meta charset="ISO-8859-1">
		
		<title>Courses</title>
		
		<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		
		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
		
		<script>
		
			$(function() {
			
				$("#datepicker").datepicker();
				
			});
			
		</script>
		
		<style type="text/css">
		
			.weekDays-selector input {
			
				display: none!important;
				
			}
			
		.weekDays-selector input[type=checkbox] + label {
		
			display: inline-block;
			
			border-radius: 6px;
			
			background: #dddddd;
			
			height: 40px;
			
			width: 30px;
			
			margin-right: 3px;
			
			line-height: 40px;
			
			text-align: center;
			
			cursor: pointer;
			
		}
		
		.weekDays-selector input[type=checkbox]:checked + label {
			
			background: #2AD705;
			
			color: #ffffff;
			
		}
		
		</style>	
		
	</head>
	
	<body>
	
		<nav class="navbar navbar-inverse navbar-fixed-top">
			
			<div class="container">
			
				<div class="navbar-header">
				
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
						
						<span class="sr-only">Toggle navigation</span>
						
						<span class="icon-bar"></span>
						
						<span class="icon-bar"></span>
						
						<span class="icon-bar"></span>
						
					</button>
					
					<a class="navbar-brand" href="#">Project name</a>
					
				</div>
				
				<div id="navbar" class="collapse navbar-collapse">
				
					<ul class="nav navbar-nav">
						
						<li class="active"><a href="#">Home</a></li>
						
						<li><a href="#about">About</a></li>
						
						<li><a href="#contact">Contact</a></li>
						
					</ul>
					
				</div>
				
			</div>
			
		</nav>
		
			<div class="container">
			
				<div style="margin-top: 100px"></div>
				
				<div style="width: 300px">
				
					<br><br>
					
						<form>
						
							<div class="course-selector">
						
							Courses
						
								<select class="form-control">
							
									<option value="Java Programming">Java Programming</option>
								
									<option value="C#">C#</option>
								
									<option value="C++">C++</option>
								
									<option value="Ruby on Rails">Ruby on Rails</option>
								
									<option value="PHP">PHP</option>
									
									<option value="SQL">SQL</option>
								
									<option value="JavaScript">JavaScript</option>
								
								</select>
						
							</div>
						
						Professors
							
							<select class="form-control">
							
								<option value="John White">John White</option>
								
								<option value="Michael Brown">Michael Brown</option>
								
								<option value="Tina Doe">Tina Doe</option>
								
								<option value="Emily Winter">Emily Winter</option>
								
								<option value="Christine Summer">Christine Summer</option>
								
							</select>
						
						<br>
						
							Room Number
			
							<div class="form-group">
			
									<label for="Room number">Room number</label>
				
								<input type="text" class="form-control" name="Room number" value="roomNumber" id="room-number" placeholder="Room number">
			
							</div>
							
						<br>
						
							Time
			
							<div class="form-group">
			
									<label for="Time">Time</label>
				
								<input type="text" class="form-control" name="time" value="time" id="time" placeholder="Time">
			
							</div>
								
						<br>
							
					<div class="weekDays-selector">
					
						<input type="checkbox" name="weekday" value="MONDAY" id="weekday-mon" class="weekday" />
							
							<label for="weekday-mon">M</label>
							
						<input type="checkbox" name="weekday" value="TUESDAY" id="weekday-tue" class="weekday" />
						
							<label for="weekday-tue">T</label>
							
						<input type="checkbox" name="weekday" value="WEDNESDAY" id="weekday-wed" class="weekday" />
						
							<label for="weekday-wed">W</label>
							
						<input type="checkbox" name="weekday" value="THURSDAY" id="weekday-thu" class="weekday" />
							
							<label for="weekday-thu">T</label>
							
						<input type="checkbox" name="weekday" value="FRIDAY" id="weekday-fri" class="weekday" />
						
							<label for="weekday-fri">F</label>
							
					</div>
					
					<br>
				
						<p>Date: <input type="text" id="datepicker"></p>
					
						<button type="submit">add course</button>
							
					</form>
					
					<c:if test="${courses != null}">
					
						<table style="width:100%">
					
  							<tr>
  						
    							<th>Course</th>
    							<th>Professor</th> 
    							<th>Room Number</th>
    							<th>Time</th>
    							<th>Weekday/s</th>
    							<th>Start Date</th>
    						
  							</tr>
 						 
							<c:forEach items="${courses}" var="course">
 						 
								<tr>      
    						
									<td><c:out value="${course.courseName}"/></td>
									<td><c:out value="${course.professor}"/></td>
									<td><c:out value="${course.roomNumber}"/></td>
									<td><c:out value="${course.time}"/></td>
									<td><c:out value="${course.weekDays}"/></td> 
									<td><c:out value="${course.startDate}"/></td> 
                                 
								</tr>
                            
							</c:forEach>

						</table>
						
					</c:if>
					
				</div>
				
			</div>				
								
	</body>
	
</html>