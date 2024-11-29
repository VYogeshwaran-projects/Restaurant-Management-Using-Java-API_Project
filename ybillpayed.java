import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;  

public class ybillpayed extends JFrame 
{
JFrame f;
yogimenu fm2;
JButton b,b1,b2,b3;
JLabel l,l1,l2,l3;
JTextField t,t1,t2,t3;

 public ybillpayed()
 {
  f=new JFrame("Bill payed");
   this.fm2=(yogimenu)f;
   b=new JButton("GPAY");
   b1=new JButton("CASH");
   b2=new JButton("CARD");
   b3=new JButton("Ok !");

   l=new JLabel("Costomer Name");
   l1=new JLabel("Phone No");
   l2=new JLabel("Total Amount");
   l3=new JLabel("BILL PAY");
  
   t1=new JTextField();
   t2=new JTextField();
   t3=new JTextField();
  
  l.setBounds(300,300,100,50);
  l1.setBounds(300,400,100,50);
  l2.setBounds(300,500,100,50);
  l3.setBounds(600,100,100,50);
  
  t1.setBounds(600,300,100,50);
  t2.setBounds(600,400,100,50);
  t3.setBounds(600,500,100,50);

  b.setBounds(300,600,100,50);
  b1.setBounds(400,600,100,50);
  b2.setBounds(500,600,100,50);
  b3.setBounds(600,600,100,50);

  f.add(l);
  f.add(l1);
  f.add(l2);
  f.add(l3);
  f.add(t1);
  f.add(t2);
  f.add(t3);
  f.add(b);
  f.add(b1);
  f.add(b2);
  f.add(b3);
 
  f.setSize(1400,900);
  f.setLayout(null);
  f.setVisible(true);
  }

  public static void main(String a[])throws Exception
  {
   ybillpayed ob=new ybillpayed();
  }
}

 


  