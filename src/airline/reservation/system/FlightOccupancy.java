/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.reservation.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
/**
 *
 * @author vineet mendon
 */
class FlightOccupancyDesign extends JFrame implements ActionListener{
    JFrame f;
    JPanel p,p1,p3;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31;
    JTextField tx1;
    JPasswordField tp1;
    JButton btn1,btn2,btn3,btn4,btn5;
    Font f1,f2,f3,f4,f5,f6;
    JComboBox cb1;
    JDateChooser d;
    String total1;
    public FlightOccupancyDesign(){
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
        l1.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/reservation/system/image/vin4.jpg")));
        l1.setBounds(0,0,sz.width,sz.height);
       
        //-----------------------Panel 2
        p1=new JPanel();
         p1.setBounds(445,130,450,450);
         p1.setLayout(null);
         p1.setVisible(true);
         p1.setOpaque(true);
         p1.setBackground(new Color(225,225,225,75));
         f.add(p1);
         
        l8=new JLabel("Check Flight Ocuupancy");
        l8.setBounds(60,30,400,50);
        l8.setForeground(new Color(10,10,10));
        l8.setFont(f3);
        p1.add(l8);
        
        l9=new JLabel("Enter Flight No:");
        l9.setBounds(60,80,300,50);
        l9.setForeground(new Color(10,10,10));
        l9.setFont(f5);
        p1.add(l9);
        
        l10=new JLabel("Enter date:");
        l10.setBounds(60,120,300,50);
        l10.setForeground(new Color(10,10,10));
        l10.setFont(f5);
        p1.add(l10);
        
        String str1[]={"Select","FSA101","FSA102","FSA103","FSA104","FSA105","FSA106","FSA107","FSA108","FSA109","FSA110","FSA111",
            "FSA112","FSA1113","FSA114","FSA115","FSA116","FSA117","FSA118","FSA119","FSA120","FSA121","FSA122","FSA123"
        ,"FSA124","FSA125","FSA126","FSA127","FSA128","FSA129","FSA130","FSA131","FSA132","FSA133","FSA134","FSA135","FSA136"
        ,"FSA137","FSA138","FSA139","FSA140","FSA141","FSA142","FSA143","FSA144","FSA145","FSA146","FSA147","FSA148","FSA149","FSA150","FSA151",
            "FSA152","FSA153","FSA154","FSA155","FSA156","FSA157","FSA158","FSA159","FSA160","FSA161","FSA162","FSA163"
        ,"FSA164","FSA165","FSA166","FSA167","FSA168","FSA169","FSA170","FSA171","FSA172","FSA173","FSA174","FSA175","FSA176"
        ,"FSA177","FSA178","FSA179","FSA180"};
        cb1=new JComboBox(str1);
        cb1.setBounds(200,90,200,25);
        cb1.setFont(f4);
        p1.add(cb1);
        
        d=new JDateChooser();
        d.setBounds(200,130,200,25);
        d.setFont(f4);
        p1.add(d);
        
        l11=new JLabel("Total Seats:");
        l11.setBounds(60,150,300,50);
        l11.setForeground(new Color(10,10,10));
        l11.setFont(f5);
        p1.add(l11);
        
        l12=new JLabel("Empty  Seats:");
        l12.setBounds(60,180,300,50);
        l12.setForeground(new Color(10,10,10));
        l12.setFont(f5);
        p1.add(l12);
        
        l13=new JLabel("Occupied Seats:");
        l13.setBounds(60,210,300,50);
        l13.setForeground(new Color(10,10,10));
        l13.setFont(f5);
        p1.add(l13);
        
         l14=new JLabel("");
         l14.setBounds(200,150,300,50);
         l14.setForeground(new Color(10,10,10));
         l14.setFont(f5);
         p1.add(l14);
         
         l15=new JLabel("");
         l15.setBounds(200,180,300,50);
         l15.setForeground(new Color(10,10,10));
         l15.setFont(f5);
         p1.add(l15);
         
        l16=new JLabel("");
        l16.setBounds(200,210,300,50);
        l16.setForeground(new Color(10,10,10));
        l16.setFont(f5);
        p1.add(l16);
         
        btn2=new JButton("Check");
        btn2.setBounds(100,270,250,25);
        btn2.setFont(f4);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        btn2.setFocusable(false);
        btn2.setBorderPainted(false);
        btn2.addActionListener(this);
        p1.add(btn2);
        
        btn3=new JButton("Back");
        btn3.setBounds(100,370,250,25);
        btn3.setFont(f4);
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.WHITE);
        btn3.setFocusable(false);
        btn3.setBorderPainted(false);
        btn3.addActionListener(this);
        p1.add(btn3);
        
        btn4=new JButton("Clear");
        btn4.setBounds(100,320,250,25);
        btn4.setFont(f4);
        btn4.setBackground(Color.BLACK);
        btn4.setForeground(Color.WHITE);
        btn4.setFocusable(false);
        btn4.setBorderPainted(false);
        btn4.addActionListener(this);
        p1.add(btn4);
       
        f.add(l1);
        f.setSize(sz.width,sz.height);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    public void actionPerformed(ActionEvent ae){
       
          
        if(ae.getSource()==btn1){
          String s1=tx1.getText();
          String s2 =tp1.getText();
          if(s1.equals("") || s2.equals("")){JOptionPane.showMessageDialog(null,"Please fill all the fields ");}
          else{
          try{
              conn c1 =new conn();
              String q1="select * from airlineExecLogin where user_name='"+s1+"' and pin='"+s2+"'";
              ResultSet rs=c1.s.executeQuery(q1);
              if(rs.next()){
                  p.setVisible(false);
                  p1.setVisible(true);
              }
              else{JOptionPane.showMessageDialog(null,"Incorrect Login Credentials");}
          }catch(Exception e){
              System.out.println(e);
          }
          }
        }
        else if(ae.getSource()==btn2){
             String bot1=l14.getText();
         String bot2=l15.getText();
          String bot3=l16.getText();
          if(!bot1.equals("") ||(!bot2.equals("")) || (!bot3.equals(""))){JOptionPane.showMessageDialog(null, "Please clear the fields");}
          else{
            int total=0,remain=0;
        String s3=cb1.getSelectedItem().toString();
                     
         if(d.getDate()==null && s3.equals("Select")){JOptionPane.showMessageDialog(null, "Please Fill All the Field");}
        else if(d.getDate()==null){JOptionPane.showMessageDialog(null, "Please select Date");}
        else if(s3.equals("Select")){JOptionPane.showMessageDialog(null, "Please select Flight No");}
        else{
          try{
                SimpleDateFormat sformat=new SimpleDateFormat("dd/MM/yyyy");
                 String s4=sformat.format(d.getDate());
              conn c1 = new conn();
              String q2="Select * from flight_info where fl_code='"+s3+"'";
             ResultSet rs=c1.s.executeQuery(q2);
             if(rs.next()){
               total=total+rs.getInt("seats");
              total1=Integer.toString(total);           
          
            
             }
             String q3="Select * from flightschedule where f_code='"+s3+"' and date='"+s4+"'";
              rs=c1.s.executeQuery(q3);
              if(rs.next()){
                remain=remain+rs.getInt("Aseats");
               String remain1=Integer.toString(remain);
              l15.setText(remain1);
              int i=total-remain;
              String sub=Integer.toString(i);
              l16.setText(sub);
                  l14.setText(total1);
               p1.setVisible(false);
              p1.setVisible(true);
              
              }
              else{
              JOptionPane.showMessageDialog(null, "No flights Available on given date");
              }
              
          }catch(Exception e){System.out.println(e);}
        }
        }
        }
        else if(ae.getSource()==btn3){
            f.setVisible(false);
            new AdminOptionsDesign();
        }
        else if(ae.getSource()==btn4){
          l14.setText("");
          l15.setText("");
          l16.setText("");
          p1.setVisible(false);
          p1.setVisible(true);
        }
    }

}
public class FlightOccupancy {
    public static void main (String []args){
        new FlightOccupancyDesign();
    }
    
}
