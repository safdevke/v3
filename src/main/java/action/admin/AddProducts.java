package action.admin;

import dao.product.ProductDao;
import model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "AddProducts", value = "/addproducts")
public class AddProducts extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/resources/add-products.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Product product = new Product();
        product.setProductId(new Random().nextInt(1000000));
        product.setProductName(req.getParameter("product name"));
        product.setProductPrice(Double.valueOf(req.getParameter("product price")));
        product.setProductUrl(req.getParameter("product url"));
        product.setProductCategory(req.getParameter("product category"));
        product.setProductDescription(req.getParameter("product description"));

        //Insert Products to Db
        new ProductDao().insertProduct(product);

        //Set attributes to use in jsp
        req.setAttribute("product name", product.getProductName());
        req.setAttribute("product price", product.getProductPrice());
        req.setAttribute("product url", product.getProductUrl());
        req.setAttribute("product category", product.getProductCategory());
        req.setAttribute("product description", product.getProductDescription());

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/resources/list-products.jsp");
        requestDispatcher.forward(req, resp);
//        if (req.getParameter("submit") != null) {
//            requestDispatcher = req.getRequestDispatcher("/WEB-INF/resources/add-products.jsp");
//        }
    }
}
