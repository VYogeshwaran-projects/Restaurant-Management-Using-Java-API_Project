import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;  
public class yogiWorkersInfo extends JFrame implements ActionListener 
{
JFrame f;
JButton b,b1,b2,b3;
JLabel l,l1,l2,l3,l4,l5;
JTextField t1,t2,t3,t4,t5;
Color color;


public yogiWorkersInfo()
{
 f=new JFrame("Workers Info");
 b=new JButton("INSERT");
 b1=new JButton("UPDATE");
 b2=new JButton("DELETE");
 b3=new JButton("BACK");
 l=new JLabel("WORKERS INFO");
 l1=new JLabel("Enter Worker Name");
 l2=new JLabel("Phone No");
 l3=new JLabel("Address");
 l4=new JLabel("Working Time");
 l5=new JLabel("Salary");

 t1=new JTextField();
 t2=new JTextField();
 t3=new JTextField();
 t4=new JTextField();
 t5=new JTextField();
   
 b.setBounds(350,600,100,50);
 b1.setBounds(500,600,100,50);
 b2.setBounds(650,600,100,50);
 b3.setBounds(20,20,100,50);
 l1.setBounds(350,100,200,50);
 l2.setBounds(350,200,200,50);
 l3.setBounds(350,300,200,50);
 l4.setBounds(350,400,200,50);
 l5.setBounds(350,500,200,50);
 l.setBounds(500,10,200,50);
 t1.setBounds(650,100,200,50);
 t2.setBounds(650,200,200,50);
 t3.setBounds(650,300,200,50);
 t4.setBounds(650,400,200,50);
 t5.setBounds(650,500,200,50);

 l.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 l1.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 l2.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 l3.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 l4.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 l5.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 t1.setBorder(BorderFactory.createBevelBorder(1,Color.black,Color.white));
 t2.setBorder(BorderFactory.createBevelBorder(1,Color.black,Color.white));
 t3.setBorder(BorderFactory.createBevelBorder(1,Color.black,Color.white));
 t4.setBorder(BorderFactory.createBevelBorder(1,Color.black,Color.white));
 t5.setBorder(BorderFactory.createBevelBorder(1,Color.black,Color.white));
 b.setBorder(BorderFactory.createBevelBorder(1,Color.black,Color.white));
 b1.setBorder(BorderFactory.createBevelBorder(1,Color.black,Color.white));
 b2.setBorder(BorderFactory.createBevelBorder(1,Color.black,Color.white));
 b3.setBorder(BorderFactory.createBevelBorder(1,Color.black,Color.white));

 l.setFont(new Font("impact",Font.ITALIC,25));
 l1.setFont(new Font("impact",Font.ITALIC,20));
 l2.setFont(new Font("impact",Font.ITALIC,20));
 l3.setFont(new Font("impact",Font.ITALIC,20));
 l4.setFont(new Font("impact",Font.ITALIC,20));
 l5.setFont(new Font("impact",Font.ITALIC,20));

 l.setForeground(Color.white);
 l1.setForeground(Color.white);
 l2.setForeground(Color.white);
 l3.setForeground(Color.white);
 l4.setForeground(Color.white);
 l5.setForeground(Color.white);

 b.setBackground(Color.white);
 b1.setBackground(Color.white);
 b2.setBackground(Color.white);
 b3.setBackground(Color.white);
 t1.setBackground(Color.white);
 t2.setBackground(Color.white);
 t3.setBackground(Color.white);
 t4.setBackground(Color.white);
 t5.setBackground(Color.white);
  
 f.setLayout(new FlowLayout());
 f.getContentPane().setBackground(new Color(255,0,0));

 b.addActionListener(this);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
  
 f.setSize(1500,900);
 f.add(b);
 f.add(b1);
 f.add(b2);
 f.add(b3);
 f.add(l);
 f.add(l1);
 f.add(l2);
 f.add(l3);
 f.add(l4);
 f.add(l5);
 f.add(t1);
 f.add(t2);
 f.add(t3);
 f.add(t4);
 f.add(t5);
  
 f.setLayout(null);
 f.setVisible(true); 
}
public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==b)
 {
  try
  {  
   Class.forName("com.mysql.jdbc.Driver");  
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yogi","root","mersal097531");  
   PreparedStatement stmt=con.prepareStatement("insert into workersinfo values(?,?,?,?,?)"); 
   stmt.setString(1,t1.getText());
   stmt.setString(2,t2.getText());
   stmt.setString(3,t3.getText());
   stmt.setString(4,t4.getText());
   stmt.setInt(5,Integer.parseInt(t5.getText().trim()));
   JOptionPane.showMessageDialog(this,"Record Is Inserted Succesfully");
   stmt.executeUpdate();
   con.close();  
   t1.setText("");t2.setText("");t3.setText("");t4.setText("");t5.setText("");
   }
   catch(Exception e1)
   {
    System.out.println(e1);
   }
}  
if(e.getSource()==b1)
{
 if(b1.getActionCommand().equals("UPDATE"))
 {
  try
  {  
   Class.forName("com.mysql.jdbc.Driver");  
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yogi","root","mersal097531");  
   PreparedStatement stmt=con.prepareStatement("select wphno,wadress,wtime,salary from workersinfo  where wname=?"); 
   stmt.setString(1,t1.getText());
   ResultSet rs=stmt.executeQuery();
   while(rs.next())
   {
    t2.setText(rs.getString(1));
    t3.setText(rs.getString(2));
    t4.setText(rs.getString(3));
    t5.setText(String.valueOf(rs.getInt(4)));
   }
   con.close(); 
   b1.setLabel("SAVE");
   }
   catch(Exception e1)
   {
    System.out.println(e1);
   }
   }
   else
   {
    try
      {	
       Class.forName("com.mysql.jdbc.Driver");  
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yogi","root","mersal097531");  
       PreparedStatement stst=con.prepareStatement("update  workersinfo set wphno=?,wadress=?,wtime=?,salary=? where wname=?");
       stst.setString(1,t2.getText());
       stst.setString(2,t3.getText());
       stst.setString(3,t4.getText());
       stst.setInt(4,Integer.parseInt(t5.getText().trim()));
       stst.setString(5,t1.getText());	
       stst.executeUpdate();
       JOptionPane.showMessageDialog(this,"Record is updated Succesfully");
       b1.setLabel("UPDATE");
       con.close();
       t1.setText("");t2.setText("");t3.setText("");t4.setText("");t5.setText("");
       }
       catch(Exception e1)
       {
	System.out.println(e1);
       }
      }
     }
if(e.getSource()==b2)
{
 if(b2.getActionCommand().equals("DELETE"))
 {
  try
    {  
     Class.forName("com.mysql.jdbc.Driver");  
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yogi","root","mersal097531");  
     PreparedStatement stmt=con.prepareStatement("select wphno,wadress,wtime,salary from workersinfo where wname=?"); 
     stmt.setString(1,t1.getText());
     ResultSet rs=stmt.executeQuery();
     while(rs.next())
     {
      t2.setText(rs.getString(1));
      t3.setText(rs.getString(2));
      t4.setText(rs.getString(3));
      t5.setText(String.valueOf(rs.getInt(4)));
     }
     con.close(); 
     b2.setLabel("CONFIRM");
     }
     catch(Exception e1)
     {
      System.out.println(e1);
     }
    } 
     else
     {
      try
	{
	 System.out.println("welcome to delete path");	
	 Class.forName("com.mysql.jdbc.Driver");  
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yogi","root","mersal097531");  
         PreparedStatement stst=con.prepareStatement("DELETE from workersinfo where wname=?");
	 stst.setString(1,t1.getText());
	 stst.executeUpdate();
	 JOptionPane.showMessageDialog(this,"Record is deleted Succesfully");
	 b2.setLabel("DELETE");
	 con.close();
         t1.setText("");t2.setText("");t3.setText("");t4.setText("");t5.setText("");
         }
	 catch(Exception e1)
	 {
	  System.out.println(e1);
	 }
        }
       }
if(e.getSource()==b3)
{
 f.hide();
 yogilog o=new yogilog();
}
}
public static void main(String h[])throws Exception
{
  yogiWorkersInfo p=new yogiWorkersInfo();
}
}