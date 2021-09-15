package dao.user;

import model.Seller;
import model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDaoI {

    boolean validateUser(User user) throws SQLException;
    boolean insertUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(User user);
    User getUserObj(String attribute);
    User getUserObj(int userId);
    List<User> listAll();


}
