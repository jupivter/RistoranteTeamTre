package it.database;

import java.sql.*;

public class View {

    private static final String url = "jdbc:mysql://localhost:3306/newdb";
    private static final String user = "----------";
    private static final  String password = "----------";

    public static void getTable(String tableName) throws SQLException {
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement statement = conn.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tableName + "");
        ResultSetMetaData rsmd = resultSet.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        for (int i = 1; i <= columnsNumber; i++) {
            System.out.printf("%-15s", rsmd.getColumnName(i));
        }
        System.out.println("");
        while (resultSet.next()) {
            for (int i = 1; i <= columnsNumber; i++) {
                String columnValue = resultSet.getString(i);
                String columnName = rsmd.getColumnName(i);
                System.out.printf("%-15s", columnValue);
            }
            System.out.println(" ");
        }

        conn.close();
    }

}
