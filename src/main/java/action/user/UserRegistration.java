package action.user;

import model.User;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserRegistration extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getParameter("pass-reg").equals(req.getParameter("pass-reg-rep"))) {

        }

        User user = new User( );
        user.setUserName(req.getParameter("user-reg"));
        user.setUserPassword(req.getParameter("pass-reg"));
        user.setUserEmail("email-reg");
    }
}
//
//    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//    }

