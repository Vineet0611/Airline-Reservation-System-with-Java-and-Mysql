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
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import net.proteanit.sql.DbUtils;
class CancelTicketDesign extends JFrame implements ActionListener{
    JFrame f;
    JPanel p,p1,p3;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l24,l26,l27,l30,l17,l18,l19,l20,l21,l22,l23,l25,l28,l29,l31;
    JTextField tx1;
    JPasswordField tp1;
    JButton btn1,btn2,btn3,btn4,btn5;
    Font f1,f2,f3,f4,f5,f6;
    JTable t;
    JScrollPane sp;
    String r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12;

    public CancelTicketDesign(){
        
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
         
        l7=new JLabel(" Cancel Ticket");
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
        btn1.setBounds(40,280,200,25);
        btn1.setFont(f4);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        btn1.setFocusable(false);
        btn1.setBorderPainted(false);
        p1.add(btn1);
        btn1.addActionListener(this);
        
        btn2=new JButton("Submit");
        btn2.setBounds(270,280,200,25);
        btn2.setFont(f4);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        btn2.setFocusable(false);
        btn2.setBorderPainted(false);
        p1.add(btn2);
        btn2.addActionListener(this);
         
      
       //------------------------------------panel 3 Ticket--------------------------//
       
        p3=new JPanel();
        p3.setBounds(340,130,600,350);
        p3.setLayout(null);
        p3.setVisible(false);
        p3.setOpaque(true);
        p3.setBackground(new Color(225,225,225,75));
        f.add(p3);
        
        l8=new JLabel(" Cancel Ticket");
        l8.setBounds(200,10,300,50);
        l8.setForeground(new Color(10,10,10));
        l8.setFont(f3);
        p3.add(l8);
        
        l9=new JLabel("Passenger-Name:");
        l9.setBounds(40,60,200,50);
        l9.setForeground(new Color(10,10,10));
        l9.setFont(f5);
        p3.add(l9);
        
          l10=new JLabel("Source:");
        l10.setBounds(40,90,100,50);
        l10.setForeground(new Color(10,10,10));
        l10.setFont(f5);
        p3.add(l10);
        
        l11=new JLabel("Dept.Time:");
        l11.setBounds(370,90,100,50);
        l11.setForeground(new Color(10,10,10));
        l11.setFont(f5);
        p3.add(l11);
          
        l12=new JLabel("Arrival:");
        l12.setBounds(40,120,100,50);
        l12.setForeground(new Color(10,10,10));
        l12.setFont(f5);
        p3.add(l12);
        
        l13=new JLabel("Arri.Time:");
        l13.setBounds(370,120,100,50);
        l13.setForeground(new Color(10,10,10));
        l13.setFont(f5);
        p3.add(l13);
        
        l14=new JLabel("Class of Travel:");
        l14.setBounds(40,150,200,50);
        l14.setForeground(new Color(10,10,10));
        l14.setFont(f5);
        p3.add(l14);
        
        l15=new JLabel("Date:");
        l15.setBounds(370,150,100,50);
        l15.setForeground(new Color(10,10,10));
        l15.setFont(f5);
        p3.add(l15);
        
        l16=new JLabel("Flight_No:");
        l16.setBounds(370,60,200,50);
        l16.setForeground(new Color(10,10,10));
        l16.setFont(f5);
        p3.add(l16);
        
        l24=new JLabel("Ticket_No:");
        l24.setBounds(40,180,200,50);
        l24.setForeground(new Color(10,10,10));
        l24.setFont(f5);
        p3.add(l24);
        
        l26=new JLabel("Age:");
        l26.setBounds(370,180,200,50);
        l26.setForeground(new Color(10,10,10));
        l26.setFont(f5);
        p3.add(l26);
        
        l27=new JLabel("Passenger Address:");
        l27.setBounds(40,210,200,50);
        l27.setForeground(new Color(10,10,10));
        l27.setFont(f5);
        p3.add(l27);
        
        l30=new JLabel("Status:");
        l30.setBounds(370,210,200,50);
        l30.setForeground(new Color(10,10,10));
        l30.setFont(f5);
        p3.add(l30);
        
        btn5=new JButton("Back");
        btn5.setBounds(40,280,200,25);
        btn5.setFont(f4);
        btn5.setBackground(Color.BLACK);
        btn5.setForeground(Color.WHITE);
        btn5.setFocusable(false);
        btn5.setBorderPainted(false);
        p3.add(btn5);
        btn5.addActionListener(this);
        
       
        
        btn4=new JButton("Cancel Ticket");
        btn4.setBounds(370,280,200,25);
        btn4.setFont(f4);
        btn4.setBackground(Color.BLACK);
        btn4.setForeground(Color.WHITE);
        btn4.setFocusable(false);
        btn4.setBorderPainted(false);
        p3.add(btn4);
        btn4.addActionListener(this);
        
       
      
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
                    String q1="select * from bookings where Ticket_no='"+s1+"'";
                    ResultSet rs=c1.s.executeQuery(q1);
                    if(rs.next()){
                       r1=rs.getString("date");
                          r2=rs.getString("Ticket_no");
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
                
                                    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                    String st =dt.format(df);// current date
                                    java.util.Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(st);  
                                    java.util.Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(r1);
                                    int ti=date2.compareTo(date1);
                                   if(ti==-1){JOptionPane.showMessageDialog(null,"Sorry The Flight Has Departed \n No Cancelation Of Ticket Possible");}
                                   else{
                                    p1.setVisible(false);
                                     p3.setVisible(true);
                                   }
                    }
                    else{JOptionPane.showMessageDialog(null, "No Ticket Found ");}
                    
                }catch(Exception e){
                  JOptionPane.showMessageDialog(null, e);
                }
          
          l17=new JLabel(r4);//passenger_name
          l17.setBounds(220,60,100,50);
          l17.setForeground(new Color(10,10,10));
          l17.setFont(f5);
          p3.add(l17); 
          
          l11=new JLabel(r7);//Departure at
          l11.setBounds(220,90,100,50);
          l11.setForeground(new Color(10,10,10));
          l11.setFont(f5);
          p3.add(l11); 
          
          l18=new JLabel(r9);//Arrival at
          l18.setBounds(220,120,300,50);
          l18.setForeground(new Color(10,10,10));
          l18.setFont(f5);
          p3.add(l18);
          
          l19=new JLabel(r10);//Arrival Time
          l19.setBounds(480,120,100,50);
          l19.setForeground(new Color(10,10,10));
          l19.setFont(f5);
          p3.add(l19);
          
          l20=new JLabel(r3);//Flight_code
          l20.setBounds(480,60,100,50);
          l20.setForeground(new Color(10,10,10));
          l20.setFont(f5);
          p3.add(l20);
          
          l21=new JLabel(r11);// class
          l21.setBounds(220,150,300,50);
          l21.setForeground(new Color(10,10,10));
          l21.setFont(f5);
          p3.add(l21);
             
          l22=new JLabel(r1);//Date
          l22.setBounds(480,150,100,50);
          l22.setForeground(new Color(10,10,10));
          l22.setFont(f5);
          p3.add(l22);
             
          l23=new JLabel(r8);//Departure time
          l23.setBounds(480,90,100,50);
          l23.setForeground(new Color(10,10,10));
          l23.setFont(f5);
          p3.add(l23);
          
          
          l25=new JLabel(r2);//Ticket No
          l25.setBounds(220,180,300,50);
          l25.setForeground(new Color(10,10,10));
          l25.setFont(f5);
          p3.add(l25);
          
          l28=new JLabel(r5);//Age
          l28.setBounds(480,180,100,50);
          l28.setForeground(new Color(10,10,10));
          l28.setFont(f5);
          p3.add(l28);
          
          l29=new JLabel(r6);//address
          l29.setBounds(220,210,300,50);
          l29.setForeground(new Color(10,10,10));
          l29.setFont(f5);
          p3.add(l29);
          
          l31=new JLabel(r12);//status
          l31.setBounds(480,210,100,50);
          l31.setForeground(new Color(10,10,10));
          l31.setFont(f5);
          p3.add(l31);
          
         
            }
     }
      else if(ae.getSource()==btn5){
          l31.setText("");
          l29.setText("");
          l28.setText("");
          l22.setText("");
          l23.setText("");
          l25.setText("");
          l21.setText("");
          l20.setText("");
          l19.setText("");
          l18.setText("");
          l11.setText("");
          l17.setText("");
          p3.setVisible(false); 
             p1.setVisible(true);
         }else if(ae.getSource()==btn4){
       
       
          
          try{
               LocalDateTime dt = LocalDateTime.now();
                LocalTime lt =LocalTime.now();
                DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String st =dt.format(df);// current date
                 java.util.Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(st);  
                  java.util.Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(r1); //booking date
              long diff = date2.getTime() - date1.getTime();
               long diffHours = diff / (60 * 60 * 1000);
               int ti=date2.compareTo(date1);
               int db = JOptionPane.YES_NO_OPTION;
              
               if(diffHours>96){db = JOptionPane.showConfirmDialog (null, "₹2500 Will be Deducted As A Cancellation Charge \n Do You Still Want To Cancel Ticket","WARNING", db);}
              else if(diffHours<96 && diffHours>24){db = JOptionPane.showConfirmDialog (null, "₹3000 Will be Deducted As A Cancellation Charge \n Do You Still Want To Cancel Ticket","WARNING", db);}
              else if(diffHours<24 || ti<0){db = JOptionPane.showConfirmDialog (null, "No Refund Possible Entire Amount Will Be Deducted As Cancelation Charge \n Do You Still Want To Cancel Ticket","WARNING", db);}
               
               if(db == JOptionPane.YES_OPTION) {
                 
              int i=0;
              conn c1=new conn();
              String q="delete from bookings where date='"+r1+"' and Ticket_no='"+r2+"'" ;
             c1.s.executeUpdate(q);
             String q1="select * from flightschedule where date='"+r1+"'and  f_code='"+r3+"'";
             ResultSet rs=c1.s.executeQuery(q1);
             if(rs.next()){
                 i=rs.getInt("Aseats");
            }
             i++;
             if(ti>=0){
              String q2="update flightschedule set Aseats='"+i+"' where date='"+r1+"' and  f_code='"+r3+"'" ;
              c1.s.executeUpdate(q2);
            JOptionPane.showMessageDialog(null,"Your booking For \n"+r7+" To "+r9+"\n ON:"+r1+"\n Is Canceled"+"\n Refund process is Initiated");
             }
          
            
             p3.setVisible(false);
            p1.setVisible(true);
            c1.c.close();
           
           
                    
             }else {remove(db);}
               
              
          }catch(Exception e){}
          
         }
        }
   
         
    
}
public class CancelTicket {
    public static void main(String args[]){new CancelTicketDesign();}
    
}
