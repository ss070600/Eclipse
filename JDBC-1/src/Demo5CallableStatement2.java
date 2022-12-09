import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo5CallableStatement2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MyConnection.getConnection();

		CallableStatement callable = con.prepareCall("{call getTotalSalarySum()}");
		ResultSet rs = callable.executeQuery();
		rs.next();
		System.out.println(rs.getString(1));
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
	}
}
