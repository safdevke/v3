package action.admin;

import dao.product.ProductDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ListProducts", value = "/listproducts")
public class ListProducts extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            req.setAttribute("productlist",new ProductDao().listAll());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/resources/list-products.jsp");
        requestDispatcher.forward(req,resp);
    }
}
