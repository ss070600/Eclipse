import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo8ResultSetTypeScrollableSensitive {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MyConnection.getConnection();

		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

		ResultSet rs = st.executeQuery("select * from emp");
		while (rs.next())
			System.out.println(rs.getInt(1) + " , " + rs.getString(2) + " , " + rs.getInt(3) + " , " + rs.getInt(4)
					+ " , " + rs.getInt(4));

		System.out.println();

		while (rs.previous())
			System.out.println(rs.getInt(1) + " , " + rs.getString(2) + " , " + rs.getInt(3) + " , " + rs.getInt(4)
					+ " , " + rs.getInt(4));

		System.out.println();
		
		rs.absolute(10);// this will return true/false and ResultSet rs will now only contain 10th
						// row(if available) and rows after 10th record if available.

		while (true) {
			System.out.println(rs.getInt(1) + " , " + rs.getString(2) + " , " + rs.getInt(3) + " , " + rs.getInt(4)
					+ " , " + rs.getInt(4));
			if (rs.next() == false)
				break;
		}
	}
}
