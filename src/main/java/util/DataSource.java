package util;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DataSource {

    private static final String DB_CONNECTION_URL = "jdbc:mysql://localhost:3306/jdbc";
    private static final String DB_USER = "root";
    private static final String DB_PWD = "toor";
    private static DataSource ds;
    private MysqlDataSource mySqlDS = new MysqlDataSource();

    private DataSource() {
        mySqlDS.setUrl(DB_CONNECTION_URL);
        mySqlDS.setUser(DB_USER);
        mySqlDS.setPassword(DB_PWD);
    }

    public static DataSource getDS(){
        if(ds == null){
            ds = new DataSource();
        }
        return ds;
    }

    public MysqlDataSource getMySqlDS() {
        return mySqlDS;
    }
}
