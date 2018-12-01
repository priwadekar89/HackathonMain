<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script src="resources/js/jquery-1.11.0.min.js"></script>
<link href="resources/css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="resources/css/style.css" rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Arimo:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="resources/js/modernizr.custom.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<h1>Level 1 Exam</h1>

	Question: ${questionData. getGq_question()} 
	
	<div>

		<form action="nextQn.html" method="post">


			<input type="radio" name="op" value="${questionData.getGq_op1_Ans()}">${questionData.getGq_op1()}<br>
			<input type="radio" name="op" value="${questionData.getGq_op2_Ans()}">${questionData.getGq_op2()}<br>
			<input type="radio" name="op" value="${questionData.getGq_op3_Ans()}">${questionData.getGq_op3()}<br>
			<input type="radio" name="op" value="${questionData.getGq_op4_Ans()}">${questionData.getGq_op4()}<br>

			<input type="submit" value="Next Question">


		</form>
	</div>
	
</body>
</html>