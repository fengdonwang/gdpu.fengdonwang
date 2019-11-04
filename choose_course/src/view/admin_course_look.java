package view;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class admin_course_look {
	 public admin_course_look() throws ClassNotFoundException, SQLException {
		    Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://182.61.5.233/choose_course?user=root&password=6369&characterEncoding=utf-8");
			PreparedStatement p1 = conn.prepareStatement("select * from course");
		    ResultSet rs=p1.executeQuery();
		    ArrayList<String> a=new ArrayList<String>();
		    ArrayList<String> b=new ArrayList<String>();
		    ArrayList<String> c=new ArrayList<String>();
		    ArrayList<String> d=new ArrayList<String>();
		    
		    while(rs.next()){		    	
		    	a.add(rs.getString(1));	    
		    	b.add(rs.getString(2));
		    	c.add(rs.getString(3));		    		
		    	d.add(rs.getString(4));	    
		    	 	
		    }  
		    
PreparedStatement p = conn.prepareStatement("select count(stu_user) from course group by cour_no ");
			    ResultSet re=p.executeQuery();
			    int count=0;String s="";
			    while(re.next()) {
			    	count=re.getInt(1);
			    	System.out.println(count);
			    	s=count+"        "+s;
				}
			    
			    System.out.println(count);
			   JFrame frame = new JFrame();
			   frame.setTitle("课程管理----查看课程信息  ");
			   frame.setBounds(100,150, 800, 500); 
			   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			   frame.getContentPane().setLayout(null); 
			   
			   JLabel messageL = new JLabel("XXX选修系统------查看课程信息！"); 
			  messageL.setFont(new Font("宋体", Font.PLAIN, 18)); 
			   messageL.setBounds(70, 10, 322, 15); 
			   frame.getContentPane().add(messageL); 
			   
			   JLabel no = new JLabel("课程号："); 
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
			   
			   JLabel all = new JLabel("课程人数："); 
			   all.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   all.setBounds(30, 110, 80, 15); 
			   frame.getContentPane().add(all); 			     
			   JTextField allt = new JTextField(); 
			   allt.setColumns(10); 
			   allt.setBounds(100, 110, 500, 30); 
			   frame.getContentPane().add(allt);
			   
			   JLabel tname = new JLabel("任课教师："); 
			   tname.setFont(new Font("宋体", Font.PLAIN, 14)); 
			   tname.setBounds(30, 140, 80, 15); 
			   frame.getContentPane().add(tname); 			     
			   JTextField tnamet = new JTextField(); 
			   tnamet.setColumns(10); 
			   tnamet.setBounds(100, 140, 500, 30); 
			   frame.getContentPane().add(tnamet); 
			   		 
 
			  
		
               String a1 = " ";  String a2=" "; String a3=" ";
               String a4=" ";  
			   for(int i = 0;i<a.size();i++) {
				   a1=(String) a.get(i)+"          "+a1;	
				   a2=(String) b.get(i)+"          "+a2;
				   a3=(String) c.get(i)+"          "+a3;   
				   a4=(String) d.get(i)+"          "+a4;
				  
			   }
		      not.setText(a1);
              namet.setText(a2);
              allt.setText(s+"");
              tnamet.setText(a4);
             
			   
				 Button back = new Button("返回主目录"); 
				 back.setFont(new Font("宋体", Font.PLAIN, 18));
				 back.setBounds(140, 360, 130, 30); 
				 frame.getContentPane().add(back); 
				 back.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							// TODO Auto-generated method stub
							new adminwindow();	
							frame.dispose();
						}
						});

				 frame.setVisible(true);
			
		      
	   }

	
}

