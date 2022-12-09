import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo61ResultSetMetaData {

	/*
	 * Generally we dont create two connection objects.
	 * 
	 * here we have shown how we can use two connection objects two have two result
	 * sets parllely otherwise we can have only one result set at a time and when we
	 * are done with all the operations on one result set then we can change the
	 * result set object to store another result set for its processing
	 */

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MyConnection.getConnection();

		// Connection con2 = MyConnection.getConnection();

		Statement st = con.createStatement();
		// Statement st2 = con2.createStatement();

		ResultSet rs = st.executeQuery("Select * FROM emp");

		// ResultSet rs2 = st2.executeQuery("SELECT empName from emp");

		// Using metadata for information about result set 'rs'
		ResultSetMetaData rsMetaData = rs.getMetaData();
		System.out.println("Total columns in emp table : " + rsMetaData.getColumnCount());
		for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
			System.out.println("Column name : " + rsMetaData.getColumnName(i) + " " + rsMetaData.getColumnTypeName(i));
		}
		System.out.println("----------------------------------");

		ResultSet rs2 = st.executeQuery("SELECT empName from emp");
		// Using metadata for information about result set 'rs2'
		ResultSetMetaData rsMetaData2 = rs2.getMetaData();
		System.out.println("Total columns in emp table : " + rsMetaData2.getColumnCount());
		for (int i = 1; i <= rsMetaData2.getColumnCount(); i++) {
			System.out
					.println("Column name : " + rsMetaData2.getColumnName(i) + " " + rsMetaData2.getColumnTypeName(i));
		}
		System.out.println("----------------------------------");

	}

}