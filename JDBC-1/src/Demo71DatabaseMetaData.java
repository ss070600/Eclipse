import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo71DatabaseMetaData {
	/* explore meta data functions */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MyConnection.getConnection();

		DatabaseMetaData dbmeta = con.getMetaData();
		ResultSet rs = dbmeta.getCatalogs();
		while (rs.next())
			System.out.println(rs.getString(1));

	}
}
