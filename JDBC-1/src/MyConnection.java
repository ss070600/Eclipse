import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		/* above statement says that we are going to use type 4 driver */
		String url = "jdbc:mysql://localhost:3306/wiley1";// path of driver
		return DriverManager.getConnection(url, "root", "1234");// Connection is an Interface
	}

}
