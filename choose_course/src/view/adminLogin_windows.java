package view;



import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controllers.studentLogin;
import controllers.teacherLogin;
import entities.student;
import entities.teacher;

import java.awt.Choice; 
import java.awt.Font; 
import java.awt.Button; 
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent;

import java.sql.SQLException; 
  
public class adminLogin_windows { 
	boolean flag = false;
 private JFrame frame; 
 private JTextField userT; 
 private JTextField passwdT; 

 public static void main(String[] args) { 
   new adminLogin_windows(); 
   
 } 
 
 public adminLogin_windows() { 

 frame = new JFrame(); 
 frame.setTitle("��̨����"); 
 frame.setBounds(400, 250, 450, 300); 
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 frame.getContentPane().setLayout(null); 
   
 JLabel titleL = new JLabel("XXXѡ��ϵͳ��̨����"); 
 titleL.setFont(new Font("����", Font.PLAIN, 16)); 
 titleL.setBounds(111, 17, 287, 15); 
 frame.getContentPane().add(titleL); 
   
 JLabel userL = new JLabel("�û�����"); 
 userL.setFont(new Font("����", Font.PLAIN, 14)); 
 userL.setBounds(87, 67, 67, 15); 
 frame.getContentPane().add(userL); 
   
 userT = new JTextField(); 
 userT.setBounds(154, 64, 141, 21); 
 frame.getContentPane().add(userT); 
 userT.setColumns(10); 
   
 JLabel passwdL = new JLabel("���룺"); 
 passwdL.setFont(new Font("����", Font.PLAIN, 14)); 
 passwdL.setBounds(87, 108, 67, 15); 
 frame.getContentPane().add(passwdL); 
 
 JPasswordField passwdT = new JPasswordField();
 passwdT.setColumns(10); 
 passwdT.setBounds(154, 103, 141, 21); 
 frame.getContentPane().add(passwdT); 
     
 Button loginB = new Button("��¼"); 
 loginB.setBounds(100, 194, 76, 23); 
 frame.getContentPane().add(loginB); 
 loginB.addMouseListener(new MouseAdapter() { 

  public void mouseClicked(MouseEvent e) { 
  String user=userT.getText(); 
  String passwd=passwdT.getText(); 
  if(user.equals("")||user==null){ 
  JOptionPane.showMessageDialog(frame, ":���ã��ʺŲ���Ϊ�գ�"); 
   return; 
  }else if(passwd.equals("")||passwd==null){ 
   JOptionPane.showMessageDialog(frame, ":���ã����벻��Ϊ�գ�"); 
   return; 
  }else if(user.equals("root")||passwd.equals("root")) {
    	 new adminwindow();
  } else{ 
	  JOptionPane.showMessageDialog(frame, ":����:�˺�������󣡣�"); 
	    	 }
       frame.dispose(); 
  } 
 }); 

   
 Button regeist = new Button("�������룡"); 
 regeist.setBounds(219, 194, 76, 23); 
 frame.getContentPane().add(regeist);

regeist.addMouseListener(new MouseAdapter() { 
	  @Override
	  public void mouseClicked(MouseEvent e) {  
		  JOptionPane.showMessageDialog(frame, ":����ϵ������Ա����"); 
	  } 
	 });
frame.setVisible(true);
 } 
 
}

