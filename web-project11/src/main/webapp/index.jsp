<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="MyServlet" method="get"> 
  <p>Please select your preferred contact method:</p>
  <div>
    <input type="radio" id="contactChoice1"
           name="contact" value="email">
    <label for="contactChoice1">Email</label>
    
    <input type="radio" id="contactChoice2"
           name="contact" value="phone">
    <label for="contactChoice2">Phone</label>
    
    <input type="radio" id="contactChoice3"
           name="contact" value="mail">
    <label for="contactChoice3">Mail</label>
    
  </div>
  
  <br/>
   <div>
    <input type="radio" id="contactChoice4"
           name="contact1" value="email1">
    <label for="contactChoice4">Email1</label>
    
    <input type="radio" id="contactChoice5"
           name="contact1" value="phone1">
    <label for="contactChoice5">Phone1</label>
    
    <input type="radio" id="contactChoice6"
           name="contact1" value="mail1">
    <label for="contactChoice6">Mail1</label>
  </div>
  <br/>
  <div>
    <input type="checkbox" name="vehicle" value="Bike">I have a bike<br>
    <input type="checkbox" name="vehicle" value="Car">I have a car<br>
    <input type="checkbox" name="vehicle" value="Lorry">I have a lorry<br>
    <input type="checkbox" name="vehicle" value="Moto">I have a moto<br>
    <input type="checkbox" name="vehicle" value="Trakc">I have a track<br>
  </div>
  <br/>
  
  <div>
    <input type="submit" value="press me"/>
  </div>
</form>


<br/>

<!-- 
<form> 
  <p>Please select your preferred contact method:</p>
  <div>
    <input type="radio" id="contactChoice1"
           name="contact" value="email">
    <label for="contactChoice1">Email</label>
    
    <input type="radio" id="contactChoice2"
           name="contact" value="phone">
    <label for="contactChoice2">Phone</label>
    
    <input type="radio" id="contactChoice3"
           name="contact" value="mail">
    <label for="contactChoice3">Mail</label>
    
  </div>
  <div>
    <button type="submit">Submit</button>
  </div>
</form>

-->
</body>
</html>