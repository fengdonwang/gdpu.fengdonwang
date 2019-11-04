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
			   frame.setTitle("��ʦ����  ");
			   frame.setBounds(100,150, 400, 500); 
			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			   frame.getContentPane().setLayout(null); 
			   
			   JLabel messageL = new JLabel("XXXѡ��ϵͳ-------���ݱ��ݣ�"); 
			  messageL.setFont(new Font("����", Font.PLAIN, 18)); 
			   messageL.setBounds(70, 10, 322, 15); 
			   frame.getContentPane().add(messageL); 
			   
				 Button backups = new Button("����ѧ����Ϣ"); 
				 backups.setFont(new Font("����", Font.PLAIN, 18));
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
				 
				 Button backupt = new Button("���ݽ�ʦ��Ϣ "); 
				 backupt.setFont(new Font("����", Font.PLAIN, 18));
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
				 
				 Button backupc = new Button("���ݿγ̱� "); 
				 backupc.setFont(new Font("����", Font.PLAIN, 18));
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
				 
				 Button backupg = new Button("���ݳɼ��� "); 
				 backupg.setFont(new Font("����", Font.PLAIN, 18));
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
				 
				 Button back = new Button("������Ŀ¼"); 
				 back.setFont(new Font("����", Font.PLAIN, 18));
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
