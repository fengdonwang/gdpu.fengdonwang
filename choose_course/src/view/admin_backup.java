package view;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controllers.backup_course;
import controllers.backup_grade;
import controllers.backup_student;
import controllers.backup_teacher;

public class admin_backup {
	 public admin_backup() {
		
			  JFrame frame = new JFrame();
			   frame.setTitle("教师管理  ");
			   frame.setBounds(100,150, 400, 500); 
			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			   frame.getContentPane().setLayout(null); 
			   
			   JLabel messageL = new JLabel("XXX选修系统-------数据备份！"); 
			  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
			   messageL.setBounds(70, 10, 322, 15); 
			   frame.getContentPane().add(messageL); 
			   
				 Button backups = new Button("备份学生信息"); 
				 backups.setFont(new Font("宋体", Font.PLAIN, 18));
				 backups.setBounds(140, 60, 130, 30); 
				 frame.getContentPane().add(backups); 
				 backups.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							try {
								new backup_student();
							} catch (ClassNotFoundException | SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}	
						}
						});
				 
				 Button backupt = new Button("备份教师信息 "); 
				 backupt.setFont(new Font("宋体", Font.PLAIN, 18));
				 backupt.setBounds(140, 120, 130, 30); 
				 frame.getContentPane().add(backupt); 
				 backupt.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							try {
								new backup_teacher();
							} catch (ClassNotFoundException | SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}	
						}
						});
				 
				 Button backupc = new Button("备份课程表 "); 
				 backupc.setFont(new Font("宋体", Font.PLAIN, 18));
				 backupc.setBounds(140, 180, 130, 30); 
				 frame.getContentPane().add(backupc); 
				 backupc.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							try {
								new backup_course();
							} catch (ClassNotFoundException | SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}	
						}
						});
				 
				 Button backupg = new Button("备份成绩单 "); 
				 backupg.setFont(new Font("宋体", Font.PLAIN, 18));
				 backupg.setBounds(140, 240, 130, 30); 
				 frame.getContentPane().add(backupg);
				 backupg.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							try {
								new backup_grade();
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
