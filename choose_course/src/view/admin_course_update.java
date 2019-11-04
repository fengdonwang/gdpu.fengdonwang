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



public class admin_course_update {
	 public admin_course_update(String s) {
		      
			  JFrame frame = new JFrame();
			   frame.setTitle("学生管理----修改信息 ");
			   frame.setBounds(100,150, 400, 500); 
			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			   frame.getContentPane().setLayout(null); 
			   
			  JLabel messageL = new JLabel("XXX选修系统--课程管理--修改课程信息！"); 
			  messageL.setFont(new Font("宋体", Font.PLAIN, 15)); 
			   messageL.setBounds(70, 10, 322, 15); 
			   frame.getContentPane().add(messageL); 
			   
			   JLabel userL = new JLabel("任课老师："); 
			   userL.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   userL.setBounds(87, 67, 70, 15); 
			   frame.getContentPane().add(userL); 
			     
			   JTextField userT = new JTextField(); 
			   userT.setBounds(154, 64, 141, 21); 
			   frame.getContentPane().add(userT); 
			   userT.setColumns(10); 
			   
				 Button ok = new Button("确定"); 
				 ok.setFont(new Font("宋体", Font.PLAIN, 12));
				 ok.setBounds(140, 280, 50, 30); 
				 frame.getContentPane().add(ok); 
				 ok.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							 String s1=userT.getText();
							if(s1.equals("")||s1==null){ 
								  JOptionPane.showMessageDialog(frame,":您好，教师不能为空！"); 
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
											p = con.prepareStatement("update course set tea_name =?  where cour_no=?");
											int s2=Integer.parseInt(s) ;
											p.setString(1, s1);				
											p.setInt(2,s2);
											p.executeUpdate();
											 JOptionPane.showMessageDialog(frame, ":修改成功！！"); 
										} catch (SQLException e1) {		
//											JOptionPane.showMessageDialog(frame, ":不存在该课程号！！"); 
											System.out.println(e1);
										}
							 }	
							frame.dispose();
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



