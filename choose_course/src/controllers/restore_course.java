package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class restore_course {
	public restore_course() throws ClassNotFoundException, SQLException {
		JFrame frame=new JFrame(); 
		Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8";
        Connection	con =DriverManager.getConnection(url);
        PreparedStatement p = con.prepareStatement("truncate table student");
        p.executeUpdate(); 
        PreparedStatement p1 = con.prepareStatement("insert into student select * from student_copy");
        p1.executeUpdate();
        con.close();
        JOptionPane.showMessageDialog(frame, ":还原课程信息成功！");
}}
