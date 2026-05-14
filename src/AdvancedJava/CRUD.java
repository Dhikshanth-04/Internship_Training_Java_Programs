import java.sql.*;
import java.util.*;
public class CRUD {
	private static final String URL = "jdbc:mysql://localhost:3306/employee";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Lannisters@3000";
	
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		Scanner sc = new Scanner(System.in);
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		while(true) {
		System.out.println("The Operation; \n 1. Display the table\n 2. Insert the data \n 3. Update the value \n 4. Delete the row\n 5. Exit \n Enter the choice : ");
		int choice = sc.nextInt();
		if(choice==1) {
			display(con);
		}else if(choice==2) {
			insert(con);
		}else if(choice==3) {
			update(con);
		}else if(choice==4) {
			delete(con);
		}else if(choice==5) {
			System.out.println("Thanks you");
			break;
		}
		}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try{
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
	
	//Displaying the table
	public static void display(Connection con) {
		try{
		String SELECT_QUERY = "select * from details";
		Statement pstmt = con.createStatement();
		ResultSet res = pstmt.executeQuery(SELECT_QUERY);
		JDBC.printResultSet(res);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//Inserting the values to the table
	public static void insert(Connection con) {
		Scanner sc = new Scanner(System.in);
		try {
		String INSERT_QUERY = "insert into details(e_id, e_name, e_mail, e_dept, e_salary) values(?,?,?,?,?)";
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
		
		PreparedStatement pstmt = con.prepareStatement(INSERT_QUERY);
		pstmt.setInt(1, e_id);
		pstmt.setString(2, e_name);
		pstmt.setString(3, e_mail);
		pstmt.setString(4, e_dept);
		pstmt.setInt(5, e_salary);
		
		pstmt.executeUpdate();
		System.out.println("Row added");
		display(con);
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
	
	//Updating the salary of specific department
	public static void update(Connection con) {
		Scanner sc = new Scanner(System.in);
		try {
		String UPDATE_QUERY = "update details set e_salary = e_salary + ? where e_dept = ?";
		PreparedStatement pstmt = con.prepareStatement(UPDATE_QUERY);
		System.out.println("Enter salary increament : ");
		int inc = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the department : ");
		String e_dept = sc.nextLine();
		
		pstmt.setInt(1, inc);
		pstmt.setString(2, e_dept);
		pstmt.executeUpdate();
		display(con);
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
	
	//Deleting the row, regarding employee id
	public static void delete(Connection con) {
		Scanner sc = new Scanner(System.in);
		try {
		String DELETE_QUERY = "delete from details where e_id = ?";
		PreparedStatement pstmt = con.prepareStatement(DELETE_QUERY);
		System.out.println("Enter the employee id : ");
		int e_id = sc.nextInt();
		pstmt.setInt(1, e_id);
		pstmt.executeUpdate();
		display(con);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}