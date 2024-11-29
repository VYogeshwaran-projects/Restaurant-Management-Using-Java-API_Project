import java.awt.*; import javax.swing.*; import java.awt.event.*; import java.util.*; import java.sql.*;
public class ybillprint extends JDialog implements ActionListener
{
Graphics g;
JButton Food,refresh,bu; int x=200,y=200,amt; yogimenu fm1;
Font fo; Color c;
Connection con; PreparedStatement stmt; String fod,mop; JRadioButton r,r1,r2; ButtonGroup gb;
String gb1;

ybillprint(JFrame fm)
{
super(fm,"BillPrint"); this.fm1=(yogimenu)fm; r=new JRadioButton("Gpay"); r1=new JRadioButton("Cash"); r2=new JRadioButton("Card"); bu=new JButton("PAID"); gb=new ButtonGroup();

bu.addActionListener(this); setSize(1500,1000); setLayout(null);
fo=new Font("Serif",Font.BOLD,20); refresh=new JButton("Refresh"); Food=new JButton("FoodMenu"); Food.setBounds(400,700,100,50); r.setBounds(100,700,100,50); r1.setBounds(600,700,100,50); r2.setBounds(800,700,100,50); bu.setBounds(1000,700,100,50); refresh.addActionListener(this); Food.addActionListener(this); r.addActionListener(this); r1.addActionListener(this); r2.addActionListener(this);
gb.add(r);
gb.add(r1);
gb.add(r2); add(Food); add(refresh); add(r);
refresh=new JButton("Refresh"); Food=new JButton("FoodMenu"); Food.setBounds(400,700,100,50); r.setBounds(100,700,100,50); r1.setBounds(600,700,100,50); r2.setBounds(800,700,100,50); bu.setBounds(1000,700,100,50); refresh.addActionListener(this); Food.addActionListener(this); r.addActionListener(this); r1.addActionListener(this); r2.addActionListener(this);
gb.add(r);
gb.add(r1);
gb.add(r2); add(Food); add(refresh); add(r);
 
add(r1);
add(r2);
add(bu); setVisible(true); g=this.getGraphics();
c=new Color(255,255,255); setLayout(new FlowLayout());
getContentPane().setBackground(new Color(169,203,123));
}
public void actionPerformed(ActionEvent e)
{
x=300;y=390;gb1="";
if(e.getSource()==r)
{
try
{
stmt.setString(6,r.getLabel()); System.out.println("Process succeed");
}
catch(Exception ee)
{System.out.println(ee);}
}
if(e.getSource()==r1)
{
try
{
stmt.setString(6,r1.getLabel());
}
catch(Exception ee)
{System.out.println(ee);}
}
if(e.getSource()==r2)
{
try
{
stmt.setString(6,r2.getLabel());
}
catch(Exception ee)
{
System.out.println(ee);
}
}
if(e.getSource()==r1)
{
try
{
stmt.setString(6,r1.getLabel());
}
catch(Exception e1)
{
System.out.println(e1);
}
}
if(e.getSource()==r2)
{
try
{
stmt.setString(6,r2.getLabel());
}
catch(Exception e2)
{
System.out.println(e2);
}
}
if(e.getSource()==bu)
{
try
{
stmt.executeUpdate(); System.out.println("Process succeed"); con.close();
JOptionPane.showMessageDialog(this,"Bill Paid & Thank u..! Visit Again"); this.hide();
ybutton ob=new ybutton();
}
 
catch(Exception e3)
{
System.out.println(e3);
}
}
if(e.getSource()==Food)
{
hide();
fm1.show(); fm1.t.setText("");
fm1.t1.setText("");
fm1.t2.setText("");
fm1.t3.setText("");
fm1.t4.setText("");
fm1.t5.setText("");
fm1.t6.setText("");
fm1.t7.setText("");
fm1.t8.setText("");
fm1.t9.setText("");
fm1.t10.setText("");
fm1.t11.setText("");
fm1.t12.setText("");
fm1.t13.setText("");
fm1.t14.setText("");
fm1.t15.setText("");
fm1.t16.setText("");
fm1.t17.setText("");
fm1.t18.setText("");
fm1.t19.setText("");
fm1.t20.setText("");
fm1.t21.setText("");
fm1.t22.setText("");
fm1.t23.setText("");
fm1.t24.setText("");
fm1.t25.setText("");
fm1.t26.setText("");
fm1.t27.setText("");
fm1.t28.setText("");

fm1.b.setSelected(false); fm1.b1.setSelected(false); fm1.b2.setSelected(false); fm1.b3.setSelected(false); fm1.b4.setSelected(false); fm1.b5.setSelected(false); fm1.b6.setSelected(false); fm1.b7.setSelected(false); fm1.b8.setSelected(false); fm1.p.setSelected(false); fm1.p1.setSelected(false); fm1.p2.setSelected(false); fm1.p3.setSelected(false); fm1.p4.setSelected(false); fm1.p5.setSelected(false); fm1.p6.setSelected(false); fm1.p7.setSelected(false); fm1.p8.setSelected(false);
 
fm1.f.setSelected(false); fm1.f1.setSelected(false); fm1.f2.setSelected(false); fm1.f3.setSelected(false); fm1.f4.setSelected(false); fm1.f5.setSelected(false); fm1.f6.setSelected(false); fm1.f7.setSelected(false); fm1.f8.setSelected(false);
}
if(e.getSource()==refresh)
{
int amt=0; setLayout(null); g.setFont(fo); g.setColor(c);

g.drawString("Marvel Outfits",600,110); g.drawString("CUSTOMER NAME :",210,200);
g.drawString(fm1.t.getText(),400,200); g.drawString("DATE :",210,240); g.drawString(fm1.t30.getText(),400,240); g.drawString("BILL :",210,260); g.drawString(fm1.t31.getText(),400,260); g.drawString("PHONE NO :",210,220); g.drawString(fm1.t1.getText(),400,220); g.drawString("ORDER FOOD",300,330);
g.drawString("TIME",600,330); g.drawString("QUANTITY",800,330); g.drawString("AMOUNT",1000,330); fod="";
try
{
Class.forName("com.mysql.jdbc.Driver"); con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yogi","root","mersal097531"); stmt=con.prepareStatement("insert into bills values(?,?,?,?,?,?)"); stmt.setString(2,fm1.t.getText());
stmt.setString(3,fm1.t1.getText()); stmt.setString(1,fm1.t30.getText());
if(fm1.b.isSelected())
{
fod=fod+fm1.b.getLabel(); g.drawString(fm1.b.getLabel(),x,y); g.drawString("7 Mins",x+300,y); g.drawString(fm1.t2.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t2.getText())*175)),x+700,y); amt=amt+Integer.parseInt(fm1.t2.getText())*175;
y=y+50;
}
if(fm1.b1.isSelected())
{
g.drawString(fm1.b1.getLabel(),x,y); g.drawString("7 Mins",x+300,y); g.drawString(fm1.t3.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t3.getText())*169)),x+700,y);
 
amt=amt+Integer.parseInt(fm1.t3.getText())*169; y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.b1.getLabel();
}
else
{
fod=fod+"-"+fm1.b1.getLabel();
}
}
if(fm1.b2.isSelected())
{
g.drawString(fm1.b2.getLabel(),x,y); g.drawString("3 Mins",x+300,y); g.drawString(fm1.t4.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t4.getText())*115)),x+700,y); amt=amt+Integer.parseInt(fm1.t4.getText())*115;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.b2.getLabel();
}
else
{
fod=fod+"-"+fm1.b2.getLabel();
}
}
if(fm1.b3.isSelected())
{
g.drawString(fm1.b3.getLabel(),x,y); g.drawString("8 Mins",x+300,y); g.drawString(fm1.t5.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t5.getText())*199)),x+700,y); amt=amt+Integer.parseInt(fm1.t5.getText())*199;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.b3.getLabel();
}
else
{
fod=fod+"-"+fm1.b3.getLabel();
}
}
if(fm1.b4.isSelected())
{
g.drawString(fm1.b4.getLabel(),x,y); g.drawString("7 Mins",x+300,y); g.drawString(fm1.t6.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t6.getText())*160)),x+700,y); amt=amt+Integer.parseInt(fm1.t6.getText())*160;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.b4.getLabel();
}
else
{
fod=fod+"-"+fm1.b4.getLabel();
}
}
if(fm1.b5.isSelected())
{
g.drawString(fm1.b5.getLabel(),x,y); g.drawString("3 Mins",x+300,y); g.drawString(fm1.t7.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t7.getText())*175)),x+700,y); amt=amt+Integer.parseInt(fm1.t7.getText())*104;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.b5.getLabel();
}
else
{
fod=fod+"-"+fm1.b5.getLabel();
}
}
if(fm1.b6.isSelected())
{
g.drawString(fm1.b6.getLabel(),x,y); g.drawString("3 Mins",x+300,y); g.drawString(fm1.t8.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t8.getText())*69)),x+700,y); amt=amt+Integer.parseInt(fm1.t8.getText())*69;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.b6.getLabel();
}
else
{
fod=fod+"-"+fm1.b5.getLabel();
}
}
if(fm1.b6.isSelected())
{
g.drawString(fm1.b6.getLabel(),x,y); g.drawString("3 Mins",x+300,y); g.drawString(fm1.t8.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t8.getText())*69)),x+700,y); amt=amt+Integer.parseInt(fm1.t8.getText())*69;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.b6.getLabel();
}
else
{
fod=fod+"-"+fm1.b6.getLabel();
}
}
if(fm1.b7.isSelected())
{
g.drawString(fm1.b7.getLabel(),x,y); g.drawString("4 Mins",x+300,y); g.drawString(fm1.t9.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t9.getText())*95)),x+700,y); amt=amt+Integer.parseInt(fm1.t9.getText())*95;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.b7.getLabel();
}
 
else
{
fod=fod+"-"+fm1.b7.getLabel();
}
}
if(fm1.b8.isSelected())
{
g.drawString(fm1.b8.getLabel(),x,y); g.drawString("4 Mins",x+300,y); g.drawString(fm1.t10.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t10.getText())*95)),x+700,y); amt=amt+Integer.parseInt(fm1.t10.getText())*95;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.b8.getLabel();
}
else
{
fod=fod+"-"+fm1.b5.getLabel();
}
}
if(fm1.b6.isSelected())
{
g.drawString(fm1.b6.getLabel(),x,y); g.drawString("3 Mins",x+300,y); g.drawString(fm1.t8.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t8.getText())*69)),x+700,y); amt=amt+Integer.parseInt(fm1.t8.getText())*69;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.b6.getLabel();
}
else
{
fod=fod+"-"+fm1.b6.getLabel();
}
}
if(fm1.b7.isSelected())
{
g.drawString(fm1.b7.getLabel(),x,y); g.drawString("4 Mins",x+300,y); g.drawString(fm1.t9.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t9.getText())*95)),x+700,y); amt=amt+Integer.parseInt(fm1.t9.getText())*95;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.b7.getLabel();
}
 
else
{
fod=fod+"-"+fm1.b7.getLabel();
}
}
if(fm1.b8.isSelected())
{
g.drawString(fm1.b8.getLabel(),x,y); g.drawString("4 Mins",x+300,y); g.drawString(fm1.t10.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t10.getText())*95)),x+700,y); amt=amt+Integer.parseInt(fm1.t10.getText())*95;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.b8.getLabel();
}
else
{
fod=fod+"-"+fm1.b8.getLabel();
}
}
if(fm1.p.isSelected())
{
g.drawString(fm1.p.getLabel(),x,y); g.drawString("15 Mins",x+300,y); g.drawString(fm1.t11.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t11.getText())*195)),x+700,y); amt=amt+Integer.parseInt(fm1.t11.getText())*195;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.p.getLabel();
}
else
{
fod=fod+"-"+fm1.p.getLabel();
}
}
if(fm1.p1.isSelected())
{
g.drawString(fm1.p1.getLabel(),x,y); g.drawString("15 Mins",x+300,y); g.drawString(fm1.t12.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t12.getText())*175)),x+700,y); amt=amt+Integer.parseInt(fm1.t12.getText())*265;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.p1.getLabel();
}
else
{
fod=fod+"-"+fm1.p1.getLabel();
}
}
 
if(fm1.p2.isSelected())
{
g.drawString(fm1.p2.getLabel(),x,y); g.drawString("15 Mins",x+300,y); g.drawString(fm1.t13.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t13.getText())*315)),x+700,y); amt=amt+Integer.parseInt(fm1.t13.getText())*315;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.p2.getLabel();
}
else
{
fod=fod+"-"+fm1.p2.getLabel();
}
}
if(fm1.p3.isSelected())
{
g.drawString(fm1.p3.getLabel(),x,y); g.drawString("15 Mins",x+300,y); g.drawString(fm1.t14.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t14.getText())*150)),x+700,y); amt=amt+Integer.parseInt(fm1.t14.getText())*150;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.p3.getLabel();
}
else
{
fod=fod+"-"+fm1.p3.getLabel();
}
}
if(fm1.p4.isSelected())
{
g.drawString(fm1.p4.getLabel(),x,y); g.drawString("15 Mins",x+300,y); g.drawString(fm1.t15.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t15.getText())*210)),x+700,y); amt=amt+Integer.parseInt(fm1.t15.getText())*210;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.p4.getLabel();
}
else
{
fod=fod+"-"+fm1.p4.getLabel();
}
}
if(fm1.p5.isSelected())
{
g.drawString(fm1.b.getLabel(),x,y); g.drawString("15 Mins",x+300,y); g.drawString(fm1.t16.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t16.getText())*175)),x+700,y); amt=amt+Integer.parseInt(fm1.t16.getText())*189;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.p5.getLabel();
}
else
{
fod=fod+"-"+fm1.p5.getLabel();
}
}
if(fm1.p6.isSelected())
{
g.drawString(fm1.p6.getLabel(),x,y); g.drawString("15 Mins",x+300,y); g.drawString(fm1.t17.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t17.getText())*135)),x+700,y); amt=amt+Integer.parseInt(fm1.t17.getText())*135;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.p6.getLabel();
}
else
{
fod=fod+"-"+fm1.p6.getLabel();
}
}
if(fm1.p7.isSelected())
{
g.drawString(fm1.p7.getLabel(),x,y); g.drawString("15 Mins",x+300,y); g.drawString(fm1.t18.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t18.getText())*165)),x+700,y); 
amt=amt+Integer.parseInt(fm1.t18.getText())*165;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.p7.getLabel();
}
else
{
fod=fod+"-"+fm1.p7.getLabel();
}
}
if(fm1.p8.isSelected())
{
g.drawString(fm1.p8.getLabel(),x,y); g.drawString("15 Mins",x+300,y); g.drawString(fm1.t19.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t19.getText())*175)),x+700,y); amt=amt+Integer.parseInt(fm1.t19.getText())*175;
y=y+50;
if(fod.equals(""))
 
{
fod=fod+fm1.p8.getLabel();
}
else
{
fod=fod+"-"+fm1.p8.getLabel();
}
}
if(fm1.f.isSelected())
{
g.drawString(fm1.f.getLabel(),x,y); g.drawString("5 Mins",x+300,y); g.drawString(fm1.t20.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t20.getText())*115)),x+700,y); amt=amt+Integer.parseInt(fm1.t20.getText())*115;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.f.getLabel();
}
else
{
fod=fod+"-"+fm1.f.getLabel();
}
}
if(fm1.f1.isSelected())
{
g.drawString(fm1.f1.getLabel(),x,y); g.drawString("15 Mins",x+300,y); g.drawString(fm1.t21.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t21.getText())*145)),x+700,y); amt=amt+Integer.parseInt(fm1.t21.getText())*145;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.f1.getLabel();
}
else
{
fod=fod+"-"+fm1.f1.getLabel();
}
}
if(fm1.f2.isSelected())
{
g.drawString(fm1.f2.getLabel(),x,y); g.drawString("7 Mins",x+300,y); g.drawString(fm1.t22.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t22.getText())*145)),x+700,y); amt=amt+Integer.parseInt(fm1.t22.getText())*145;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.f2.getLabel();
}
else
{
 
fod=fod+"-"+fm1.f2.getLabel();
}
}
if(fm1.f3.isSelected())
{
g.drawString(fm1.f3.getLabel(),x,y); g.drawString("7 Mins",x+300,y); g.drawString(fm1.t23.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t23.getText())*150)),x+700,y); amt=amt+Integer.parseInt(fm1.t23.getText())*150;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.f3.getLabel();
}
else
{
fod=fod+"-"+fm1.f3.getLabel();
}
}
if(fm1.f4.isSelected())
{
g.drawString(fm1.f4.getLabel(),x,y); g.drawString("5 Mins",x+300,y); g.drawString(fm1.t24.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t24.getText())*120)),x+700,y); amt=amt+Integer.parseInt(fm1.t24.getText())*120;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.f4.getLabel();
}
else
{
fod=fod+"-"+fm1.f4.getLabel();
}
}
if(fm1.f5.isSelected())
{
g.drawString(fm1.f5.getLabel(),x,y); g.drawString("5 Mins",x+300,y); g.drawString(fm1.t25.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t25.getText())*56)),x+700,y); amt=amt+Integer.parseInt(fm1.t25.getText())*56;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.f5.getLabel();
}
else
{
fod=fod+"-"+fm1.f5.getLabel();
}
}
if(fm1.f6.isSelected())
{
 
g.drawString(fm1.f6.getLabel(),x,y); g.drawString("5 Mins",x+300,y); g.drawString(fm1.t26.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t26.getText())*99)),x+700,y); amt=amt+Integer.parseInt(fm1.t26.getText())*99;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.f6.getLabel();
}
else
{
fod=fod+"-"+fm1.f6.getLabel();
}
}
if(fm1.f7.isSelected())
{
g.drawString(fm1.f7.getLabel(),x,y); g.drawString("5 Mins",x+300,y); g.drawString(fm1.t27.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t27.getText())*112)),x+700,y); amt=amt+Integer.parseInt(fm1.t27.getText())*112;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.f7.getLabel();
}
else
{
fod=fod+"-"+fm1.f7.getLabel();
}
}
if(fm1.f8.isSelected())
{
g.drawString(fm1.f8.getLabel(),x,y); g.drawString("5 Mins",x+300,y); 
g.drawString(fm1.t28.getText(),x+500,y);
g.drawString(String.valueOf((Integer.parseInt(fm1.t28.getText())*86)),x+700,y); amt=amt+Integer.parseInt(fm1.t28.getText())*86;
y=y+50;
if(fod.equals(""))
{
fod=fod+fm1.f8.getLabel();
}
else
{
fod=fod+"-"+fm1.f8.getLabel();
}
}
g.drawString("TOTAL AMT = Rs"+amt,x+700,y); stmt.setString(4,fod);
stmt.setInt(5,amt);
}
 
catch(Exception e1)
{
System.out.println(e1);
}
}
}
}









 



 
