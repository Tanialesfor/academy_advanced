<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Авторизация произведена успешно</h1>
<h2=5> Добро пожаловать, пользователь с логином:</h5>
<%
		out.println(request.getParameter("login"));
	%> 
	</br></br></br>
	<form action="index.jsp" method="post">
		<input type="submit" value="Вернуться на главную страницу" />
	</form>
	
	</body>

</html>


