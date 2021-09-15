package dao.product;

import model.Product;
import model.Seller;
import model.User;
import util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao extends DbUtil implements ProductDaoI {

    @Override
    public void insertProduct(Product product) {
        String sql;

        sql = "insert into products(productid,productname,";
        sql += "productprice,category,productdesc,url) values(";
        sql += "'" + product.getProductId() + "',";
        sql += "'" + product.getProductName() + "',";
        sql += "'" + product.getProductPrice() + "',";
        sql += "'" + product.getProductCategory() + "',";
        sql += "'" + product.getProductDescription() + "',";
        sql += "'" + product.getProductUrl() + "';";

        execUpdate(sql);
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(Product product) {
        String sql;

        sql = "delete from products where=";
        sql += "'" + product.getProductId() + "';";

        execUpdate(sql);
    }

    @Override
    public Product fetchProductObj(ResultSet resultSet) throws SQLException {
        String sql;

        Product product = new Product( );
        product.setProductId(resultSet.getInt(1));
        product.setProductName(resultSet.getString(2));
        product.setProductPrice(resultSet.getDouble(3));
        product.setProductCategory(resultSet.getString(4));
        product.setProductDescription(resultSet.getString(5));
        product.setProductUrl(resultSet.getString(6));

        return product;
    }

    @Override
    public List<Product> listAll() throws SQLException {
        List<Product> products = new ArrayList<>( );
        String sql;

        sql = "select productid,productname,productprice,category,description,url";
        sql += " from products;";
        ResultSet resultSet = execQuery(sql);
        while (resultSet.next()) {
            products.add(fetchProductObj(resultSet));
        }
        return products;
    }
}
