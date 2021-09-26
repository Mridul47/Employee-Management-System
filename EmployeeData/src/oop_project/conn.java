package oop_project;

import java.sql.*;

public class conn {
	public Connection c;
	public Statement s;
	
	public conn() {
		try {
			Class.forName("conn.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata","root","galacticos2001");
			s= c.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
