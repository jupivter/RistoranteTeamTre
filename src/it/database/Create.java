package it.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

    private static final String url = "jdbc:mysql://localhost:3306/newdb";
    private static final String user = "developer";
    private static final  String password = "passwordhere";

    public static void createTable(String tableName, String idName) throws SQLException {
        Connection conn = DriverManager.getConnection(url,user,password);

        Statement statement= conn.createStatement();
        String varname1 =  ""
                + "CREATE TABLE `"+tableName+"` ( "
                + "  `"+idName+"` int NOT NULL AUTO_INCREMENT, "
                + "  PRIMARY KEY (`"+idName+"`) "
                + ")";
        statement.executeUpdate(varname1);
        statement.close();

    }
    public static void addColTable(String tableName, String colName,String type) throws SQLException {
        Connection conn =DriverManager.getConnection(url,user,password);

        Statement statement= conn.createStatement();

        String varname1 = ""
                + "ALTER TABLE newdb."+tableName+" ADD "+colName+" "+type+" NULL;";


        statement.executeUpdate(varname1);
        statement.close();
    }
}
