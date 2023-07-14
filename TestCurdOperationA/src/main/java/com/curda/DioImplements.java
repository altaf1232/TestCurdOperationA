package com.curda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DioImplements implements DioInterface{
//here is create your DaoInterface with implements name your Interface DioInterface
	static Connection connection = null;
	
	@Override
	public void save(testPojoClass pojoClass)
	{
		// TODO Auto-generated method stub
		
		
		try {
			connection = DBConnectionClass.getConnection();
			PreparedStatement stmt = connection.prepareStatement("insert into Person values(?,?)");
			
			stmt.setString(1,testPojoClass.getName());
			stmt.setString(2,testPojoClass.getEmail());
			
			
			System.out.println("it is Print  DioImplements First time 4");
			
			int i = stmt.executeUpdate();
			if (i > 0) {
				System.out.println("data is inserted");

			} else {
				System.out.println("data is not inserted");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
