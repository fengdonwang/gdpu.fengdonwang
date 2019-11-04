package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.course;
import entities.student;



public class courseDao {
	public void insert(course c) throws ClassNotFoundException, SQLException  {			 	
		Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8";
    Connection con = null;	
	con = DriverManager.getConnection(url);
    PreparedStatement p=null; 		   
	String sql="insert into course(cour_no,cour_name,tea_name) values(?,?,?)"; 
     p=con.prepareStatement(sql);
     p.setInt(1, c.getCour_no());
     p.setString(2,c.getCour_name());
     p.setString(3, c.getTea_name());

     p.executeUpdate();
}
	public void delete(course c ) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8";
			Connection	con =DriverManager.getConnection(url);
			PreparedStatement p = con.prepareStatement("delete from course where cour_no =?");
            p.setInt(1, c.getCour_no());
			p.executeUpdate();
			con.close();
		  
	}
	public void select(course c) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8");
		PreparedStatement pr = conn.prepareStatement("select * from course where cour_no=?");
	    pr.setInt(1, c.getCour_no());
	    ResultSet rs=pr.executeQuery();
		while(rs.next()){
			c.setCour_name(rs.getString(2));
			c.setTea_name(rs.getString(4));
}
}
}
