/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.reservation.system;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Random;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;
import java.util.Date;
import javax.swing.table.DefaultTableCellRenderer;


class MainFrameDesign1 extends JFrame implements ActionListener{
    JFrame f;
    JPanel p,p1,p2,p3,p4,p5,p6;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,
            l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44;
    JLabel p4l1,p4l2,p4l3,p4l4,p4l5,p4l6,p4l7,p4l8,p4l9,p4l10,p4l11,p4l12,p4l13,p4l14,p4l15,p4l16,p4l17,p4l18,p4l19,p4l20
            ,p4l21,p4l22,p4l23,p4l24,p4l25,p4l26,p4l27,p4l28,p4l29,p4l30,p4l31,p4l32;
    JLabel p4n1,p4n2,p4n3,p4n4,p4n5,p4n6,p4n7,p4n8,p4n9,p4n10,p4n11,p4n12,p4n13,p4n14;
    JLabel p5l1,p5l2,p5l3,p5l4,p5l6,p5l5,p5l7,p5l8,p5l9;
    JTextField p5t1,p5t2,p5t3,p5t4,p5t5,p5t6,p5t7,p5t8,p5t9;
    Font f1,f2,f3,f4,f5,f6;
    JComboBox c1,c2,c3,c4,c5,c6;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15;
    JDateChooser d;
    JMenuBar menubar;
    JMenu AirExc,Admin,custom,dis;
    JMenuItem cfo,Aadmin,upSch,upfi,viewf,viewp,viewb,Sign,canc,info,Pay,update,printT;
    JTable t;
    JScrollPane sp ;
    String rc1,rc2,rc3,rc4,rc5,rc6,rc7,rc8,rc10,rc11,ad,ch,in,user,x2,i3,ran,sl1,sl2,sl5,sl3;
    JTextField tx1,tx2,tx5,tx6,tx7,tx8,tx9,tx10,tx11;
    JPasswordField tp1,tp2,tx3,tx4;
    JRadioButton r1,r2,r3,r4;
    ResultSet rs;
    int x1,m1,seat1;
    String[] name= new String[10];
    String[] age= new String[10];
    String[] address= new String[10];
     String[] TicketNo= new String[10];
     String Ticket ="";
    
           
    
     public MainFrameDesign1()
    {
        f=new JFrame("Airline  Reservation System");
        
        //-----------------------------------Panel-0---------------------Search ticket Frame
        p=new JPanel();
        p.setBounds(419,100,500,500);
        p.setLayout(null);
        f1=new Font("Castellar",Font.BOLD,45);
        f2=new Font("Harrington",Font.BOLD,25);
        f3=new Font("Cooper",Font.PLAIN,30);
        f4=new Font("Cooper",Font.PLAIN,15);
        f5=new Font("Cooper",Font.PLAIN,18);
        f6=new Font("Cooper",Font.PLAIN,13);
        
          

        Dimension sz=Toolkit.getDefaultToolkit().getScreenSize();
        l1=new JLabel("");
        //l1.setIcon(new ImageIcon("C:\\Users\\vineet mendon\\Desktop\\website templates\\vin3.jpg"));
        l1.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/reservation/system/image/vin4.jpg")));
        l1.setBounds(0,0,sz.width,sz.height);

        //Image icon = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("airline/reservation/system/image/vin7.png")); 
        
        ImageIcon icon1 =new ImageIcon((ClassLoader.getSystemResource("airline/reservation/system/image/vin9.png")));
        Image newimg = icon1.getImage().getScaledInstance(64,64, java.awt.Image.SCALE_SMOOTH);
        icon1=new ImageIcon(newimg);
        f.setIconImage(newimg); 

        l2=new JLabel("FLY SAFE");
        l2.setBounds(550,1,400,50);
        l2.setForeground(new Color(2, 28, 27));
        l2.setFont(f1);

        l3=new JLabel("Explore  The  World  With  Us");
        l3.setBounds(500,40,400,40);
        l3.setForeground(new Color(2, 28, 27));
        l3.setFont(f2);
        f.add(l3);

        l4=new JLabel("Search Flight Tickets.");
        l4.setBounds(20,30,300,50);
        l4.setForeground(new Color(10,10,10));
        l4.setFont(f3);
        p.add(l4);

        l5=new JLabel("Fly anywhere. Fly everywhere");
        l5.setBounds(20,55,300,50);
        l5.setForeground(new Color(10,10,10));
        l5.setFont(f4);
        p.add(l5);
       
        l6=new JLabel("From");
        l6.setBounds(20,100,50,30);
        l6.setFont(f5);
        l6.setForeground(new Color(10,10,10));
        p.add(l6);


        String str1[]={"Select","Bengaluru","Chennai","Mumbai","Dehli","Kolkata"};
        c1=new JComboBox(str1);
        c1.setBounds(20,127,200,25);
        c1.setFont(f4);
        p.add(c1);

        btn1=new JButton("⇆");
        btn1.setBounds(230,127,50,25);
        btn1.setFont(f3);
        btn1.setOpaque(false);
        btn1.setFocusable(false);
       
        btn1.setBorderPainted(false);
        btn1.setForeground(Color.BLACK);
        btn1.setMargin(new Insets(0,0,0,0));
        btn1.setBorder(null);
        p.add(btn1);

        l7=new JLabel("To");
        l7.setBounds(290,100,50,30);
        l7.setFont(f5);
        l7.setForeground(new Color(10,10,10));
        p.add(l7);

        c2=new JComboBox(str1);
        c2.setBounds(290,127,200,25);
        c2.setFont(f4);
        p.add(c2);

        l8=new JLabel("Depart on");
        l8.setBounds(20,160,100,30);
        l8.setFont(f5);
        l8.setForeground(new Color(10,10,10));
        p.add(l8);
        
      
         
  
         Calendar c = Calendar.getInstance();
         c.setTime(new Date()); // Using today's date
         c.add(Calendar.DATE, 90);//adding 90 days
         d=new JDateChooser();
         d.setBounds(20,191,200,25);
         d.setFont(f4);
         d.setMaxSelectableDate(c.getTime());
         d.setMinSelectableDate(new Date());
         p.add(d);
          
            l9=new JLabel("Adults");
        l9.setBounds(20,220,100,30);
        l9.setFont(f5);
        l9.setForeground(new Color(10,10,10));
        p.add(l9);

        String []str2={"1","2","3","4","5","6","7","8","9"};
        c3=new JComboBox(str2);
        c3.setBounds(20,250,100,20);
        c3.setFont(f4);
        p.add(c3);

        l10=new JLabel("Children");
        l10.setBounds(170,220,100,30);
        l10.setFont(f5);
        l10.setForeground(new Color(10,10,10));
        p.add(l10);

        String []str3={"0","1","2","3","4","5","6","7","8","9"};
        c4=new JComboBox(str3);
        c4.setBounds(170,250,100,20);
        c4.setFont(f4);
        p.add(c4);

        l11=new JLabel("Infant");
        l11.setBounds(320,220,100,30);
        l11.setFont(f5);
        l11.setForeground(new Color(10,10,10));
        p.add(l11);

        String []str4={"0","1","2"};
        c5=new JComboBox(str4);
        c5.setBounds(320,250,100,20);
        c5.setFont(f4);
        p.add(c5);

        l12=new JLabel("2-11yrs");
        l12.setBounds(170,262,100,30);
        l12.setFont(f6);
        l12.setForeground(new Color(10,10,10));
        p.add(l12);

        l13=new JLabel("Below 2yrs");
        l13.setBounds(320,262,100,30);
        l13.setFont(f6);
        l13.setForeground(new Color(10,10,10));
        p.add(l13);

        l14=new JLabel("Class of travel");
        l14.setBounds(20,300,150,30);
        l14.setFont(f5);
        l14.setForeground(new Color(10,10,10));
        p.add(l14);

        String []str5={"Economy","Bussiness","First","Premium Economy"};
        c6=new JComboBox(str5);
        c6.setBounds(20,330,180,25);
        c6.setFont(f4);
        p.add(c6);

        btn2=new JButton("Search");
        btn2.setBounds(255,390,200,25);
        btn2.setFont(f4);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        btn2.setFocusable(false);
        btn2.setBorderPainted(false);
        p.add(btn2);
        
        btn5=new JButton("Back");
        btn5.setBounds(25,390,200,25);
        btn5.setFont(f4);
        btn5.setBackground(Color.BLACK);
        btn5.setForeground(Color.WHITE);
        btn5.setFocusable(false);
        btn5.setBorderPainted(false);
        p.add(btn5);
        
        
         
         btn1.addActionListener(this);
         btn2.addActionListener(this);
         btn5.addActionListener(this);
         
         //------------------------------Panel-1------------------------Search results ticket
         p1=new JPanel();
         p1.setBounds(110,100,1100,550);
         p1.setLayout(null);
         p1.setVisible(false);
         p1.setOpaque(true);
         p1.setBackground(new Color(225,225,225,75));
         f.add(p1);
         
          l15=new JLabel("Search Result");
        l15.setBounds(450,5,300,60);
        l15.setForeground(new Color(10,10,10));
        l15.setFont(f3);
        p1.add(l15);
        
        t=new JTable();
        t.setBackground(Color.WHITE);
        t.setBounds(25,100,1050,300);
        t.setFont(f5);
        t.setRowHeight(t.getRowHeight()+20);
        JTableHeader header = t.getTableHeader();
         header.setPreferredSize(new Dimension(100, 0));
        
        sp=new JScrollPane(t);
        sp.setBounds(25,100,1050,300);
        sp.setBackground(Color.WHITE);
        p1.add(sp);
        
         btn3=new JButton("Back");
        btn3.setBounds(400,450,150,25);
        btn3.setFont(f4);
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.WHITE);
        btn3.setFocusable(false);
        btn3.setBorderPainted(false);
        p1.add(btn3);
        btn3.addActionListener(this);
        
        btn4=new JButton("Book");
        btn4.setBounds(600,450,150,25);
        btn4.setFont(f4);
        btn4.setBackground(Color.BLACK);
        btn4.setForeground(Color.WHITE);
        btn4.setFocusable(false);
        btn4.setBorderPainted(false);
        p1.add(btn4);
        btn4.addActionListener(this);
        
        l16=new JLabel("Date");
        l16.setFont(f5);
        l16.setBounds(50,55,50,30);
        p1.add(l16);
        
         l17=new JLabel("Flight");
        l17.setFont(f5);
        l17.setBounds(120,55,50,30);
        p1.add(l17);
        
        l18=new JLabel("code");
        l18.setFont(f5);
        l18.setBounds(120,75,50,30);
        p1.add(l18);
        
        l19=new JLabel("Departure");
        l19.setFont(f5);
        l19.setBounds(200,55,150,30);
        p1.add(l19);
        
        l20=new JLabel("At");
        l20.setFont(f5);
        l20.setBounds(220,75,50,30);
        p1.add(l20);
        
         l21=new JLabel("Departure");
        l21.setFont(f5);
        l21.setBounds(300,55,150,30);
        p1.add(l21);
        
        l22=new JLabel("Time");
        l22.setFont(f5);
        l22.setBounds(320,75,50,30);
        p1.add(l22);
        
         l23=new JLabel("Arrival");
        l23.setFont(f5);
        l23.setBounds(420,55,150,30);
        p1.add(l23);
        
        l24=new JLabel("At");
        l24.setFont(f5);
        l24.setBounds(435,75,50,30);
        p1.add(l24);
        
         l25=new JLabel("Arrival");
        l25.setFont(f5);
        l25.setBounds(540,55,150,30);
        p1.add(l25);
        
        l26=new JLabel("Time");
        l26.setFont(f5);
        l26.setBounds(545,75,50,30);
        p1.add(l26);
        
         l27=new JLabel("Duration");
        l27.setFont(f5);
        l27.setBounds(630,55,150,30);
        p1.add(l27);
        
         l28=new JLabel("Price");
        l28.setFont(f5);
        l28.setBounds(770,55,150,30);
        p1.add(l28);
        
         l29=new JLabel("Available");
        l29.setFont(f5);
        l29.setBounds(870,55,150,30);
        p1.add(l29);
        
        l30=new JLabel("Seats");
        l30.setFont(f5);
        l30.setBounds(880,75,50,30);
        p1.add(l30);
        
         l31=new JLabel("Class");
        l31.setFont(f5);
        l31.setBounds(990,55,150,30);
        p1.add(l31);
        
        l32=new JLabel("Type");
        l32.setFont(f5);
        l32.setBounds(990,75,50,30);
        p1.add(l32);
       
       
       //----------------------Panel-4---------------------------------------Ticket Details/Payment 
        p4=new JPanel();
        p4.setBounds(120,80,1100,230);
        p4.setLayout(null);
        p4.setVisible(false);
        p4.setOpaque(true);
        p4.setBackground(new Color(225,225,225,75));
        f.add(p4);
        
        p4l1=new JLabel("Ticket Details");
        p4l1.setBounds(450,10,300,50);
        p4l1.setForeground(new Color(10,10,10));
        p4l1.setFont(f3);
        p4.add(p4l1);
        
        p4l3=new JLabel("Flight No:");
        p4l3.setBounds(40,60,100,50);
        p4l3.setForeground(new Color(10,10,10));
        p4l3.setFont(f5);
        p4.add(p4l3);
        

        
        p4l4=new JLabel("Source:");
        p4l4.setBounds(40,90,100,50);
        p4l4.setForeground(new Color(10,10,10));
        p4l4.setFont(f5);
        p4.add(p4l4);
        
         p4l8=new JLabel("Dept.Time:");
        p4l8.setBounds(320,90,100,50);
        p4l8.setForeground(new Color(10,10,10));
        p4l8.setFont(f5);
        p4.add(p4l8);
        
        p4n1=new JLabel("Passenger-1-Name:");
        p4n1.setBounds(520,90,200,50);
        p4n1.setForeground(new Color(10,10,10));
        p4n1.setFont(f5);
        p4.add(p4n1);
        
        p4n7=new JLabel("Ticket No:");
        p4n7.setBounds(840,90,200,50);
        p4n7.setForeground(new Color(10,10,10));
        p4n7.setFont(f5);
        p4.add(p4n7);
          
        p4l10=new JLabel("Arrival:");
        p4l10.setBounds(40,120,100,50);
        p4l10.setForeground(new Color(10,10,10));
        p4l10.setFont(f5);
        p4.add(p4l10);
        
        p4l11=new JLabel("Arri.Time:");
        p4l11.setBounds(320,120,100,50);
        p4l11.setForeground(new Color(10,10,10));
        p4l11.setFont(f5);
        p4.add(p4l11);
        
        p4l15=new JLabel("Class of Travel:");
        p4l15.setBounds(40,150,200,50);
        p4l15.setForeground(new Color(10,10,10));
        p4l15.setFont(f5);
        p4.add(p4l15);
        
        p4l16=new JLabel("Date:");
        p4l16.setBounds(320,150,100,50);
        p4l16.setForeground(new Color(10,10,10));
        p4l16.setFont(f5);
        p4.add(p4l16);
        
        p4l18=new JLabel("Adult:");
        p4l18.setBounds(40,180,100,50);
        p4l18.setForeground(new Color(10,10,10));
        p4l18.setFont(f5);
        p4.add(p4l18);
        
        p4l20=new JLabel("Children:");
        p4l20.setBounds(160,180,100,50);
        p4l20.setForeground(new Color(10,10,10));
        p4l20.setFont(f5);
        p4.add(p4l20);
        
        p4l22=new JLabel("Infant:");
        p4l22.setBounds(280,180,100,50);
        p4l22.setForeground(new Color(10,10,10));
        p4l22.setFont(f5);
        p4.add(p4l22);
        
        p4l24=new JLabel("No of Tickets:");
        p4l24.setBounds(370,180,200,50);
        p4l24.setForeground(new Color(10,10,10));
        p4l24.setFont(f5);
        p4.add(p4l24);
        
      
        
        
        p4l14=new JLabel("");
        p4l14.setBounds(170,150,300,50);
        p4l14.setForeground(new Color(10,10,10));
        p4l14.setFont(f5);
        p4.add(p4l14);
             
         p4l17=new JLabel("");//Date-------------Panel 4
         p4l17.setBounds(380,150,100,50);
         p4l17.setForeground(new Color(10,10,10));
         p4l17.setFont(f5);
         p4.add(p4l17);
        p4l19=new JLabel("");
        p4l19.setBounds(100,180,100,50);
        p4l19.setForeground(new Color(10,10,10));
        p4l19.setFont(f5);
        p4.add(p4l19); 
        
        p4l21=new JLabel("");
        p4l21.setBounds(240,180,100,50);
        p4l21.setForeground(new Color(10,10,10));
        p4l21.setFont(f5);
        p4.add(p4l21);
        
        p4l25=new JLabel("");
        p4l25.setBounds(480,180,100,50);
        p4l25.setForeground(new Color(10,10,10));
        p4l25.setFont(f5);
        p4.add(p4l25);
           
        
        p4l23=new JLabel("");
        p4l23.setBounds(340,180,100,50);
        p4l23.setForeground(new Color(10,10,10));
        p4l23.setFont(f5);
        p4.add(p4l23);
        
        p4l5=new JLabel("");//Departure At
        p4l5.setBounds(150,90,300,50);
        p4l5.setForeground(new Color(10,10,10));
        p4l5.setFont(f5);
        p4.add(p4l5);
        
        p4l9=new JLabel("");
        p4l9.setBounds(430,90,100,50);
        p4l9.setForeground(new Color(10,10,10));
        p4l9.setFont(f5);
        p4.add(p4l9);
        
        p4l12=new JLabel("");
        p4l12.setBounds(150,120,300,50);
        p4l12.setForeground(new Color(10,10,10));
        p4l12.setFont(f5);
        p4.add(p4l12);
        
        p4l13=new JLabel("");
        p4l13.setBounds(430,120,100,50);
        p4l13.setForeground(new Color(10,10,10));
        p4l13.setFont(f5);
        p4.add(p4l13);
        
        p4l27=new JLabel("");//Flight_code
        p4l27.setBounds(160,60,100,50);
        p4l27.setForeground(new Color(10,10,10));
        p4l27.setFont(f5);
        p4.add(p4l27);
        
       
        
      
        //--------------------------------Panel-5------------------------------Passenger Information
        p5=new JPanel();
        p5.setBounds(420,100,500,550);
        p5.setLayout(null);
        p5.setVisible(false);
        p5.setOpaque(true);
        p5.setBackground(new Color(225,225,225,75));
        f.add(p5);
        
        p5l1=new JLabel("Passenger Information");
        p5l1.setBounds(100,10,300,50);
        p5l1.setForeground(new Color(10,10,10));
        p5l1.setFont(f3);
        p5.add(p5l1);
        
        p5l2=new JLabel("Passenger-1-Name:");
        p5l2.setBounds(40,70,200,50);
        p5l2.setForeground(new Color(10,10,10));
        p5l2.setFont(f5);
        p5.add(p5l2);
        
        p5t1=new JTextField();
        p5t1.setBounds(205,80,250,30);
        p5t1.setFont(f5);
        p5.add(p5t1);
        
        p5l3=new JLabel("Age:");
        p5l3.setBounds(40,105,200,50);
        p5l3.setForeground(new Color(10,10,10));
        p5l3.setFont(f5);
        p5.add(p5l3);
        
        p5t2=new JTextField();
        p5t2.setBounds(205,115,250,30);
        p5t2.setFont(f5);
        p5.add(p5t2);
        
        p5l3=new JLabel("Address:");
        p5l3.setBounds(40,140,200,50);
        p5l3.setForeground(new Color(10,10,10));
        p5l3.setFont(f5);
        p5.add(p5l3);
        
        p5t3=new JTextField();
        p5t3.setBounds(205,155,250,30);
        p5t3.setFont(f5);
        p5.add(p5t3);
        
        p5l4=new JLabel("Passenger-2-Name:");
        p5l4.setBounds(40,185,200,50);
        p5l4.setForeground(new Color(10,10,10));
        p5l4.setFont(f5);
      
        
        p5t4=new JTextField();
        p5t4.setBounds(205,195,250,30);
        p5t4.setFont(f5);
       
        
        p5l5=new JLabel("Age:");
        p5l5.setBounds(40,225,200,50);
        p5l5.setForeground(new Color(10,10,10));
        p5l5.setFont(f5);
       
        
        p5t5=new JTextField();
        p5t5.setBounds(205,235,250,30);
        p5t5.setFont(f5);
        
        
        p5l6=new JLabel("Address:");
        p5l6.setBounds(40,270,200,50);
        p5l6.setForeground(new Color(10,10,10));
        p5l6.setFont(f5);
       
        
        p5t6=new JTextField();
        p5t6.setBounds(205,280,250,30);
        p5t6.setFont(f5);
        
        p5l7=new JLabel("Passenger-3-Name:");
        p5l7.setBounds(40,310,200,50);
        p5l7.setForeground(new Color(10,10,10));
        p5l7.setFont(f5);
      
        
        p5t7=new JTextField();
        p5t7.setBounds(205,325,250,30);
        p5t7.setFont(f5);
       
        
        p5l8=new JLabel("Age:");
        p5l8.setBounds(40,355,200,50);
        p5l8.setForeground(new Color(10,10,10));
        p5l8.setFont(f5);
       
        
        p5t8=new JTextField();
        p5t8.setBounds(205,370,250,30);
        p5t8.setFont(f5);
        
        
        p5l9=new JLabel("Address:");
        p5l9.setBounds(40,400,200,50);
        p5l9.setForeground(new Color(10,10,10));
        p5l9.setFont(f5);
       
        
        p5t9=new JTextField();
        p5t9.setBounds(205,415,250,30);
        p5t9.setFont(f5);
       
         btn12=new JButton("Submit");
        btn12.setBounds(280,475,150,25);
        btn12.setFont(f4);
        btn12.setBackground(Color.BLACK);
        btn12.setForeground(Color.WHITE);
        btn12.setFocusable(false);
        btn12.setBorderPainted(false);
        btn12.addActionListener(this);
        p5.add(btn12);
        
        btn13=new JButton("Back");
        btn13.setBounds(120,475,150,25);
        btn13.setFont(f4);
        btn13.setBackground(Color.BLACK);
        btn13.setForeground(Color.WHITE);
        btn13.setFocusable(false);
        btn13.setBorderPainted(false);
        btn13.addActionListener(this);
        p5.add(btn13);
       //----------------------------------------panel 6-------------------- 
       
        p6=new JPanel();
        p6.setBounds(120,330,1100,350);
        p6.setLayout(null);
        p6.setVisible(false);
        p6.setOpaque(true);
        p6.setBackground(new Color(225,225,225,75));
        f.add(p6);
        
         p4l30=new JLabel("");//Total amount
        p4l30.setBounds(550,50,100,50);
        p4l30.setForeground(new Color(10,10,10));
        p4l30.setFont(f5);
        p6.add(p4l30);
        
        p4l28=new JLabel("Make Payment");
        p4l28.setBounds(450,10,300,50);
        p4l28.setForeground(new Color(10,10,10));
        p4l28.setFont(f3);
        p6.add(p4l28);
        
        r1=new JRadioButton("Card");
        r1.setFont(f5);
        r1.setForeground(new Color(10,10,10));
        r1.setBorderPainted(false);
        r1.setFocusable(false);
        r1.setBounds(360,100,70,30);
        r1.setSelected(true);
        r1.addActionListener(this);
        
        p6.add(r1);
        
        r2=new JRadioButton("Cheque");
        r2.setFont(f5);
        r2.setForeground(new Color(10,10,10));
        r2.setBorderPainted(false);
        r2.setFocusable(false);
        r2.setBounds(450,100,100,30);
        r2.addActionListener(this);
        p6.add(r2);
        
        r3=new JRadioButton("UPI/Gpay");
        r3.setFont(f5);
        r3.setForeground(new Color(10,10,10));
        r3.setBorderPainted(false);
        r3.setFocusable(false);
        r3.setBounds(570,100,130,30);
        r3.addActionListener(this);
        p6.add(r3);
        
        ButtonGroup bg5=new ButtonGroup();
        bg5.add(r1);
        bg5.add(r2);
        bg5.add(r3);
       
        
        p4l29=new JLabel("Total Payable Amount:");
        p4l29.setBounds(360,50,250,50);
        p4l29.setForeground(new Color(10,10,10));
        p4l29.setFont(f5);
        p6.add(p4l29);
        
        p4l31=new JLabel("Card no:");
        p4l31.setBounds(340,150,250,50);
        p4l31.setForeground(new Color(10,10,10));
        p4l31.setFont(f5);
        p6.add(p4l31);
        
          p4l32=new JLabel("Pin:");
        p4l32.setBounds(340,200,250,50);
        p4l32.setForeground(new Color(10,10,10));
        p4l32.setFont(f5);
        p6.add(p4l32);
       
        tx9=new JTextField();
        tx9.setBounds(450,160,300,30);
        tx9.setFont(f5);
        p6.add(tx9);
        
       
        
        tp2=new JPasswordField();
        tp2.setBounds(450,210,300,30);
        tp2.setFont(f5);
        p6.add(tp2);
        
        btn11=new JButton("Back");
        btn11.setBounds(300,270,200,25);
        btn11.setFont(f4);
        btn11.setBackground(Color.BLACK);
        btn11.setForeground(Color.WHITE);
        btn11.setFocusable(false);
        btn11.setBorderPainted(false);
        btn11.addActionListener(this);
        p6.add(btn11);
        
        btn10=new JButton("Submit");
        btn10.setBounds(600,270,200,25);
        btn10.setFont(f4);
        btn10.setBackground(Color.BLACK);
        btn10.setForeground(Color.WHITE);
        btn10.setFocusable(false);
        btn10.setBorderPainted(false);
        btn10.addActionListener(this);
        p6.add(btn10);
        
        btn14=new JButton("Print Ticket");
        btn14.setBounds(600,270,200,25);
        btn14.setFont(f4);
        btn14.setVisible(false);
        btn14.setBackground(Color.BLACK);
        btn14.setForeground(Color.WHITE);
        btn14.setFocusable(false);
        btn14.setBorderPainted(false);
        btn14.addActionListener(this);
        p6.add(btn14);
         
        p.setOpaque(true);
        p.setBackground(new Color(255, 255,255,75));
        f.add(p);
        f.add(l2);
        f.add(l1);
        f.setSize(sz.width,sz.height);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    @Override
    public void actionPerformed(ActionEvent ae){
          String s1=(String)c1.getSelectedItem();
        String s2=(String)c2.getSelectedItem();
         if(ae.getSource()==btn1){
         String s3=s1;
        c1.setSelectedItem(s2);
        c2.setSelectedItem(s3);
    } else if(ae.getSource()==btn2){
         p4l14.setText("");
         p4l17.setText("");
         p4l19.setText("");
         p4l21.setText("");
         p4l23.setText("");
         p4l25.setText("");
         
           
          try{
               String sl4=(String)c6.getSelectedItem();
               
               if(d.getDate()==null){
              JOptionPane.showMessageDialog(null, "Please select Date");
           }
               else if(s1.equals("Select") || s2.equals("Select")){JOptionPane.showMessageDialog(null, "Please Select Source and Desitination");}
               else if(s1.equals(s2)){JOptionPane.showMessageDialog(null, "Source and destination cannot be same");}
               
           else{
                    sl1=(String)c1.getSelectedItem();
             sl2=(String)c2.getSelectedItem();
            SimpleDateFormat sformat=new SimpleDateFormat("dd/MM/yyyy");
             sl3=sformat.format(d.getDate());
             sl5=(String)c6.getSelectedItem();
            String n1=(String)c3.getSelectedItem();//Adult ad
            String n2=(String)c4.getSelectedItem();//chidrens ch
            String n3=(String)c5.getSelectedItem();//infant in
             LocalDateTime dt = LocalDateTime.now();
             DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
             String st =dt.format(df);//date   
            int ti=sl3.compareTo(st);
            
                LocalTime lt =LocalTime.now();
                DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                String stt =dt.format(dft);//date  
            ad=n1;
            ch=n2;
            in=n3;
             x1=(Integer.parseInt(ad)+Integer.parseInt(ch)+Integer.parseInt(in));
             x2=Integer.toString(x1);
             p4.revalidate();
             p5.revalidate();
             String endTime="",dts1="",dts2="";
             long elapsed=0;
             conn c1=new conn();
                String l= "select * from flightschedule where deptAt='"+sl1+"' and ArriAt='"+sl2+"' and date='"+sl3+"' and class_name='"+sl5+"'";
                ResultSet rs=c1.s.executeQuery(l);
                if(rs.next()){
                  dts1 = rs.getString("DeptTime");
                  dts2=rs.getString("date");
                  endTime=dts2.concat(" ").concat(dts1);
                  try{
                   java.util.Date d1= new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(stt); 
                   java.util.Date d2= new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(endTime);            
                   elapsed = (d2.getTime() - d1.getTime())/3600000; 
                    System.out.println(elapsed);
                  }catch(Exception e){
                  System.out.println(e);
                  }
            
             if(x1>3){JOptionPane.showMessageDialog(null, "You can only book 3 tickets at a time");}
             else if(ti==-1){JOptionPane.showMessageDialog(null, "Past Date Not Allowed \n Only Future Dates Allowed ");}
             else if(elapsed<24){JOptionPane.showMessageDialog(null, "You can only Book Tickets Before The 24 Hours Of Departure");}
             else{
                 p4l14.setText(sl5);
                 p4l17.setText(sl3);
                 p4l19.setText(n1);
                 p4l21.setText(n2);
                 p4l23.setText(n3);
                 p4l25.setText(x2);
                 
                 c1=new conn();
                String l2= "select * from flightschedule where deptAt='"+sl1+"' and ArriAt='"+sl2+"' and date='"+sl3+"' and class_name='"+sl5+"'";
                ResultSet rst= c1.s.executeQuery(l2);
                t.setModel(DbUtils.resultSetToTableModel(rst));
                t.getColumnModel().getColumn(0).setPreferredWidth(55);
                t.getColumnModel().getColumn(1).setPreferredWidth(30);
                t.getColumnModel().getColumn(2).setPreferredWidth(75);
                t.getColumnModel().getColumn(3).setPreferredWidth(35);
               
                 DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
                 cr.setHorizontalAlignment(JLabel.CENTER);
                  t.getColumnModel().getColumn(0).setCellRenderer(cr);
                 t.getColumnModel().getColumn(1).setCellRenderer(cr);
                 t.getColumnModel().getColumn(2).setCellRenderer(cr);
                 t.getColumnModel().getColumn(3).setCellRenderer(cr);
                 t.getColumnModel().getColumn(4).setCellRenderer(cr);
                 t.getColumnModel().getColumn(5).setCellRenderer(cr);
                 t.getColumnModel().getColumn(6).setCellRenderer(cr);
                 t.getColumnModel().getColumn(7).setCellRenderer(cr);
                 t.getColumnModel().getColumn(8).setCellRenderer(cr);
                 t.getColumnModel().getColumn(9).setCellRenderer(cr);
           }
                }
                else{
                JOptionPane.showMessageDialog(null, "No Tickets found on given data");
                }
                  
           }
               conn c1 =new conn();
                String l1= "select * from flightschedule where deptAt='"+sl1+"' and ArriAt='"+sl2+"' and date='"+sl3+"' and class_name='"+sl5+"'";
                ResultSet rst1= c1.s.executeQuery(l1);
                
                if(rst1.next()){
                     p.setVisible(false);
                     p1.setVisible(true);
                    
                }
               
                
          }catch(Exception e){
              System.out.println(e);
          }
            
            }
    else if(ae.getSource()==btn3){
        p1.setVisible(false);
        p.setVisible(true);
    }
    else if(ae.getSource()==btn4){
       
        
        if(x1==2){
         p5l4.setVisible(true);
                 p5t4.setVisible(true);
                 p5l5.setVisible(true);
                  p5t5.setVisible(true);
                   p5l6.setVisible(true);
                    p5t6.setVisible(true);
        }
        else if(x1==3){
                   p5l4.setVisible(true);
                 p5t4.setVisible(true);
                 p5l5.setVisible(true);
                  p5t5.setVisible(true);
                   p5l6.setVisible(true);
                    p5t6.setVisible(true);
                   p5l7.setVisible(true); 
                 p5t7.setVisible(true);
                  p5l8.setVisible(true);
                  p5t8.setVisible(true);
                 p5l9.setVisible(true);
                    p5t9.setVisible(true);
                   
              }

        int row=t.getSelectedRow();
        row=row+1;
        if(row==0){
            JOptionPane.showMessageDialog(null, "Please Select A row");
        }
        else{
          row=row-1;
          rc1=t.getValueAt(row,0).toString();//date
          rc2=t.getValueAt(row,1).toString();//flight code
          rc3=t.getValueAt(row,2).toString();//departure at
          rc4=t.getValueAt(row,3).toString();//departure time
          rc5=t.getValueAt(row,4).toString();//arrival at
          rc6=t.getValueAt(row,5).toString();//arrival time
          rc7=t.getValueAt(row,6).toString();//duration
          rc8=t.getValueAt(row,7).toString();//price
          rc10=t.getValueAt(row,9).toString();//class name
           rc11=t.getValueAt(row,8).toString();//A_seats
           p4l5.setText(rc3);
           p4l9.setText(rc4);
           p4l12.setText(rc5);
           p4l13.setText(rc6);
           p4l27.setText(rc2);
          
           
           
          int i1=Integer.parseInt(x2);
          int i2=Integer.parseInt(rc8)*i1;//total amount 
          i3=Integer.toString(i2);
          p4l30.setText(i3);
         
          
           if(x1==2){
                p5.add(p5l4);
                 p5.add(p5t4);
                  p5.add(p5l5);
                  p5.add(p5t5);
                   p5.add(p5l6);
                   p5.add(p5t6);
              }
              else if(x1==3){
                 p5.add(p5l4);
                 p5.add(p5t4);
                  p5.add(p5l5);
                  p5.add(p5t5);
                   p5.add(p5l6);
                   p5.add(p5t6);
                p5.add(p5l7);
                 p5.add(p5t7);
                  p5.add(p5l8);
                  p5.add(p5t8);
                   p5.add(p5l9);
                   p5.add(p5t9);
              }
         
          p1.setVisible(false);
          p5.setVisible(true);
         
        }
    }
    else if(ae.getSource()==btn10){
              if(tx9.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Please Fill All The Field");
              }
              else
              {
                LocalDateTime dt = LocalDateTime.now();
                LocalTime lt =LocalTime.now();
                DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                DateTimeFormatter tf =DateTimeFormatter.ofPattern("HH:mm:ss");
                String st =dt.format(df);//date
                String m =lt.format(tf);//time
                
                String cd=tx9.getText();//card no
//                String txn=p4l7.getText();//ticket no
                
             if(r2.isSelected()){  
                try{
                   
                    
                    if(cd.length()!=6){
                        JOptionPane.showMessageDialog(null,cd);
                      JOptionPane.showMessageDialog(null,"Cheque no should be of 6 digits");
                    }
                    else if(Character.isLetter(cd.charAt(0))||Character.isLetter(cd.charAt(1))||Character.isLetter(cd.charAt(2))||Character.isLetter(cd.charAt(3))||Character.isLetter(cd.charAt(4))||Character.isLetter(cd.charAt(5))){
                    JOptionPane.showMessageDialog(null,"Only Numeric value allowed in card.no ");
                    }
                    
                    else{
                        conn c2= new conn();
                         String q2="select * from flightschedule where date='"+p4l17.getText()+"' and f_code='"+p4l27.getText()+"'";
                       ResultSet rs= c2.s.executeQuery(q2);
                      if(rs.next()){
                          int seats=rs.getInt("Aseats");
                       if(seats <x1){
                           JOptionPane.showMessageDialog(null, "The flight is full/ No seats are avilable");
                       }
                       else{
                           seats=seats-x1;
                            String q5= "select * from flight_info where fl_code='"+p4l27.getText()+"'";
                            rs=c2.s.executeQuery(q5);
                            if(rs.next()){
                                
                                seat1=rs.getInt("seats");
                              
                            }
                            int rv=seat1-Integer.parseInt(rc11);
                          rv=rv+1;
                           String q3="update flightschedule set Aseats='"+seats+"' where date='"+p4l17.getText()+"' and f_code='"+p4l27.getText()+"'";
                           c2.s.executeUpdate(q3);
                             
                        
                           
                       for(int i=0;i<x1;i++){
                           rv=rv+i;
                      String q1="insert into bookings values('"+p4l17.getText()+"','"+TicketNo[i]+"','"+rv+"','"+p4l27.getText()+"','"+name[i]+"','"+age[i]+"','"+address[i]+"','"+p4l5.getText()+"','"+p4l9.getText()+"','"+p4l12.getText()+"','"+p4l13.getText()+"','"+rc10+"','Confirm')";
                       c2.s.executeUpdate(q1);
                       
                      String q ="insert into paymentdetail values('"+name[i]+"','"+TicketNo[i]+"','NA','"+cd+"','NA','"+rc8+"','"+st+"','"+m+"')";
                      c2.s.executeUpdate(q);
                          
                      }
                    c2.c.close();
                       }
                      }
                       
                      
                  JOptionPane.showMessageDialog(null,"Ticket Booking Successfull");
                  tx9.setText("");
                 btn10.setVisible(false);
                 btn14.setVisible(true);
                  p6.setVisible(false);
                 p6.setVisible(true);
                }
                
              
                }catch(Exception e){
                   System.out.println(e);
                }
             }else if(r3.isSelected()){  
                try{
                    
                    
                    if(cd.length()<10 || cd.length()>10){
                      JOptionPane.showMessageDialog(null,"UPI ID should be of 10 digits");
                    }
                    else if(Character.isLetter(cd.charAt(0))||Character.isLetter(cd.charAt(1))||Character.isLetter(cd.charAt(2))||Character.isLetter(cd.charAt(3))||Character.isLetter(cd.charAt(4))||Character.isLetter(cd.charAt(5))||Character.isLetter(cd.charAt(6))||Character.isLetter(cd.charAt(7))||Character.isLetter(cd.charAt(8))||Character.isLetter(cd.charAt(9))){
                    JOptionPane.showMessageDialog(null,"Only Numeric value allowed in UPI ID ");
                    }
                    
                    else{
                        conn c2= new conn();
                         String q2="select * from flightschedule where date='"+p4l17.getText()+"' and f_code='"+p4l27.getText()+"'";
                       ResultSet rs= c2.s.executeQuery(q2);
                      if(rs.next()){
                          int seats=rs.getInt("Aseats");
                       if(seats <x1){
                           JOptionPane.showMessageDialog(null, "The flight is full/ No seats are avilable");
                       }
                       else{
                            
                            String q5= "select * from flight_info where fl_code='"+p4l27.getText()+"'";
                            rs=c2.s.executeQuery(q5);
                            if(rs.next()){
                                
                                seat1=rs.getInt("seats");
                              
                            }
                            int rv=seat1-Integer.parseInt(rc11);
                           seats=seats-x1;
                           rv=rv+1;
                           String q3="update flightschedule set Aseats='"+seats+"' where date='"+p4l17.getText()+"' and f_code='"+p4l27.getText()+"'";
                           c2.s.executeUpdate(q3);
                           
                       for(int i=0;i<x1;i++){
                           rv=rv+i;
                      String q1="insert into bookings values('"+p4l17.getText()+"','"+TicketNo[i]+"','"+rv+"','"+p4l27.getText()+"','"+name[i]+"','"+age[i]+"','"+address[i]+"','"+p4l5.getText()+"','"+p4l9.getText()+"','"+p4l12.getText()+"','"+p4l13.getText()+"','"+rc10+"','Confirm')";
                       c2.s.executeUpdate(q1);
                      String q ="insert into paymentdetail values('"+name[i]+"','"+TicketNo[i]+"','NA','NA','"+cd+"','"+rc8+"','"+st+"','"+m+"')";
                      c2.s.executeUpdate(q);
                          
                      }
                    c2.c.close();
                       }
                      }
                       
                      
                  JOptionPane.showMessageDialog(null,"Ticket Booking Successfull");
                  tx9.setText("");
                 btn10.setVisible(false);
                 btn14.setVisible(true);
                  p6.setVisible(false);
                 p6.setVisible(true);
                }
                
              
                }catch(Exception e){
                   System.out.println(e);
                }
             } else if(r1.isSelected()){  
                try{
                    if(cd.length()<16 || cd.length()>16){
                      JOptionPane.showMessageDialog(null,"Card no should be of 16 digits");
                    }
                    else if(Character.isLetter(cd.charAt(0))||Character.isLetter(cd.charAt(1))||Character.isLetter(cd.charAt(2))||Character.isLetter(cd.charAt(3))||Character.isLetter(cd.charAt(4))||Character.isLetter(cd.charAt(5))||Character.isLetter(cd.charAt(6))||Character.isLetter(cd.charAt(7))||Character.isLetter(cd.charAt(8))||Character.isLetter(cd.charAt(9))||Character.isLetter(cd.charAt(10))||Character.isLetter(cd.charAt(11))||Character.isLetter(cd.charAt(12))||Character.isLetter(cd.charAt(13))||Character.isLetter(cd.charAt(14))||Character.isLetter(cd.charAt(15))){
                    JOptionPane.showMessageDialog(null,"Only Numeric value allowed in card.no ");
                    }
                    
                    else{
                        conn c2= new conn();
                         String q2="select * from flightschedule where date='"+p4l17.getText()+"' and f_code='"+p4l27.getText()+"'";
                       ResultSet rs= c2.s.executeQuery(q2);
                      if(rs.next()){
                          int seats=rs.getInt("Aseats");
                       if(seats <x1){
                           JOptionPane.showMessageDialog(null, "The flight is full/ No seats are avilable");
                       }
                       else{
                            
                            String q5= "select * from flight_info where fl_code='"+p4l27.getText()+"'";
                            rs=c2.s.executeQuery(q5);
                            if(rs.next()){
                                
                                seat1=rs.getInt("seats");
                              
                            }
                            int rv=seat1-Integer.parseInt(rc11);
                           seats=seats-x1;
                           rv=rv+1;
                           String q3="update flightschedule set Aseats='"+seats+"' where date='"+p4l17.getText()+"' and f_code='"+p4l27.getText()+"'";
                           c2.s.executeUpdate(q3);
                           
                       for(int i=0;i<x1;i++){
                           rv=rv+i;
                      String q1="insert into bookings values('"+p4l17.getText()+"','"+TicketNo[i]+"','"+rv+"','"+p4l27.getText()+"','"+name[i]+"','"+age[i]+"','"+address[i]+"','"+p4l5.getText()+"','"+p4l9.getText()+"','"+p4l12.getText()+"','"+p4l13.getText()+"','"+rc10+"','Confirm')";
                       c2.s.executeUpdate(q1);
                      String q ="insert into paymentdetail values('"+name[i]+"','"+TicketNo[i]+"','"+cd+"','NA','NA','"+rc8+"','"+st+"','"+m+"')";
                      c2.s.executeUpdate(q);
                          
                      }
                    c2.c.close();
                       }
                      }
                       
                      
                  JOptionPane.showMessageDialog(null,"Ticket Booking Successfull");
                  tx9.setText("");
                  tp2.setText("");
                 btn10.setVisible(false);
                 btn14.setVisible(true);
                  p6.setVisible(false);
                 p6.setVisible(true);
                }
                
              
                }catch(Exception e){
                   System.out.println(e);
                }
             }
              }
              
    } else if(ae.getSource()==btn11){
        
           
            p4l19.setText("");
            p4l21.setText("");
            p4l23.setText("");
            p4l25.setText("");
            p4l30.setText("");
            p4l14.setText("");
            p4l17.setText("");
            p4l5.setText("");
            p4l9.setText("");
            p4l13.setText("");
            p4l27.setText("");
            p4l9.setText("");
            
            if(x1==1){
            p4n2.setText("");
            p4n9.setText("");
            }
            else if (x1==2){
              p4n2.setText("");
            p4n9.setText("");
             p4n4.setText("");
            p4n11.setText("");
            
            }
            else if(x1==3){
            p4n2.setText("");
            p4n9.setText("");
             p4n4.setText("");
            p4n11.setText("");
            p4n6.setText("");
            p4n13.setText("");
            }
            p4.setVisible(false);
            p6.setVisible(false);
            p5.setVisible(true);
    } 
    else if(ae.getSource()==btn13){
            if(x1==2){
                p5l4.setVisible(false);
                 p5t4.setVisible(false);
                 p5l5.setVisible(false);
                  p5t5.setVisible(false);
                   p5l6.setVisible(false);
                    p5t6.setVisible(false);
              
              }
              else if(x1==3){
                   p5l4.setVisible(false);
                 p5t4.setVisible(false);
                 p5l5.setVisible(false);
                  p5t5.setVisible(false);
                   p5l6.setVisible(false);
                    p5t6.setVisible(false);
                   p5l7.setVisible(false); 
                 p5t7.setVisible(false);
                  p5l8.setVisible(false);
                  p5t8.setVisible(false);
                 p5l9.setVisible(false);
                    p5t9.setVisible(false);
                   
              }
         p5.setVisible(false);
         p1.setVisible(true);
    }
    else if(ae.getSource()==btn12){
        if(x1==1){
            boolean b=false,a=false;
          if(p5t1.getText().equals("") || p5t2.getText().equals("") || p5t3.getText().equals("")){JOptionPane.showMessageDialog(null, "Please enter data in all the fields ");}
     
          else{
              String s=p5t1.getText();
              String m=p5t2.getText();
              
              if(checkString(s)){JOptionPane.showMessageDialog(null,"Name should not contain any numeric value");}
              else if(checkAge(m)){JOptionPane.showMessageDialog(null,"Age should not contain any character value");}
              else{
              name[0]=p5t1.getText();
            age[0]=p5t2.getText();
            address[0]=p5t3.getText();
           
            p4n2=new JLabel(name[0]);
            p4n2.setBounds(700,90,100,50);
            p4n2.setForeground(new Color(10,10,10));
            p4n2.setFont(f5);
             p4.add(p4n2);
             
              try{
           
            conn c1=new conn();
        String q5="select * from bookings order by Ticket_no desc limit 1";
                       rs=c1.s.executeQuery(q5);
                       if(rs.next()){
                          Ticket=rs.getString("Ticket_no");
                         m1=Integer.parseInt(Ticket)+1;
                       }
                       for(int i=0;i<x1;i++){
                       ran=Integer.toString(m1);//convering into string
                        TicketNo[i]=ran;
                    m1++;
                       }
       }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
              p4n9=new JLabel(TicketNo[0]);
            p4n9.setBounds(930,90,100,50);
            p4n9.setForeground(new Color(10,10,10));
            p4n9.setFont(f5);
             p4.add(p4n9);
             
               p5.setVisible(false);
         p4.setVisible(true);
         p6.setVisible(true);
              }
          }
        }
        else if(x1==2){
            
            
          if(p5t1.getText().equals("") || p5t2.getText().equals("") || p5t3.getText().equals("") || p5t4.getText().equals("") || p5t5.getText().equals("") || p5t6.getText().equals("")){JOptionPane.showMessageDialog(null, "Please enter data in all the fields ");}
          else{
            String s=p5t1.getText();
              String m=p5t2.getText();
              String n=p5t4.getText();
              String o=p5t5.getText();
              
           if(checkString(s)){JOptionPane.showMessageDialog(null,"Name should not contain any numeric value");}
           else if(checkString(n)){JOptionPane.showMessageDialog(null,"Name should not contain any numeric value");}
              else if(checkAge(m)){JOptionPane.showMessageDialog(null,"Age should not contain any character value");}
            else if(checkAge(o)){JOptionPane.showMessageDialog(null,"Age should not contain any character value");}
            else{
           name[0]=p5t1.getText();
            age[0]=p5t2.getText();
            address[0]=p5t3.getText();
            name[1]=p5t4.getText();
            age[1]=p5t5.getText();
            address[1]=p5t6.getText();
            
             p4n2=new JLabel(name[0]);
            p4n2.setBounds(700,90,100,50);
            p4n2.setForeground(new Color(10,10,10));
            p4n2.setFont(f5);
             p4.add(p4n2);
             
              try{
           
            conn c1=new conn();
        String q5="select * from bookings order by Ticket_no desc limit 1";
                       rs=c1.s.executeQuery(q5);
                       if(rs.next()){
                          Ticket=rs.getString("Ticket_no");
                         m1=Integer.parseInt(Ticket)+1;
                       }
                       for(int i=0;i<x1;i++){
                       ran=Integer.toString(m1);//convering into string
                        TicketNo[i]=ran;
                    m1++;
                       }
       }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
             
              p4n9=new JLabel(TicketNo[0]);
            p4n9.setBounds(930,90,100,50);
            p4n9.setForeground(new Color(10,10,10));
            p4n9.setFont(f5);
             p4.add(p4n9);
           
            
             p4n3=new JLabel("Passenger-2-Name:");
             p4n3.setBounds(520,120,200,50);
             p4n3.setForeground(new Color(10,10,10));
             p4n3.setFont(f5);
             p4.add(p4n3);
             
              p4n4=new JLabel(name[1]);
            p4n4.setBounds(700,120,100,50);
            p4n4.setForeground(new Color(10,10,10));
            p4n4.setFont(f5);
             p4.add(p4n4);
             
              p4n10=new JLabel("Ticket No:");
              p4n10.setBounds(840,120,200,50);
              p4n10.setForeground(new Color(10,10,10));
              p4n10.setFont(f5);
              p4.add(p4n10);
              
            p4n11=new JLabel(TicketNo[1]);
            p4n11.setBounds(930,120,100,50);
            p4n11.setForeground(new Color(10,10,10));
            p4n11.setFont(f5);
             p4.add(p4n11);
             
             
               p5.setVisible(false);
         p4.setVisible(true);
         p6.setVisible(true);
            }
        }
        }
        else if(x1==3){
        if(p5t1.getText().equals("") || p5t2.getText().equals("") || p5t3.getText().equals("") || p5t4.getText().equals("") || p5t5.getText().equals("") || p5t6.getText().equals("") || p5t7.getText().equals("") || p5t8.getText().equals("") || p5t9.getText().equals("")){JOptionPane.showMessageDialog(null, "Please enter data in all the fields ");}
        else{
            
            String s=p5t1.getText();
              String m=p5t2.getText();
              String n=p5t4.getText();
              String o=p5t5.getText();
               String p=p5t7.getText();
              String q=p5t8.getText();
              
           if(checkString(s)){JOptionPane.showMessageDialog(null,"Name should not contain any numeric value");}
           else if(checkString(n)){JOptionPane.showMessageDialog(null,"Name should not contain any numeric value");}
              else if(checkAge(m)){JOptionPane.showMessageDialog(null,"Age should not contain any character value");}
            else if(checkAge(o)){JOptionPane.showMessageDialog(null,"Age should not contain any character value");}
             else if(checkString(p)){JOptionPane.showMessageDialog(null,"Name should not contain any numeric value");}
             else if(checkAge(q)){JOptionPane.showMessageDialog(null,"Age should not contain any character value");}
            else{
        name[0]=p5t1.getText();
            age[0]=p5t2.getText();
            address[0]=p5t3.getText();
            name[1]=p5t4.getText();
            age[1]=p5t5.getText();
            address[1]=p5t6.getText();
            name[2]=p5t7.getText();
            age[2]=p5t8.getText();
            address[2]=p5t9.getText();
            p4n5=new JLabel("Passenger-3-Name:");
             p4n5.setBounds(520,150,200,50);
             p4n5.setForeground(new Color(10,10,10));
             p4n5.setFont(f5);
             p4.add(p4n5);
             
              p4n6=new JLabel(name[2]);
            p4n6.setBounds(700,150,100,50);
            p4n6.setForeground(new Color(10,10,10));
            p4n6.setFont(f5);
             p4.add(p4n6);
             
              p4n2=new JLabel(name[0]);
            p4n2.setBounds(700,90,100,50);
            p4n2.setForeground(new Color(10,10,10));
            p4n2.setFont(f5);
             p4.add(p4n2);
            
             p4n3=new JLabel("Passenger-2-Name:");
             p4n3.setBounds(520,120,200,50);
             p4n3.setForeground(new Color(10,10,10));
             p4n3.setFont(f5);
             p4.add(p4n3);
             
              p4n4=new JLabel(name[1]);
            p4n4.setBounds(700,120,100,50);
            p4n4.setForeground(new Color(10,10,10));
            p4n4.setFont(f5);
             p4.add(p4n4);
             
              try{
           
            conn c1=new conn();
        String q5="select * from bookings order by Ticket_no desc limit 1";
                       rs=c1.s.executeQuery(q5);
                       if(rs.next()){
                          Ticket=rs.getString("Ticket_no");
                         m1=Integer.parseInt(Ticket)+1;
                       }
                       for(int i=0;i<x1;i++){
                       ran=Integer.toString(m1);//convering into string
                        TicketNo[i]=ran;
                    m1++;
                    
                    
                       }
       }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
             
              p4n9=new JLabel(TicketNo[0]);
            p4n9.setBounds(930,90,100,50);
            p4n9.setForeground(new Color(10,10,10));
            p4n9.setFont(f5);
             p4.add(p4n9);
             
              p4n10=new JLabel("Ticket No:");
              p4n10.setBounds(840,120,200,50);
              p4n10.setForeground(new Color(10,10,10));
              p4n10.setFont(f5);
              p4.add(p4n10);
              
            p4n11=new JLabel(TicketNo[1]);
            p4n11.setBounds(930,120,100,50);
            p4n11.setForeground(new Color(10,10,10));
            p4n11.setFont(f5);
             p4.add(p4n11);
             
              p4n12=new JLabel("Ticket No:");
              p4n12.setBounds(840,150,200,50);
              p4n12.setForeground(new Color(10,10,10));
              p4n12.setFont(f5);
              p4.add(p4n12);
              
            p4n13=new JLabel(TicketNo[2]);
            p4n13.setBounds(930,150,100,50);
            p4n13.setForeground(new Color(10,10,10));
            p4n13.setFont(f5);
             p4.add(p4n13);
             
             
               p5.setVisible(false);
         p4.setVisible(true);
         p6.setVisible(true);
        }
        }
        }
      
        
       
        
    }else if(ae.getSource()==btn5){
      f.setVisible(false);
       new EmployeeOptionDesign();
    }else if(ae.getSource()==btn14){
      f.setVisible(false);
       new printTicketDesign();
    }else if(ae.getSource()==r2){
              p4l31.setText("Cheque No:");
              p4l32.setVisible(false);
              tp2.setVisible(false);
              p6.setVisible(false);
              p6.setVisible(true);
              
    }else if(ae.getSource()==r3){
              p4l31.setText("UPI ID:");
              tp2.setVisible(false);
               p4l32.setVisible(false);
              p6.setVisible(false);
              p6.setVisible(true);
              
    }else if(ae.getSource()==r1){
              p4l31.setText("Card No");
              p4l32.setVisible(true);
              tx9.setVisible(true);
              tp2.setVisible(true);
              p6.setVisible(false);
              p6.setVisible(true);
              
    }
         
    
    }
    public boolean checkString(String v){
        boolean b=false;
        String s=v;
    char [] char1=s.toCharArray();
              for(char c:char1){
              if(Character.isDigit(c)){
              return true;
              }            
              }
        
      return false; 
    }
    public boolean checkAge(String z){
       boolean b=false;
       String s=z;
       char [] char1=s.toCharArray();
              for(char c:char1){
              if(Character.isLetter(c)){
              return true;
              }            
              }
       
        return false;
    }
     
}
public class MainFrame {
    public static void main(String args[])
    {
        new MainFrameDesign1();
    }        
}
