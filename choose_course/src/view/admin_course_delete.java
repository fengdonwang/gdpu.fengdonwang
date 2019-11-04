package view;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controllers.courseDao;
import entities.course;

public class admin_course_delete {
	public admin_course_delete() {
	 JFrame frame = new JFrame();
	 JOptionPane.showMessageDialog(frame, ":警告⚠危险，此操作会永久删除课程！");
	   frame.setTitle("课程管理  ");
	   frame.setBounds(100,150, 400, 500); 
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	   frame.getContentPane().setLayout(null); 
	   
	   JLabel messageL = new JLabel("XXX选修系统---删除课程！"); 
	  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
	   messageL.setBounds(70, 10, 322, 15); 
	   frame.getContentPane().add(messageL); 
	 			 
		   JLabel userL = new JLabel("请输入课程号："); 
		   userL.setFont(new Font("宋体", Font.PLAIN, 16)); 
		   userL.setBounds(40, 80, 160, 30); 
		   frame.getContentPane().add(userL); 		     
		   JTextField userT = new JTextField(); 
		   userT.setBounds(120, 120, 200, 30); 
		   userT.setColumns(10); 
		   frame.getContentPane().add(userT);
		 
		 Button ok = new Button("确定 "); 
		 ok.setFont(new Font("宋体", Font.PLAIN, 18));
		 ok.setBounds(140, 160, 130, 30); 
		 frame.getContentPane().add(ok); 
		 ok.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {							
			String s1=userT.getText();

			int s=Integer.parseInt(s1);
			courseDao cd=new courseDao();
			course c=new course();
			c.setCour_no(s);
			try {
				cd.delete(c);
				JOptionPane.showMessageDialog(frame, ":删除成功！");
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			frame.dispose();
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
