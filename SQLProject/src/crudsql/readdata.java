package crudsql;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class readdata {

    public readdata() throws SQLException {
        System.out.println("You selected option 2: Read database record");
        DisplayResults();
    }

    private void DisplayResults() throws SQLException {
        try {
            databaseutilities dbUtilities = new databaseutilities();

            String sql_stmt = "SELECT id, name, className, mark FROM studentsdetail";
            ResultSet resultSet = dbUtilities.ReadRecords(sql_stmt);

            // process query results
            if (resultSet.next()) {

                ResultSetMetaData metaData = resultSet.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                System.out.printf("Database Records Listing\n");

                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-8s", metaData.getColumnName(i));
                }
                System.out.println();

                do {
                    for (int i = 1; i <= numberOfColumns; i++) {
                        System.out.printf("%-8s", resultSet.getObject(i));
                    }
                    System.out.println();
                } while (resultSet.next());
                
                System.out.println();

            } else {
                System.out.println("No database records found");
            }

            //close db connection
            dbUtilities.DisconnectFromDB();
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        } finally {
            codecrudsql.DisplayMenu();
        }
    }
}
