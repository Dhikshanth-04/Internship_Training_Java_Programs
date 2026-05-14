package AdvancedJava;

import java.sql.*;
import java.util.*;

public class PreparedStatementExecution{
	private static final String URL = "jdbc:mysql://localhost:3306/employee";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Lannisters@3000";
	private static final String WHERE_QUERY = "select * from details where e_dept = ?";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
		pstmt = con.prepareStatement(WHERE_QUERY);
		System.out.println("Enter the department : ");
		pstmt.setString(1, scan.nextLine());
		
		res = pstmt.executeQuery();
		
		JDBC.printResultSet(res);
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			if(res!=null) {
				res.close();
			}else if(pstmt!=null) {
				pstmt.close();
			}else if(con!=null) {
				con.close();
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
