package com.tpt.bonzai;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseHandler {
	
	private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private final String DB_URL = "jdbc:mysql://10.101.160.203:3306/bonzai_trading_system?useSSL=false";
	
	private final String USERNAME = "suraj";
	private final String PASSWORD = "1234";
	
	private Connection connection  = null;
	private PreparedStatement preparedStatement = null;

	public DataBaseHandler() {
		// TODO Auto-generated constructor stub
	}
	
	public void getConnection() {
		try {
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void getPreparedStatement() {
		try {
			//String query = "SELECT * from trade_information";
			String sql = "INSERT into trade_information values (55, \"a\", \"b\", \"c\", 100, \"Mt\", 100, \"ccxc\", ? ,\"xcxc\",\"cscs\",\"ccdc\")";
			preparedStatement = connection.prepareStatement(sql);
			Date date = new Date(new java.util.Date().getTime());
			preparedStatement.setDate(1, date);
			//pst.setInt(1, 1135);
			preparedStatement.execute();
			/*while(rs.next()) {
				System.out.println(rs.getString(2));
			}*/
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	

}
