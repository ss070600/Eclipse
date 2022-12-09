import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo91BatchUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MyConnection.getConnection();

		PreparedStatement pst = con.prepareStatement("insert into t2 values(?,?)");

		con.setAutoCommit(false); /* whenever we are using batch update then Auto Commit needs to be off */

		pst.setString(1, "5");
		pst.setString(2, "xyz");
		pst.addBatch(); // adds first batch

		pst.setString(1, "2");
		pst.setString(2, "pqr");
		pst.addBatch();

		pst.setString(1, "3");
		pst.setString(2, "abc");
		pst.addBatch();

		int[] resultOfEachBatch=null;
		try {
			resultOfEachBatch = pst.executeBatch();
		}catch(BatchUpdateException e) {
			int [] arr = e.getUpdateCounts();
			for(int i :arr)
				System.out.println(i);
		}
		

		System.out.println("Batch inserted");
		con.commit(); // commits the batch
		System.out.println("operation committed");

	}
}
