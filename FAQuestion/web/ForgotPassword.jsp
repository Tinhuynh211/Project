<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forgot Password</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-position: center;
            background-color: #eee;
            background-repeat: no-repeat;
            background-size: cover;
            color: #505050;
            font-family: "Rubik", Helvetica, Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            line-height: 1.5;
            text-transform: none;
        }

        .forgot {
            background-color: #fff;
            padding: 12px;
            border: 1px solid #dfdfdf;
        }

        .forgot h2 {
            font-weight: bold;
        }

        .padding-bottom-3x {
            padding-bottom: 72px !important;
        }

        .card-footer {
            background-color: #fff;
        }

        .btn {
            font-size: 13px;
        }

        .form-control:focus {
            color: #495057;
            background-color: #fff;
            border-color: #76b7e9;
            outline: 0;
            box-shadow: 0 0 0 0px #28a745;
        }

        .container {
            margin-top: 5%;
        }

        .card {
            border: none;
            box-shadow: 0px 0px 15px 0px rgba(0, 0, 0, 0.1);
        }

        label {
            font-weight: bold;
        }

        .card-footer {
            border-top: none;
            padding: 1.25rem;
            text-align: center;
        }

        .btn-success {
            background-color: #28a745;
            border-color: #28a745;
        }

        .btn-danger {
            background-color: #dc3545;
            border-color: #dc3545;
        }
    </style>
</head>
<body oncontextmenu='return false' class='snippet-body'>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-lg-8 col-md-10">
                <form class="card mt-4" action="ForgotPasswordServlet" method="POST">
                    <div class="card-body">
                        <h2 class="card-title text-center mb-4">Forgot Password</h2>
                        <div class="form-group">
                            <label for="email-for-pass" >Enter your email address :</label>
                            <input class="form-control" type="text" name="email" id="email-for-pass" required="" placeholder="Input Your Email">
                            <small class="form-text text-muted text-center pt-3">Enter the registered email address. We'll email an OTP to this address.</small>
                        </div>
                    </div>
                    <div class="card-footer text-center">
                        <button class="btn btn-success" type="submit">Get New Password</button>
                        <a href="Login.jsp" class="btn btn-danger" type="submit">Back to Login</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js"></script>
</body>
</html>
