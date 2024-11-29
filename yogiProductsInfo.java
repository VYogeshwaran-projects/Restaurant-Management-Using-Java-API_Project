import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;  
public class yogiProductsInfo extends JFrame implements ActionListener 
{
JFrame f;
JButton b,b1,b2,b3;
JLabel l,l1,l2,l3,l4;
JTextField t,t1,t2,t3;
String cb[];
Color color;

public yogiProductsInfo()
{
 f=new JFrame("Productsinfo");
 b=new JButton("INSERT");
 b1=new JButton("UPDATE");
 b2=new JButton("DELETE");
 b3=new JButton("BACK");
 l=new JLabel("Enter the items");
 l1=new JLabel("Price");
 l2=new JLabel("Quantity");
 l3=new JLabel("Date");
 l4=new JLabel("PRODUCTS PURCHASE INFO");

 t=new JTextField();
 t1=new JTextField();
 t2=new JTextField();
 t3=new JTextField();

 b.setBounds(350,600,100,50);
 b1.setBounds(500,600,100,50);
 b2.setBounds(650,600,100,50);
 b3.setBounds(800,600,100,50);

 l.setBounds(350,200,200,50);
 l1.setBounds(350,300,200,50);
 l2.setBounds(350,400,200,50);	
 l3.setBounds(350,500,200,50);
 l4.setBounds(450,70,350,50);
   
 t3.setBounds(650,200,200,50);
 t.setBounds(650,300,200,50);
 t1.setBounds(650,400,200,50);
 t2.setBounds(650,500,200,50);

 l.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 l1.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 l2.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 l3.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 l4.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
   
 t3.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 t.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 t1.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 t2.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));

  b.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
  b1.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
  b2.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
  b3.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
  l.setFont(new Font("impact",Font.ITALIC,30));
  l1.setFont(new Font("impact",Font.ITALIC,30));
  l2.setFont(new Font("impact",Font.ITALIC,28));
  l3.setFont(new Font("impact",Font.ITALIC,28));
  l4.setFont(new Font("impact",Font.ITALIC,28));

  l.setForeground(Color.white);
  l1.setForeground(Color.white);
  l2.setForeground(Color.white);
  l3.setForeground(Color.white);
  l4.setForeground(Color.white);

  b.setBackground(Color.white);
  b1.setBackground(Color.white);
  b2.setBackground(Color.white);
  b3.setBackground(Color.white);

  t.setBackground(new Color(185,202,233));
  t1.setBackground(new Color(185,202,233));
  t2.setBackground(new Color(185,202,233));
  t3.setBackground(new Color(185,202,233));

  f.setLayout(new FlowLayout());
  f.getContentPane().setBackground(new Color(255,0,0));

  b.addActionListener(this);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
   
  f.setSize(1400,900);
  f.add(b);
  f.add(b1);
  f.add(b2);
  f.add(b3);
  f.add(l);
  f.add(l1);
  f.add(l2);
  f.add(l3);
  f.add(l4);
  f.add(t);
  f.add(t1);
  f.add(t2);
  f.add(t3);
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
   PreparedStatement stmt=con.prepareStatement("insert into fooditems values(?,?,?,?)"); 
   stmt.setString(1,t3.getText());
   stmt.setInt(2,Integer.parseInt(t.getText().trim()));
   stmt.setString(3,t1.getText());
   stmt.setString(4,t2.getText());
   JOptionPane.showMessageDialog(this,"Record Is Inserted Succesfully");
   stmt.executeUpdate();
   con.close();  
   t.setText("");t1.setText("");t2.setText("");t3.setText("");
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
   PreparedStatement stmt=con.prepareStatement("select fprice,fquantity,fdate from fooditems where fitems=?"); 
   stmt.setString(1,t3.getText());
   ResultSet rs=stmt.executeQuery();
   while(rs.next())
   {
    t.setText(String.valueOf(rs.getInt(1)));
    t1.setText(rs.getString(2));
    t2.setText(rs.getString(3));
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
    PreparedStatement stst=con.prepareStatement("update  fooditems set fprice=?,fquantity=?,fdate=? where fitems=?");
    stst.setInt(1,Integer.parseInt(t.getText().trim()));
    stst.setString(2,t1.getText());
    stst.setString(3,t2.getText());
    stst.setString(4,t3.getText());	
    stst.executeUpdate();
    JOptionPane.showMessageDialog(this,"Record is updated Succesfully");
    b1.setLabel("UPDATE");
    con.close();
    t.setText("");t1.setText("");t2.setText("");t3.setText("");
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
   PreparedStatement stmt=con.prepareStatement("select fprice,fquantity,fdate from fooditems where fitems=?"); 
   stmt.setString(1,t3.getText());
   ResultSet rs=stmt.executeQuery();
   while(rs.next())
   {
    t.setText(String.valueOf(rs.getInt(1)));
    t1.setText(rs.getString(2));
    t2.setText(rs.getString(3));
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
      PreparedStatement stst=con.prepareStatement("DELETE from fooditems where fitems=?");
      stst.setString(1,t3.getText());
      stst.executeUpdate();
      JOptionPane.showMessageDialog(this,"Record is deleted Succesfully");
      b2.setLabel("DELETE");
      con.close();
      t1.setText("");t2.setText("");t3.setText("");
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
    ybutton o=new ybutton();
 }
 }
public static void main(String h[])throws Exception
{
 yogiProductsInfo p=new yogiProductsInfo();
}
}