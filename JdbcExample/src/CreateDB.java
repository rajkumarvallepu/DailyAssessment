import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateDB {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "Admin@123");
			Statement stmt = con.createStatement();
			DatabaseMetaData dm = con.getMetaData();
			System.out.println(dm);
			boolean status = stmt.execute("create database sampledb;");
			ResultSet resultset = stmt.executeQuery("select * from person;");
			while (resultset.next()) {
				System.out.println(resultset.getString("pname"));
			}

			System.out.println("Query has been executes Successfully");
			stmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Erroe: " + e);
		}
	}

}
