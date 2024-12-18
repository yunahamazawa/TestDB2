import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

<<<<<<< HEAD

=======
>>>>>>> a66c388de86e02c8f305251124978fe4782a8190
public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";

	private static String url =
"jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";


	private static String user = "root";
	private static String password = "mysql";

<<<<<<< HEAD
	public Connection getConnection() {
		Connection con = null;

		try{
			Class.forName(driverName);
			con = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace() ;
		} catch (SQLException e) {
			e.printStackTrace() ;
		}
		return con ;
	}
=======
public Connection getConnection() {
Connection con = null;

try{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,password);
} catch (ClassNotFoundException e) {
e.printStackTrace() ;
} catch (SQLException e) {
e.printStackTrace() ;
}
return con ;
}
>>>>>>> a66c388de86e02c8f305251124978fe4782a8190
}