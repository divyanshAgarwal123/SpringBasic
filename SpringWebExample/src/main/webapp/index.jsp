<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
 
  <style>
.container {
 padding: 30px;
}
hr.style1{
	border-top: 3px solid #8c8b8b;
}
.grad1 {
  height: 100%;
  background-image:linear-gradient(to right,Lightskyblue,Darkslateblue);
}

</style>
<script type="text/javascript"> 	
$(document).ready(function(){ 	
	$("#userMsg").hide(); 
	var user_name = false;
	

	$("#userName").keyup(function()
		
	{ 	 		
		userNameValidate(); 	 	
	});
	$("#btn").click(function(){
		user_name = false;
		userNameValidate(); 
		if(user_name == false)
		{
			return true:
		}
		else{
			return false;
		}
		
	});
	function userNameValidate()
	{
	u_name = $("#userName").val();

	var reg = /^[A-Za-z]+$/;
	if((reg.test(u_name))  && u_name.length>2){

	$("#userName").css("border","2px solid green");

	$("#userMsg").html("<p class='text-success'>User Name is  valid</p>");
	return true;

	}

	else
	{

	$("#userMsg").show();
	$("#userName").css("border","2px solid red");
	$("#userMsg").html("<p class='text-danger'>User Name is not valid</p>");
	$("#userMsg").focus();
	user_name  = true;
	return false;


	}

	}
	
});
</script>
</head>                                                       
<body>
<center>

<div class="grad1">
<div style = "position:relative;top:41px">
<div class="border-0" style="border-radius:8px;height:520px;width:32em;backgrounD:white">
<form action="hello" method="post"> 
<div class="container">
<h5><b>REGISTRATION FORM</b></H5>
<hr class="style1">
<div>
<input type="text" id="userName" class="form-control col-lg-8" placeholder = "First Name" name="user1"><br>
<span id="userMsg"> </span>
<input type="text" class="form-control col-lg-8" placeholder ="Second Name" name="user2"><br>

<input type="text" class="form-control col-lg-8"placeholder="EMAIL" name="email">

</div>
<div>
<br><input type="password" class="form-control col-lg-8"placeholder="password" name="pass1">

<br><input type="password" class="form-control col-lg-8"placeholder="confirm password" name="pass2"><br>

</div>
<br>
<button id="btn" class="btn btn-primary form-control col-lg-4"> submit </button>

</div>
</div>
</div>
</div>
</form>
</div>
</center>
</body>
</html>