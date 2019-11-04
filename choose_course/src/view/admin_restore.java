package view;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controllers.restore_course;
import controllers.restore_grade;
import controllers.restore_student;
import controllers.restore_teacher;

public class admin_restore {
	 public admin_restore() {
			  JFrame frame = new JFrame();
			  JOptionPane.showMessageDialog(frame, "警告⚠危险！此操作会丢失现有的表！");
			   frame.setTitle("教师管理  ");
			   frame.setBounds(100,150, 400, 500); 
			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			   frame.getContentPane().setLayout(null); 
			   
			   JLabel messageL = new JLabel("XXX选修系统-------数据备份！"); 
			  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
			   messageL.setBounds(70, 10, 322, 15); 
			   frame.getContentPane().add(messageL); 
			   
				 Button restores = new Button("还原学生信息"); 
				 restores.setFont(new Font("宋体", Font.PLAIN, 18));
				 restores.setBounds(140, 60, 130, 30); 
				 frame.getContentPane().add(restores); 
				 restores.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							try {
								new restore_student();
							} catch (ClassNotFoundException | SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}	
						}
						});
				 
				 Button restoret = new Button("还原教师信息 "); 
				 restoret.setFont(new Font("宋体", Font.PLAIN, 18));
				 restoret.setBounds(140, 120, 130, 30); 
				 frame.getContentPane().add(restoret);
				 restoret.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							try {
								new restore_teacher();
							} catch (ClassNotFoundException | SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}	
						}
						});
				 
				 Button restorec = new Button("还原课程表 "); 
				 restorec.setFont(new Font("宋体", Font.PLAIN, 18));
				 restorec.setBounds(140, 180, 130, 30); 
				 frame.getContentPane().add(restorec); 
				 restorec.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							try {
								new restore_course();
							} catch (ClassNotFoundException | SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}	
						}
						});
				 
				 Button restoreg = new Button("还原成绩单 "); 
				 restoreg.setFont(new Font("宋体", Font.PLAIN, 18));
				 restoreg.setBounds(140, 240, 130, 30); 
				 frame.getContentPane().add(restoreg); 
				 restoreg.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							try {
								new restore_grade();
							} catch (ClassNotFoundException | SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
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


