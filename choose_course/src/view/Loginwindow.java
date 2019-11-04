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
  
public class Loginwindow { 
	boolean flag = false;
 private JFrame frame; 
 private JTextField userT; 
 private JTextField passwdT; 

 public static void main(String[] args) { 
   new Loginwindow(); 
   
 } 
 
 public Loginwindow() { 

 frame = new JFrame(); 
 frame.setTitle("ѡ��ϵͳ"); 
 frame.setBounds(400, 250, 450, 300); 
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 frame.getContentPane().setLayout(null); 
   
 JLabel titleL = new JLabel("��ӭ��¼XXXѡ��ϵͳ"); 
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
   
 JLabel idL = new JLabel("��¼��ݣ�"); 
 idL.setFont(new Font("����", Font.PLAIN, 14)); 
 idL.setBounds(105, 150, 97, 15); 
 frame.getContentPane().add(idL); 
   
 final Choice choice = new Choice(); 
 choice.setBounds(210, 147, 74, 21); 

 choice.add("ѧ��"); 
 choice.add("��ʦ"); 
 frame.getContentPane().add(choice); 
   
 Button loginB = new Button("��¼"); 
 loginB.setBounds(100, 194, 76, 23); 
 frame.getContentPane().add(loginB); 
 loginB.addMouseListener(new MouseAdapter() { 

  public void mouseClicked(MouseEvent e) { 
  String user=userT.getText(); 
  String passwd=passwdT.getText(); 
  String shenfen=choice.getSelectedItem(); 
  if(user.equals("")||user==null){ 
  JOptionPane.showMessageDialog(frame, shenfen+":���ã��ʺŲ���Ϊ�գ�"); 
   return; 
  }else if(passwd.equals("")||passwd==null){ 
   JOptionPane.showMessageDialog(frame, shenfen+":���ã����벻��Ϊ�գ�"); 
   return; 
  }else{  
     if(shenfen.equals("ѧ��")) {
    	 try {new studentLogin(user, passwd);
    	      student s=new student();
    	      s.setStu_user(user);
    	       
    	 } 
    	  catch (ClassNotFoundException e1) {} 
    	  catch (SQLException e1) {}
    	 
  } else{ 
	     if(shenfen.equals("��ʦ")) {
	    	 try {new teacherLogin(user, passwd);
	    	      teacher t=new teacher();
	    	      t.setTea_user(user);
	    	    
	    	 }			              				 		
	    	 catch (ClassNotFoundException e1) {}
	    	 catch (SQLException e1) {}
	     } } 
       frame.dispose(); 
  } }
 }); 

   
 Button regeist = new Button("ѧ��ע��"); 
 regeist.setBounds(219, 194, 76, 23); 
 frame.getContentPane().add(regeist);

regeist.addMouseListener(new MouseAdapter() { 
	  @Override
	  public void mouseClicked(MouseEvent e) {  
	   regeistwindow re=new regeistwindow(); 
	   JFrame frame2=re.getFrame(); 
	   frame2.setVisible(true); 
	   frame.dispose(); 
	  } 
	 });
frame.setVisible(true);
 } 
 
}

