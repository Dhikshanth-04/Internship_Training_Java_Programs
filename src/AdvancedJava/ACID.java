package AdvancedJava;
import java.util.*;
import java.sql.*;
public class ACID {
	//ACID
	/*
	 * Atomicity - The transaction should be either 100% successfull or 100% failure
	 * Consistency - Data from one consistent state to another consistent state should be same
	 * Isolation - Transaction has to be isolated from other transactions
	 * Durability - Even though the server crashes the transaction should be inserted
	 */
	private static final String URL = "jdbc:mysql://localhost:3306/employee";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Lannisters@3000";
	private static final String DEBIT_QUERY = "update details set e_salary=e_salary-? where e_name = ? ";
	private static final String CREDIT_QUERY = "update details set e_salary=e_salary+? where e_name = ? ";
	static Scanner scan = new Scanner(System.in);
	static Connection con = null;
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);		
			con.setAutoCommit(false);
			transaction();
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("select * from details");
			JDBC.printResultSet(res);
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void transaction() throws SQLException{
		System.out.println("Enter the sender name : ");
		String sender = scan.nextLine();
		System.out.println("Enter the name of the receiver : ");
		String receiver = scan.nextLine();
		System.out.println("Enter the amount to send : ");
		int amt = scan.nextInt();
		
		int senderRes = updateSender(sender, amt);
		int receiverRes = updateReceiver(receiver, amt);
		//System.out.println(senderRes + " "+ receiverRes);
		
		if(isConsistent(senderRes, receiverRes)) {
			con.commit();
		}else {
			con.rollback();
		}
		
	}
	private static boolean isConsistent(int senderRes, int receiverRes) {
		// TODO Auto-generated method stub
		if(senderRes==1 && receiverRes==1) {
			return true;
		}else {
			return false;
		}
		
	}
	private static int updateReceiver(String receiver, int amt) throws SQLException {
		PreparedStatement pstmt = con.prepareStatement(CREDIT_QUERY);
		pstmt.setInt(1, amt);
		pstmt.setString(2, receiver);
		int res = pstmt.executeUpdate();
		return res;
		}
	private static int updateSender(String sender, int amt) throws SQLException {
		PreparedStatement pstmt = con.prepareStatement(DEBIT_QUERY);
		pstmt.setInt(1, amt);
		pstmt.setString(2, sender);
		int res = pstmt.executeUpdate();
		return res;
		
	}
}
