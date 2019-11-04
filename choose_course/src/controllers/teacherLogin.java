package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.Loginwindow;
import view.teacherwindow;
public class teacherLogin {
	
    public teacherLogin(String user,String passwd) throws ClassNotFoundException, SQLException {
         JFrame	frame = new JFrame(); 
	 	Class.forName("com.mysql.jdbc.Driver");
	 String url="jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8";
	  Connection con =DriverManager.getConnection(url);
	 String sql = "select tea_user,tea_passwd from teacher where tea_user=? and tea_passwd=?";
	 PreparedStatement ptmt = null;
		ptmt = con.prepareStatement(sql);
		ptmt.setString(1, user);	
		ptmt.setString(2, passwd);   
	 ResultSet rs = null;
	    
		rs = ptmt.executeQuery();
		if (rs.next()) {  
           new teacherwindow(user);
           frame.dispose();
		 } 
		 else {         
			 JOptionPane.showMessageDialog(frame,"–’√˚ªÚ√‹¬Î¥ÌŒÛ£°\n«Î÷ÿ–¬µ«¬º"); 
			 new Loginwindow();
			 }
	
	 }
    
}

