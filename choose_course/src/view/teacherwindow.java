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
		   frame.setTitle("XXXѡ��ϵͳ");
		   frame.setBounds(100,150, 400, 300); 
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		   frame.getContentPane().setLayout(null); 
		   
		   JLabel messageL = new JLabel("��ӭ��ʦ��¼XXXѡ��ϵͳ��"); 
		  messageL.setFont(new Font("����", Font.PLAIN, 18)); 
		   messageL.setBounds(70, 10, 322, 15); 
		   frame.getContentPane().add(messageL); 
		   
			 Button setgrade = new Button("¼��ɼ�"); 
			 setgrade.setFont(new Font("����", Font.PLAIN, 18));
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
			 
//			 Button show = new Button("�鿴��Ϣ"); 
//			 show.setFont(new Font("����", Font.PLAIN, 18));
//			 show.setBounds(140, 150, 100, 30); 
//			 frame.getContentPane().add(show); 
			 
			 frame.setVisible(true);
	       
	      
   }


}
