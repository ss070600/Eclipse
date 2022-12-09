
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3PreparedStatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MyConnection.getConnection();
		System.out.println("Connection Established !!");
		Statement st = con.createStatement();
		
		String sqlInsert = "insert into t1 values(?,?)";
		PreparedStatement pst = con.prepareStatement(sqlInsert);
		
		pst.setString(1,"1");
		pst.setString(2,"sandeep");
		pst.executeUpdate();
		
		pst.clearParameters();
		
		ResultSet rs = st.executeQuery("SELECT * FROM t1");
		while (rs.next()) {
			System.out.println(rs.getString("id") + " , " + rs.getString("name"));
		}
		con.close();
	}
}
