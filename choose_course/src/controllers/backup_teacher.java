package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class backup_teacher {
       public backup_teacher() throws SQLException, ClassNotFoundException{  
    	   JFrame frame=new JFrame();
			Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8";
        Connection	con =DriverManager.getConnection(url);
        PreparedStatement p = con.prepareStatement("truncate table teacher_copy");
        p.executeUpdate(); 
        PreparedStatement p1 = con.prepareStatement("insert into teacher_copy select * from teacher");
        p1.executeUpdate();
        con.close();
        JOptionPane.showMessageDialog(frame, ":备份教师信息成功！");
           }
}