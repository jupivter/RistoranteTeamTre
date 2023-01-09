package it.database;

import java.sql.*;

import static it.database.DatabaseCredentials.*;

public class View {

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
