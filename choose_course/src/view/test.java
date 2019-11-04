package view;

import java.awt.Button;

import java.awt.Font;
import java.awt.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entities.student;
import entities.teacher;

public class test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//管理员登录	
//		  JFrame frame = new JFrame();
//		   frame.setTitle("XXX选修系统");
//		   frame.setBounds(100,150, 400, 500); 
//		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//		   frame.getContentPane().setLayout(null); 
//		   
//		   JLabel messageL = new JLabel("XXX选修系统！"); 
//		  messageL.setFont(new Font("宋体", Font.PLAIN, 20)); 
//		   messageL.setBounds(120, 12, 322, 20); 
//		   frame.getContentPane().add(messageL); 
//		   
//			 Button teacher = new Button("教师管理"); 
//			 teacher.setFont(new Font("宋体", Font.PLAIN, 18));
//			 teacher.setBounds(140, 60, 100, 30); 
//			 frame.getContentPane().add(teacher); 
//			 
//			 Button student = new Button("学生管理"); 
//			 student.setFont(new Font("宋体", Font.PLAIN, 18));
//			 student.setBounds(140, 120, 100, 30); 
//			 frame.getContentPane().add(student); 
//			 
//			 Button course = new Button("课程管理"); 
//			 course.setFont(new Font("宋体", Font.PLAIN, 18));
//			 course.setBounds(140, 180, 100, 30); 
//			 frame.getContentPane().add(course); 
//			 
//			 Button grade = new Button("成绩管理"); 
//			 grade.setFont(new Font("宋体", Font.PLAIN, 18));
//			 grade.setBounds(140, 240, 100, 30); 
//			 frame.getContentPane().add(grade); 
//			 
//			 Button backup = new Button("备份数据"); 
//			 backup.setFont(new Font("宋体", Font.PLAIN, 18));
//			 backup.setBounds(140, 300, 100, 30); 
//			 frame.getContentPane().add(backup); 
//			 
//			 Button restore = new Button("恢复数据"); 
//			 restore.setFont(new Font("宋体", Font.PLAIN, 18));
//			 restore.setBounds(140, 360, 100, 30); 
//			 frame.getContentPane().add(restore);
//			 frame.setVisible(true);
			 
			 
//教师登录			 
//			   JFrame frame = new JFrame();
//			   frame.setTitle("XXX选修系统");
//			   frame.setBounds(100,150, 400, 300); 
//			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//			   frame.getContentPane().setLayout(null); 
//			   
//			   JLabel messageL = new JLabel("欢迎教师登录XXX选修系统！"); 
//			  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
//			   messageL.setBounds(70, 10, 322, 15); 
//			   frame.getContentPane().add(messageL); 
//			   
//				 Button setgrade = new Button("录入成绩"); 
//				 setgrade.setFont(new Font("宋体", Font.PLAIN, 18));
//				 setgrade.setBounds(140, 61, 100, 30); 
//				 frame.getContentPane().add(setgrade); 
//				 
//				 Button show = new Button("查看信息"); 
//				 show.setFont(new Font("宋体", Font.PLAIN, 18));
//				 show.setBounds(140, 150, 100, 30); 
//				 frame.getContentPane().add(show); 
//		
//				 frame.setVisible(true);
	
			 
//学生登录			 
//			  JFrame frame = new JFrame();
//			   frame.setTitle("XXX选修系统");
//			   frame.setBounds(100,150, 400, 300); 
//			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//			   frame.getContentPane().setLayout(null); 
//			   
//			   JLabel messageL = new JLabel("欢迎学生登录XXX选修系统！"); 
//			  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
//			   messageL.setBounds(70, 10, 322, 15); 
//			   frame.getContentPane().add(messageL); 
//			   
//				 Button  choosecour= new Button("选课"); 
//				 choosecour.setFont(new Font("宋体", Font.PLAIN, 18));
//				 choosecour.setBounds(140, 61, 100, 30); 
//				 frame.getContentPane().add(choosecour); 
//				 
//				 Button show = new Button("查看课程"); 
//				 show.setFont(new Font("宋体", Font.PLAIN, 18));
//				 show.setBounds(140, 150, 100, 30); 
//				 frame.getContentPane().add(show); 
//				 
//				 frame.setVisible(true);
//		
		//注册
//		 JFrame frame = new JFrame(); 
//		 frame.setTitle("注册选课系统"); 
//		 frame.setBounds(400, 250, 450, 300); 
//		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//		 frame.getContentPane().setLayout(null); 
//		   
//		 JLabel titleL = new JLabel("欢迎注册XXX选课系统"); 
//		 titleL.setFont(new Font("宋体", Font.PLAIN, 16)); 
//		 titleL.setBounds(111, 17, 287, 15); 
//		 frame.getContentPane().add(titleL); 
//		   
//		 JLabel userL = new JLabel("用户名："); 
//		 userL.setFont(new Font("宋体", Font.PLAIN, 14)); 
//		 userL.setBounds(87, 67, 67, 15); 
//		 frame.getContentPane().add(userL); 
//		   
//		 JTextField userT = new JTextField(); 
//		 userT.setBounds(154, 64, 141, 21); 
//		 frame.getContentPane().add(userT); 
//		 userT.setColumns(10); 
//		   
//		 JLabel passwdL = new JLabel("密码："); 
//		 passwdL.setFont(new Font("宋体", Font.PLAIN, 14)); 
//		 passwdL.setBounds(87, 108, 67, 15); 
//		 frame.getContentPane().add(passwdL); 
//		   
//		 JTextField passwdT = new JTextField(); 
//		 passwdT.setColumns(10); 
//		 passwdT.setBounds(154, 103, 141, 21); 
//		 frame.getContentPane().add(passwdT); 
//		   
//		 Button regeist = new Button("注册"); 
//		 regeist.setBounds(180, 194, 76, 23); 
//		 frame.getContentPane().add(regeist); 	 
//		 frame.setVisible(true);
//		 regeist.addMouseListener(new MouseAdapter() {
//			 @Override
//			public void mouseClicked(MouseEvent e) {
//				// TODO Auto-generated method stub
//				 PreparedStatement pstmt=null;
//				 try{
//				 	Class.forName("com.mysql.jdbc.Driver");
//				 }catch(Exception e1){
//				 	System.out.println(e1);
//				 }
//				 try{
//				 	String url="jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8";
//				  Connection con =DriverManager.getConnection(url);
//				 	String sql="insert into studentinfo(stu_user,stu_passwd) values(?,?)";
//				 	pstmt=con.prepareStatement(sql);
//				     pstmt.setString(1, "afadsf");
//				     pstmt.setString(2, "sdfsdafg");
//				     pstmt.executeUpdate();
//				 }catch(SQLException e1){
//			System.out.println(e1);
//				 }
//                 
//				//super.mouseClicked(e);
//			}
//		});
//	}
		
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8");
//		PreparedStatement pr = conn.prepareStatement("select * from teacher ");
//
//	    ResultSet rs=pr.executeQuery();
//	    ArrayList a=new ArrayList();
//	    ArrayList b=new ArrayList();
//	    ArrayList c=new ArrayList();
//	    while(rs.next()){
//	    	
//	    	a.add(rs.getString(1));	    
//	    	b.add(rs.getString(2));
//	    	c.add(rs.getString(3));
//	    	
//	    }  
//		for( int i = 0;i<j;i++){
//			String a=(rs.getString(1));
//			String b[]=rs.getString(2);
	//}
	    
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		
//		student s=new student();
//		Class.forName("com.mysql.jdbc.Driver");
//		String url="jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8";
//	    Connection	con =DriverManager.getConnection(url);
//		PreparedStatement p = con.prepareStatement("update student set cour_no =? where stu_user =?");
//	    p.setInt(1, 2);	
//	    p.setString(2, "1");
//	    p.executeUpdate();
//	    con.close();
//	    System.out.println(s.getCour_no());
//	    System.out.println(s.getStu_no());
		
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8");
//		PreparedStatement pr = conn.prepareStatement("select * from teacher where tea_user=?");
//	    pr.setString(1, "a");String s = " ";
//	    ResultSet rs=pr.executeQuery();
//	    ArrayList l=new ArrayList();
//	   	while(rs.next()){
//	   		l.add(rs.getInt(3));
//	   	}
//		int[] a=new int[l.size()];
//		for(int i=0;i<l.size();i++) {
//			a[i]=(int) l.get(i);
//		}
//		for(int i=0;i<l.size();i++) {
//			System.out.println(a[i]);
//		}
		
		 JFrame frame=new JFrame();
			Class.forName("com.mysql.jdbc.Driver");
         String url="jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8";
         Connection	con =DriverManager.getConnection(url);
//         PreparedStatement p = con.prepareStatement("truncate table student");
//         p.executeUpdate(); 
//         PreparedStatement p1 = con.prepareStatement("insert into student select * from student_copy");
//         p1.executeUpdate();
//         con.close();
//         JOptionPane.showMessageDialog(frame, ":备份学生信息成功！");
		
		PreparedStatement pr = con.prepareStatement("select Count(*) from course group by cour_name");
	    ResultSet r=pr.executeQuery();
	    int count=0;
	    while(r.next()) {
		count=r.getInt(1);}
	   
		System.out.println(count);
	}
}
