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


public class admin_student_serch {
	 public admin_student_serch() {	 
			  JFrame frame = new JFrame();
			   frame.setTitle("学生管理  ");
			   frame.setBounds(100,150, 400, 500); 
			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			   frame.getContentPane().setLayout(null); 
			   
			   JLabel messageL = new JLabel("XXX选修系统----修改学生信息！"); 
			  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
			   messageL.setBounds(70, 10, 322, 15); 
			   frame.getContentPane().add(messageL); 
			 			 
				   JLabel userL = new JLabel("请输入学生账号："); 
				   userL.setFont(new Font("宋体", Font.PLAIN, 16)); 
				   userL.setBounds(40, 80, 160, 30); 
				   frame.getContentPane().add(userL); 		     
				   JTextField userT = new JTextField(); 
				   userT.setBounds(120, 120, 200, 30); 
				   userT.setColumns(10); 
				   frame.getContentPane().add(userT);
				 
				 Button ok = new Button("查询 "); 
				 ok.setFont(new Font("宋体", Font.PLAIN, 18));
				 ok.setBounds(140, 160, 130, 30); 
				 frame.getContentPane().add(ok); 
				 ok.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {							
					String s1=userT.getText();
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
							pr = conn.prepareStatement("select * from student where stu_user=?");						
					    ResultSet rs = null;					
							pr.setString(1, s1);
							rs = pr.executeQuery();									
							if(rs.next()){	
								new admin_student_update(userT.getText());                                							
							}
							else {JOptionPane.showMessageDialog(frame, ":账号不存在！"); }
						} catch (SQLException e1) {
							
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
							new adminwindow();	
						}
						});
				 frame.setVisible(true);
				
	 }	      
	   
}


