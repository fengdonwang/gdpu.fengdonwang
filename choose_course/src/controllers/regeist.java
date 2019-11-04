package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class regeist {
	public regeist(String user,String passwd){
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
			String sql="insert into student(stu_user,stu_passwd) values(?,?)";
		 	pstmt=con.prepareStatement(sql);	
		     pstmt.setString(1, user);
		     pstmt.setString(2, passwd);
		     pstmt.executeUpdate();
			 JOptionPane.showMessageDialog(frame, ":您好，注册成功！"); 
		 }catch(SQLException e1){
	System.out.println(e1);
	JOptionPane.showMessageDialog(frame,"用户已存在，请使用该号码登录！"); 
		 }
	}
	 }
