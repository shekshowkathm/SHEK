package crudpractise;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TESTU {
	
	public static void main(String[] args) throws Exception {
		TESTU updu=new TESTU ();
		updu.update_data("2", "22", "kula", "kula@gmail.com");
	}
	
	
	
	
	public void update_data(String id, String new_id, String name, String email) throws Exception {
		CRUD obje = new CRUD();
		Connection connection=obje.get_connection();
		
		PreparedStatement upd=null;
		
		try {
			String query="update student set id=?, name=?, email=? where id=?";
			upd=connection.prepareStatement(query);
			upd.setString(1, new_id);
			upd.setString(2, name);
			upd.setString(3, email);
			upd.setString(4, id);
			System.out.println(upd);
			upd.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
