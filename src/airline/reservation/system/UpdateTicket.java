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
import net.proteanit.sql.DbUtils;
import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
class UpdateTicketDesign extends JFrame implements ActionListener {
     JFrame f;
    JPanel p,p1,p2,p6;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23;
    JTextField tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9;
    JPasswordField tp1,tp2;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn11,btn10,btn14;
    Font f1,f2,f3,f4,f5,f6;
    int a1,a2,a3,a4,seat1,seats;
    JTable t;
    JScrollPane sp;
     JRadioButton rb1,rb2,rb3;
     JLabel p4l30,p4l28,p4l29,p4l31,p4l32;
     
      String r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
      String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
     JComboBox c6;
     JDateChooser d;
    
    public UpdateTicketDesign(){
        
         f=new JFrame("Airline Reservation System");        
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
        
       
        
        
        //------------------------------panel 1
        
         
          p1=new JPanel();
         p1.setBounds(410,150,500,350);
         p1.setLayout(null);
         p1.setVisible(true);
         p1.setOpaque(true);
         p1.setBackground(new Color(225,225,225,75));
         f.add(p1);
         
        l7=new JLabel(" Update Ticket");
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
         
         
       
       
        //--------------------------------panel
        
          p2=new JPanel();
        p2.setBounds(390,100,600,500);
        p2.setLayout(null);
        p2.setVisible(false);
        p2.setOpaque(true);
        p2.setBackground(new Color(225,225,225,75));
        f.add(p2);
        l4=new JLabel("Update Details");
        l4.setBounds(200,10,300,50);
        l4.setForeground(new Color(10,10,10));
        l4.setFont(f3);
        p2.add(l4);
        
        l5=new JLabel("Passenger Name:");
        l5.setBounds(40,60,200,50);
        l5.setForeground(new Color(10,10,10));
        l5.setFont(f5);
        p2.add(l5);
        
        tx2=new JTextField();
        tx2.setBounds(200,70,250,30);
        tx2.setFont(f5);
        p2.add(tx2);
        
        l6=new JLabel("age:");
        l6.setBounds(40,110,300,50);
        l6.setForeground(new Color(10,10,10));
        l6.setFont(f5);
        p2.add(l6);
        
        tx3=new JTextField();
        tx3.setBounds(200,115,250,30);
        tx3.setFont(f5);
        p2.add(tx3);
        
        l7=new JLabel("Address:");
        l7.setBounds(40,160,300,50);
        l7.setForeground(new Color(10,10,10));
        l7.setFont(f5);
        p2.add(l7);
        
        tx4=new JTextField();
        tx4.setBounds(200,165,250,30);
        tx4.setFont(f5);
        p2.add(tx4);
        
        l8=new JLabel("Departure At:");
        l8.setBounds(40,210,300,50);
        l8.setForeground(new Color(10,10,10));
        l8.setFont(f5);
        p2.add(l8);
        
        tx5=new JTextField();
        tx5.setBounds(200,215,250,30);
        tx5.setFont(f5);
        p2.add(tx5);
        
        l9=new JLabel("Arrival At:");
        l9.setBounds(40,260,300,50);
        l9.setForeground(new Color(10,10,10));
        l9.setFont(f5);
        p2.add(l9);
        
        tx6=new JTextField();
        tx6.setBounds(200,265,250,30);
        tx6.setFont(f5);
        p2.add(tx6);
        
        l10=new JLabel("Date:");
        l10.setBounds(40,320,300,50);
        l10.setForeground(new Color(10,10,10));
        l10.setFont(f5);
        p2.add(l10);
        
        d=new JDateChooser();
        d.setBounds(200,325,250,25);
        d.setFont(f5);
        p2.add(d);
        
        l11=new JLabel("Class:");
        l11.setBounds(40,380,300,50);
        l11.setForeground(new Color(10,10,10));
        l11.setFont(f5);
        p2.add(l11);
        
        String []str5={"Economy","Business","First","Premium Economy"};
        c6=new JComboBox(str5);
        c6.setBounds(200,385,250,25);
        c6.setFont(f5);
        p2.add(c6);
        
        btn7=new JButton("Back");
        btn7.setBounds(100,440,150,25);
        btn7.setFont(f4);
        btn7.setBackground(Color.BLACK);
        btn7.setForeground(Color.WHITE);
        btn7.setFocusable(false);
        btn7.setBorderPainted(false);
        btn7.addActionListener(this);
        p2.add(btn7);
//        
        btn6=new JButton("Update");
        btn6.setBounds(300,440,150,25);
        btn6.setFont(f4);
        btn6.setBackground(Color.BLACK);
        btn6.setForeground(Color.WHITE);
        btn6.setFocusable(false);
        btn6.setBorderPainted(false);
        btn6.addActionListener(this);
        p2.add(btn6);
        
        p6=new JPanel();
        p6.setBounds(120,180,1100,350);
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
        
        rb1=new JRadioButton("Card");
        rb1.setFont(f5);
        rb1.setForeground(new Color(10,10,10));
        rb1.setBorderPainted(false);
        rb1.setFocusable(false);
        rb1.setBounds(360,100,70,30);
        rb1.setSelected(true);
        rb1.addActionListener(this);
        
        p6.add(rb1);
        
        rb2=new JRadioButton("Cheque");
        rb2.setFont(f5);
        rb2.setForeground(new Color(10,10,10));
        rb2.setBorderPainted(false);
        rb2.setFocusable(false);
        rb2.setBounds(450,100,100,30);
        rb2.addActionListener(this);
        p6.add(rb2);
        
        rb3=new JRadioButton("UPI/Gpay");
        rb3.setFont(f5);
        rb3.setForeground(new Color(10,10,10));
        rb3.setBorderPainted(false);
        rb3.setFocusable(false);
        rb3.setBounds(570,100,130,30);
        rb3.addActionListener(this);
        p6.add(rb3);
        
        ButtonGroup bg5=new ButtonGroup();
        bg5.add(rb1);
        bg5.add(rb2);
        bg5.add(rb3);
       
        
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
        
        btn11=new JButton("Cancel");
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
           
             s1=tx1.getText();
           // String s2=tx2.getText();
            
            if(s1.equals("") ){JOptionPane.showMessageDialog(null, "Please Enter Ticket No ");}
             
           
                try{
                    conn c1=new conn();
                    String q1="select * from bookings where Ticket_no='"+s1+"'";
                    ResultSet rs=c1.s.executeQuery(q1);
                    if(rs.next()){
                       r1=rs.getString("date");
                          r2=rs.getString("Ticket_no");
                          r13=rs.getString("seat_no");
                          r3=rs.getString("Flight_code");
                            r4=rs.getString("passenger_name");
                            r5=rs.getString("age");
                              r6=rs.getString("address");
                               r7=rs.getString("deparAt");
                               r8=rs.getString("deptTime");
                                r9=rs.getString("ArriAt");
                                 r10=rs.getString("arritime");
                                   r11=rs.getString("class");
                                   r12=rs.getString("status");
                                    LocalDateTime dt = LocalDateTime.now();
                                    LocalTime lt =LocalTime.now();
                                    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                    String st =dt.format(df);
                                    java.util.Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(st);
                                   java.util.Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(r1);
                                   int ti=date2.compareTo(date1);
                                   if(ti<0){JOptionPane.showMessageDialog(null,"Sorry the Flight is Departed for the given Ticket Number \n No update or Refund is possible");}
                                   else{
                                   tx2.setText(r4);
                                   tx3.setText(r5);
                                   tx4.setText(r6);
                                   tx5.setText(r7);
                                   tx6.setText(r9);
                                   c6.setSelectedItem(r11);
                                   java.util.Date date = new SimpleDateFormat("dd/MM/yyyy").parse(r1);
                                      d.setDate(date);
                                   

                                   
                                   
                                    p1.setVisible(false);
                                     p2.setVisible(true);
                    
                                   }
                    }
                    else{JOptionPane.showMessageDialog(null, "No Ticket Found ");}
                    
                }catch(Exception e){
                  JOptionPane.showMessageDialog(null, e);
                }
       }
       
       else if(ae.getSource()==btn6){
        n1=tx2.getText();//name
        n2=tx3.getText();//age
        n3=tx4.getText();//address
        n4=tx5.getText();//dept
        n5=tx6.getText();//arival
        n6=c6.getSelectedItem().toString();//class 
       SimpleDateFormat sformat=new SimpleDateFormat("dd/MM/yyyy");
        n7=sformat.format(d.getDate());//date
       
       try{
           conn c1=new conn();
           String q="select * from flightschedule where date='"+n7+"' and DeptAt='"+n4+"' and ArriAt='"+n5+"' and class_name='"+n6+"'";
           ResultSet rs=c1.s.executeQuery(q);
           if(rs.next()){
               seats=rs.getInt("Aseats");
            if(rs.getInt("Aseats")>0){
                
                n8=rs.getString("f_code");//flight code
                 n9=rs.getString("DeptTime");
                 n10=rs.getString("ArriTime");
                //String n11=rs.getString("Duration");
                LocalDateTime dt = LocalDateTime.now();
                LocalTime lt =LocalTime.now();
                DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String st =dt.format(df);// current date
                 java.util.Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(st);  
                  java.util.Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(n7); 
                   long diff = date2.getTime() - date1.getTime();
               long diffHours = diff / (60 * 60 * 1000);
             

               int db = JOptionPane.YES_NO_OPTION;
             
               if(diffHours>96){db = JOptionPane.showConfirmDialog (null, "₹2500 Will be Deducted As A Cancellation Charge \n Do You Still Want To Cancel Ticket","WARNING", db);}
              else if(diffHours<96 && diffHours>24){db = JOptionPane.showConfirmDialog (null, "₹3000 Will be Deducted As A Cancellation Charge \n Do You Still Want To Cancel Ticket","WARNING", db);}
              else if(diffHours<=24 ){db = JOptionPane.showConfirmDialog (null, "No Refund Possible Entire Amount Will Be Deducted As Cancelation Charge \n Do You Still Want To Cancel Ticket","WARNING", db);}
               if(db == JOptionPane.YES_OPTION){
              if(!r7.equals(n4)||!r9.equals(n5)||!r1.equals(n7)||!r11.equals(n6)){
                  int i=0;
                String q3="delete from bookings where Ticket_no='"+r2+"'";//deleting the old ticket
                  c1.s.executeUpdate(q3);
                  
                  String q4="Select * from flightschedule where f_code='"+r3+"' and date='"+r1+"'";//getting the seatcount
                 rs=c1.s.executeQuery(q4);
                 if(rs.next()){
                      i=rs.getInt("Aseats");
                     
                    i++;
                    
                 String q5="update flightschedule set Aseats='"+i+"' where   f_code='"+r3+"'  and date='"+r1+"'";//increasing the seat count
                 c1.s.executeUpdate(q5);
                 }
                 JOptionPane.showMessageDialog(null,"You Have to pay for the new Ticket");
                 String w="select * from paymentdetail where ticket_no='"+r2+"' ";
                 ResultSet rst=c1.s.executeQuery(w);
                 if(rst.next()){
                 a1=Integer.parseInt(rst.getString("amount"));
                 }
                 if(diffHours>96){
                 a2=a1-2500;
                 }
                 else if(diffHours < 96 && diffHours > 24){
                 a2=a1-3000;
                 }
                 else if(diffHours<=24){
                 a2=0;
                 }
                 String w1="select * from flightschedule where f_code='"+n8+"' ";
                rst=c1.s.executeQuery(w1);
                if(rst.next()){
                a3=Integer.parseInt(rst.getString("price"));
                }
                a4=a3-a2;
                
                String a41=Integer.toString(a4);
                p4l30.setText(a41);
                p2.setVisible(false);
                p6.setVisible(true);
               
             
              }  
               else if(!r4.equals(n1)|| !r5.equals(n2)||!r6.equals(n3)){
                   int i=0;
                 String q2="update  bookings set passenger_name='"+n1+"',age='"+n2+"',address='"+n3+"' where Ticket_no='"+r2+"'"; 
                 c1.s.executeUpdate(q2);  
                 JOptionPane.showMessageDialog(null, "Ticket Updated");
                 p2.setVisible(false);
                 p1.setVisible(true);
               }
            
           }
            }
            
           }else{JOptionPane.showMessageDialog(null, "No tickets found in Schedule for the given data");}
             }catch(Exception e){System.out.println(e);}
       
    }else if (ae.getSource()==btn7){
                    tx2.setText("");
                    tx3.setText("");
                  tx4.setText("");
                  tx5.setText("");
                  tx6.setText("");
                 c6.setSelectedItem("Select");
                 d.setCalendar(null);
                p2.setVisible(false);
                 p1.setVisible(true);
    }else if(ae.getSource()==rb2){
              p4l31.setText("Cheque No:");
              p4l32.setVisible(false);
              tp2.setVisible(false);
              p6.setVisible(false);
              p6.setVisible(true);
              
    }else if(ae.getSource()==rb3){
              p4l31.setText("UPI ID:");
              tp2.setVisible(false);
               p4l32.setVisible(false);
              p6.setVisible(false);
              p6.setVisible(true);
              
    }else if(ae.getSource()==rb1){
              p4l31.setText("Card No");
              p4l32.setVisible(true);
              tx9.setVisible(true);
              tp2.setVisible(true);
              p6.setVisible(false);
              p6.setVisible(true);
              
    }else if(ae.getSource()==btn10){
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
                
                String cd=tx9.getText();//card no/upi id/cheque no
//                String txn=p4l7.getText();//ticket no
                
             if(rb2.isSelected()){  
                try{
                   
                    
                    if(cd.length()!=6){
                        JOptionPane.showMessageDialog(null,cd);
                      JOptionPane.showMessageDialog(null,"Cheque no should be of 6 digits");
                    }
                    else if(Character.isLetter(cd.charAt(0))||Character.isLetter(cd.charAt(1))||Character.isLetter(cd.charAt(2))||Character.isLetter(cd.charAt(3))||Character.isLetter(cd.charAt(4))||Character.isLetter(cd.charAt(5))){
                    JOptionPane.showMessageDialog(null,"Only Numeric value allowed in card.no ");
                    }
                    
                    else{ int i=0;
                        conn c1=new conn();
                        String q1="select * from flightschedule where date='"+n7+"' and DeptAt='"+n4+"' and ArriAt='"+n5+"' and class_name='"+n6+"' ";
                         ResultSet rst= c1.s.executeQuery(q1);
                         if(rst.next()){
                          s9=rst.getString("date");
                          s2=rst.getString("f_code");
                          s3=rst.getString("DeptAt");
                          s4=rst.getString("DeptTime");
                          s5=rst.getString("ArriAt");
                          s6=rst.getString("ArriTime");
                          s7=rst.getString("price");
                          s8=rst.getString("class_name");
                           s10=rst.getString("Aseats");
                          
                         }
                         String q5= "select * from flight_info where fl_code='"+s2+"'";//getting the seatcount
                            rst=c1.s.executeQuery(q5);
                            if(rst.next()){
                                
                                seat1=rst.getInt("seats");
                              
                            }
                            int rv=seat1-Integer.parseInt(s10);
                           seats=seats-1;
                           rv=rv+1;
                 String q3="update flightschedule set Aseats='"+seats+"' where date='"+n7+"' and f_code='"+s2+"'";//updating/decreasing the seatcount
                           c1.s.executeUpdate(q3);
                 String z="insert into bookings values('"+s9+"','"+r2+"','"+rv+"','"+s2+"','"+n1+"','"+n2+"','"+n3+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+n6+"','Confirm')";
                       c1.s.executeUpdate(z);
                       String z3="delete from paymentdetail where ticket_no='"+r2+"'";
                       c1.s.executeUpdate(z3);
                      String z1 ="insert into paymentdetail values('"+n1+"','"+r2+"','NA','"+cd+"','NA','"+s7+"','"+st+"','"+m+"')";
                      c1.s.executeUpdate(z1);
                 
                  
                 JOptionPane.showMessageDialog(null, "Ticket Updated");
                  
                       
                        
                        
                        
                    
                  tx9.setText("");
                  tp2.setText("");
                 btn11.setVisible(false); 
                 btn10.setVisible(false);
                 btn14.setVisible(true);
                  p6.setVisible(false);
                 p6.setVisible(true);
                }
                
              
                }catch(Exception e){
                   System.out.println(e);
                }
             }else if(rb3.isSelected()){  
                try{
                    
                    
                    if(cd.length()<10 || cd.length()>10){
                      JOptionPane.showMessageDialog(null,"UPI ID should be of 10 digits");
                    }
                    else if(Character.isLetter(cd.charAt(0))||Character.isLetter(cd.charAt(1))||Character.isLetter(cd.charAt(2))||Character.isLetter(cd.charAt(3))||Character.isLetter(cd.charAt(4))||Character.isLetter(cd.charAt(5))||Character.isLetter(cd.charAt(6))||Character.isLetter(cd.charAt(7))||Character.isLetter(cd.charAt(8))||Character.isLetter(cd.charAt(9))){
                    JOptionPane.showMessageDialog(null,"Only Numeric value allowed in UPI ID ");
                    }
                    
                    else{ int i=0;
                        conn c1=new conn();
                        String q1="select * from flightschedule where date='"+n7+"' and DeptAt='"+n4+"' and ArriAt='"+n5+"'  and class_name='"+n6+"'";
                         ResultSet rst= c1.s.executeQuery(q1);
                         if(rst.next()){
                          s9=rst.getString("date");
                          s2=rst.getString("f_code");
                          s3=rst.getString("DeptAt");
                          s4=rst.getString("DeptTime");
                          s5=rst.getString("ArriAt");
                          s6=rst.getString("ArriTime");
                          s7=rst.getString("price");
                          s8=rst.getString("class_name");
                           s10=rst.getString("Aseats");
                         }
                         String q5= "select * from flight_info where fl_code='"+s2+"'";//getting the seatcount
                            rst=c1.s.executeQuery(q5);
                            if(rst.next()){
                                
                                seat1=rst.getInt("seats");
                              
                            }
                            int rv=seat1-Integer.parseInt(s10);
                           seats=seats-1;
                          rv=rv+1;
                 String q3="update flightschedule set Aseats='"+seats+"' where date='"+n7+"' and f_code='"+s2+"'";//updating/decreasing the seatcount
                           c1.s.executeUpdate(q3);
                 String z="insert into bookings values('"+s9+"','"+r2+"','"+rv+"','"+s2+"','"+n1+"','"+n2+"','"+n3+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+n6+"','Confirm')";
                       c1.s.executeUpdate(z);
                       String z3="delete from paymentdetail where ticket_no='"+r2+"'";
                       c1.s.executeUpdate(z3);
                      String z1 ="insert into paymentdetail values('"+n1+"','"+r2+"','NA','NA','"+cd+"','"+s7+"','"+st+"','"+m+"')";
                      c1.s.executeUpdate(z1);
                 
                  
                 JOptionPane.showMessageDialog(null, "Ticket Updated");
                
                       
                        
                        
                        
                    
                  tx9.setText("");
                  tp2.setText("");
                 btn10.setVisible(false);
                 btn11.setVisible(false);
                 btn14.setVisible(true);
                  p6.setVisible(false);
                 p6.setVisible(true);
                }
                
              
                }catch(Exception e){
                   System.out.println(e);
                }
             } else if(rb1.isSelected()){  
                try{
                    if(cd.length()<16 || cd.length()>16){
                      JOptionPane.showMessageDialog(null,"Card no should be of 16 digits");
                    }
                    else if(Character.isLetter(cd.charAt(0))||Character.isLetter(cd.charAt(1))||Character.isLetter(cd.charAt(2))||Character.isLetter(cd.charAt(3))||Character.isLetter(cd.charAt(4))||Character.isLetter(cd.charAt(5))||Character.isLetter(cd.charAt(6))||Character.isLetter(cd.charAt(7))||Character.isLetter(cd.charAt(8))||Character.isLetter(cd.charAt(9))||Character.isLetter(cd.charAt(10))||Character.isLetter(cd.charAt(11))||Character.isLetter(cd.charAt(12))||Character.isLetter(cd.charAt(13))||Character.isLetter(cd.charAt(14))||Character.isLetter(cd.charAt(15))){
                    JOptionPane.showMessageDialog(null,"Only Numeric value allowed in card.no ");
                    }
                    
                    else{
                        
                        int i=0;
                        conn c1=new conn();
                        String q1="select * from flightschedule where date='"+n7+"' and DeptAt='"+n4+"' and ArriAt='"+n5+"' and class_name='"+n6+"'";
                         ResultSet rst= c1.s.executeQuery(q1);
                         if(rst.next()){
                          s9=rst.getString("date");
                          s2=rst.getString("f_code");
                          s3=rst.getString("DeptAt");
                          s4=rst.getString("DeptTime");
                          s5=rst.getString("ArriAt");
                          s6=rst.getString("ArriTime");
                          s7=rst.getString("price");
                          s8=rst.getString("class_name");
                           s10=rst.getString("Aseats");
                           
                         }
                         String q5= "select * from flight_info where fl_code='"+s2+"'";//getting the seatcount
                            rst=c1.s.executeQuery(q5);
                            if(rst.next()){
                                
                                seat1=rst.getInt("seats");
                              
                            }
                            int rv=seat1-Integer.parseInt(s10);
                           seats=seats-1;
                           rv=rv+1;
                 String q3="update flightschedule set Aseats='"+seats+"' where date='"+n7+"' and f_code='"+s2+"'";//updating/decreasing the seatcount
                           c1.s.executeUpdate(q3);
                 String z="insert into bookings values('"+s9+"','"+r2+"','"+rv+"','"+s2+"','"+n1+"','"+n2+"','"+n3+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+n6+"','Confirm')";
                       c1.s.executeUpdate(z);
                       String z3="delete from paymentdetail where ticket_no='"+r2+"'";
                       c1.s.executeUpdate(z3);
                      String z1 ="insert into paymentdetail values('"+n1+"','"+r2+"','"+cd+"','NA','NA','"+s7+"','"+st+"','"+m+"')";
                      c1.s.executeUpdate(z1);
                 
                  
                 JOptionPane.showMessageDialog(null, "Ticket Updated");
                
                       
                        
                        
                        
                     
                  tx9.setText("");
                  tp2.setText("");
                 btn10.setVisible(false);
                  btn11.setVisible(false);
                 btn14.setVisible(true);
                  p6.setVisible(false);
                 p6.setVisible(true);
                      }
                }catch(Exception e){
                   System.out.println(e);
                }
             }
              }
    
    }else if(ae.getSource()==btn14){
                 f.setVisible(false);
                new printTicketDesign();
             }else if(ae.getSource()==btn11){
                  int db = JOptionPane.YES_NO_OPTION;
                db = JOptionPane.showConfirmDialog (null,"Do You Want to Cancel the Process of Updating the Ticket","WARNING", db);
                if(db==JOptionPane.YES_OPTION){
                    int i;
                   try{
                    conn c1=new conn();
                String q4="Select * from flightschedule where f_code='"+r3+"' and date='"+r1+"'";//getting the seatcount
                 ResultSet rs=c1.s.executeQuery(q4);
                 if(rs.next()){
                      i=rs.getInt("Aseats");
                     
                    i--;
                    
                 String q5="update flightschedule set Aseats='"+i+"' where   f_code='"+r3+"'  and date='"+r1+"'";//decreasing the seat count
                 c1.s.executeUpdate(q5);
                 String q1="insert into bookings values('"+r1+"','"+r2+"','"+r13+"','"+r3+"','"+r4+"','"+r5+"','"+r6+"','"+r7+"','"+r8+"','"+r9+"','"+r10+"','"+r11+"','"+r12+"')";
                 c1.s.executeUpdate(q1);
                 JOptionPane.showMessageDialog(null,"Process is canceled");
                 p6.setVisible(false);
                 p1.setVisible(true);
                 }
                 }catch(Exception e){
                 System.out.println(e);
                 }
                
                }else{remove(db);}
             }
    }
    
}
public class UpdateTicket {
    public static void main(String args[]){
     new UpdateTicketDesign();
    }
    
}
