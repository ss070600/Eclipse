import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo5CalllableStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MyConnection.getConnection();
		
		CallableStatement callable = con.prepareCall("{call inOutExample(?)}");
		callable.setInt(1, 0);
		callable.registerOutParameter(1, java.sql.Types.INTEGER);
		callable.executeUpdate();
		int result = callable.getInt(1);
		System.out.println("result is : "+result);
	}
}
