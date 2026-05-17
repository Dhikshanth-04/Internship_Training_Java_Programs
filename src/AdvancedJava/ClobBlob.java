import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.sql.*;
public class ClobBlob {
	private static final String URL = "jdbc:mysql://localhost:3306/employee";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Lannisters@3000";
	static Connection con;
	static PreparedStatement pstmt = null;
	private static final String INSERT_QUERY = "insert into student(id, name, branch, gender, cgpa) values(?,?,?,?,?)";
	private static final String SELECT_QUERY = "select * from student";
	private static final String UPDATE_QUERY = "update student set dpl = ? where id = ?";
	private static final String UPDATE_CLOB_QUERY = "update student set summary = ? where id = ?";
	private static final String path = "C:\\Users\\DHIKSHANTH K\\eclipse-workspace\\AdvancedJava\\Images\\deadpool.jpg";
	private static final String CLOBpath = "C:\\Users\\DHIKSHANTH K\\eclipse-workspace\\AdvancedJava\\texts\\hello.txt";
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			//insert(con);
			
			//update(con);
			
			updateCLOB(con);
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(FileNotFoundException e) {
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
	private static void updateCLOB(Connection con) throws SQLException, FileNotFoundException {
		// TODO Auto-generated method stub
		pstmt = con.prepareStatement(UPDATE_CLOB_QUERY);
		System.out.println("Enter the id : ");
		int id = sc.nextInt();
		FileReader fr = new FileReader(CLOBpath);
		pstmt.setInt(2, id);
		pstmt.setCharacterStream(1, fr);
		pstmt.executeUpdate();
		
	}
	public static void insert(Connection con) throws SQLException {
		pstmt = con.prepareStatement(INSERT_QUERY);
		
		System.out.println("Enter ID : ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter branch : ");
		String branch = sc.nextLine();
		
		System.out.println("Enter gender : ");
		String gender = sc.nextLine();
		
		System.out.println("Enter CGPA : ");
		float cgpa = sc.nextFloat();
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, branch);
		pstmt.setString(4, gender);
		pstmt.setFloat(5, cgpa);
		
		int res = pstmt.executeUpdate();
		System.out.println(res);
	}
	public static void update(Connection con) throws SQLException, FileNotFoundException {
		pstmt = con.prepareStatement(UPDATE_QUERY);
		System.out.println("enter the id : ");
		int id = sc.nextInt();
		FileInputStream fis = new FileInputStream(path);
		
		pstmt.setBinaryStream(1, fis);
		pstmt.setInt(2, id);
		
		int res = pstmt.executeUpdate();
		System.out.println(res);
	}
}
