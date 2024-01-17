<!DOCTYPE html>
<html lang="en">
<head>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.17.0/font/bootstrap-icons.css">
    <link href="assets/css/style_1.css" rel="stylesheet" type="text/css"/>
    <link href="assets/css/style_2.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="css/app.css">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css">
    <title>Đăng Nhập</title>
</head>

<body>
    <div id="wrapper">
        <form action="LoginAccount" id="form-login">
            <h1 class="form-heading">Đăng Nhập</h1>
            <div class="form-group">
                <i class="far fa-user"></i>
                <input type="text" class="form-input" placeholder="Email" name="Email">
            </div>
            <div class="form-group">
                <i class="fas fa-key"></i>
                <input type="password" class="form-input" placeholder="Password" name="password">
                <div id="eye">
                    <i class="far fa-eye"></i>
                </div>
            </div>  
            <a style="color:white;" href="ForgotPassword.jsp" target="_blank">Forgot Password?</a>
            <input type="submit" value="Đăng nhập" class="form-submit">
            <br>
            <br> 
            <div style="display:flex; justify-content: center;">
                <p style="color:white; text-align: center; ">Or Login With</p>
                <a style="margin-left: 10px;"href="https://accounts.google.com/o/oauth2/auth?scope=profile email&redirect_uri=http://localhost:8080/FAQuestion/LoginGoogleServlet&response_type=code
                                           &client_id=357909169797-n5m8ikaahjv1at1qblloaksu6asm2ijh.apps.googleusercontent.com&approval_prompt=force" target="_blank"><img src="assets/img/googoo.png" width="25px" height="25px" alt="alt"/></a>
            </div>
        </form>
         
    </div>
    
    
    <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
    <script src="assets/js/app.js.js"></script>
</body>
</html>
