package action.user;

import dao.user.UserDao;
import dao.user.UserDaoI;
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

@WebServlet(name = "UserLogin", value = "/login")
public class UserLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/resources/vendor.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user = new User();
        user.setUserName(req.getParameter("user-login"));
        user.setUserPassword(req.getParameter("pass-login"));
        PrintWriter out = resp.getWriter();

        try {
            if (new UserDao().validateUser(user)) {
                RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/resources/site.jsp");
                rd.forward(req, resp);
            }
            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/resources/vendor.jsp");
            rd.include(req, resp);
            out.println(warningMessage());
        }catch (SQLException ex) {
            ex.printStackTrace( );
        }
    }

    protected String warningMessage() {

        String alert = " <head>\n" +
                "  <link rel=" + "\"import\"" + "href=" + "\"/WEB-INF/resources/vendor.jsp\"" + ">\n" +
                "</head>" +
                "<p> Incorrect </p>";

        return alert;
    }
}