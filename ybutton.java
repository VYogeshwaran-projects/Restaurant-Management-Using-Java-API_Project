import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;


public class ybutton extends JFrame implements ActionListener
{
 JFrame f;
 JButton  b[] ;
 JButton j1,j2;
 JLabel l;
 JPanel p;
 Color color;
       
public ybutton() 
{
 f=new JFrame("Marvel foods");
 l=new JLabel("Contact For Support : 8939346299" );
 p=new JPanel();
 b=new JButton[10]; 
 j1=new JButton("Products"); 
 j2=new JButton("Report"); 

for(int i=0;i<b.length;i++)
{
 b[i]=new JButton(" Table " +(i+1) );
}
 b[0].setBounds(200,150,100,100);
 b[1].setBounds(350,150,100,100);
 b[2].setBounds(500,150,100,100);
 b[3].setBounds(650,150,100,100);
 b[4].setBounds(800,150,100,100);
 b[5].setBounds(200,450,100,100);
 b[6].setBounds(350,450,100,100);
 b[7].setBounds(500,450,100,100);
 b[8].setBounds(650,450,100,100);
 b[9].setBounds(800,450,100,100);

 f.setLayout(new FlowLayout());
 f.getContentPane().setBackground(new Color(255,0,0));
 l.setFont(new Font("impact",Font.BOLD,15));
 l.setForeground(Color.white);
 p.setBackground(Color.black);
 p.setBounds(750,20,300,30);
 p.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.blue));
for(int i=0;i<b.length;i++)
{
 b[i].setBorder(BorderFactory.createLineBorder(Color.blue));
 b[i].setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.blue));
 b[i].setForeground(Color.white);
 b[i].setFont(new Font("impact",Font.ITALIC,15));
 b[i].setBackground(Color.black);
 b[i].addActionListener(this);
}
 
 j1.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.blue));
 j1.setForeground(Color.white);
 j1.setFont(new Font("impact",Font.ITALIC,15));
 j1.setBackground(Color.black);
 j1.addActionListener(this);
 j2.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.blue));
 j2.setForeground(Color.white);
 j2.setFont(new Font("impact",Font.ITALIC,15));
 j2.setBackground(Color.black);
 j2.addActionListener(this);
 j1.setBounds(1100,20,100,30);
 j2.setBounds(1250,20,100,30);
 f.setSize(1400,900);
  
 for(int i=0;i<b.length;i++)
 {
  f.add(b[i]);
 }
  p.add(l);
  f.add(p);
  f.add(j1);
  f.add(j2);
  f.setLayout(null);
  f.setVisible(true);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
	
if(e.getSource()==b[0])
 {
 f.hide();
 yogimenu ob=new yogimenu();
 }
 if(e.getSource()==b[1])
 {
  f.hide();
  yogimenu ob=new yogimenu();
 }
 if(e.getSource()==b[2])
 {
  f.hide();
  yogimenu ob=new yogimenu();
 }
 if(e.getSource()==b[3])
 {
  f.hide();
  yogimenu ob=new yogimenu();       
 }
 if(e.getSource()==b[4])
 {
  f.hide();
  yogimenu ob=new yogimenu();   
 }
 if(e.getSource()==b[5])
 {
  f.hide();
  yogimenu ob=new yogimenu();       
 }
 if(e.getSource()==b[6])
 {
  f.hide();
  yogimenu ob=new yogimenu();
 }
 if(e.getSource()==b[7])
 {
  f.hide();
  yogimenu ob=new yogimenu();
 }
 if(e.getSource()==b[8])
 {
  f.hide();
  yogimenu ob=new yogimenu();
 }
 if(e.getSource()==b[9])
 {
  f.hide();
  yogimenu ob=new yogimenu();  
 }
 if(e.getSource()==j1)
 {
  f.hide();
  yogiProductsInfo p=new yogiProductsInfo();
 }
 if(e.getSource()==j2)
 {
  f.hide();
  yogiDailyre p1=new yogiDailyre();
 }
}
public static void main(String h[])throws Exception
{
 ybutton ob=new ybutton();
}
}

