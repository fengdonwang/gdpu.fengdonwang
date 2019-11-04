package view;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class admin_course {
	 public admin_course() {
			  JFrame frame = new JFrame();
			   frame.setTitle("课程管理  ");
			   frame.setBounds(100,150, 400, 500); 
			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			   frame.getContentPane().setLayout(null); 
			   
			   JLabel messageL = new JLabel("XXX选修系统-------课程管理！"); 
			  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
			   messageL.setBounds(70, 10, 322, 15); 
			   frame.getContentPane().add(messageL); 
			   
				 Button addc = new Button("增加课程"); 
				 addc.setFont(new Font("宋体", Font.PLAIN, 18));
				 addc.setBounds(140, 60, 130, 30); 
				 frame.getContentPane().add(addc); 
				 addc.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							new admin_course_add();	
						}
						});
				 
				 Button lookc = new Button("查看课程 "); 
				 lookc.setFont(new Font("宋体", Font.PLAIN, 18));
				 lookc.setBounds(140, 120, 130, 30); 
				 frame.getContentPane().add(lookc); 
				 lookc.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							try {
								new admin_course_look();
							} catch (ClassNotFoundException | SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}	
						}
						});
				 
				 Button updatec = new Button("修改课程 "); 
				 updatec.setFont(new Font("宋体", Font.PLAIN, 18));
				 updatec.setBounds(140, 180, 130, 30); 
				 frame.getContentPane().add(updatec);
				 updatec.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							new admin_course_search();	
						}
						});
				 
				 Button deletec = new Button("删除课程 "); 
				 deletec.setFont(new Font("宋体", Font.PLAIN, 18));
				 deletec.setBounds(140, 240, 130, 30); 
				 frame.getContentPane().add(deletec);
				 deletec.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							new admin_course_delete();	
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

