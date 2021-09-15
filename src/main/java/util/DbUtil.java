package util;

import java.sql.*;

public abstract class DbUtil {

    public Connection getDbConnection() throws Exception {
        return  DataSource.getDS().getMySqlDS().getConnection();
    }

    public ResultSet execQuery(String sql) {

        if (sql == null || sql.trim().equals("")) {
            return null;
        }

        try {
            PreparedStatement statement = getDbConnection().prepareStatement(sql);
            return statement.executeQuery();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public void execUpdate(String sql){

        if  (sql == null || sql.trim().equals(""))
            return;

        try {
            PreparedStatement statement = getDbConnection().prepareStatement(sql);
            statement.executeUpdate();

        }catch (Exception ex){
            System.out.println(ex.getMessage());

        }
        return;
    }
}