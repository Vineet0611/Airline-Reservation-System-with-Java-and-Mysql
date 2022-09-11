/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.reservation.system;

/**
 *
 * @author vineet mendon
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;


class PaymentDetailsDesign extends JFrame implements ActionListener{
    JFrame f;
    JPanel p,p1,p2;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23;
    JTextField tx1;
    JPasswordField tp1;
    JButton btn1,btn2,btn3,btn4,btn5;
    Font f1,f2,f3,f4,f5,f6;
   
   String r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13;
   
    
    public PaymentDetailsDesign(){
       f=new JFrame("Airline  Reservation System");        
        Dimension sz=Toolkit.getDefaultToolkit().getScreenSize();
        
          ImageIcon icon1 =new ImageIcon((ClassLoader.getSystemResource("airline/reservation/system/image/vin9.png")));
        Image newimg = icon1.getImage().getScaledInstance(64,64, java.awt.Image.SCALE_SMOOTH);
        icon1=new ImageIcon(newimg);
        f.setIconImage(newimg);
        
        f1=new Font("Castellar",Font.BOLD,45);
        f2=new Font("Harrington",Font.BOLD,25);
        f3=new Font("Cooper",Font.PLAIN,30);
        f4=new Font("Cooper",Font.PLAIN,15);
        f5=new Font("Cooper",Font.PLAIN,18);
        f6=new Font("Cooper",Font.PLAIN,13);
        
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
        
         p1=new JPanel();
         p1.setBounds(410,150,500,350);
         p1.setLayout(null);
         p1.setVisible(true);
         p1.setOpaque(true);
         p1.setBackground(new Color(225,225,225,75));
         f.add(p1);
         
        l7=new JLabel(" Payment Details");
        l7.setBounds(150,1,300,50);
        l7.setForeground(new Color(10,10,10));
        l7.setFont(f3);
        p1.add(l7);
         
        l4=new JLabel(" Enter Details");
        l4.setBounds(40,40,300,50);
        l4.setForeground(new Color(10,10,10));
        l4.setFont(f5);
        p1.add(l4);
        
        l5=new JLabel("Enter Ticket_No:");
        l5.setBounds(40,100,200,50);
        l5.setForeground(new Color(10,10,10));
        l5.setFont(f5);
        p1.add(l5);
        
        tx1=new JTextField();
        tx1.setBounds(180,110,200,30);
        tx1.setFont(f5);
        p1.add(tx1);
        
        
        
        btn1=new JButton("Back");
        btn1.setBounds(40,240,200,25);
        btn1.setFont(f4);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        btn1.setFocusable(false);
        btn1.setBorderPainted(false);
        p1.add(btn1);
        btn1.addActionListener(this);
        
        btn2=new JButton("Submit");
        btn2.setBounds(270,240,200,25);
        btn2.setFont(f4);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        btn2.setFocusable(false);
        btn2.setBorderPainted(false);
        p1.add(btn2);
        btn2.addActionListener(this);
        
        
       
        //-------------------------------panal 3
        
         p2=new JPanel();
         p2.setBounds(350,150,600,300);
         p2.setLayout(null);
         p2.setVisible(false);
         p2.setOpaque(true);
         p2.setBackground(new Color(225,225,225,75));
         f.add(p2);
         
        l9=new JLabel("Payment Details");
        l9.setBounds(175,20,300,50);
        l9.setForeground(new Color(10,10,10));
        l9.setFont(f3);
        p2.add(l9);
        
       
        
     
        
        l12=new JLabel("Passenger Name:");
        l12.setBounds(40,80,200,50);
        l12.setForeground(new Color(10,10,10));
        l12.setFont(f5);
        p2.add(l12);
        
        l13=new JLabel("label4");
        l13.setBounds(190,80,300,50);
        l13.setForeground(new Color(10,10,10));
        l13.setFont(f5);
        p2.add(l13);
        
        l14=new JLabel("Ticket_No:");
        l14.setBounds(40,110,200,50);
        l14.setForeground(new Color(10,10,10));
        l14.setFont(f5);
        p2.add(l14);
        
        l15=new JLabel("label5");
        l15.setBounds(190,110,300,50);
        l15.setForeground(new Color(10,10,10));
        l15.setFont(f5);
        p2.add(l15);
        
        l16=new JLabel("Amount Paid:");
        l16.setBounds(320,80,200,50);
        l16.setForeground(new Color(10,10,10));
        l16.setFont(f5);
        p2.add(l16);
        
        l17=new JLabel("label6");
        l17.setBounds(470,80,300,50);
        l17.setForeground(new Color(10,10,10));
        l17.setFont(f5);
        p2.add(l17);
        
        l18=new JLabel("Card No:");
        l18.setBounds(40,170,200,50);
        l18.setForeground(new Color(10,10,10));
        l18.setFont(f5);
        p2.add(l18);
        
        l19=new JLabel("label7");
        l19.setBounds(190,170,200,50);
        l19.setForeground(new Color(10,10,10));
        l19.setFont(f5);
        p2.add(l19);

        
        
        l22=new JLabel("Payment Date:");
        l22.setBounds(40,140,200,50);//60,150,200,50
        l22.setForeground(new Color(10,10,10));
        l22.setFont(f5);
        p2.add(l22);
        
        l23=new JLabel("label1");//card no
        l23.setBounds(190,140,400,50);
        l23.setForeground(new Color(10,10,10));
        l23.setFont(f5);
        p2.add(l23);
        
        l20=new JLabel("Payment Time:");
        l20.setBounds(320,110,200,50);
        l20.setForeground(new Color(10,10,10));
        l20.setFont(f5);
        p2.add(l20);
        
        l21=new JLabel("label2");
        l21.setBounds(470,110,300,50);
        l21.setForeground(new Color(10,10,10));
        l21.setFont(f5);
        p2.add(l21);
         
        btn5=new JButton("Back");
        btn5.setBounds(175,250,250,25);
        btn5.setFont(f4);
        btn5.setBackground(Color.BLACK);
        btn5.setForeground(Color.WHITE);
        btn5.setFocusable(false);
        btn5.setBorderPainted(false);
        btn5.addActionListener(this);
        p2.add(btn5);
         
        
        
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
                    String q1="select * from paymentdetail where Ticket_no='"+s1+"'";
                    ResultSet rs=c1.s.executeQuery(q1);
                    if(rs.next()){
                       r1=rs.getString("name");
                          r2=rs.getString("Ticket_no");
                          r3=rs.getString("card_no");
                            r4=rs.getString("amount");
                            r8=rs.getString("cheque_no");
                            r9=rs.getString("upi_id");
                              r6=rs.getString("date");
                               r7=rs.getString("time");
                               
                                   l13.setText(r1);
                                   l15.setText(r2);
                                   l17.setText(r4);
                                   if(r8.equals("NA") && r9.equals("NA")){
                                       l18.setText("Card No:");
                                       l19.setText(r3);}
                                   else if(r3.equals("NA") && r9.equals("NA"))
                                   { 
                                       l18.setText("Cheque No:");
                                       l19.setText(r8);
                                   
                                   }
                                   else if(r3.equals("NA") && r8.equals("NA"))
                                   
                                   {
                                        l18.setText("UPI ID:");
                                       l19.setText(r9);
                                   
                                   }
                                   l23.setText(r6);
                                   l21.setText(r7);

                                   
                                   
                                    p1.setVisible(false);
                                     p2.setVisible(true);
                                
                    }
                    else{JOptionPane.showMessageDialog(null, "No Ticket Found ");}
                    
                }catch(Exception e){
                  JOptionPane.showMessageDialog(null, e);
                }
            }
       
           
        }
         else if(ae.getSource()==btn5){
         
           l15.setText("");
            l13.setText("");
             l18.setText("");
              l17.setText("");
               l23.setText("");
                l21.setText("");
              p2.setVisible(false);
                p1.setVisible(true);
        }

    }
}
public class PaymentDetails {
    public static void main(String args[]){
    new PaymentDetailsDesign();
    }
    
}
