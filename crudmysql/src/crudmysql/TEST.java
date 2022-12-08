package crudmysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TEST {
	public static void main(String[] args) throws Exception {
		TEST objtest = new TEST();
		objtest.create_data("8", "navasa", "navasa@gmail.com");
//		objtest.read_data("2");
//		objtest.update_data("1", "22", "shek", "sh@gmail.com");
//		objtest.delete_data("22");
		
	}
	
	
	
	
	
	
	public void create_data(String sl_no, String name, String email) throws Exception {
		CRUD obj=new CRUD();
		
		Connection connection=obj.get_connection();
		
		PreparedStatement pa =null;
		try {
			String query="insert into user(sl_no, name, email) values(?,?,?)";
			pa=connection.prepareStatement(query);
			pa.setString(1, sl_no);
			pa.setString(2, name);
			pa.setString(3, email);
			System.out.println(pa);
			pa.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
//	READING THE DATA
	
	public void read_data(String sl_no) throws Exception {
		CRUD obj=new CRUD();
		
		Connection connection=obj.get_connection();
		
		PreparedStatement pa =null;
		ResultSet rs=null;
		
		try {
			String query="select * from user where sl_no=?"; // for full values remove the where content
			pa=connection.prepareStatement(query);
			pa.setString(1, sl_no); // just command this line
//			pa.setString(2, name);
//			pa.setString(3, email);
			System.out.println(pa);
//			pa.executeUpdate();
			rs=pa.executeQuery();
			
			while(rs.next()) {
				System.out.println("sl_no = "+ rs.getString("sl_no"));
				System.out.println("name = "+ rs.getString("name"));
				System.out.println("email = "+ rs.getString("email"));
				
				System.out.println("!----------------------!");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	// UPDATE DATA 
	
	public void update_data(String sl_no, String new_sl_no, String name, String email) throws Exception {
		CRUD obj=new CRUD();
		
		Connection connection=obj.get_connection();
		
		PreparedStatement pa =null;
//		ResultSet rs=null;  // resultsets are removed here
		
		try {
			String query="update user set sl_no=?, name=?, email=? where sl_no=?"; 
			pa=connection.prepareStatement(query);
			pa.setString(1, new_sl_no); // just command this line
			pa.setString(2, name);
			pa.setString(3, email);
			pa.setString(4, sl_no);
			
			System.out.println(pa);
//			pa.executeUpdate();
			pa.executeUpdate();
			
//			while(rs.next()) {
//				System.out.println("sl_no = "+ rs.getString("sl_no"));
//				System.out.println("name = "+ rs.getString("name"));
//				System.out.println("email = "+ rs.getString("email"));
//				
//				System.out.println("!----------------------!");
//			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	// DELETE DATA 
	
	public void delete_data(String sl_no) throws Exception {
		CRUD obj=new CRUD();
		
		Connection connection=obj.get_connection();
		
		PreparedStatement pa =null;
//		ResultSet rs=null; 
		
		try {
			String query="delete from user where sl_no=?"; 
			pa=connection.prepareStatement(query);
			pa.setString(1, sl_no); 
//			pa.setString(2, name);
//			pa.setString(3, email);
//			pa.setString(4, sl_no);
			
			System.out.println(pa);
//			pa.executeUpdate();
			pa.executeUpdate();
			
//			while(rs.next()) {
//				System.out.println("sl_no = "+ rs.getString("sl_no"));
//				System.out.println("name = "+ rs.getString("name"));
//				System.out.println("email = "+ rs.getString("email"));
//				
//				System.out.println("!----------------------!");
//			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
