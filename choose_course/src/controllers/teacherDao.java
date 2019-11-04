package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.teacher;


public class teacherDao {
	public void insert(teacher t) throws ClassNotFoundException, SQLException  {			 	
				Class.forName("com.mysql.jdbc.Driver");
	 	String url="jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8";
		    Connection con = null;	
			con = DriverManager.getConnection(url);
		    PreparedStatement p=null; 		   
			String sql="insert into teacher(tea_no,tea_name,tea_user,tea_passwd,cour_name,cour_no) values(?,?,?,?,?,?)"; 
             p=con.prepareStatement(sql);
             p.setInt(1, t.getTea_no());
             p.setString(2, t.getTea_name());
             p.setString(3, t.getTea_user());
             p.setString(4, t.getTea_passwd());
             p.setString(5, t.getCour_name());
             p.setInt(6, t.getCour_no());
             p.executeUpdate();
		}


	public void delete(teacher t ) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8";
			Connection	con =DriverManager.getConnection(url);
			PreparedStatement p = con.prepareStatement("delete from teacher where tea_no =?");
            p.setInt(1, t.getTea_no());
            p.setString(2, t.getTea_name());
            p.setInt(3, t.getCour_no());
			p.executeUpdate();
			con.close();
		    p.executeUpdate();
	}

	public void update(teacher t ) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		  
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8";
		    Connection	con =DriverManager.getConnection(url);
			PreparedStatement p = con.prepareStatement("update teacherinfo set tea_user =?, tea_name =?   where tea_no =s.getUser()");
		    p.setInt(1, t.getTea_no());	
		    p.setString(2,t.getTea_name());
		    p.setInt(3, t.getCour_no());
		    p.executeUpdate();
		
	}

//	public void select(teacher t ) throws SQLException, ClassNotFoundException {
//		
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8");
//			PreparedStatement pr = conn.prepareStatement("select * from teacher where tea_user=?");
//	//	    pr.setInt(1, 1);
//		    ResultSet rs=pr.executeQuery();
//			while(rs.next()){			
//				t.setTea_no(rs.getInt(1));
//				t.setTea_name(rs.getString(2));
//				t.setCour_no(rs.getInt(3));
//				
//	}}
	public void select(int a[] , String user) throws SQLException, ClassNotFoundException {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8");
				PreparedStatement pr = conn.prepareStatement("select * from teacher where tea_user=?");
			    pr.setString(1, "a");String s = " ";
			    ResultSet rs=pr.executeQuery();
			    ArrayList l=new ArrayList();
			   	while(rs.next()){
			   		l.add(rs.getInt(3));
			   	}
				for(int i=0;i<l.size();i++) {
					a[i]=(int) l.get(i);
				}
				
				for(int i=0;i<l.size();i++) {
					System.out.println(a[i]);
				}
			
			}	
	}
	
	
	




