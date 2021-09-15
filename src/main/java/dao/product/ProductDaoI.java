package dao.product;

import model.Admin;
import model.Product;
import model.Seller;
import model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface ProductDaoI {

    void insertProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
    Product fetchProductObj(ResultSet resultSet) throws SQLException;
    List<Product> listAll() throws SQLException;
}
