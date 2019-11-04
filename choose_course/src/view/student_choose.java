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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controllers.student_choosec;


public class student_choose {
	 public student_choose(String user) throws ClassNotFoundException, SQLException {

		    Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8");
			PreparedStatement p1 = conn.prepareStatement("select * from course");
		    ResultSet rs=p1.executeQuery();
		    ArrayList<String> a=new ArrayList<String>();
		    ArrayList<String> b=new ArrayList<String>();
		    ArrayList<String> c=new ArrayList<String>();

		    while(rs.next()){		    	
		    	a.add(rs.getString(1));	    
		    	b.add(rs.getString(2));
		    	c.add(rs.getString(4));		    		 	
		    }  
			   JFrame frame = new JFrame();
			   frame.setTitle("学生选课  ");
			   frame.setBounds(100,150, 800, 500); 
			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			   frame.getContentPane().setLayout(null); 
			   
			   JLabel messageL = new JLabel("XXX选修系统------学生选课！"); 
			  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
			   messageL.setBounds(70, 10, 322, 15); 
			   frame.getContentPane().add(messageL); 
			   
			   JLabel no = new JLabel("课程号："); 
			   no.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   no.setBounds(40, 80, 67, 15); 
			   frame.getContentPane().add(no); 		     
			   JTextField not = new JTextField(); 
			   not.setBounds(100, 80, 500, 30); 
			   not.setColumns(10); 
			   frame.getContentPane().add(not);
			   
			   JLabel name = new JLabel("课程名："); 
			   name.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   name.setBounds(30, 170, 80, 15); 
			   frame.getContentPane().add(name); 			     
			   JTextField namet = new JTextField(); 
			   namet.setColumns(10); 
			   namet.setBounds(100, 170, 500, 30); 
			   frame.getContentPane().add(namet);	
			   			   
			   JLabel tname = new JLabel("任课教师："); 
			   tname.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   tname.setBounds(30, 110, 80, 15); 
			   frame.getContentPane().add(tname); 			     
			   JTextField tnamet = new JTextField(); 
			   tnamet.setColumns(10); 
			   tnamet.setBounds(100, 110, 500, 30); 
			   frame.getContentPane().add(tnamet); 
			    
               String a1 = " ";  String a2=" "; String a3=" ";
			   for(int i = 0;i<a.size();i++) {
				   a1=(String) a.get(i)+"  "+a1;	
				   a2=(String) b.get(i)+"  "+a2;
				   a3=(String) c.get(i)+"  "+a3;   	  
			   }
		      not.setText(a1);
              namet.setText(a2);           
              tnamet.setText(a3);
             
              JLabel cho_no = new JLabel("请输入你要选的课程课程号："); 
              cho_no.setFont(new Font("宋体", Font.PLAIN, 18)); 
              cho_no.setBounds(80, 250, 240, 15); 
			   frame.getContentPane().add(cho_no); 			     
			   JTextField cho_not = new JTextField(); 
			   cho_not.setColumns(10); 
			   cho_not.setBounds(320, 250, 100, 30); 
			   frame.getContentPane().add(cho_not);
			   
			   Button ok = new Button("确定"); 
			   ok.setFont(new Font("宋体", Font.PLAIN, 15));
			   ok.setBounds(330, 300, 80, 30); 
				 frame.getContentPane().add(ok); 
				 ok.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							PreparedStatement p2;
							try {
								int cour_no=Integer.parseInt(cho_not.getText()) ;
								p2 = conn.prepareStatement("select cour_no from course where cour_no=?");
								p2.setInt(1, cour_no);
								ResultSet rs=p2.executeQuery();
								
								if(rs.next()) {
									String s1=namet.getText();
							try {								
								new student_choosec(cour_no,user);	
							} catch (ClassNotFoundException | SQLException e1) {
								e1.printStackTrace();
							}			
								}else {
									JOptionPane.showMessageDialog(frame, ":输入有误，请输入上面的课程号！");
								}
							} catch (SQLException e2) {
								e2.printStackTrace();
							}
						    
						    
							
							
						}
						});
			   
				 Button back = new Button("返回主目录"); 
				 back.setFont(new Font("宋体", Font.PLAIN, 18));
				 back.setBounds(140, 360, 130, 30); 
				 frame.getContentPane().add(back); 
				 back.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							new studentwindow(user);
							frame.dispose();
						}
						});
				 frame.setVisible(true);    
	   }	
}

