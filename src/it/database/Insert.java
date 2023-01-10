package it.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public class Insert {

    private static final String url = "jdbc:mysql://localhost:3306/newdb";
    private static final String user = "----------";
    private static final  String password = "----------";

    public static void insertValueIntoTable(String tableName, String column, String value) throws SQLException {
        String insert = "INSERT INTO " +tableName +  " (" + column + ") " + " VALUES " + "(" +value + ")" ;
        Connection conn = DriverManager.getConnection(url,user,password);
        Statement statement= conn.createStatement();
        statement.executeUpdate(insert);
        statement.close();
    }

    public static void insertValuesIntoTable (String tableName, Map<String,String> column_value) throws SQLException {
        String insert = "INSERT INTO "  + tableName;
        String columns = "";
        String values = "";
        for(String col : column_value.keySet()){
            columns += col + ",";
            values += column_value.get(col) + ",";
        }
        columns = "(" + columns.substring(0, columns.length()-1) + ")";
        values = "(" + values.substring(0,values.length()-1) + ")";
        insert += columns + " VALUES " + values;

        Connection conn = DriverManager.getConnection(url,user,password);
        Statement statement= conn.createStatement();
        statement.executeUpdate(insert);
        statement.close();
    }

}
