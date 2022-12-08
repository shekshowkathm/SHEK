package crudpractise;
import java.sql.*;
public class CRUD {
//	public static void main(String[] args) throws Exception {
//		CRUD obje = new CRUD();
//		System.out.println(obje.get_connection());
//	}
	
	
	
	
	public  Connection get_connection() {
		Connection connection=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/univer", "root", "Ss@123456");
		
		
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		return connection;
		
		
	}
}
