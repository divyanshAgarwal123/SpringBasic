<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="animate.css">
  <style>
  .modal-backdrop.show {
    opacity: .5;
 position:static;
 }
 .jumbotron {
    padding: 2rem 1rem;
    margin-bottom: 2rem;
    background-color: #000000ba;
    border-radius: .3rem;
	height:67px;
}
.grad1 {
  height: 38em;
  background-image:linear-gradient(to right,Lightskyblue,Darkslateblue);
}
  </style>
</head>
<body>
<div class=grad1>
<center>
<div class="container ">
  <div class="row">
   <div class="col-lg-4">
<div class="card" style="width:34em;height:386px;postition:relative;right:-21em;top:6em">
    <img class="card-img-top img-responsive" src="61f346045132db493cbfc22c9b9b92b1.jpg" alt="Card image" width="100">
    <div class="card-body">
    <h3 class="card-title">Your name is ${key} ${key2} </h3><br>
    <h3 class="card-title">Your email is ${key3} </h3><br>
    <h3 class="card-title">Your password is ${key4} </h3><br>
</div>
</div>
</div>
</div>
</div>
</div>
</center>
</body>
</html>