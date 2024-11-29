import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color.*;
 
class yogilog extends JFrame implements ActionListener
{
JFrame j;
JLabel name,pass,title,j1;
JTextField tx;
JButton b;
JPasswordField p;
Color color;
	yogilog()
{
j=new JFrame();
name=new JLabel("User Name");
pass=new JLabel("Password");
title=new JLabel("Marvel Foods");
tx=new JTextField();
p=new JPasswordField();
b=new JButton("Login");
this.b.addActionListener(this);


this.name.setBounds(490,210,150,30);

this.name.setFont(new Font("Impact",Font.BOLD,20));
name.setForeground(Color.blue);
   
this.pass.setBounds(490,270,150,30);
this.pass.setFont(new Font("Impact",Font.BOLD,20));
pass.setForeground(Color.blue);

this.title.setBounds(560,40,330,70);
this.title.setFont(new Font("Impact",Font.BOLD,46));
title.setForeground(Color.blue);

this.tx.setBounds(670,210,200,30);
this.tx.setFont(new Font("Impact",Font.BOLD,20));
this.p.setBounds(670,270,200,30);
this.b.setBounds(620,350,130,25);
this.b.setFont(new Font("Impact",Font.BOLD,20));

j.setLayout(new FlowLayout());
j.getContentPane().setBackground(new Color(250,0,0));
    
name.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
pass.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
tx.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
p.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
b.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
title.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));


j.setTitle("Food Ordering System");
j.setSize(1490,900);
j.setLayout(null);
ImageIcon icon=new ImageIcon("C:\\Users\\Vijayakumar.C\\Desktop\\krishna.png");
j.setVisible(true);
j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
j.add(name);
j.add(pass);
j.add(title);
j.add(b);
j.add(tx);
j.add(p);
}
	

public void actionPerformed(ActionEvent e){
if(tx.getText().equals("yogesh")&&p.getText().equals("yogesh"))
{
j.hide();
ybutton ob=new ybutton();
}
else
{
JOptionPane.showMessageDialog(null,"invalid password");
}
}
public static void main(String a[])
{
yogilog ob=new yogilog();
}
}