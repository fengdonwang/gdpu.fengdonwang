package view;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;




public class admin_teacher_lookt {
	 public admin_teacher_lookt() throws ClassNotFoundException, SQLException {

		    Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8");
			PreparedStatement p1 = conn.prepareStatement("select * from teacher ");
		    ResultSet rs=p1.executeQuery();
		    ArrayList<String> a=new ArrayList<String>();
		    ArrayList<String> b=new ArrayList<String>();
		    ArrayList<String> c=new ArrayList<String>();
		    ArrayList<String> d=new ArrayList<String>();
		    ArrayList<String> e=new ArrayList<String>();
		    while(rs.next()){		    	
		    	a.add(rs.getString(4));	    
		    	b.add(rs.getString(5));
		    	c.add(rs.getString(1));		    		    	
		    	d.add(rs.getString(2));	    
		    	e.add(rs.getString(6));   	
		    }  

			   JFrame frame = new JFrame();
			   frame.setTitle("教师管理----查看教师信息  ");
			   frame.setBounds(100,150, 800, 500); 
			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			   frame.getContentPane().setLayout(null); 
			   
			   JLabel messageL = new JLabel("XXX选修系统------查看教师信息！"); 
			  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
			   messageL.setBounds(70, 10, 322, 15); 
			   frame.getContentPane().add(messageL); 
			   
			   JLabel userL = new JLabel("用户名："); 
			   userL.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   userL.setBounds(40, 80, 67, 15); 
			   frame.getContentPane().add(userL); 		     
			   JTextField userT = new JTextField(); 
			   userT.setBounds(100, 80, 500, 30); 
			   userT.setColumns(10); 
			   frame.getContentPane().add(userT);
			   
			   JLabel passwdL = new JLabel("密码："); 
			   passwdL.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   passwdL.setBounds(40, 110, 67, 15); 
			   frame.getContentPane().add(passwdL); 			     
			   JTextField passwdT = new JTextField(); 
			   passwdT.setColumns(10); 
			   passwdT.setBounds(100, 110, 500, 30); 
			   frame.getContentPane().add(passwdT);
			   
			   JLabel no = new JLabel("教师号："); 
			   no.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   no.setBounds(40, 140, 67, 15); 
			   frame.getContentPane().add(no); 			     
			   JTextField not = new JTextField(); 
			   not.setColumns(10); 
			   not.setBounds(100, 140, 500, 30); 
			   frame.getContentPane().add(not); 
			   		 
			   JLabel name = new JLabel("教师姓名："); 
			   name.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   name.setBounds(30, 170, 80, 15); 
			   frame.getContentPane().add(name); 			     
			   JTextField namet = new JTextField(); 
			   namet.setColumns(10); 
			   namet.setBounds(100, 170, 500, 30); 
			   frame.getContentPane().add(namet); 
			   
			   JLabel course = new JLabel("课程："); 
			   course.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   course.setBounds(40, 200, 67, 15); 
			   frame.getContentPane().add(course); 			     
			   JTextField courset = new JTextField(); 
			   courset.setColumns(10); 
			   courset.setBounds(100, 200, 500, 30); 
			   frame.getContentPane().add(courset); 
               String a1=" ";  String a2=" "; String a3=" ";
               String a4=" ";  String a5=" ";
			   for(int i = 0;i<a.size();i++) {
				   a1=(String) a.get(i)+"          "+a1;	
				   a2=(String) b.get(i)+"          "+a2;
				   a3=(String) c.get(i)+"          "+a3;   
				   a4=(String) d.get(i)+"          "+a4;
				   a5=(String) e.get(i)+"          "+a5;			   
			   }

             System.out.println(a1);
		      userT.setText(a1);
              passwdT.setText(a2);
              not.setText(a3);
              namet.setText(a4);
              courset.setText(a5);
			   
				 Button back = new Button("返回主目录"); 
				 back.setFont(new Font("宋体", Font.PLAIN, 18));
				 back.setBounds(140, 360, 130, 30); 
				 frame.getContentPane().add(back); 
				 back.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							new adminwindow();	
						}
						});
				 frame.setVisible(true);
    
	   }

	
}

