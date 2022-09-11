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
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Random;
import java.util.Date;
import java.util.concurrent.TimeUnit;
    class addFlights extends JFrame implements ActionListener{
        JFrame f;
    JPanel p,p1,p3;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField tx1,tx2,tx3,tx4,tx5,tx6;
    JButton btn1,btn2,btn3,btn4,btn5;
    Font f1,f2,f3,f4,f5,f6;
    JComboBox cb,cb2,c6;
    JDateChooser d;
    String s1,st,time,time1,TimeTaken;
      SpinnerDateModel sdm;
    int ti;
    JSpinner timeSpinner,timeSpinner2;
     JSpinner.DateEditor timeEditor;
      
        addFlights(){
           f=new JFrame("Airline  Reservation System");        
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
        //l1.setIcon(new ImageIcon("C:\\Users\\vineet mendon\\Desktop\\website templates\\vin3.jpg"));
        l1.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/reservation/system/image/vin4.jpg")));
        l1.setBounds(0,0,sz.width,sz.height);
        


        
         
       
        //---------------------------panel 2---------------------
         p1=new JPanel();
         p1.setBounds(425,100,500,550);
         p1.setLayout(null);
         p1.setVisible(true);
         p1.setOpaque(true);
         p1.setBackground(new Color(225,225,225,75));
         f.add(p1);
         
          l8=new JLabel("Add Flights");
        l8.setBounds(160,10,400,50);
        l8.setForeground(new Color(10,10,10));
        l8.setFont(f3);
        p1.add(l8);
        
        l9=new JLabel("Departure At:");
        l9.setBounds(60,60,300,50);
        l9.setForeground(new Color(10,10,10));
        l9.setFont(f5);
        p1.add(l9);
        
       
        
        String str1[]={"Select","Bengaluru","Chennai","Mumbai","Dehli","Kolkata"};
        cb=new JComboBox(str1);
        cb.setBounds(60,100,250,30);
        cb.setFont(f5);
        p1.add(cb);
        
        l13=new JLabel("Time:");
        l13.setBounds(330,60,300,50);
        l13.setForeground(new Color(10,10,10));
        l13.setFont(f5);
        p1.add(l13);
        
        Date dt =new Date();
        SpinnerDateModel sdm=new SpinnerDateModel(dt,null,null,Calendar.HOUR);
        timeSpinner = new JSpinner( sdm );
        timeEditor = new JSpinner.DateEditor(timeSpinner, "HH:mm");
        timeSpinner.setEditor(timeEditor);
        timeSpinner.setBounds(330,100,100,30);
        timeSpinner.setFont(f5);
        p1.add(timeSpinner);
        
        l10=new JLabel("Arrival At:");
        l10.setBounds(60,130,300,50);
        l10.setForeground(new Color(10,10,10));
        l10.setFont(f5);
        p1.add(l10);
        
        cb2=new JComboBox(str1);
        cb2.setBounds(60,170,250,30);
        cb2.setFont(f5);
        p1.add(cb2);
        
        l14=new JLabel("Time:");
        l14.setBounds(330,130,300,50);
        l14.setForeground(new Color(10,10,10));
        l14.setFont(f5);
        p1.add(l14);
        
        timeSpinner2 = new JSpinner( new SpinnerDateModel() );
        JSpinner.DateEditor timeEditor2 = new JSpinner.DateEditor(timeSpinner2, "HH:mm");
        timeSpinner2.setEditor(timeEditor2);
        timeSpinner2.setBounds(330,170,100,30);
        timeSpinner2.setFont(f5);
        p1.add(timeSpinner2);
        
        
        l11=new JLabel("Date:");
        l11.setBounds(60,230,100,50);
        l11.setForeground(new Color(10,10,10));
        l11.setFont(f5);
        p1.add(l11);
        
         
         Calendar c = Calendar.getInstance();
         c.setTime(new Date()); // Using today's date
         c.add(Calendar.DATE, 90);//adding 90 days
        
        d=new JDateChooser();
        d.setBounds(180,240,250,30);
        d.setFont(f5);
         d.setMaxSelectableDate(c.getTime());
        d.setMinSelectableDate(new Date());
        p1.add(d);
        
         
        l12=new JLabel("Class:");
        l12.setBounds(60,300,100,50);
        l12.setForeground(new Color(10,10,10));
        l12.setFont(f5);
        p1.add(l12);
        
         String []str5={"Select","Economy","Bussiness","First","Premium Economy"};
        c6=new JComboBox(str5);
        c6.setBounds(180,310,250,30);
        c6.setFont(f5);
        p1.add(c6);
        
        btn1=new JButton("Reset");
        btn1.setBounds(30,400,200,25);
        btn1.setFont(f4);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        btn1.setFocusable(false);
        btn1.setBorderPainted(false);
        btn1.addActionListener(this);
        p1.add(btn1);
        
         btn2=new JButton("Back");
        btn2.setBounds(140,450,200,25);
        btn2.setFont(f4);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        btn2.setFocusable(false);
        btn2.setBorderPainted(false);
        btn2.addActionListener(this);
        p1.add(btn2);
        
        btn3=new JButton("Submit");
        btn3.setBounds(260,400,200,25);
        btn3.setFont(f4);
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.WHITE);
        btn3.setFocusable(false);
        btn3.setBorderPainted(false);
        btn3.addActionListener(this);
        p1.add(btn3);
         
        f.add(l1);
        f.setSize(sz.width,sz.height);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==btn1){
             c6.setSelectedItem("Select");
             cb.setSelectedItem("Select");
             cb2.setSelectedItem("Select");
             d.setCalendar(null);
             
           }
            else if(ae.getSource()==btn3){
            String s2=(String)c6.getSelectedItem();//class
            String s3=(String)cb.getSelectedItem();//dept
            String s4=(String)cb2.getSelectedItem();//arri
            try{
             Object value = timeSpinner.getValue();
                    if (value instanceof Date) {
                        Date date = (Date)value;
                        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
                        time = format.format(date);
                      }}catch(Exception e){System.out.println(e);}
             try{
             Object value = timeSpinner2.getValue();
                    if (value instanceof Date) {
                        Date date = (Date)value;
                        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
                        time1 = format.format(date);
                      }}catch(Exception e){System.out.println(e);}
            
             if(d.getDate()==null || s2.equals("Select") || s3.equals("Select") || s4.equals("Select") ){JOptionPane.showMessageDialog(null,"Please Select All The Required Fields ");} 
              SimpleDateFormat sformat=new SimpleDateFormat("dd/MM/yyyy");
                   s1=sformat.format(d.getDate());
                    LocalDateTime dt = LocalDateTime.now();
                DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                 st =dt.format(df);//date
               ti=s1.compareTo(st);
             if(s3.equals(s4)){JOptionPane.showMessageDialog(null,"Source and destination cannot be same");}
             else if(time.equals(time1)){JOptionPane.showMessageDialog(null,"departure and the arrival time cannot be same " );}
              else if(checkDate1(ti)){JOptionPane.showMessageDialog(null,"You cannot add flights for Today \n You can only add flights before 24 hours of departure" );}
              else if(checkDate(ti)){JOptionPane.showMessageDialog(null,"You cannot add flights with past date " ); }
             else{
            try{
                
                 java.util.Date d1= new SimpleDateFormat("HH:mm").parse(time); 
                   java.util.Date d2= new SimpleDateFormat("HH:mm").parse(time1);            
           
             long diff = d2.getTime() - d1.getTime();
             if(diff<0){JOptionPane.showMessageDialog(null, "Error In Defining Time \n Arrival Time Is Before The Departure Time");}
             else{
              TimeTaken = String.format( "%s mins",TimeUnit.MILLISECONDS.toMinutes(diff) );
             conn c1=new conn();
             String q="select * from flight_info where DeptAt='"+s3+"' and ArriAr='"+s4+"' and type='"+s2+"'";
             
             ResultSet rs= c1.s.executeQuery(q);
             if(rs.next()){
                String n1=rs.getString("fl_code");//flight code
                 String n2=rs.getString("DeptAt");//Deptarture
                  String n3=rs.getString("DeptTime");//Depttime
                   String n4=rs.getString("ArriAr");//Arrival
                    String n5=rs.getString("ArriTime");//Arrival time
                     String n6=rs.getString("Duration");//Duration
                      String n7=rs.getString("Price");//price
                       String n8=rs.getString("seats");//seats
                        String n9=rs.getString("type");//class
                       
                        
                        
                        String q1="select * from flightschedule where date='"+s1+"' and DeptAt='"+s3+"' and ArriAt='"+s4+"' and class_name='"+s2+"'" ;
                        ResultSet rs1=c1.s.executeQuery(q1);
                         if(rs1.next()){
                            
                         JOptionPane.showMessageDialog(null,"Flight Already Exist On Give Date ");
                        }
                        
                        else{
                               
                        String q2="insert into flightschedule values('"+s1+"','"+n1+"','"+n2+"','"+time+"','"+n4+"','"+time1+"','"+TimeTaken+"','"+n7+"','"+n8+"','"+s2+"')";
                        c1.s.executeUpdate(q2);
                         JOptionPane.showMessageDialog(null,"New Flight Added ");
                         c6.setSelectedItem("Select");
                         cb.setSelectedItem("Select");
                         cb2.setSelectedItem("Select");
                         d.setCalendar(null);
                       
                         }
                         
             }
             }
            // c1.c.close();
                
            }catch(Exception e){System.out.println(e);}
             
            }
            }
            else if(ae.getSource()==btn2){
              f.setVisible(false);
               new AdminOptionsDesign();
            }
            
        }
        public boolean checkDate(int i){
        boolean b=false;
        int x=i;
        if(x==-1){
        return true;
        } 
            return false;
        }
         public boolean checkDate1(int i){
        boolean b=false;
        int x=i;
        if(x==0){
        return true;
        } 
            return false;
        }
    }

public class Add_Flights {
    public static void main(String args[]){
      
      new addFlights();
    }
    
}
