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
			   frame.setTitle("�γ̹���  ");
			   frame.setBounds(100,150, 400, 500); 
			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			   frame.getContentPane().setLayout(null); 
			   
			   JLabel messageL = new JLabel("XXXѡ��ϵͳ-------�γ̹���"); 
			  messageL.setFont(new Font("����", Font.PLAIN, 18)); 
			   messageL.setBounds(70, 10, 322, 15); 
			   frame.getContentPane().add(messageL); 
			   
				 Button addc = new Button("���ӿγ�"); 
				 addc.setFont(new Font("����", Font.PLAIN, 18));
				 addc.setBounds(140, 60, 130, 30); 
				 frame.getContentPane().add(addc); 
				 addc.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							new admin_course_add();	
						}
						});
				 
				 Button lookc = new Button("�鿴�γ� "); 
				 lookc.setFont(new Font("����", Font.PLAIN, 18));
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
				 
				 Button updatec = new Button("�޸Ŀγ� "); 
				 updatec.setFont(new Font("����", Font.PLAIN, 18));
				 updatec.setBounds(140, 180, 130, 30); 
				 frame.getContentPane().add(updatec);
				 updatec.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							new admin_course_search();	
						}
						});
				 
				 Button deletec = new Button("ɾ���γ� "); 
				 deletec.setFont(new Font("����", Font.PLAIN, 18));
				 deletec.setBounds(140, 240, 130, 30); 
				 frame.getContentPane().add(deletec);
				 deletec.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							new admin_course_delete();	
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

