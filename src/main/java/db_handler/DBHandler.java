package db_handler;

import java.sql.*;

/*
 * Handler:
 * The Handler class takes care of all SQLite functionality
 */

public class DBHandler {
	   static final String DB_URL = "jdbc:sqlite:database/gym_plugin.db";

	   // Connect to the Database
	   public static boolean connect() {
		   Connection conn = null;
		   try {
			   System.out.println("GymPlugin: Connecting to a selected database...");
			   conn = DriverManager.getConnection(DB_URL);
			   System.out.println("GymPlugin: Connected database successfully...");
			   return true;
		   } catch(SQLException se) {
			   se.printStackTrace();
		   }
		   catch(Exception e) {
			   e.printStackTrace();
		   } finally {
			    try{
			    	if(conn!=null)
			    	conn.close();
				}catch(SQLException se){
					se.printStackTrace();
				}
		   }
		   
		   // Failed to connect
		   return false;
	   } // End of connect()
	   
	   public static void createNewDatabase() {
		   try (Connection conn = DriverManager.getConnection(DB_URL)) {
	    	   if (conn != null) {
	    		   DatabaseMetaData meta = conn.getMetaData();
	    		   System.out.println("GymPlugin: The driver name is " + meta.getDriverName());
	    		   System.out.println("GymPlugin: A new database has been created.");
	    	   }
		   } catch (SQLException e) {
			   System.out.println(e.getMessage());
		   }
	   } // End of createNewDatabase()
}
