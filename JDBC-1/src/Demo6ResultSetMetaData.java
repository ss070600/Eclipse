import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;



public class Demo6ResultSetMetaData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MyConnection.getConnection();
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from emp");
		ResultSetMetaData rsmeta = rs.getMetaData();
		
		System.out.println("No of columns in resultset "+rsmeta.getColumnCount());
		for(int i =1;i<=rsmeta.getColumnCount();i++)
			System.out.println(rsmeta.getColumnName(i)+" "+rsmeta.getColumnTypeName(i)+" "+rsmeta.getColumnDisplaySize(i));
		
	}
}
