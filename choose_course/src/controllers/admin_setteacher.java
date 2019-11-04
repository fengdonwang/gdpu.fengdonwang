package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class admin_setteacher {
	public admin_setteacher(String user,String passwd){
		 JFrame	frame = new JFrame(); 
		 PreparedStatement pstmt=null;
		 try{
		 	Class.forName("com.mysql.jdbc.Driver");
		 }catch(Exception e1){
		 	System.out.println(e1);
		 }
		 try{
		 	String url="jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8";
		  Connection con =DriverManager.getConnection(url);
			String sql="insert into teacher(tea_user,tea_passwd) values(?,?)";
		 	pstmt=con.prepareStatement(sql);	
		     pstmt.setString(1, user);
		     pstmt.setString(2, passwd);
		     pstmt.executeUpdate();
			 JOptionPane.showMessageDialog(frame, ":您好，教师密码设置成功！"); 
		 }catch(SQLException e1){
	System.out.println(e1);
	JOptionPane.showMessageDialog(frame,"用户已存在！"); 
		 }
	}
	 }

