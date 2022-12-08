package crudpractise;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TESTD {
	public static void main(String[] args) throws Exception {
		TESTD dele=new TESTD ();
		dele.delete_data("6");
	}
	
	
	
	public void delete_data(String id) throws Exception {
		CRUD obje = new CRUD();
		Connection connection=obje.get_connection();
		
		PreparedStatement delu=null;
		
		
		try {
			String query="delete from student where id=?";
			delu=connection.prepareStatement(query);
			delu.setString(1, id);
			System.out.println(delu);
			delu.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
