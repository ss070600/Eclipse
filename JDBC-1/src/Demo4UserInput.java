
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo4UserInput {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Configuration details :");
		System.out.println("Enter port number : ");
		MyConnection2.setPortNumber(sc.nextInt() + "");
		sc.nextLine();
		System.out.println("Enter database name : ");
		MyConnection2.setDBName(sc.next());
		sc.nextLine();
		System.out.println("Enter user name : ");
		MyConnection2.setUser(sc.nextLine());
		System.out.println("Enter password : ");
		MyConnection2.setPassword(sc.nextLine());

		Connection con = MyConnection2.getConnection();
		System.out.println("Connection Established !!");
		Statement st = con.createStatement();

		String sqlInsert = "insert into t1 values(?,?)";
		PreparedStatement pst = con.prepareStatement(sqlInsert);

		System.out.println("Enter No of records you want to enter : ");
		int noOfRecords = sc.nextInt();
		sc.nextLine();

		String value1, value2;

		for (int i = 1; i <= noOfRecords; i++) {
			System.out.println("Enter details for record " + i + " : ");
			System.out.println("Enter id : ");
			value1 = sc.nextLine();
			System.out.println("Enter name : ");
			value2 = sc.nextLine();

			pst.setString(1, value1);
			pst.setString(2, value2);
			pst.executeUpdate();

			pst.clearParameters();
		}

		System.out.println("table t1 data after insertion : ");
		ResultSet rs = st.executeQuery("SELECT * FROM t1");
		while (rs.next()) {
			System.out.println(rs.getString("id") + " , " + rs.getString("name"));
		}
		con.close();
	}
}
