package view;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class student_set {
	 public student_set(String s) {
		      
			  JFrame frame = new JFrame();
			   frame.setTitle("学生登录----修改信息 ");
			   frame.setBounds(100,150, 400, 500); 
			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			   frame.getContentPane().setLayout(null); 
			   
			  JLabel messageL = new JLabel("XXX选修系统--学生登录--修改信息！"); 
			  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
			   messageL.setBounds(70, 10, 322, 15); 
			   frame.getContentPane().add(messageL); 
			     
			   JLabel passwdL = new JLabel("登录密码："); 
			   passwdL.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   passwdL.setBounds(87, 108, 70, 15); 
			   frame.getContentPane().add(passwdL); 
			     
			   JTextField passwdT = new JTextField(); 
			   passwdT.setColumns(10); 
			   passwdT.setBounds(154, 103, 141, 21); 
			   frame.getContentPane().add(passwdT); 
			   
			   JLabel name = new JLabel("设置姓名："); 
			   name.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   name.setBounds(87, 149, 70, 15); 
			   frame.getContentPane().add(name); 
			     
			   JTextField namet = new JTextField(); 
			   namet.setColumns(10); 
			   namet.setBounds(154, 142, 141, 21); 
			   frame.getContentPane().add(namet); 
			   
				 Button ok = new Button("确定"); 
				 ok.setFont(new Font("宋体", Font.PLAIN, 12));
				 ok.setBounds(140, 280, 50, 30); 
				 frame.getContentPane().add(ok); 
				 ok.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							 String s1=passwdT.getText();
							 String s2=namet.getText();
							       if(s1.equals("")||s1==null){ 
								   JOptionPane.showMessageDialog(frame, ":您好，密码不能为空！"); 
								   return; }
							       else if(s1.equals("")||s1==null){ 
									   JOptionPane.showMessageDialog(frame, ":您好，名字不能为空！"); 
									   return; }
							      else {
							    	  try {
										Class.forName("com.mysql.jdbc.Driver");
									} catch (ClassNotFoundException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
							    		String url="jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8";
							    	    Connection con = null;
										try {
											con = DriverManager.getConnection(url);
											PreparedStatement p = null;
											p = con.prepareStatement("update student set stu_passwd =? ,stu_name=?   where stu_user =?");				
											p.setString(1,s1); 
											p.setString(2, s2);
											p.setString(3,s);
											p.executeUpdate();
											JOptionPane.showMessageDialog(frame, ":修改成功！！"); 
										} catch (SQLException e1) {		
											System.out.println(e1);
										}
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
							new studentwindow(s);
							frame.dispose();
						}
						});
				 
				 frame.setVisible(true);
			
		      
	   }

}



