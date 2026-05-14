package AdvancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args){
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "Lannisters@3000";
		try {
			//1.Load the drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			
			//2.Establish connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established");
			
			//3.Create statement
			Statement stmt = con.createStatement();
			System.out.println("Statement is created");
			
			//4.Execute query
			ResultSet res = stmt.executeQuery("select * from details");
			System.out.println("Table retrived");
			
			//5.Process the output
			printResultSet(res);
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	static void printResultSet(ResultSet res) throws SQLException {
		System.out.println("-------------------------------------------------------");
		while(res.next()) {
			int e_id = res.getInt("e_id");
			String e_name = res.getString("e_name");
			String e_mail = res.getString("e_mail");
			String e_dept = res.getString("e_dept");
			int e_salary = res.getInt("e_salary");
			
			System.out.printf("| %d | %-7s | %-16s | %-9s | %-6d | \n", e_id, e_name, e_mail, e_dept, e_salary);
		}
		System.out.println("-------------------------------------------------------");

	}
}

