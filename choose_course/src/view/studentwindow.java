package view;


import java.awt.Button;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class studentwindow {
   public studentwindow(String user) {
		  JFrame frame = new JFrame();
		   frame.setTitle("XXXѡ��ϵͳ");
		   frame.setBounds(100,150, 400, 300); 
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		   frame.getContentPane().setLayout(null); 
		   
		   JLabel messageL = new JLabel("��ӭѧ����¼XXXѡ��ϵͳ��"); 
		  messageL.setFont(new Font("����", Font.PLAIN, 18)); 
		   messageL.setBounds(70, 10, 322, 15); 
		   frame.getContentPane().add(messageL); 
		   
			 Button  choosecour= new Button("ѡ��"); 
			 choosecour.setFont(new Font("����", Font.PLAIN, 18));
			 choosecour.setBounds(140, 60, 100, 30); 
			 frame.getContentPane().add(choosecour); 

			 choosecour.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						try {
							new student_choose(user);
						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}	
					}
					});
			 
			 Button show = new Button("�鿴�γ�"); 
			 show.setFont(new Font("����", Font.PLAIN, 18));
			 show.setBounds(140, 120, 100, 30); 
			 frame.getContentPane().add(show); 
			 show.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						try {
							new student_look(user);
						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}	
					}
					});
			 
			 Button set = new Button("�޸ĸ�����Ϣ"); 
			 set.setFont(new Font("����", Font.PLAIN, 18));
			 set.setBounds(135, 180, 130, 30); 
			 frame.getContentPane().add(set); 
			 set.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						new student_set(user);	
					}
					});
			 
			 frame.setVisible(true);
			
	      
   }
}

