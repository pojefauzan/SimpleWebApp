package crudsql;


import java.sql.*;

public class databaseutilities {
    // database URL                              
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DATABASE_URL = "jdbc:mysql://localhost/studentdetail";
    Connection connection = null;
    Statement statement = null; 
    ResultSet resultSet = null; 

    public databaseutilities() throws SQLException {
        // establish connection to database  
        try {
        	
            connection = DriverManager.getConnection(DATABASE_URL, "root", "poje");

        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
    }

    public void DisconnectFromDB() {

        try {
            resultSet.close();
            statement.close();
            connection.close();
        } // end try                                               
        catch (Exception ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        } // end catch  
    }

    public ResultSet ReadRecords(String sql_stmt) {
        try {

            statement = connection.createStatement();
                                    
            resultSet = statement.executeQuery(sql_stmt);

            return resultSet;

        } 
        catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }                                                    

        return resultSet;
    }

    public void ExecuteSQLStatement(String sql_stmt) {
        try {
            statement = connection.createStatement();
                                    
            statement.executeUpdate(sql_stmt);
        } 
        catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
    }
}