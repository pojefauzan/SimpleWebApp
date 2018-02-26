package crudsql;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class deletedata {

    deletedata() throws SQLException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("You selected option 4: Delete database record: ");

        String student_id;
        System.out.println("Enter student id to delete: ");
        student_id = userInput.next();

        //retrieve record to update
        DisplayRecord(student_id);

        String confirm_delete;
        System.out.println("Enter Y to confirm deletion: ");
        confirm_delete = userInput.next();

        if ("Y".equals(confirm_delete)) {
            databaseutilities dbUtilities = new databaseutilities();

            String sql_stmt = "DELETE FROM studentsdetail WHERE id = " + student_id;

            dbUtilities.ExecuteSQLStatement(sql_stmt);
            
            System.out.println("The Record has successfully being deleted");
        }

        codecrudsql.DisplayMenu();
    }

    private void DisplayRecord(String student_id) throws SQLException {
        try {
            databaseutilities dbUtilities = new databaseutilities();

            String sql_stmt = "SELECT id, name, className, mark FROM studentsdetail WHERE id = " + student_id;
            ResultSet resultSet = dbUtilities.ReadRecords(sql_stmt);

            // process query results
            if (resultSet.next()) {

                ResultSetMetaData metaData = resultSet.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                System.out.print("Database Records Listing");

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
        } 
    }
}
