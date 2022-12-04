<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>ElementArea</h1>
<h2>Авторизация</h2>
<form action="Controller" method="post">
		<input type="hidden" name="command" value="forward" /> Enter login:<br />
		<input type="text" name="login" value="" /><br /> Enter password:<br />
		<input type="password" name="password" value="" /><br /> 
		<input type="submit" value="Войти" /><br /><br />
	</form>
	<form action="Controller" method="get">
		<input type="submit" value="Регистрация" />
	</form>	
</body>
</html>