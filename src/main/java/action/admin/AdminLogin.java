package action.admin;

import dao.admin.AdminDao;
import dao.user.UserDao;
import model.Admin;
import model.Seller;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "AdminLogin", value = "/vendor")
public class AdminLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/resources/vendor.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Admin admin = new Seller();
        admin.setAdminName(req.getParameter("user-login"));
        admin.setAdminPassword(req.getParameter("pass-login"));

        //boolean match = new AdminDao().validateAdmin(admin);
        //req.setAttribute("validate",match);

        if (admin.getAdminName().equals("admin") && admin.getAdminPassword().equals("admin")) {
            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/resources/add-products.jsp");
            rd.forward(req, resp);
        }
    }
}

