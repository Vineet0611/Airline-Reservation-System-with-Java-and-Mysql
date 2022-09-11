  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.reservation.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

class UpdateFlightInfoDesign extends JFrame implements ActionListener{
     JFrame f;
    JPanel p,p1,p2;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24;
    JTextField tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8;
    JPasswordField tp1;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    Font f1,f2,f3,f4,f5,f6;
    
    JTable t;
    JScrollPane sp;
     
      String r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,sl3;
     JComboBox cb1,c6;
     JDateChooser d;
     String s1;
      UpdateFlightInfoDesign(){
          f=new JFrame("Airline Reservation System");        
        Dimension sz=Toolkit.getDefaultToolkit().getScreenSize();
        
        f1=new Font("Castellar",Font.BOLD,45);
        f2=new Font("Harrington",Font.BOLD,25);
        f3=new Font("Cooper",Font.PLAIN,30);
        f4=new Font("Cooper",Font.PLAIN,15);
        f5=new Font("Cooper",Font.PLAIN,18);
        f6=new Font("Cooper",Font.PLAIN,13);
        
          ImageIcon icon1 =new ImageIcon((ClassLoader.getSystemResource("airline/reservation/system/image/vin9.png")));
        Image newimg = icon1.getImage().getScaledInstance(64,64, java.awt.Image.SCALE_SMOOTH);
        icon1=new ImageIcon(newimg);
        f.setIconImage(newimg);
        
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
        l1.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/reservation/system/image/vin4.jpg")));
        l1.setBounds(0,0,sz.width,sz.height);
      
       
         
         p1=new JPanel();
         p1.setBounds(410,150,500,350);
         p1.setLayout(null);
         p1.setVisible(true);
         p1.setOpaque(true);
         p1.setBackground(new Color(225,225,225,105));
         f.add(p1);
         
        l7=new JLabel(" Update Flight Info");
        l7.setBounds(150,1,300,50);
        l7.setForeground(new Color(10,10,10));
        l7.setFont(f3);
        p1.add(l7);
         
        l4=new JLabel(" Enter Details");
        l4.setBounds(40,40,300,50);
        l4.setForeground(new Color(10,10,10));
        l4.setFont(f5);
        p1.add(l4);
        
        l5=new JLabel("Select Flight No:");
        l5.setBounds(40,100,200,50);
        l5.setForeground(new Color(10,10,10));
        l5.setFont(f5);
        p1.add(l5);
        
         String str1[]={"Select","FSA101","FSA102","FSA103","FSA104","FSA105","FSA106","FSA107","FSA108","FSA109","FSA110","FSA111",
            "FSA112","FSA1113","FSA114","FSA115","FSA116","FSA117","FSA118","FSA119","FSA120","FSA121","FSA122","FSA123"
        ,"FSA124","FSA125","FSA126","FSA127","FSA128","FSA129","FSA130","FSA131","FSA132","FSA133","FSA134","FSA135","FSA136"
        ,"FSA137","FSA138","FSA139","FSA140","FSA141","FSA142","FSA143","FSA144","FSA145","FSA146","FSA147","FSA148","FSA149","FSA150","FSA151",
            "FSA152","FSA153","FSA154","FSA155","FSA156","FSA157","FSA158","FSA159","FSA160","FSA161","FSA162","FSA163"
        ,"FSA164","FSA165","FSA166","FSA167","FSA168","FSA169","FSA170","FSA171","FSA172","FSA173","FSA174","FSA175","FSA176"
        ,"FSA177","FSA178","FSA179","FSA180"};
        cb1=new JComboBox(str1);
        cb1.setBounds(180,110,200,30);
        cb1.setFont(f4);
        p1.add(cb1);
        
        l24=new JLabel("Select Date:");
        l24.setBounds(40,160,200,50);
        l24.setForeground(new Color(10,10,10));
        l24.setFont(f5);
        p1.add(l24);
        
         Calendar c = Calendar.getInstance();
         c.setTime(new java.util.Date()); // Using today's date
         c.add(Calendar.DATE, 90);//adding 90 days
         d=new JDateChooser();
         d.setBounds(180,170,200,30);
         d.setFont(f4);
         d.setMaxSelectableDate(c.getTime());
         d.setMinSelectableDate(new java.util.Date());
         p1.add(d);
        
        
        
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
        //--------------------------------panel 2
        
        p2=new JPanel();
        p2.setBounds(380,100,600,500);
        p2.setLayout(null);
        p2.setVisible(false);
        p2.setOpaque(true);
        p2.setBackground(new Color(225,225,225,105));
        f.add(p2);
        l11=new JLabel("Update Flight Info");
        l11.setBounds(180,10,300,50);
        l11.setForeground(new Color(10,10,10));
        l11.setFont(f3);
        p2.add(l11);
        
        l12=new JLabel("Departure At:");
        l12.setBounds(40,60,200,50);
        l12.setForeground(new Color(10,10,10));
        l12.setFont(f5);
        p2.add(l12);
      
        
        l14=new JLabel("");
        l14.setBounds(200,70,250,30);
        l14.setForeground(new Color(10,10,10));
        l14.setFont(f5);
        p2.add(l14);
        
        l6=new JLabel("Arrival At:");
        l6.setBounds(40,110,300,50);
        l6.setForeground(new Color(10,10,10));
        l6.setFont(f5);
        p2.add(l6);
        
       
        l15=new JLabel("");
        l15.setBounds(200,115,250,30);
        l15.setForeground(new Color(10,10,10));
        l15.setFont(f5);
        p2.add(l15);
        
         l13=new JLabel("Price:");
        l13.setBounds(40,160,300,50);
        l13.setForeground(new Color(10,10,10));
        l13.setFont(f5);
        p2.add(l13);
        
       
        
        tx4=new JTextField();
        tx4.setBounds(200,165,250,30);
        tx4.setFont(f5);
        p2.add(tx4);
        
        l17=new JLabel("Timings are in 24hr Format");
        l17.setBounds(200,190,250,30);
        l17.setForeground(new Color(10,10,10));
        l17.setFont(f6);
        p2.add(l17);
        
        l8=new JLabel("Departure Time:");
        l8.setBounds(40,210,300,50);
        l8.setForeground(new Color(10,10,10));
        l8.setFont(f5);
        p2.add(l8);
        
        tx5=new JTextField();
        tx5.setBounds(200,215,250,30);
        tx5.setFont(f5);
        p2.add(tx5);
        
        l18=new JLabel("Timings are in 24hr Format");
        l18.setBounds(200,242,250,30);
        l18.setForeground(new Color(10,10,10));
        l18.setFont(f6);
        p2.add(l18);
        
        l9=new JLabel("Arrival Time:");
        l9.setBounds(40,260,300,50);
        l9.setForeground(new Color(10,10,10));
        l9.setFont(f5);
        p2.add(l9);
        
        tx6=new JTextField();
        tx6.setBounds(200,265,250,30);
        tx6.setFont(f5);
        p2.add(tx6);
        
        l10=new JLabel("Seats:");
        l10.setBounds(40,320,300,50);
        l10.setForeground(new Color(10,10,10));
        l10.setFont(f5);
        p2.add(l10);
        
        tx2=new JTextField();
        tx2.setBounds(200,325,250,25);
        tx2.setFont(f5);
        p2.add(tx2);
        
        
//     
        
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
        
        f.add(l1);
        f.setSize(sz.width,sz.height);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
      public void actionPerformed(ActionEvent ae){
          if(ae.getSource()==btn1){
            f.setVisible(false);
             new AdminOptionsDesign();
          }
          else if(ae.getSource()==btn2){
           s1=cb1.getSelectedItem().toString();
           if(s1.equals("Select")){JOptionPane.showMessageDialog(null, "Please Select Flight No");}
           else if(d.getDate()==null){JOptionPane.showMessageDialog(null, "Please Select Date");}
           else{
             try{
                 SimpleDateFormat sformat=new SimpleDateFormat("dd/MM/yyyy");
                  sl3=sformat.format(d.getDate());
                 conn c1 =new conn();
                 String q ="select  * from flightschedule where f_code='"+s1+"' and date ='"+sl3+"'";
                 ResultSet rs= c1.s.executeQuery(q);
                 if(rs.next()){
                 l14.setText(rs.getString("DeptAt"));
                 l15.setText(rs.getString("ArriAt"));
                 tx4.setText(Integer.toString(rs.getInt("price")));
                 tx5.setText((rs.getString("DeptTime")));
                 tx6.setText((rs.getString("ArriTime")));
                 tx2.setText(Integer.toString(rs.getInt("Aseats")));
                 p1.setVisible(false);
                 p2.setVisible(true);
                 } else{JOptionPane.showMessageDialog(null, "No Flights Found On Given Date"); }
             }catch(Exception e){
            // JOptionPane.showMessageDialog(null,"hii");
            System.out.println(e);
             }
           }
        
        }else if(ae.getSource()==btn6){
           
         
           if(tx4.getText().equals("") || tx5.getText().equals("") || tx6.getText().equals("") || tx2.getText().equals("")){JOptionPane.showMessageDialog(null,"Please Fill All The Fields");}
           else{
               String s2 =tx4.getText();//price
           int i=Integer.parseInt(s2);
           String s3=tx5.getText();//depture time
           String s4=tx6.getText();//Arrival time
           String s5=tx2.getText();//seats
           int h=Integer.parseInt(s5);
           String r1,r2,r3,r4,r5;
           try{
                conn c1 =new conn();
                 String q ="select  * from flightschedule where f_code='"+s1+"' and date ='"+sl3+"'";
                 ResultSet rs= c1.s.executeQuery(q);
                 if(rs.next()){
                     
                  r1= Integer.toString(rs.getInt("price"));
                  r2=rs.getString("DeptTime");
                  r3=rs.getString("ArriTime");
                  r4=Integer.toString(rs.getInt("Aseats"));
                  
                 if(!s2.equals(r1) || !s3.equals(r2)|| !s4.equals(r3)|| !s5.equals(r4) ){
                      java.util.Date d1= new SimpleDateFormat("HH:mm").parse(s3); 
                   java.util.Date d2= new SimpleDateFormat("HH:mm").parse(s4);
                   long diff = d2.getTime() - d1.getTime();
                   String TimeTaken = String.format( "%s mins",TimeUnit.MILLISECONDS.toMinutes(diff) );
                   String q1="update flightschedule set DeptTime='"+s3+"',ArriTime='"+s4+"',price='"+i+"',Aseats='"+h+"',Duration='"+TimeTaken+"' where f_code='"+s1+"' and date ='"+sl3+"'";
                   c1.s.executeUpdate(q1);
                   JOptionPane.showMessageDialog(null, "Flight info successfully updated");
                   tx4.setText("");
                   tx5.setText("");
                   tx6.setText("");
                   tx2.setText("");
                   c1.c.close();
                 }
                 else{
                     JOptionPane.showMessageDialog(null, "No change in data \nUpdate Not Possible");
                 }
                 }
           }catch(Exception e){
               System.out.println(e);
           
           }
           }
            
        }else if(ae.getSource()==btn7){
            p2.setVisible(false);
            p1.setVisible(true);
        }
            
      }
      
}
        


public class FlightInfoUpdate {
   public static void main(String args[]){
     new UpdateFlightInfoDesign();
   }
}   
             


