package crudpractise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TESTR {
	public static void main(String[] args) throws Exception {
		TESTR rea=new TESTR ();
		rea.read_data("3");
	}
	
	
	
	public void read_data(String id) throws Exception {
		CRUD obje = new CRUD();
		Connection connection=obje.get_connection();
		
		PreparedStatement par=null;
		ResultSet res=null;
		
		try {
			String query="select * from student where id=?";
			par=connection.prepareStatement(query);
			par.setString(1, id);
			System.out.println(par);
			res=par.executeQuery();
			
			while(res.next()) {
				System.out.println("id :"+ res.getString("id"));
				System.out.println("name : "+res.getString("name"));
				System.out.println("email : "+ res.getString("email"));
				System.out.println("!--------!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	
}
