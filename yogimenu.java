import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class yogimenu extends JFrame implements ActionListener  
{
ybillprint bp;
JButton bu,bu1;
JLabel l,l1,l2,l3,l4,l5,l6,l7;
JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
JTextField t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31;
JCheckBox b,b1,b2,b3,b4,b5,b6,b7,b8;
JCheckBox p,p1,p2,p3,p4,p5,p6,p7,p8;
JCheckBox f,f1,f2,f3,f4,f5,f6,f7,f8;
Color color;
Date d;
int count=0;

public yogimenu()
{
 super("Delicious Food Menu");
 bu=new JButton("ORDER CONFORM !");
 bu1=new JButton("Back !");
 Date d=new Date();
 l=new JLabel("SELECT YOUR FAV FOODS");
 l1=new JLabel("CUSTOMER NAME");
 l2=new JLabel("PHONE NO");
 l3=new JLabel("DATE");
 l4=new JLabel("BILL NO");
 l5=new JLabel("BURGER");
 l6=new JLabel("PIZZA");
 l7=new JLabel("FRIED ITEMS");

 t30=new JTextField(d.getDate()+"-"+(d.getMonth()+1)+"-2023");
 t31=new JTextField();
 Color color=new Color(255,239,213);

 t=new JTextField();
 t1=new JTextField();
 t2=new JTextField();
 t3=new JTextField();
 t4=new JTextField();
 t5=new JTextField();
 t6=new JTextField();
 t7=new JTextField();
 t8=new JTextField();
 t9=new JTextField();
 t10=new JTextField();
 t11=new JTextField();
 t12=new JTextField();
 t13=new JTextField();
 t14=new JTextField();
 t15=new JTextField();
 t16=new JTextField();
 t17=new JTextField();
 t18=new JTextField();
 t19=new JTextField();
 t20=new JTextField();
 t21=new JTextField();
 t22=new JTextField();
 t23=new JTextField();
 t24=new JTextField();
 t25=new JTextField();
 t26=new JTextField();
 t27=new JTextField();
 t28=new JTextField();

 b=new JCheckBox("Tempting Cheese Fried");
 b1=new JCheckBox("Crispy Fried");
 b2=new JCheckBox("Champian Chicken");
 b3=new JCheckBox("Twin Tower");
 b4=new JCheckBox("Thousands Island");
 b5=new JCheckBox("Triumph Classic");
 b6=new JCheckBox("Kiddy veg");
 b7=new JCheckBox("Panner veg" );
 b8=new JCheckBox("Spinach Corn");

 p=new JCheckBox("Cheesey chicken");
 p1=new JCheckBox("BBQ Chicken");
 p2=new JCheckBox("BTT Special");
 p3=new JCheckBox("Peproni");
 p4=new JCheckBox("Margareta Chicken pizza");
 p5=new JCheckBox("Veg Perspective");
 p6=new JCheckBox("Cheesy Pizza");
 p7=new JCheckBox("Corn ");
 p8=new JCheckBox("Panner");

 f=new JCheckBox("Chicken Excite Stripes");
 f1=new JCheckBox("Desired Fried Leg");
 f2=new JCheckBox("Chicken Lollipop");
 f3=new JCheckBox("Chicken Spicy Wings");
 f4=new JCheckBox("Crispy Popcorn");
 f5=new JCheckBox("French Fries");
 f6=new JCheckBox("Smile");
 f7=new JCheckBox("Chilli Garlic Pops");
 f8=new JCheckBox("Cheese Corn Nuggets");

 setLayout(new FlowLayout());
 getContentPane().setBackground(color.red);
 bu.setBackground(Color.black);
 bu1.setBackground(Color.black);
 b.setBackground(Color.black);
 b1.setBackground(Color.black);
 b2.setBackground(Color.black);
 b3.setBackground(Color.black);
 b4.setBackground(Color.black);
 b5.setBackground(Color.black);
 b6.setBackground(Color.black);
 b7.setBackground(Color.black);
 b8.setBackground(Color.black);

 f.setBackground(Color.black);
 f1.setBackground(Color.black);
 f2.setBackground(Color.black);
 f3.setBackground(Color.black);
 f4.setBackground(Color.black);
 f5.setBackground(Color.black);
 f6.setBackground(Color.black);
 f7.setBackground(Color.black);
 f8.setBackground(Color.black);

 p.setBackground(Color.black);
 p1.setBackground(Color.black);
 p2.setBackground(Color.black);
 p3.setBackground(Color.black);
 p4.setBackground(Color.black);
 p5.setBackground(Color.black);
 p6.setBackground(Color.black);
 p7.setBackground(Color.black);
 p8.setBackground(Color.black);

 t30.setBackground(Color.black);
 t31.setBackground(Color.black);

 l.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 l1.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 l2.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 l3.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 l4.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 l5.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 l6.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 l7.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 t30.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 t31.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 bu.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 bu1.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 t.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));
 t1.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.white));

 t2.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.red));
 t3.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.red));
 t4.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.red));
 t5.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.red));
 t6.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.red));
 t7.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.green));
 t8.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.green));
 t9.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.green));
 t10.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.green));
 t11.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.red));
 t12.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.red));
 t13.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.red));
 t14.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.red));
 t15.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.red));
 t16.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.green));
 t17.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.green));
 t18.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.green));
 t19.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.green));
 t20.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.red));
 t21.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.red));
 t22.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.red));
 t23.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.red));
 t24.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.red));
 t25.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.green));
 t26.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.green));
 t27.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.green));
 t28.setBorder(BorderFactory.createBevelBorder(1,Color.blue,Color.green));

  l.setForeground(Color.white);
  l1.setForeground(Color.white);
  l2.setForeground(Color.white);
  l3.setForeground(Color.white);
  l4.setForeground(Color.white);
  l5.setForeground(Color.white);
  l6.setForeground(Color.white);
  l7.setForeground(Color.white);
  t30.setForeground(Color.white);
  t31.setForeground(Color.white);
  bu.setForeground(Color.white);
  bu1.setForeground(Color.white);
  b.setForeground(Color.red);
  b1.setForeground(Color.red);
  b2.setForeground(Color.red);
  b3.setForeground(Color.red);
  b4.setForeground(Color.red);
  b5.setForeground(Color.green);
  b6.setForeground(Color.green);
  b7.setForeground(Color.green);
  b8.setForeground(Color.green);

  p.setForeground(Color.blue);
  p1.setForeground(Color.blue);
  p2.setForeground(Color.blue);
  p3.setForeground(Color.blue);
  p4.setForeground(Color.blue);
  p5.setForeground(Color.green);
  p6.setForeground(Color.green);
  p7.setForeground(Color.green);
  p8.setForeground(Color.green);

  f.setForeground(Color.yellow);
  f1.setForeground(Color.yellow);
  f2.setForeground(Color.yellow);
  f3.setForeground(Color.yellow);
  f4.setForeground(Color.yellow);
  f5.setForeground(Color.green);
  f6.setForeground(Color.green);
  f7.setForeground(Color.green);
  f8.setForeground(Color.green);

  bu.setBounds(1100,600,150,35);
  bu1.setBounds(920,600,150,35);
  t.setBounds(1150,200,150,40);
  t1.setBounds(1150,250,150,40);
  l.setBounds(400,30,400,50);
  l1.setBounds(950,200,190,35);
  l2.setBounds(950,250,190,35);
  l3.setBounds(1100,50,100,35);
  l4.setBounds(1100,90,100,35);
  l5.setBounds(80,130,100,35);
  l6.setBounds(340,130,100,35);
  l7.setBounds(640,130,150,35);
  t30.setBounds(1210,50,100,35);
  t31.setBounds(1210,90,100,35);

  b.setBounds(80,200,170,30);
  b1.setBounds(80,250,170,30);
  b2.setBounds(80,300,170,30);
  b3.setBounds(80,350,170,30);
  b4.setBounds(80,400,170,30);
  b5.setBounds(80,450,170,30);
  b6.setBounds(80,500,170,30);
  b7.setBounds(80,550,170,30);
  b8.setBounds(80,600,170,30);

  t2.setBounds(280,200,30,30);
  t3.setBounds(280,250,30,30);
  t4.setBounds(280,300,30,30);
  t5.setBounds(280,350,30,30);
  t6.setBounds(280,400,30,30);
  t7.setBounds(280,450,30,30);
  t8.setBounds(280,500,30,30);
  t9.setBounds(280,550,30,30);
  t10.setBounds(280,600,30,30);
       
  p.setBounds(340,200,170,30);
  p1.setBounds(340,250,170,30);
  p2.setBounds(340,300,170,30);
  p3.setBounds(340,350,170,30);
  p4.setBounds(340,400,170,30);
  p5.setBounds(340,450,170,30);
  p6.setBounds(340,500,170,30);
  p7.setBounds(340,550,170,30);
  p8.setBounds(340,600,170,30);

  t11.setBounds(540,200,30,30);
  t12.setBounds(540,250,30,30);
  t13.setBounds(540,300,30,30);
  t14.setBounds(540,350,30,30);
  t15.setBounds(540,400,30,30);
  t16.setBounds(540,450,30,30);
  t17.setBounds(540,500,30,30);
  t18.setBounds(540,550,30,30);
  t19.setBounds(540,600,30,30);
    
  f.setBounds(640,200,170,30);
  f1.setBounds(640,250,170,30);
  f2.setBounds(640,300,170,30);
  f3.setBounds(640,350,170,30);
  f4.setBounds(640,400,170,30);
  f5.setBounds(640,450,170,30);
  f6.setBounds(640,500,170,30);
  f7.setBounds(640,550,170,30);
  f8.setBounds(640,600,170,30);
      
  t20.setBounds(840,200,30,30);
  t21.setBounds(840,250,30,30);
  t22.setBounds(840,300,30,30);
  t23.setBounds(840,350,30,30);
  t24.setBounds(840,400,30,30);
  t25.setBounds(840,450,30,30);
  t26.setBounds(840,500,30,30);
  t27.setBounds(840,550,30,30);
  t28.setBounds(840,600,30,30);

  setSize(1400,900);
  add(bu);
  add(bu1);
  add(l);
  add(l1);
  add(l2);
  add(l3);
  add(l4);
  add(l5);
  add(l6);
  add(l7);
  add(t30);
  add(t31);
  add(t);
  add(t1);
  add(b);
  add(b1);
  add(b2);
  add(b3);
  add(b4);
  add(b5);
  add(b6);
  add(b7);
  add(b8);
  add(p);
  add(p1);
  add(p2);
  add(p3);
  add(p4);
  add(p5);
  add(p6);
  add(p7);
  add(p8);
  add(f);
  add(f1);
  add(f2);
  add(f3);
  add(f4);
  add(f5);
  add(f6);
  add(f7);
  add(f8);
  add(t2);
  add(t3);
  add(t4);
  add(t5);
  add(t6);
  add(t7);
  add(t8);
  add(t9);
  add(t10);
  add(t11);
  add(t12);
  add(t13);
  add(t14);
  add(t15);
  add(t16);
  add(t17);
  add(t18);
  add(t19);
  add(t20);
  add(t21);
  add(t22);
  add(t23);
  add(t24);
  add(t25);
  add(t26);
  add(t27);
  add(t28);

  l.setFont(new Font("impact",Font.ITALIC,40));
  l1.setFont(new Font("impact",Font.ITALIC,25));
  l2.setFont(new Font("impact",Font.ITALIC,25));
  l3.setFont(new Font("impact",Font.ITALIC,30));
  l4.setFont(new Font("impact",Font.ITALIC,30));
  l5.setFont(new Font("impact",Font.ITALIC,30));
  l6.setFont(new Font("impact",Font.ITALIC,30));
  l7.setFont(new Font("impact",Font.ITALIC,30));
  bu.setFont(new Font("impact",Font.ITALIC,18));
  bu1.setFont(new Font("impact",Font.ITALIC,18));

  b.setFont(new Font("impact",Font.ITALIC,15));
  b1.setFont(new Font("impact",Font.ITALIC,15));
  b2.setFont(new Font("impact",Font.ITALIC,15));
  b3.setFont(new Font("impact",Font.ITALIC,15));
  b4.setFont(new Font("impact",Font.ITALIC,15));
  b5.setFont(new Font("impact",Font.ITALIC,15));
  b6.setFont(new Font("impact",Font.ITALIC,15));
  b7.setFont(new Font("impact",Font.ITALIC,15));
  b8.setFont(new Font("impact",Font.ITALIC,15));

  p.setFont(new Font("impact",Font.ITALIC,15));
  p1.setFont(new Font("impact",Font.ITALIC,15));
  p2.setFont(new Font("impact",Font.ITALIC,15));
  p3.setFont(new Font("impact",Font.ITALIC,15));
  p4.setFont(new Font("impact",Font.ITALIC,15));
  p5.setFont(new Font("impact",Font.ITALIC,15));
  p6.setFont(new Font("impact",Font.ITALIC,15));
  p7.setFont(new Font("impact",Font.ITALIC,15));
  p8.setFont(new Font("impact",Font.ITALIC,15));

  f.setFont(new Font("impact",Font.ITALIC,15));
  f1.setFont(new Font("impact",Font.ITALIC,15));
  f2.setFont(new Font("impact",Font.ITALIC,15));
  f3.setFont(new Font("impact",Font.ITALIC,15));
  f4.setFont(new Font("impact",Font.ITALIC,15));
  f5.setFont(new Font("impact",Font.ITALIC,15));
  f6.setFont(new Font("impact",Font.ITALIC,15));
  f7.setFont(new Font("impact",Font.ITALIC,15));
  f8.setFont(new Font("impact",Font.ITALIC,15));
  t30.setFont(new Font("impact",Font.ITALIC,15));
  t31.setFont(new Font("impact",Font.ITALIC,15));
 
bp=new ybillprint(this);
 bp.hide();  
 bu.addActionListener(this);
 bu1.addActionListener(this);    
 setLayout(null);
 setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
count=count+1;
 String result=String.valueOf(count);
 t31.setText(result);
 hide();
 bp.show();

 if(e.getSource()==bu1)
 {
         hide();
ybutton o=new ybutton();
 }
}
public static void main(String h[])throws Exception
{
 yogimenu ob=new yogimenu();
}
}     