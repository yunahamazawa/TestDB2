import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TestUserDAO {

	String name = "";
	String password = "";
	public void select(String name, String password) {
		DBConnector db2 = new DBConnector();
		Connection con = db2.getConnection();


	 String sql ="select * from test_table where user_name=? and password=?";
	 try {
		 PreparedStatement ps = con.prepareStatement(sql);
		 ps.setString(1, name);
		 ps.setString (2, password);
		 ResultSet rs=ps.executeQuery();
		 if (rs.next()) {
			 System.out.println(rs.getString("user_name"));
			 System.out.println(rs.getString("password"));
		 }
		 } catch (SQLException e ) {
			 e.printStackTrace();
		}

	try {
		 con.close() ;
		 } catch (SQLException e ) {
			 e.printStackTrace();
		 }
	}

public void selectAll() {
	 DBConnector db2 = new DBConnector();
	 Connection con = db2.getConnection();

	 String sql ="select * from test_table";
	 try {
		 PreparedStatement ps = con.prepareStatement(sql);
		 ResultSet rs=ps.executeQuery();
		 while (rs.next()) {
			 System.out.println(rs.getString("user_name"));
			 System.out.println(rs.getString("password"));
		 }
	 	} catch (SQLException e ) {
	 		e.printStackTrace();
	 	}
	 try {
		 con.close() ;
	 	} catch (SQLException e ) {
	 		e.printStackTrace();
	 	}
	 }

	public void selectByName(String name) {
		DBConnector db2 = new DBConnector();
		Connection con = db2.getConnection();


		String sql ="select * from test_table where user_name=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		} catch (SQLException e ) {
			e.printStackTrace();
		}
		try {
			con.close() ;
		} catch (SQLException e ) {
			e.printStackTrace();
		}
	}
}
