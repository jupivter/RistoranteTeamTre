package it.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static it.database.DatabaseCredentials.*;

public class Create {

    /**
     * Questo metodo crea una tabella a partire dai parametri inseriti.
     * @param tableName nome della tabella.
     * @param idName nome del'id (chiave primaria).
     * @throws SQLException
     */
    public static void createTable(String tableName, String idName) throws SQLException {
        Connection conn = DriverManager.getConnection(url,user,password);
        Statement statement= conn.createStatement();

        String createTableQuery = ""
                + "CREATE TABLE `ristorante`.`"+tableName+"` ( "
                + "  `"+idName+"` INT NOT NULL AUTO_INCREMENT, "
                + "  PRIMARY KEY (`"+idName+"`));";

        statement.executeUpdate(createTableQuery);
        conn.close();
    }
}
