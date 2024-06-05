/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.login;

import Modal.User;
import dal.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
public class LoginAccount extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginAccount</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginAccount at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // ...

// ...

// ...

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    HttpSession mySession = request.getSession();

    // Kiểm tra xem người dùng đã đăng nhập chưa
    if (mySession.getAttribute("userSession") != null) {
        // Người dùng đã đăng nhập, chuyển hướng đến trang UserProfile
        response.sendRedirect("userProfile.jsp");
        return;
    }

    // Nếu chưa đăng nhập, xử lý đăng nhập
    UserDAO userDAO = new UserDAO();
    String email = request.getParameter("Email");
    String password = request.getParameter("password");
    boolean checkLoginValid = true;

    if (email == null || email.trim().isEmpty()) {
        request.setAttribute("errEmail", "Email is not valid");
        checkLoginValid = false;
    } else {
        request.setAttribute("valueUsername", email);
    }

    if (password == null || password.trim().isEmpty()) {
        request.setAttribute("errPassword", "Password is not valid");
        checkLoginValid = false;
    } else {
        request.setAttribute("valuePassword", password);
    }

    if (checkLoginValid) {
        boolean checkLogin = true;

        // Kiểm tra username trong DB
        if (!userDAO.isEmailExists(email)) {
            mySession.setAttribute("status", "failedUsername");
            checkLogin = false;
            request.setAttribute("valueUsername", "");
        } else {
            // Kiểm tra mật khẩu của username trong DB
            // password = encryptPassword.toSHA1(password);
            if (!userDAO.isUserExists(email, password)) {
                mySession.setAttribute("status", "failedPassword");
                request.setAttribute("valuePassword", "");
                checkLogin = false;
                request.setAttribute("valueEmail", email);
                request.setAttribute("errorMessage", "Incorrect password");
            }
        }

        if (checkLogin) {
            request.setAttribute("valueUsername", "");
            request.setAttribute("valuePassword", "");
            request.setAttribute("errUsername", "");
            request.setAttribute("errPassword", "");
            request.setAttribute("status", "success");

            User userSession = userDAO.getUserByEmail(email, password);
            mySession.setAttribute("userSession", userSession);

            // Chuyển hướng đến trang UserProfile
            response.sendRedirect("userProfile.jsp");
            return;
        } else {
            // Thêm thông báo khi mật khẩu sai
            request.setAttribute("errorMessage", "Incorrect password");
        }
    }

    // Nếu đăng nhập không thành công, chuyển hướng đến trang Login
    request.getRequestDispatcher("Login.jsp").forward(request, response);
}

// ...

// ...

// ...


    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
