package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class teacher_serch {
	public teacher_serch(String s1,Object s2,Object s3) throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8");
	PreparedStatement pr = conn.prepareStatement("select * from teacher where tea_user=s1");
    ResultSet rs=pr.executeQuery();
	while(rs.next()){	
		s2 = rs.getString(1);
		s3 = rs.getString(2);
		}
	}
}
