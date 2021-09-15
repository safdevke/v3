package dao.admin;

import model.Admin;
import model.Seller;
import model.User;

import java.sql.SQLException;
import java.util.List;

public interface AdminDaoI {

    boolean validateAdmin(Admin admin) throws SQLException;
    boolean insertAdmin(Admin admin);
    boolean updateAdmin(Admin admin);
    boolean deleteAdmin(Admin admin);

    List<Admin> listAll();
}
