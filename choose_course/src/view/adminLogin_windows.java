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
 frame.setTitle("后台管理"); 
 frame.setBounds(400, 250, 450, 300); 
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 frame.getContentPane().setLayout(null); 
   
 JLabel titleL = new JLabel("XXX选课系统后台管理"); 
 titleL.setFont(new Font("宋体", Font.PLAIN, 16)); 
 titleL.setBounds(111, 17, 287, 15); 
 frame.getContentPane().add(titleL); 
   
 JLabel userL = new JLabel("用户名："); 
 userL.setFont(new Font("宋体", Font.PLAIN, 14)); 
 userL.setBounds(87, 67, 67, 15); 
 frame.getContentPane().add(userL); 
   
 userT = new JTextField(); 
 userT.setBounds(154, 64, 141, 21); 
 frame.getContentPane().add(userT); 
 userT.setColumns(10); 
   
 JLabel passwdL = new JLabel("密码："); 
 passwdL.setFont(new Font("宋体", Font.PLAIN, 14)); 
 passwdL.setBounds(87, 108, 67, 15); 
 frame.getContentPane().add(passwdL); 
 
 JPasswordField passwdT = new JPasswordField();
 passwdT.setColumns(10); 
 passwdT.setBounds(154, 103, 141, 21); 
 frame.getContentPane().add(passwdT); 
     
 Button loginB = new Button("登录"); 
 loginB.setBounds(100, 194, 76, 23); 
 frame.getContentPane().add(loginB); 
 loginB.addMouseListener(new MouseAdapter() { 

  public void mouseClicked(MouseEvent e) { 
  String user=userT.getText(); 
  String passwd=passwdT.getText(); 
  if(user.equals("")||user==null){ 
  JOptionPane.showMessageDialog(frame, ":您好，帐号不能为空！"); 
   return; 
  }else if(passwd.equals("")||passwd==null){ 
   JOptionPane.showMessageDialog(frame, ":您好，密码不能为空！"); 
   return; 
  }else if(user.equals("root")||passwd.equals("root")) {
    	 new adminwindow();
  } else{ 
	  JOptionPane.showMessageDialog(frame, ":您好:账号密码错误！！"); 
	    	 }
       frame.dispose(); 
  } 
 }); 

   
 Button regeist = new Button("忘了密码！"); 
 regeist.setBounds(219, 194, 76, 23); 
 frame.getContentPane().add(regeist);

regeist.addMouseListener(new MouseAdapter() { 
	  @Override
	  public void mouseClicked(MouseEvent e) {  
		  JOptionPane.showMessageDialog(frame, ":请联系开发人员！！"); 
	  } 
	 });
frame.setVisible(true);
 } 
 
}

