package view;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class teacherwindow {  
   public teacherwindow(String user) {
		   JFrame frame = new JFrame();
		   frame.setTitle("XXX选修系统");
		   frame.setBounds(100,150, 400, 300); 
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		   frame.getContentPane().setLayout(null); 
		   
		   JLabel messageL = new JLabel("欢迎教师登录XXX选修系统！"); 
		  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
		   messageL.setBounds(70, 10, 322, 15); 
		   frame.getContentPane().add(messageL); 
		   
			 Button setgrade = new Button("录入成绩"); 
			 setgrade.setFont(new Font("宋体", Font.PLAIN, 18));
			 setgrade.setBounds(140, 61, 100, 30); 
			 frame.getContentPane().add(setgrade); 
			 setgrade.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						try {
							new teacher_mycourse(user);
						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//frame.dispose();
					}
					});
			 
//			 Button show = new Button("查看信息"); 
//			 show.setFont(new Font("宋体", Font.PLAIN, 18));
//			 show.setBounds(140, 150, 100, 30); 
//			 frame.getContentPane().add(show); 
			 
			 frame.setVisible(true);
	       
	      
   }


}
