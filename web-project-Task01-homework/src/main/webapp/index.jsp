<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title> Страница авторизации</title>
    <link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>
<div class="main">
            <div class="header">
                <img id="logo" class="logo" src="images/logo-rabbit.png" alt="Logo">
                <div class="title"> <b> Авторизация</b>
                </div>
            </div>
            <div class="content">

                <form id="avtorization-form" name="avtorizationForm" method="post" action="Controller">
                    <fieldset>
                        <div class="label-and-field">
                            <label for="login">Логин</label>
                            <input type="text" id="login" name="login" class="round full-width-box">
                        </div>
                            <div class="label-and-field">
                                  <label for="password">Пароль</label>
                                  <input type="password" id="password" name="password" class="round full-width-box">
                            </div>
                        <input name="submit" type="submit" class="action-button round blue" value="Войти">
                    </fieldset>
                </form>
                <form id="registration-form" name="registrationForm" method="get" action="Controller" >
  		             <input type="submit" value="Регистрация" />
  	            </form>
            </div>
            <div class="footer">
            </div>
          </div>
</body>
</html>




<!-- <h1>ElementArea</h1>
<h2>Авторизация</h2>
<form action="Controller" method="post">
		<input type="hidden" name="command" value="forward" /> Enter login:<br />
		<input type="text" name="login" value="" /><br /> Enter password:<br />
		<input type="password" name="password" value="" /><br /> 
		<input type="submit" value="Войти" /><br /><br />
	</form>
	<form action="Controller" method="get">
		<input type="submit" value="Регистрация" />
	</form>	-->
