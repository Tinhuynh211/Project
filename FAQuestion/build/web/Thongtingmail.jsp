<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Thông Tin Email</title>
    <!-- Bổ sung các thẻ style, link, script cần thiết cho trang của bạn -->
</head>
<body>
    <h1>Thông Tin Email</h1>

    <p>Id: ${id}</p>
    
    <p>Email: ${email}</p>
    <p>Verified Email: ${verified_email}</p>
    <p>Name: ${name}</p>
    <p>Given Name: ${given_name}</p>
    <p>Family Name: ${family_name}</p>
    <p>Link: ${link}</p>
    <p>Picture: <img src="${picture}" alt="Profile Picture"></p>

    <!-- Bổ sung phần HTML và CSS khác tùy thuộc vào yêu cầu của bạn -->

</body>
</html>
