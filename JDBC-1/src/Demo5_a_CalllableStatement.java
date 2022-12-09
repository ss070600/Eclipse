import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo5_a_CalllableStatement  {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MyConnection.getConnection();
		
		CallableStatement callable = con.prepareCall("{call getCustomerShipping(?,?)}");
		callable.setInt(1, 1);
		callable.registerOutParameter(2, java.sql.Types.VARCHAR);
		callable.executeUpdate();
		String result = callable.getString(2);
		System.out.println("result is : "+result);
	}
}
