package view;

import java.awt.Button;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class regeistwindow {
 
    public regeistwindow() {
    	super();
    }
	public  JFrame getFrame() {
		 JFrame frame = new JFrame(); 
		 frame.setTitle("ע��ѡ��ϵͳ"); 
		 frame.setBounds(400, 250, 450, 300); 
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		 frame.getContentPane().setLayout(null); 
		   
		 JLabel titleL = new JLabel("��ӭע��XXXѡ��ϵͳ"); 
		 titleL.setFont(new Font("����", Font.PLAIN, 16)); 
		 titleL.setBounds(111, 17, 287, 15); 
		 frame.getContentPane().add(titleL); 
		   
		 JLabel userL = new JLabel("�û�����"); 
		 userL.setFont(new Font("����", Font.PLAIN, 14)); 
		 userL.setBounds(87, 67, 67, 15); 
		 frame.getContentPane().add(userL); 
		   
		 JTextField userT = new JTextField(); 
		 userT.setBounds(154, 64, 141, 21); 
		 frame.getContentPane().add(userT); 
		 userT.setColumns(10); 
		   
		 JLabel passwdL = new JLabel("���룺"); 
		 passwdL.setFont(new Font("����", Font.PLAIN, 14)); 
		 passwdL.setBounds(87, 108, 67, 15); 
		 frame.getContentPane().add(passwdL); 
		   
		 JTextField passwdT = new JTextField(); 
		 passwdT.setColumns(10); 
		 passwdT.setBounds(154, 103, 141, 21); 
		 frame.getContentPane().add(passwdT); 
		   
		 Button regeist = new Button("ע��"); 
		 regeist.setBounds(120, 194, 76, 23); 
		 frame.getContentPane().add(regeist); 
		 regeist.addMouseListener(new MouseAdapter() { 
			  @Override
			  public void mouseClicked(MouseEvent e) { 
				  
				  String s1=userT.getText();
				  String s2=passwdT.getText();
				  
			      new controllers.regeist(s1,s2); 
			    //  JOptionPane.showMessageDialog(frame, ":���ã�ע��ɹ���"); 
			  } 
			 });
		 Button back = new Button("����"); 
		 back.setBounds(250, 194, 76, 23); 
		 frame.getContentPane().add(back); 
		 back.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					 new Loginwindow(); 
				}
				});
		 return frame;
	}

}