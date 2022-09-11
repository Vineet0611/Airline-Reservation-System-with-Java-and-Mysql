/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.reservation.system;

import com.mysql.cj.protocol.Resultset;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author vineet mendon
 */
 class printTicketDesign extends JPanel implements ActionListener{
    JFrame f;
    JPanel p,p1,p3;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,
            l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43;
    JTextField tx1,tx2;
   Graphics g;
    JButton btn1,btn2,btn3,btn4,btn5;
    Font f1,f2,f3,f4,f5,f6,f7,f8;
    JTable t;
    JScrollPane sp;
    String r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14;
 
      public printTicketDesign()
     {
        f=new JFrame("Airline  Reservation System");        
        Dimension sz=Toolkit.getDefaultToolkit().getScreenSize();
        
          ImageIcon icon1 =new ImageIcon((ClassLoader.getSystemResource("airline/reservation/system/image/vin9.png")));
        Image newimg = icon1.getImage().getScaledInstance(64,64, java.awt.Image.SCALE_SMOOTH);
        icon1=new ImageIcon(newimg);
        f.setIconImage(newimg);
        
        f1=new Font("Castellar",Font.BOLD,45);
        f2=new Font("Harrington",Font.BOLD,25);
        f3=new Font("Cooper",Font.PLAIN,30);
        f4=new Font("Castellar",Font.BOLD,20);
        f5=new Font("Cooper",Font.PLAIN,18);
        f6=new Font("Cooper",Font.PLAIN,15);
        f7=new Font("Cooper",Font.PLAIN,25);
         f8=new Font("Cooper",Font.PLAIN,13);
        l2=new JLabel("FLY SAFE");
        l2.setBounds(550,1,400,50);
        l2.setForeground(new Color(2, 28, 27));
        l2.setFont(f1);
        f.add(l2);

        l3=new JLabel("Explore  The  World  With  Us");
        l3.setBounds(500,40,400,40);
        l3.setForeground(new Color(2, 28, 27));
        l3.setFont(f2);
        f.add(l3);

        l1=new JLabel("");
        //l1.setIcon(new ImageIcon("C:\\Users\\vineet mendon\\Desktop\\website templates\\vin3.jpg"));
        l1.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/reservation/system/image/vin4.jpg")));
        l1.setBounds(0,0,sz.width,sz.height);
        
        
        
        
      //-------------------------------panel 2 /your bookings----------------------------
         p1=new JPanel();
         p1.setBounds(410,150,500,350);
         p1.setLayout(null);
         p1.setVisible(true);
         p1.setOpaque(true);
         p1.setBackground(new Color(225,225,225,75));
          
         f.add(p1);
         
         
        l7=new JLabel(" Print Ticket");
        l7.setBounds(150,40,300,50);
        l7.setForeground(new Color(10,10,10));
        l7.setFont(f3);
        p1.add(l7);
         
        l4=new JLabel(" Enter Details");
        l4.setBounds(40,100,300,50);
        l4.setForeground(new Color(10,10,10));
        l4.setFont(f5);
        p1.add(l4);
        
        l5=new JLabel("Enter Ticket_No:");
        l5.setBounds(40,150,200,50);
        l5.setForeground(new Color(10,10,10));
        l5.setFont(f5);
        p1.add(l5);
        
        tx1=new JTextField();
        tx1.setBounds(180,160,200,30);
        tx1.setFont(f5);
        p1.add(tx1);
        
         l41=new JLabel("");
        l41.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/reservation/system/image/vin7.png")));
        l41.setBounds(310,25,64,64);
        p1.add(l41);
        
        btn1=new JButton("Back");
        btn1.setBounds(40,280,200,25);
        btn1.setFont(f6);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        btn1.setFocusable(false);
        btn1.setBorderPainted(false);
        p1.add(btn1);
        btn1.addActionListener(this);
        
        btn2=new JButton("Submit");
        btn2.setBounds(270,280,200,25);
        btn2.setFont(f6);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        btn2.setFocusable(false);
        btn2.setBorderPainted(false);
        p1.add(btn2);
        btn2.addActionListener(this);
         
      
       //------------------------------------panel 3 Ticket--------------------------//
       
        p3=new JPanel();
        p3.setBounds(370,90,600,590);
        p3.setLayout(null);
        p3.setVisible(false);
        p3.setOpaque(true);
        p3.setBackground(new Color(225,225,225,150));
        
        f.add(p3);
        l30=new JLabel("");
        l30.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/reservation/system/image/vin9.png")));
        l30.setBounds(130,5,64,64);
        p3.add(l30);
        
        
        l41=new JLabel("");
        l41.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/reservation/system/image/vin7.png")));
        l41.setBounds(330,110,64,64);
        p3.add(l41);
                
       
        
        l8=new JLabel("FLY SAFE AIRWAYS");
        l8.setBounds(210,5,300,50);
        l8.setForeground(new Color(10,10,10));
        l8.setFont(f4);
        p3.add(l8);
        
        l31=new JLabel("Guest Name:");
        l31.setBounds(40,60,200,50);
        l31.setForeground(new Color(10,10,10));
        l31.setFont(f5);
        p3.add(l31);
        
        
        l9=new JLabel("Booking Date:");
        l9.setBounds(330,60,200,50);
        l9.setForeground(new Color(10,10,10));
        l9.setFont(f5);
        p3.add(l9);
        
        l33=new JLabel("Flight Details");
        l33.setBounds(40,110,200,50);
        l33.setForeground(new Color(10,10,10));
        l33.setFont(f7);
        p3.add(l33);
        
        l34=new JLabel("ROUTE");
        l34.setBounds(40,135,200,50);
        l34.setForeground(new Color(10,10,10));
        l34.setFont(f6);
        p3.add(l34);
        
        l10=new JLabel("From:");
        l10.setBounds(40,170,100,50);
        l10.setForeground(new Color(10,10,10));
        l10.setFont(f5);
        p3.add(l10);
        
        l11=new JLabel("Dept.Date:");
        l11.setBounds(200,170,100,50);
        l11.setForeground(new Color(10,10,10));
        l11.setFont(f5);
        p3.add(l11);
        
        l15=new JLabel("Dept.Time:");
        l15.setBounds(390,170,100,50);
        l15.setForeground(new Color(10,10,10));
        l15.setFont(f5);
        p3.add(l15);
          
        l12=new JLabel("TO:");
        l12.setBounds(40,220,100,50);
        l12.setForeground(new Color(10,10,10));
        l12.setFont(f5);
        p3.add(l12);
        
         l11=new JLabel("Arri.Date:");
        l11.setBounds(200,220,100,50);
        l11.setForeground(new Color(10,10,10));
        l11.setFont(f5);
        p3.add(l11);
//        
        l13=new JLabel("Arri.Time:");
        l13.setBounds(390,220,100,50);
        l13.setForeground(new Color(10,10,10));
        l13.setFont(f5);
        p3.add(l13);
       
        l14=new JLabel("Seat Class:");
        l14.setBounds(40,270,200,50);
        l14.setForeground(new Color(10,10,10));
        l14.setFont(f5);
        p3.add(l14);
        
       
        
        l16=new JLabel("Flight_No:");
        l16.setBounds(200,270,200,50);
        l16.setForeground(new Color(10,10,10));
        l16.setFont(f5);
        p3.add(l16);
        
        l24=new JLabel("Ticket_No:");
        l24.setBounds(390,270,200,50);
        l24.setForeground(new Color(10,10,10));
        l24.setFont(f5);
        p3.add(l24);
        
        l30=new JLabel("Status:");
        l30.setBounds(40,320,200,50);
        l30.setForeground(new Color(10,10,10));
        l30.setFont(f5);
        p3.add(l30);
         
        l26=new JLabel("Seat_No:");
        l26.setBounds(200,320,200,50);
        l26.setForeground(new Color(10,10,10));
        l26.setFont(f5);
        p3.add(l26);
        
        l35=new JLabel("Important Information:");
        l35.setBounds(40,370,200,50);
        l35.setForeground(new Color(10,10,10));
        l35.setFont(f5);
        p3.add(l35);
        
        l36=new JLabel("* Passengers are required to bring this Itinerary/Receipt along with an official ID with photo");
        l36.setBounds(40,388,550,50);
        l36.setForeground(new Color(10,10,10));
        l36.setFont(f8);
        p3.add(l36);
        
        l37=new JLabel("issued by the government or known corporations upon entering the terminal.");
        l37.setBounds(50,406,550,50);
        l37.setForeground(new Color(10,10,10));
        l37.setFont(f8);
        p3.add(l37);
        
        l38=new JLabel("* The airline may contact the card holder or the passenger for verification of their payment, and ");
        l38.setBounds(40,424,550,50);
        l38.setForeground(new Color(10,10,10));
        l38.setFont(f8);
        p3.add(l38);
        
         l39=new JLabel("and in case the airline suspects or has a reason to believe that the ticket(s) purchased");
        l39.setBounds(50,442,550,50);
        l39.setForeground(new Color(10,10,10));
        l39.setFont(f8);
        p3.add(l39);
        
        l40=new JLabel("were made fraudulently, the airline may cancel the reservation made by the passenger.");
        l40.setBounds(50,460,550,50);
        l40.setForeground(new Color(10,10,10));
        l40.setFont(f8);
        p3.add(l40);
        
        l41=new JLabel("THANK YOU FOR MAKING US YOUR AIRLINE OF CHOICE.");
        l41.setBounds(50,483,550,50);
        l41.setForeground(new Color(10,10,10));
        l41.setFont(f5);
        p3.add(l41);
        
        l42=new JLabel("VIST AGAIN.");
        l42.setBounds(245,501,550,50);
        l42.setForeground(new Color(10,10,10));
        l42.setFont(f5);
        p3.add(l42);
        
//        
        btn5=new JButton("Back");
        btn5.setBounds(200,550,200,25);
        btn5.setFont(f6);
        btn5.setBackground(Color.BLACK);
        btn5.setForeground(Color.WHITE);
        btn5.setFocusable(false);
        btn5.setBorderPainted(false);
        p3.add(btn5);
        btn5.addActionListener(this);
        
     
       
        f.add(l1);
        f.setSize(sz.width,sz.height);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
      
       
      
      public void actionPerformed(ActionEvent ae){
       
         if(ae.getSource()==btn1){
            f.setVisible(false);
            new EmployeeOptionDesign();
         }
        
          else if(ae.getSource()==btn2){
            String s1=tx1.getText();
           // String s2=tx2.getText();
            
            
            if(s1.equals("") ){JOptionPane.showMessageDialog(null, "Please Enter Ticket No ");}
            else{ 
                try{
                    conn c1=new conn();
                    String q2="select * from paymentdetail where ticket_no='"+s1+"'";
                     ResultSet rs=c1.s.executeQuery(q2);
                    if(rs.next()){
                     r13=rs.getString("date");
                    }
                    String q1="select * from bookings where Ticket_no='"+s1+"'";
                     rs=c1.s.executeQuery(q1);
                    if(rs.next()){
                       r1=rs.getString("date");
                          r2=rs.getString("Ticket_no");
                          r3=rs.getString("Flight_code");
                            r4=rs.getString("passenger_name").toUpperCase();
                            r5=rs.getString("age");
                              r6=rs.getString("address");
                               r7=rs.getString("deparAt").toUpperCase();
                               r8=rs.getString("deptTime");
                                r9=rs.getString("ArriAt").toUpperCase();
                                 r10=rs.getString("arritime");
                                   r11=rs.getString("class").toUpperCase();
                                   r12=rs.getString("status").toUpperCase();
                                   r14=rs.getString("seat_no");
                                   
                                   
                                   
             p1.setVisible(false);
             l17=new JLabel(r4);//passenger_name
             l17.setBounds(40,78,200,50);
             l17.setForeground(new Color(10,10,10));
             l17.setFont(f6);
             p3.add(l17); 
             
             l32=new JLabel(r13);//booking date
             l32.setBounds(330,78,200,50);
             l32.setForeground(new Color(10,10,10));
             l32.setFont(f6);
             p3.add(l32); 
             
             
         
          l11=new JLabel(r7);//Departure at
          l11.setBounds(40,188,100,50);
          l11.setForeground(new Color(10,10,10));
          l11.setFont(f6);
          p3.add(l11); 
          
          l22=new JLabel(r1);//Date
          l22.setBounds(200,188,100,50);
          l22.setForeground(new Color(10,10,10));
          l22.setFont(f6);
          p3.add(l22);
          
            l23=new JLabel(r8);//Departure time
          l23.setBounds(390,188,100,50);
          l23.setForeground(new Color(10,10,10));
          l23.setFont(f6);
          p3.add(l23);
         
          l18=new JLabel(r9);//Arrival at
          l18.setBounds(40,238,100,50);
          l18.setForeground(new Color(10,10,10));
          l18.setFont(f6);
          p3.add(l18);
          
          l34=new JLabel(r1);//Date
          l34.setBounds(200,238,100,50);
          l34.setForeground(new Color(10,10,10));
          l34.setFont(f6);
          p3.add(l34);
         
          l19=new JLabel(r10);//Arrival Time
          l19.setBounds(390,238,100,50);
          l19.setForeground(new Color(10,10,10));
          l19.setFont(f6);
          p3.add(l19);
          
           l21=new JLabel(r11);// class
          l21.setBounds(40,288,200,50);
          l21.setForeground(new Color(10,10,10));
          l21.setFont(f6);
          p3.add(l21);
          
          l20=new JLabel(r3);//Flight_code
          l20.setBounds(200,288,100,50);
          l20.setForeground(new Color(10,10,10));
          l20.setFont(f6);
          p3.add(l20);
          
           l25=new JLabel(r2);//Ticket No
          l25.setBounds(390,288,300,50);
          l25.setForeground(new Color(10,10,10));
          l25.setFont(f6);
          p3.add(l25);
          
         
          l31=new JLabel(r12);//status
          l31.setBounds(40,338,100,50);
          l31.setForeground(new Color(10,10,10));
          l31.setFont(f6);
          p3.add(l31);
          
        l26=new JLabel(r14);//seat no
        l26.setBounds(200,338,200,50);
        l26.setForeground(new Color(10,10,10));
        l26.setFont(f6);
        p3.add(l26);
//         
           p3.setVisible(true);
           
                  
                    }
                    else{JOptionPane.showMessageDialog(null, "No Ticket Found ");}
                    
                }catch(Exception e){
                  JOptionPane.showMessageDialog(null, e);
                }
          
         
           
          
          
         
            }
     }
      else if(ae.getSource()==btn5){
          l31.setText("");
         l26.setText("");
         l22.setText("");
         l23.setText("");
         l25.setText("");
         l21.setText("");
         l20.setText("");
         l19.setText("");
         l18.setText("");
         l11.setText("");
         l32.setText("");
         l17.setText("");
         l34.setText("");
         p3.setVisible(false);
         p1.setVisible(true);
         }
 
 }
   
 }
      
public class PrintTicket {
   public static void main(String args[]){
       new printTicketDesign();
   }
    
}
