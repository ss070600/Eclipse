import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection2 {
	private static String DBName,portNumber,user,password;
	
	public static String getDBName() {
		return DBName;
	}

	public static void setDBName(String dBName) {
		DBName = dBName;
	}

	public static String getPortNumber() {
		return portNumber;
	}

	public static void setPortNumber(String portNumber) {
		MyConnection2.portNumber = portNumber;
	}

	public static String getUser() {
		return user;
	}

	public static void setUser(String user) {
		MyConnection2.user = user;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		MyConnection2.password = password;
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		/* above statement says that we are going to use type 4 driver */
		String url = "jdbc:mysql://localhost:"+MyConnection2.getPortNumber()+"/"+MyConnection2.getDBName();// path of driver
		return DriverManager.getConnection(url, MyConnection2.getUser(),MyConnection2.getPassword());// Connection is an Interface
	}

}
