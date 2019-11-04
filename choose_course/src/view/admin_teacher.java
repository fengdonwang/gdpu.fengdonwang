package view;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class admin_teacher {
	 public admin_teacher() {
		
			  JFrame frame = new JFrame();
			   frame.setTitle("教师管理  ");
			   frame.setBounds(100,150, 400, 500); 
			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			   frame.getContentPane().setLayout(null); 
			   
			   JLabel messageL = new JLabel("XXX选修系统-------教师管理！"); 
			  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
			   messageL.setBounds(70, 10, 322, 15); 
			   frame.getContentPane().add(messageL); 
			   
				 Button sett = new Button("设置教师信息"); 
				 sett.setFont(new Font("宋体", Font.PLAIN, 18));
				 sett.setBounds(120, 60, 180, 30); 
				 frame.getContentPane().add(sett); 
				 sett.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							new admin_teacher_sett();	
						}
						});
				 
				 
				 Button lookt = new Button("查看教师 "); 
				 lookt.setFont(new Font("宋体", Font.PLAIN, 18));
				 lookt.setBounds(140, 120, 130, 30); 
				 frame.getContentPane().add(lookt); 
				 lookt.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							try {
								new admin_teacher_lookt();
							} catch (ClassNotFoundException | SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}	
						}
						});
				 
				 Button updatet = new Button("查询，修改教师"); 
				 updatet.setFont(new Font("宋体", Font.PLAIN, 18));
				 updatet.setBounds(140, 180, 130, 30); 
				 frame.getContentPane().add(updatet); 
				 updatet.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							new admin_teacher_serch();	
						}
						});
				 Button quan = new Button("设置教师权限"); 
				 quan.setFont(new Font("宋体", Font.PLAIN, 18));
				 quan.setBounds(140, 240, 130, 30); 
				 frame.getContentPane().add(quan); 
				 quan.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frame, "警告⚠！教师只允许操作自己的学生的成绩！"); 
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
