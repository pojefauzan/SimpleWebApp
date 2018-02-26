package crudsql;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class updatedata {

    updatedata() throws SQLException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("You selected option 3: Update database record: ");

        String student_id;
        System.out.println("Enter student id to update: ");
        student_id = userInput.next();

        //retrieve record to update
        DisplayRecord(student_id);

        String name;
        System.out.println("Enter student name: ");
        name = userInput.next();

        String className;
        System.out.println("Enter student class: ");
        className = userInput.next();

        String mark;
        System.out.println("Enter student mark: ");
        mark = userInput.next();

        databaseutilities dbUtilities = new databaseutilities();

        String sql_stmt = "UPDATE contacts SET name = '" + name + "',className = '" + className + "',mark = '" + mark + "' WHERE id = " + student_id;

        dbUtilities.ExecuteSQLStatement(sql_stmt);

        System.out.println("The Record has successfully being deleted");

        codecrudsql.DisplayMenu();
    }

    private void DisplayRecord(String customer_id) throws SQLException {
        try {
            databaseutilities dbUtilities = new databaseutilities();

            String sql_stmt = "SELECT id, name, email, contact_number FROM contacts WHERE id = " + customer_id;
            ResultSet resultSet = dbUtilities.ReadRecords(sql_stmt);

            // process query results
            if (resultSet.next()) {

                ResultSetMetaData metaData = resultSet.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                System.out.print("Database Records Listing\n");

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
                System.out.println("No database records foundn");
            }

            //close db connection
            dbUtilities.DisconnectFromDB();
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
    }
}
