package crudpractise;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TESTC {
	public static void main(String[] args)  {
		TESTC crea=new TESTC();
		crea.create_data("14", "sri", "sri@gmail.com");
	}
	
	

	public void create_data(String id, String name, String email)  {
		CRUD obje = new CRUD();
		Connection connection=obje.get_connection();
		
		PreparedStatement pav=null;
		
		
		try {
			String query="insert into student(id, name, email) values(?,?,?)";
			pav=connection.prepareStatement(query);
			pav.setString(1, id);
			pav.setString(2, name);
			pav.setString(3, email);
			System.out.println(pav);
			pav.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
