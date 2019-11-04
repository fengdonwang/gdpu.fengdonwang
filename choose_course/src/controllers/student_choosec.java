package controllers;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class student_choosec{
	 public student_choosec(int cour_no, String user) throws ClassNotFoundException, SQLException {
		 JFrame frame=new JFrame() ;
		 try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {		
				e1.printStackTrace();
			}
			Connection conn = null;
			try {
				conn = DriverManager.getConnection("jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8");
			    PreparedStatement pr = null;						
				pr = conn.prepareStatement("select * from student where stu_user=?");								     
				pr.setString(1, user);
				ResultSet rs = null;					
				rs = pr.executeQuery();									
			    System.out.println(cour_no);
			    System.out.println(user);
				if(rs.next()){	
					PreparedStatement p1 = null;
					p1=conn.prepareStatement("update student set cour_no=?  where stu_user =?");
					p1.setInt(1, cour_no);
					p1.setString(2, user);
					p1.executeUpdate();	
					
				    PreparedStatement p=null; 		   
					String sql="update course set stu_user=? where cour_no=?"; 
				     p=conn.prepareStatement(sql);
				     p.setString(1, user);
				     p.setInt(2, cour_no);
				     p.executeUpdate();
					
					JOptionPane.showMessageDialog(frame, ":选课成功！");
				}
				else { JOptionPane.showMessageDialog(frame, ":录入不成功！");}
			} catch (SQLException e1) {
				System.out.println(e1);
			}	
		 
	 }
 }