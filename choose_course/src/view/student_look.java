package view;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controllers.courseDao;
import controllers.myStudentDao;
import controllers.student_choosec;
import entities.course;
import entities.student;

public class student_look {
     public student_look(String user) throws ClassNotFoundException, SQLException {
    	 JFrame frame = new JFrame();
		   frame.setTitle("学生---查看课程  ");
		   frame.setBounds(100,150, 800, 500); 
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		   frame.getContentPane().setLayout(null); 
		   
		   JLabel messageL = new JLabel("XXX选修系统----查看课程！"); 
		  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
		   messageL.setBounds(70, 10, 322, 15); 
		   frame.getContentPane().add(messageL); 
		   
		   JLabel no = new JLabel("姓名："); 
		   no.setFont(new Font("宋体", Font.PLAIN, 14)); 
		   no.setBounds(40, 80, 67, 15); 
		   frame.getContentPane().add(no); 		     
		   JTextField not = new JTextField(); 
		   not.setBounds(100, 80, 500, 30); 
		   not.setColumns(10); 
		   frame.getContentPane().add(not);
		   
		   JLabel name = new JLabel("课程名："); 
		   name.setFont(new Font("宋体", Font.PLAIN, 14)); 
		   name.setBounds(30, 170, 80, 15); 
		   frame.getContentPane().add(name); 			     
		   JTextField namet = new JTextField(); 
		   namet.setColumns(10); 
		   namet.setBounds(100, 170, 500, 30); 
		   frame.getContentPane().add(namet);	
		   
		   JLabel tname = new JLabel("任课教师："); 
		   tname.setFont(new Font("宋体", Font.PLAIN, 14)); 
		   tname.setBounds(30, 260, 80, 15); 
		   frame.getContentPane().add(tname); 			     
		   JTextField tnamet = new JTextField(); 
		   tnamet.setColumns(10); 
		   tnamet.setBounds(100, 260, 500, 30); 
		   frame.getContentPane().add(tnamet);
		   
			 Button back = new Button("返回主目录"); 
			 back.setFont(new Font("宋体", Font.PLAIN, 18));
			 back.setBounds(140, 360, 130, 30); 
			 frame.getContentPane().add(back); 
			 back.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						new studentwindow(user);
						frame.dispose();
					}
					});
    	 
    	myStudentDao sd =new myStudentDao();
    	student s=new student();
    	s.setStu_user(user);
    	sd.select(s);
    	int num=s.getCour_no();
    	
    	courseDao cd =new courseDao();
    	course c=new course();
    	c.setCour_no(num);
    	cd.select(c);
    	c.getCour_name();
    	c.getTea_name();
    	
        not.setText(s.getStu_name());
        namet.setText(c.getCour_name());
        tnamet.setText(c.getTea_name());
    	frame.setVisible(true);
     }

	 
}
