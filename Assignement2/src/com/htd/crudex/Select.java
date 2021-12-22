package com.htd.crudex;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Admin@123");
			// Here employeetable is database name, root is the username and Admin@123 is the password
	 		Statement stmt = con.createStatement();
			DatabaseMetaData dm = con.getMetaData();
			System.out.println(dm);

			// SQL statement execution
			ResultSet resultset = stmt.executeQuery("select * from employee;");
			while (resultset.next()) {
				System.out.println(resultset.getString("EmpName"));
			}
			System.out.println("Query has been executes Successfully");
			stmt.close();
			con.close();
		} catch (Exception e) { // Handling Exception in case of Exception
			System.out.println("Error " + e + " has occured");

		}

	}
}
