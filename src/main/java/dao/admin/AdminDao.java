package dao.admin;

import model.Admin;
import model.Seller;
import model.User;
import util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AdminDao extends DbUtil implements AdminDaoI {

    @Override
    public boolean validateAdmin(Admin admin) throws SQLException {
        String sql;

        sql = "select name,password from new_admins where name=";
        sql += "'" + admin.getAdminName() + "'";
        sql +=" and password=";
        sql += "'" + admin.getAdminPassword() + "';";
        ResultSet rs = execQuery(sql);
        return (rs.next());
    }

    @Override
    public boolean insertAdmin(Admin admin) {
        return false;
    }

    @Override
    public boolean updateAdmin(Admin admin) {
        return false;
    }

    @Override
    public boolean deleteAdmin(Admin admin) {
        return false;
    }

    @Override
    public List<Admin> listAll() {
        return null;
    }


}
