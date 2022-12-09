import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo9BatchUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = MyConnection.getConnection();

		PreparedStatement pst = con.prepareStatement("insert into t1 values(?,?)");

		con.setAutoCommit(false); /* whenever we are using batch update then Auto Commit needs to be off */

		pst.setString(1, "2");
		pst.setString(2, "xyz");
		pst.addBatch(); // adds first batch

		pst.setString(1, "3");
		pst.setString(2, "pqr");
		pst.addBatch();

		pst.setString(1, "3");
		pst.setString(2, "abc");
		pst.addBatch();

		int[] resultOfEachBatch = pst.executeBatch(); // starts execution
		/*
		 * this int[] resultOfEachBatch will contains status of each batch 0 means not
		 * inserted 1 means inserted
		 */
		/*
		 * Returns: an array of update counts containing one element for each command in
		 * the batch. The elements of the array are ordered according to the order in
		 * which commands were added to the batch.
		 */
		/*
		 * also if any error occurs during then provide the code for exception handling
		 * 1. like duplicate key incase of primary key 2. data type mismatch etc..
		 * 
		 * provide the Exception handling code for the exception do that you can check
		 * the status of each batch and commit the operation accordingly (for eg if you
		 * don't want to commit if all the batches are not inserted then provide the
		 * code accordingly )
		 */

		System.out.println("Batch inserted");
		con.commit(); // commits the batch
		System.out.println("operation committed");

	}
}
