package view;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class admin_student {
	 public admin_student() {

			  JFrame frame = new JFrame();
			   frame.setTitle("��ʦ����  ");
			   frame.setBounds(100,150, 400, 500); 
			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			   frame.getContentPane().setLayout(null); 
			   
			   JLabel messageL = new JLabel("XXXѡ��ϵͳ-------ѧ������"); 
			  messageL.setFont(new Font("����", Font.PLAIN, 18)); 
			   messageL.setBounds(70, 10, 322, 15); 
			   frame.getContentPane().add(messageL); 
			   
				 Button looks = new Button("�鿴ѧ����Ϣ"); 
				 looks.setFont(new Font("����", Font.PLAIN, 18));
				 looks.setBounds(140, 60, 130, 30); 
				 frame.getContentPane().add(looks); 
				 looks.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							try {
								new admin_studentlook();
							} catch (ClassNotFoundException | SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}	
						}
						});
				 
				 Button updates = new Button("�޸�ѧ����Ϣ "); 
				 updates.setFont(new Font("����", Font.PLAIN, 18));
				 updates.setBounds(140, 120, 130, 30); 
				 frame.getContentPane().add(updates); 
				 updates.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							new admin_student_serch();	
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
