import java.util.*;
import java.sql.*;
public class BatchProcessing {
	private static final String URL = "jdbc:mysql://localhost:3306/employee";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Lannisters@3000";
	private static final String INSERT_QUERY = "insert into details(e_id, e_name, e_mail, e_dept, e_salary) values(?,?,?,?,?)";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(URL, USERNAME, PASSWORD);		
		pstmt = con.prepareStatement(INSERT_QUERY);
		String choice;
		ResultSet res = pstmt.executeQuery("select* from details");
		JDBC.printResultSet(res);
	
		do {
		System.out.println("Enter employee id : ");
		int e_id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee name : ");
		String e_name = sc.nextLine();
		System.out.println("Enter employee mail id : ");
		String e_mail = sc.nextLine();
		System.out.println("Enter employee department : ");
		String e_dept = sc.nextLine();
		System.out.println("Enter employee salary : ");
		int e_salary = sc.nextInt();
		sc.nextLine();
		pstmt.setInt(1, e_id);
		pstmt.setString(2, e_name);
		pstmt.setString(3, e_mail);
		pstmt.setString(4, e_dept);
		pstmt.setInt(5,e_salary);
		pstmt.addBatch();
		System.out.println("Row added");
		System.out.println("Do you want to add one more user : Yes/No");
		choice = sc.nextLine();
		}while(choice.equalsIgnoreCase("yes"));
		pstmt.executeUpdate();
		System.out.println("Users added");
		res = pstmt.executeQuery("select* from details");
		JDBC.printResultSet(res);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}else if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
