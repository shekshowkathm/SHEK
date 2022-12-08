package crudmysql;
import java.sql.*;
public class CRUD {
	
	public static void main(String[] args) throws Exception {
		CRUD obj=new CRUD();
		System.out.println(obj.get_connection());
	}

	public Connection get_connection() throws Exception {
		Connection connection=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "shek@13062001");
		try {
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}

}
