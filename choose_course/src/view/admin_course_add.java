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


import controllers.courseDao;

import entities.course;


public class admin_course_add {
	 public admin_course_add() {
		 
			  JFrame frame = new JFrame();
			   frame.setTitle("课程管理----开设课程  ");
			   frame.setBounds(100,150, 400, 500); 
			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			   frame.getContentPane().setLayout(null); 
			   
			   JLabel messageL = new JLabel("XXX选修系统-------课程管理-----开设课程！"); 
			  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
			   messageL.setBounds(70, 10, 322, 15); 
			   frame.getContentPane().add(messageL); 
			   
			   JLabel cour_no = new JLabel("课程号："); 
			   cour_no.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   cour_no.setBounds(87, 67, 70, 15); 
			   frame.getContentPane().add(cour_no); 
			     
			   JTextField cour_not = new JTextField(); 
			   cour_not.setBounds(154, 64, 141, 21); 
			   frame.getContentPane().add(cour_not); 
			   cour_not.setColumns(10); 
			     
			   JLabel cour_name = new JLabel("课程名称："); 
			   cour_name.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   cour_name.setBounds(87, 108, 70, 15); 
			   frame.getContentPane().add(cour_name); 
			     
			   JTextField cour_namet = new JTextField(); 
			   cour_namet.setColumns(10); 
			   cour_namet.setBounds(154, 103, 141, 21); 
			   frame.getContentPane().add(cour_namet); 
			   
			   JLabel tea_name = new JLabel("教师："); 
			   tea_name.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   tea_name.setBounds(87, 149, 70, 15); 
			   frame.getContentPane().add(tea_name); 
			     
			   JTextField noT = new JTextField(); 
			   noT.setBounds(154, 149, 141, 21); 
			   frame.getContentPane().add(noT); 
			   noT.setColumns(10); 
			     
			   
				 Button ok = new Button("确定"); 
				 ok.setFont(new Font("宋体", Font.PLAIN, 12));
				 ok.setBounds(140, 280, 50, 30); 
				 frame.getContentPane().add(ok); 
				 ok.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							 String s1=cour_not.getText();
							 String s2=cour_namet.getText();
							 String s3=noT.getText();
							if(s1.equals("")||s1==null){ 
								  JOptionPane.showMessageDialog(frame,":您好，课程号不能为空！"); 
								   return; }
							       else if(s2.equals("")||s2==null){ 
								   JOptionPane.showMessageDialog(frame, ":您好，课程名不能为空！"); 
								   return; }
			                         else {
//							new admin_setteacher(s1, s2);								
							int s4=Integer.parseInt(s1);
							course c=new course(s4,s2,s3);
							courseDao td=new courseDao(); 
							try {
								td.insert(c);
								JOptionPane.showMessageDialog(frame, ":添加成功！");
							} catch (ClassNotFoundException | SQLException e1) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(frame,"课程号存在！");
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

