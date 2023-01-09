package it.database;

import java.sql.*;

import static it.database.DatabaseCredentials.*;

public class Alter {

    /**
     * Questo metodo crea una nuova colonna nella tabella controllando prima che non ce ne sia una con lo stesso nome.
     * @param tableName nome della tabella.
     * @param columnName nome della colonna.
     * @param columnType tipo della colonna.
     * @throws SQLException
     */
    public static void AddNewColumn(String tableName, String columnName, String columnType) throws SQLException {
        Connection conn = DriverManager.getConnection(url,user,password);
        Statement statement= conn.createStatement();

        String ifNotExist = ""
                + "SELECT count(*) FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA = 'ristorante' AND TABLE_NAME = '"+tableName+"' AND COLUMN_NAME = ' "+columnName+"';";

        String addColumn = ""
                + "ALTER TABLE `ristorante`.`"+tableName+"` "
                + "ADD COLUMN `"+columnName+"` "+columnType+" NULL;";

        ResultSet rs = statement.executeQuery(ifNotExist);

        if (rs.getInt(0) > 0){
            statement.executeUpdate(addColumn);
        }
    }
}
