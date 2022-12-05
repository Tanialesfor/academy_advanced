<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Регистрация</h2>
	<form action="Controller" method="post">
		<input type="hidden" name="command" value="forward" /> Enter Your name:<br />
		<input type="text" name="name" value="" /><br /> Enter password:<br />
		<input type="password" name="password" value="" /><br /> Enter Re-enter password:<br />
		<input type="password" name="Re-enter password" value="" /><br />
		
		<input type="submit" value="Зарегистрироваться" /><br />
	</form>	
	<br />
	<form action="index.jsp" method="post">
		<input type="submit" value="Вернуться на главную страницу" />
	</form>	
</body>
</html>