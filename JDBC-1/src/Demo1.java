import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		/* above statement says that we are going to use type 4 driver */
		String url = "jdbc:mysql://localhost:3306/wiley1";// path of driver
		Connection con = DriverManager.getConnection(url, "root", "1234");// Connection is an Interface
		/*
		 * getConnection method returns the connection object i.e DriveManager is
		 * responsible for implementation of such methods, so it is probably having a
		 * class inside it that implements the connection interface and the object of
		 * that class is returned. so it is possible to store that object in the
		 * reference variable that has a reference as Connection
		 */
		System.out.println("Connection Established !!");
		Statement st = con.createStatement();// Statement is an Interface

		ResultSet rs = st.executeQuery("SELECT * FROM emp");//executeQuery is used for all the select statements
		while (rs.next()) {
//			System.out.println(rs.getInt(1) + " , " + rs.getString(2) + " , " + rs.getInt(3) + " , " + rs.getInt(4)
//					+ " , " + rs.getInt(4));
			System.out.println(rs.getInt("empId") + " , " + rs.getString("empName") + " , "
					+ rs.getInt("empDepartmentid") + rs.getInt("empSalary") + rs.getInt("manager_id"));
		}
	}
}
