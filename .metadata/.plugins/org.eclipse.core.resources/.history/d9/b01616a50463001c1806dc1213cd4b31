package com.crud_operations;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeetable", "root", "SudebLaltu6@");
			// Here employeetable is database name, root is the username and SudebLaltu6@ is the password
	 		Statement stmt = con.createStatement();
			DatabaseMetaData dm = con.getMetaData();
			System.out.println(dm);

			// SQL statement execution
			stmt.execute("insert into employee values(1,'Sudeb Dolui', '8343');");
			stmt.execute("insert into employee values(2,'Mr. Venu Pupalla', '8584');");
			System.out.println("Query has been executes Successfully");
			stmt.close();
			con.close();
		} catch (Exception e) { // Handling Exception in case of Exception
			System.out.println("Something went wrong " + e);

		}

	}

}
