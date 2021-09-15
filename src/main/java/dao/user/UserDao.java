package dao.user;

import model.User;
import util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao extends DbUtil implements UserDaoI{

    @Override
    public boolean validateUser(User user) throws SQLException {
        String sql;

        sql = "select name,password from new_users where name=";
        sql += "'" + user.getUserName() + "'";
        sql +=" and password=";
        sql += "'" + user.getUserPassword() + "';";
        ResultSet rs = execQuery(sql);
        return (rs.next());
    }

    @Override
    public boolean insertUser(User user) {
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    @Override
    public User getUserObj(String attribute) {
        return null;
    }

    @Override
    public User getUserObj(int userId) {
        return null;
    }

    @Override
    public List<User> listAll() {
        return null;
    }
}


