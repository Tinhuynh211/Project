<!DOCTYPE html>
<html lang="vi">

    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

        <meta charset="ISO-8859-1">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="" name="description">
        <meta content="" name="keywords">
        <title>FPT ACADEMY</title>

        <!-- Favicons -->
        <link href="assets/img/FPTLOGO.png" rel="icon">
        <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
        <link href="assets/vendor/aos/aos.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">


        <link href="assets/css/style.css" rel="stylesheet">

    </head>



    <body>
        <%@include file="layouts/Guest/headerGuest.jsp" %> 
        <section id="hero" class="d-flex justify-content-center align-items-center">
            <div class="container position-relative" data-aos="zoom-in" data-aos-delay="100">
                <h1>Học Thử Miễn Phí<br>Cùng Chuyên Gia tại FPT Software</h1>
                <h2>Học viện đào tạo kỹ sư Công nghệ thông tin trực thuộc FPT Software</h2>
                <a href="courses.html" class="btn-get-started">Tìm hiểu thêm</a>
            </div>
        </section><!-- End Hero -->

        <main id="main">

            <div id="content" role="main" class="content-area">

                <div class="container section-title-container custom-section-title title-small-border">
                    <h1 class="section-title section-title-normal"><b></b><span class="section-title-main">Lịch khai giảng</span><b></b></h1>
                </div>

                <section class="section schedule-section">
                    <div class="container">
                        <form action="" method="get" class="form-filter">
                            <!-- Your existing filter dropdowns and buttons -->

                            <div class="list-items mt-half">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>Khoá học</th>
                                            <th>Ngày khai giảng</th>
                                            <th>Khu vực</th>
                                            <th>Lịch học</th>
                                            <th>Thời lượng</th>
                                            <th>Chỗ trống</th>
                                            <th>Đăng ký</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <!-- Example rows with registration buttons -->
                                        <tr>
                                            <td>[HCM] Full-stack Java Web Developer</td>
                                            <td>19-01-2024</td>
                                            <td>Hồ Chí Minh</td>
                                            <td>18h - 21h Thứ 2-4-6</td>
                                            <td>216 giờ</td>
                                            <td>6/20</td>
                                            <td>
                                                <!--<button class="btn item-action">Đăng ký</button>-->
                                                <button type="button" class="btn item-action" data-toggle="modal" data-target="#exampleModalCenter">
                                                    Đăng ký 
                                                </button>
                                                <!-----------------------modal----------------------->
                                                <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                                                    <div class="modal-dialog modal-dialog-centered" role="document">
                                                        <div class="modal-content">
                                                            <div class="modal-header">
                                                                <h5 class="modal-title" id="exampleModalLongTitle">Modal title</h5>
                                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                                    <span aria-hidden="true">&times;</span>
                                                                </button>
                                                            </div>
                                                            <div class="modal-body">
                                                                ...
                                                            </div>
                                                            <div class="modal-footer">
                                                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                                <button type="button" class="btn btn-primary">Save changes</button>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!-------------------end modal------------------>
                                            </td>
                                        </tr>
                                        <!-- Add more rows as needed -->
                                    </tbody>
                                </table>
                            </div>

                            <div class="box-pagination">
                                <div class="pagination">
                                    <a href="#" class="current">1</a>
                                    <a href="#">2</a>
                                    <a href="#">3</a>
                                    <a href="#">4</a>
                                </div>
                                <div>
                                    <span>Rows per page</span>
                                    <select name="per_page" class="per-page">
                                        <option value="6">6</option>
                                        <option value="12">12</option>
                                        <option value="18">18</option>
                                    </select>
                                </div>
                            </div>
                        </form>
                    </div>
                </section>

            </div>
        </main>

        <!-- ======= Footer ======= -->
        <footer id="footer">

            <div class="footer-top">
                <div class="container">
                    <div class="row">

                        <div class="col-lg-3 col-md-6 footer-contact">
                            <h3>FPT ACADEMY</h3>
                            <p>
                            <ul>
                                <li> Tòa nhà FPT Complex, đường Nam Kỳ Khởi Nghĩa, Quận Ngũ Hành Sơn, TP Đà Nẵng<br></li>
                                <li> Tòa nhà FPT Massda, đường số 01, KCN An Đồn, Sơn Trà, Đà Nẵng<br>                            </li>
                            </ul>                                                                                                                
                            <strong>Email:</strong> FA.DN@fpt.com<br>
                            </p>
                        </div>

                        <div class="col-lg-2 col-md-6 footer-links">
                            <h4>Our Link</h4>
                            <ul>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Trang chủ</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Giới thiệu</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Đào tạo</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Chăm sóc khách hàng</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Chính sách bảo mật</a></li>
                            </ul>
                        </div>

                        <div class="col-lg-3 col-md-6 footer-links">
                            <h4>Our Services</h4>
                            <ul>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Web Design</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Web Development</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Product Management</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Marketing</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Graphic Design</a></li>
                            </ul>
                        </div>

                        <div class="col-lg-4 col-md-6 footer-newsletter">
                            <h4>GIA NHẬP FPT SOFTWARE ACADEMY</h4>
                            <p>Nhập email của bạn để có thể nhận được thông báo mới nhất của chúng tôi</p>
                            <form action="" method="post">
                                <input type="email" name="email"><input type="submit" value="Subscribe">
                            </form>
                        </div>

                    </div>
                </div>
            </div>



        </div>
    </footer><!-- End Footer -->

    <div id="preloader"></div>
    <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

    <!-- Vendor JS Files -->
    <script src="assets/vendor/purecounter/purecounter_vanilla.js"></script>
    <script src="assets/vendor/aos/aos.js"></script>
    <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
    <script src="assets/vendor/php-email-form/validate.js"></script>


    <!-- Template Main JS File -->
    <script src="assets/js/main.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <!-- jQuery -->
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>

    <!-- Bootstrap JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

</body>

</html>