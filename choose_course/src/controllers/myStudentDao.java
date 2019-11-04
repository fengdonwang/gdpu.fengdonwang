package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import entities.student;

public class myStudentDao {
	public void insert(student s) throws SQLException, ClassNotFoundException  {			 	
				Class.forName("com.mysql.jdbc.Driver");
	 	String url="jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8";
		    Connection con = null;	
			con = DriverManager.getConnection(url);
		    PreparedStatement p=null; 		   
			String sql="insert into student() values(?)"; 
             p=con.prepareStatement(sql);
             p.setInt(1, s.getStu_no());
             p.setString(2, s.getStu_name());
             p.setInt(3, s.getCour_no());
		}


	public void delete(student s) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://182.61.5.233/DBJsp?user=root&password=6369&characterEncoding=utf-8";
			Connection	con =DriverManager.getConnection(url);
			PreparedStatement p = con.prepareStatement("delete from student where stu_no =?");
            p.setInt(1, s.getStu_no());
			p.executeUpdate();
			con.close();
	
	}

	public void update(student s) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		  
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8";
		    Connection	con =DriverManager.getConnection(url);
			PreparedStatement p = con.prepareStatement("update student set cour_no =?   where stu_user =?");
		    p.setInt(1, s.getCour_no());	
		    p.setString(2, s.getStu_user());
		    p.executeUpdate();
		    con.close();
		    System.out.println(s.getCour_no());
		    System.out.println(s.getStu_user());
	}

	public void select(student s) throws SQLException, ClassNotFoundException {
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8");
			PreparedStatement pr = conn.prepareStatement("select * from student where stu_user=?");
		    pr.setString(1, s.getStu_user());
		    ResultSet rs=pr.executeQuery();
			while(rs.next()){
				s.setStu_name(rs.getString(2));
				s.setCour_no(rs.getInt(3));
	}
	}
}
