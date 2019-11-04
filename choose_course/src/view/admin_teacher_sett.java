package view;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import controllers.teacherDao;
import entities.teacher;

public class admin_teacher_sett {
	 public admin_teacher_sett() {
		 
			  JFrame frame = new JFrame();
			   frame.setTitle("教师管理----设置账号密码  ");
			   frame.setBounds(100,150, 400, 500); 
			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			   frame.getContentPane().setLayout(null); 
			   
			   JLabel messageL = new JLabel("XXX选修系统-------教师管理-----设置账号密码！"); 
			  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
			   messageL.setBounds(70, 10, 322, 15); 
			   frame.getContentPane().add(messageL); 
			   
			   JLabel userL = new JLabel("登录账号："); 
			   userL.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   userL.setBounds(87, 67, 70, 15); 
			   frame.getContentPane().add(userL); 
			     
			   JTextField userT = new JTextField(); 
			   userT.setBounds(154, 64, 141, 21); 
			   frame.getContentPane().add(userT); 
			   userT.setColumns(10); 
			     
			   JLabel passwdL = new JLabel("登录密码："); 
			   passwdL.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   passwdL.setBounds(87, 108, 70, 15); 
			   frame.getContentPane().add(passwdL); 
			     
			   JTextField passwdT = new JTextField(); 
			   passwdT.setColumns(10); 
			   passwdT.setBounds(154, 103, 141, 21); 
			   frame.getContentPane().add(passwdT); 
			   
			   JLabel tea_no = new JLabel("教师号："); 
			   tea_no.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   tea_no.setBounds(87, 149, 70, 15); 
			   frame.getContentPane().add(tea_no); 
			     
			   JTextField noT = new JTextField(); 
			   noT.setBounds(154, 149, 141, 21); 
			   frame.getContentPane().add(noT); 
			   noT.setColumns(10); 
			     
			   JLabel tea_name = new JLabel("教师名子："); 
			   tea_name.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   tea_name.setBounds(87, 190, 70, 15); 
			   frame.getContentPane().add(tea_name); 
			     
			   JTextField nameT = new JTextField(); 
			   nameT.setColumns(10); 
			   nameT.setBounds(154, 190, 141, 21); 
			   frame.getContentPane().add(nameT); 
			   
			   JLabel cour_name = new JLabel("课程名称："); 
			   cour_name.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   cour_name.setBounds(87, 231, 70, 15); 
			   frame.getContentPane().add(cour_name);    
			   JTextField cour_nameT = new JTextField(); 
			   cour_nameT.setColumns(10); 
			   cour_nameT.setBounds(154, 231, 141, 21); 
			   frame.getContentPane().add(cour_nameT); 
			   
			   JLabel cour_no = new JLabel("课程号："); 
			   cour_no.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   cour_no.setBounds(87, 272, 70, 15); 
			   frame.getContentPane().add(cour_no);    
			   JTextField cour_noT = new JTextField(); 
			   cour_noT.setColumns(10); 
			   cour_noT.setBounds(154, 272, 141, 21); 
			   frame.getContentPane().add(cour_noT); 
			   
				 Button ok = new Button("确定"); 
				 ok.setFont(new Font("宋体", Font.PLAIN, 12));
				 ok.setBounds(140, 300, 50, 30); 
				 frame.getContentPane().add(ok); 
				 ok.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							 String s1=userT.getText();
							 String s2=passwdT.getText();
							 String s3=noT.getText();
							 String s4=nameT.getText();
							 String s5=cour_nameT.getText();
							 String s6=cour_noT.getText();
							if(s1.equals("")||s1==null){ 
								  JOptionPane.showMessageDialog(frame,":您好，帐号不能为空！"); 
								   return; }
							       else if(s2.equals("")||s2==null){ 
								   JOptionPane.showMessageDialog(frame, ":您好，密码不能为空！"); 
								   return; }
							       else if(s3.equals("")||s3==null){ 
									   JOptionPane.showMessageDialog(frame, ":您好，教师号码不能为空！"); 
								   return; }
							       else if(s4.equals("")||s4==null){ 
									   JOptionPane.showMessageDialog(frame, ":您好，教师名字不能为空！"); 
								   return; }else {
						//	new admin_setteacher(s1, s2);								
							int s3a=Integer.parseInt(s3);
							int s6a=Integer.parseInt(s6);
							try {	
								teacher t=new teacher();
								t.setTea_no(s3a);t.setTea_name(s4);t.setCour_name(s5);
								t.setTea_user(s1);t.setTea_passwd(s2);t.setCour_no(s6a);
								teacherDao td=new teacherDao();	
								td.insert(t);
								JOptionPane.showMessageDialog(frame, ":设置成功！"); 
							} catch (ClassNotFoundException | SQLException e1) {
								System.out.println(e1);
							} }		
							
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

