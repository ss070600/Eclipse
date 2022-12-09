import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MyConnection.getConnection();
		System.out.println("Connection Established !!");
		Statement st = con.createStatement();

		// executeUpdate
		String sqlInsert = "insert into emp values(15,'priya',105,6060,5)";
		int rowsAffected = st.executeUpdate(sqlInsert);
		if (rowsAffected > 0)
			System.out.println("data inserted successfully");
		else
			System.out.println("data insertion failed");

		ResultSet rs = st.executeQuery("SELECT * FROM emp");
		while (rs.next()) {
			System.out.println(rs.getInt("empId") + " , " + rs.getString("empName") + " , "
					+ rs.getInt("empDepartmentid") + " , " + rs.getInt("empSalary") + " , " + rs.getInt("manager_id"));
		}

		System.out.println();
		// execute
		String sqlCreateTable = "create table t1(id text,name text)";
		boolean status = st.execute(sqlCreateTable);/*
													 * this execute() method returns true if any result set is returned
													 * otherwise it returns false
													 */
		System.out.println("status variable value : " + status);
		// System.out.println("Table Created");

		rs = st.executeQuery("show tables");
		while (rs.next()) {
			if ((rs.getString(1)).equals("t1"))
				System.out.println("table created!!!");
		}
	}
}
