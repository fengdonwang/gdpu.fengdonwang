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
		   frame.setTitle("XXX选修系统");
		   frame.setBounds(100,150, 400, 500); 
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		   frame.getContentPane().setLayout(null); 
		   
		   JLabel messageL = new JLabel("XXX选修系统！"); 
		  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
		   messageL.setBounds(70, 10, 322, 15); 
		   frame.getContentPane().add(messageL); 
		   
			 Button teacher = new Button("教师管理"); 
			 teacher.setFont(new Font("宋体", Font.PLAIN, 18));
			 teacher.setBounds(140, 60, 100, 30); 
			 frame.getContentPane().add(teacher); 
			 teacher.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
				new admin_teacher();

					frame.dispose();
					
				}
				});
			 
			 Button student = new Button("学生管理"); 
			 student.setFont(new Font("宋体", Font.PLAIN, 18));
			 student.setBounds(140, 120, 100, 30); 
			 frame.getContentPane().add(student);
			 student.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						new admin_student();

						frame.dispose();
						
					}
					});
			 
			 Button course = new Button("课程管理"); 
			 course.setFont(new Font("宋体", Font.PLAIN, 18));
			 course.setBounds(140, 180, 100, 30); 
			 frame.getContentPane().add(course); 
			 course.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						new admin_course();

						frame.dispose();
						
					}
					});
			 
			 Button grade = new Button("成绩管理"); 
			 grade.setFont(new Font("宋体", Font.PLAIN, 18));
			 grade.setBounds(140, 240, 100, 30); 
			 frame.getContentPane().add(grade); 
			 grade.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						new admin_grade();
	
						frame.dispose();
						
					}
					});
			 
			 Button backup = new Button("备份数据"); 
			 backup.setFont(new Font("宋体", Font.PLAIN, 18));
			 backup.setBounds(140, 300, 100, 30); 
			 frame.getContentPane().add(backup); 
			 backup.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						new admin_backup();
						frame.dispose();
						
					}
					});
			 
			 Button restore = new Button("恢复数据"); 
			 restore.setFont(new Font("宋体", Font.PLAIN, 18));
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


