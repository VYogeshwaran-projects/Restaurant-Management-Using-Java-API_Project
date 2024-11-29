import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;

public class yogiDailyre
{
 JFrame f;
 JLabel l,l1;
 JButton bu;
 JTable t1;
 JScrollPane sp;
 Vector v,v1; 
 
yogiDailyre()
{
 f=new JFrame("Report");
 String cname[]={"cdate","cname","cfoods","camount"};
 String data[][]=new String[100][4];
      
 try
 {  
  Class.forName("com.mysql.jdbc.Driver");  
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yogi","root","mersal097531");  
  PreparedStatement stmt=con.prepareStatement("select * from bills");
  ResultSet rs=stmt.executeQuery();
  System.out.println("Loading Process..");
  int i=0;
  while(rs.next())
  {
   data[i][0]=rs.getString(1);
   data[i][1]=rs.getString(2);
   data[i][2]=rs.getString(4);
   data[i][3]=String.valueOf(rs.getInt(5));
   i++;
  }
  System.out.println("Loading Process..");                       
  t1=new javax.swing.JTable(data,cname);
  t1.setBounds(30,40,200,300);
  sp=new JScrollPane(t1);	
  System.out.println("Loading Process");
  con.close();
  }
catch(Exception e1)
{
 System.out.println(e1);
}
 f.setSize(1400,900);
 f.add(sp);
 f.setVisible(true);
}  
public static void main(String h[])
{
 yogiDailyre ob=new yogiDailyre();
}
}  				