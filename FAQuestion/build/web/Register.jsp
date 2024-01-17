<!DOCTYPE html>
<html lang="en">
<head>
     <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="assets/css/style_1.css" rel="stylesheet" type="text/css"/>
    <link href="assets/css/style_2.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="css/app.css">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css">
    <title>Đăng Kí</title>
</head>

<body>
    <div id="wrapper">
        <form action="" id="form-login">
            <h1 class="form-heading">Đăng Kí</h1>
            <div class="form-group">
                <i class="far fa-user"></i>
                <input type="text" class="form-input" placeholder="Username">
            </div>
            <div class="form-group">
                <i class="far fa-envelope"></i>
                <input type="text" class="form-input" placeholder="Your Email">
            </div>
            <div class="form-group">
                <i class="fas fa-key"></i>
                <input type="password" class="form-input" placeholder="Password">
                <div id="eye">
                    <i class="far fa-eye"></i>
                </div>
            </div>
            <div class="form-group">
                <i class="fas fa-key"></i>
                <input type="password" class="form-input" placeholder="Repeat your password">
                <div id="eye">
                    <i class="far fa-eye"></i>
                </div>
            </div>
            <div class="form-group">
                <i class="far fa-lock"></i>
                <input type="text" class="form-input" placeholder="Contact no">
            </div>
            <a  style="color:white; " href="Login.jsp" target="_blank">I am already a member</a>
            <input type="submit" value="Đăng Kí" class="form-submit">
        </form>
    </div>
    
</body>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="assets/js/app.js.js"></script>
</html>