package view;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class adminwindow {
    public adminwindow() {
		  JFrame frame = new JFrame();
		   frame.setTitle("XXXѡ��ϵͳ");
		   frame.setBounds(100,150, 400, 500); 
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		   frame.getContentPane().setLayout(null); 
		   
		   JLabel messageL = new JLabel("XXXѡ��ϵͳ��"); 
		  messageL.setFont(new Font("����", Font.PLAIN, 18)); 
		   messageL.setBounds(70, 10, 322, 15); 
		   frame.getContentPane().add(messageL); 
		   
			 Button teacher = new Button("��ʦ����"); 
			 teacher.setFont(new Font("����", Font.PLAIN, 18));
			 teacher.setBounds(140, 60, 100, 30); 
			 frame.getContentPane().add(teacher); 
			 teacher.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
				new admin_teacher();

					frame.dispose();
					
				}
				});
			 
			 Button student = new Button("ѧ������"); 
			 student.setFont(new Font("����", Font.PLAIN, 18));
			 student.setBounds(140, 120, 100, 30); 
			 frame.getContentPane().add(student);
			 student.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						new admin_student();

						frame.dispose();
						
					}
					});
			 
			 Button course = new Button("�γ̹���"); 
			 course.setFont(new Font("����", Font.PLAIN, 18));
			 course.setBounds(140, 180, 100, 30); 
			 frame.getContentPane().add(course); 
			 course.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						new admin_course();

						frame.dispose();
						
					}
					});
			 
			 Button grade = new Button("�ɼ�����"); 
			 grade.setFont(new Font("����", Font.PLAIN, 18));
			 grade.setBounds(140, 240, 100, 30); 
			 frame.getContentPane().add(grade); 
			 grade.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						new admin_grade();
	
						frame.dispose();
						
					}
					});
			 
			 Button backup = new Button("��������"); 
			 backup.setFont(new Font("����", Font.PLAIN, 18));
			 backup.setBounds(140, 300, 100, 30); 
			 frame.getContentPane().add(backup); 
			 backup.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						new admin_backup();
						frame.dispose();
						
					}
					});
			 
			 Button restore = new Button("�ָ�����"); 
			 restore.setFont(new Font("����", Font.PLAIN, 18));
			 restore.setBounds(140, 360, 100, 30); 
			 frame.getContentPane().add(restore); 
			 restore.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						new admin_restore();
						frame.dispose();
					}
					});
			 
			 frame.setVisible(true);
			
          }
   }


