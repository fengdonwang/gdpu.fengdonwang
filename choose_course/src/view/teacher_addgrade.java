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

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class teacher_addgrade {
	 public teacher_addgrade(String s, String user) {	 
		 
			  JFrame frame = new JFrame();
			   frame.setTitle("教师，你好！  ");
			   frame.setBounds(100,150, 400, 500); 
			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			   frame.getContentPane().setLayout(null); 
			   
			   JLabel messageL = new JLabel("XXX选修系统----录入成绩！"); 
			  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
			   messageL.setBounds(70, 10, 322, 15); 
			   frame.getContentPane().add(messageL); 
			 			 
			   JLabel no = new JLabel("请输入学生学号："); 
			   no.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   no.setBounds(40, 80, 180, 15); 
			   frame.getContentPane().add(no); 		     
			   JTextField not = new JTextField(); 
			   not.setBounds(160, 80, 50, 30); 
			   not.setColumns(10); 
			   frame.getContentPane().add(not);
			   
			   JLabel gradeL = new JLabel("请输入成绩："); 
			   gradeL.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   gradeL.setBounds(60, 170, 160, 15); 
			   frame.getContentPane().add(gradeL); 			     
			   JTextField gradet = new JTextField(); 
			   gradet.setColumns(10); 
			   gradet.setBounds(160, 170, 50, 30); 
			   frame.getContentPane().add(gradet);	
				 
				 Button ok = new Button("确定 "); 
				 ok.setFont(new Font("宋体", Font.PLAIN, 18));
				 ok.setBounds(140, 240, 130, 30); 
				 frame.getContentPane().add(ok); 
				 ok.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {												
						try {
							Class.forName("com.mysql.jdbc.Driver");
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						Connection conn = null;
						try {
							conn = DriverManager.getConnection("jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8");
						    PreparedStatement pr = null;						
							pr = conn.prepareStatement("select * from grade where stu_no=?");						
					        int num=Integer.parseInt(not.getText());
							pr.setInt(1, num);
							ResultSet rs = null;
					        System.out.println(num);						
							rs = pr.executeQuery();									
							if(rs.next()){	
								PreparedStatement p1 = null;
								int grade=Integer.parseInt(gradet.getText()) ;
								p1=conn.prepareStatement("update grade set grade=?  where stu_no =?");
								p1.setInt(1, grade);
								p1.setInt(2, num);
								p1.executeUpdate();	
								JOptionPane.showMessageDialog(frame, ":录入成功！");
							}
							else {JOptionPane.showMessageDialog(frame, ":账号不存在！"); }
						} catch (SQLException e1) {
							System.out.println(e1);
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
							new teacherwindow(user);	
						}
						});
				 frame.setVisible(true);
				
	 }	      
	   
}


