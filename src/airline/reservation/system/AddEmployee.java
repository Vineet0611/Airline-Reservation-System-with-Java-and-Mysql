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
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Random;
class AddAdministratorDesign extends JFrame implements ActionListener{
    JFrame f;
    JPanel p,p1,p3;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31;
    JTextField tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8;
    JPasswordField tp1;
    JButton btn1,btn2,btn3,btn4,btn5;
    Font f1,f2,f3,f4,f5,f6;
    JComboBox cb1;
    JDateChooser d;
     JRadioButton male,female,married,unmarried,other;
   public  AddAdministratorDesign(){
      f=new JFrame("Airline Reservation System");        
        Dimension sz=Toolkit.getDefaultToolkit().getScreenSize();
        
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
        
         ImageIcon icon1 =new ImageIcon((ClassLoader.getSystemResource("airline/reservation/system/image/vin9.png")));
        Image newimg = icon1.getImage().getScaledInstance(64,64, java.awt.Image.SCALE_SMOOTH);
        icon1=new ImageIcon(newimg);
        f.setIconImage(newimg);

        
         
       
        //---------------------------panel 1---------------------
         p1=new JPanel();
         p1.setBounds(425,100,500,550);
         p1.setLayout(null);
         p1.setVisible(true);
         p1.setOpaque(true);
         p1.setBackground(new Color(225,225,225,75));
         f.add(p1);
         
         
        l8=new JLabel("Employee Details");
        l8.setBounds(120,10,400,50);
        l8.setForeground(new Color(10,10,10));
        l8.setFont(f3);
        p1.add(l8);
        
        l9=new JLabel("Full Name:");
        l9.setBounds(60,60,300,50);
        l9.setForeground(new Color(10,10,10));
        l9.setFont(f5);
        p1.add(l9);
        
        tx2=new JTextField();
        tx2.setBounds(180,70,250,30);
        tx2.setFont(f5);
        p1.add(tx2);
        
        l10=new JLabel("Father Name:");
        l10.setBounds(60,100,300,50);
        l10.setForeground(new Color(10,10,10));
        l10.setFont(f5);
        p1.add(l10);
        
        tx3=new JTextField();
        tx3.setBounds(180,110,250,30);
        tx3.setFont(f5);
        p1.add(tx3);
        
        l11=new JLabel("D.O.B:");
        l11.setBounds(60,140,100,50);
        l11.setForeground(new Color(10,10,10));
        l11.setFont(f5);
        p1.add(l11);
        
        d=new JDateChooser();
        d.setBounds(180,150,250,30);
        d.setFont(f5);
        p1.add(d);
        
        l11=new JLabel("Gender:");
        l11.setBounds(60,180,100,50);
        l11.setForeground(new Color(10,10,10));
        l11.setFont(f5);
        p1.add(l11);
        
        male=new JRadioButton("Male");
        male.setFont(f5);
        male.setForeground(new Color(10,10,10));
        male.setBorderPainted(false);
        male.setFocusable(false);
        male.setBounds(180,190,70,30);
        p1.add(male);

        female=new JRadioButton("Female");
        female.setFont(f5);
        female.setForeground(new Color(10,10,10));
        female.setBorderPainted(false);
        female.setFocusable(false);
        female.setBounds(280,190,90,30);
        p1.add(female);

        other=new JRadioButton("Other");
        other.setFont(f5);
        other.setForeground(new Color(10,10,10));
        other.setBorderPainted(false);
        other.setFocusable(false);
        other.setBounds(390,190,70,30);
        p1.add(other);

        ButtonGroup b=new ButtonGroup();
        b.add(male);
        b.add(female);
        b.add(other);
        
        l12=new JLabel("Marital Status:");
        l12.setBounds(60,230,200,50);
        l12.setForeground(new Color(10,10,10));
        l12.setFont(f5);
        p1.add(l12);
        
        married=new JRadioButton("Married");
        married.setFont(f5);
        married.setForeground(new Color(10,10,10));
        married.setBorderPainted(false);
        married.setFocusable(false);
        married.setBounds(180,240,90,30);
        p1.add(married);
        
        unmarried=new JRadioButton("Unmarried");
        unmarried.setFont(f5);
        unmarried.setForeground(new Color(10,10,10));
        unmarried.setBorderPainted(false);
        unmarried.setFocusable(false);
        unmarried.setBounds(300,240,110,30);
        p1.add(unmarried);
        
        ButtonGroup b1=new ButtonGroup();
        b1.add(married);
        b1.add(unmarried);
   
        
        l13=new JLabel("Nationality:");
        l13.setBounds(60,270,200,50);
        l13.setForeground(new Color(10,10,10));
        l13.setFont(f5);
        p1.add(l13);
        
        tx4=new JTextField();
        tx4.setBounds(180,280,250,30);
        tx4.setFont(f5);
        p1.add(tx4);
        
        l14=new JLabel("Qualification:");
        l14.setBounds(60,310,200,50);
        l14.setForeground(new Color(10,10,10));
        l14.setFont(f5);
        p1.add(l14);
        
        tx5=new JTextField();
        tx5.setBounds(180,320,250,30);
        tx5.setFont(f5);
        p1.add(tx5);
        
        l15=new JLabel("Address:");
        l15.setBounds(60,350,200,50);
        l15.setForeground(new Color(10,10,10));
        l15.setFont(f5);
        p1.add(l15);
        
        tx6=new JTextField();
        tx6.setBounds(180,360,250,30);
        tx6.setFont(f5);
        p1.add(tx6);
        
        l16=new JLabel("Phone no:");
        l16.setBounds(60,390,200,50);
        l16.setForeground(new Color(10,10,10));
        l16.setFont(f5);
        p1.add(l16);
        
        tx7=new JTextField();
        tx7.setBounds(180,400,250,30);
        tx7.setFont(f5);
        p1.add(tx7);
        
        l17=new JLabel("Email:");
        l17.setBounds(60,430,200,50);
        l17.setForeground(new Color(10,10,10));
        l17.setFont(f5);
        p1.add(l17);
        
        tx8=new JTextField();
        tx8.setBounds(180,440,250,30);
        tx8.setFont(f5);
        p1.add(tx8);
        
        
        
        
         btn2=new JButton("Back");
        btn2.setBounds(80,500,150,25);
        btn2.setFont(f4);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        btn2.setFocusable(false);
        btn2.setBorderPainted(false);
        btn2.addActionListener(this);
        p1.add(btn2);
        
        btn3=new JButton("Submit");
        btn3.setBounds(280,500,150,25);
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
     
       if(ae.getSource()==btn3){
            String s1=tx2.getText();//full name
            String s2=tx3.getText();// fathers name
           
            String s4="";
            if(male.isSelected()){s4="Male";}
            else if(female.isSelected()){s4="Female";}
            else if(other.isSelected()){s4="Other";}
            String s5="";
            if(married.isSelected()){s5="Married";}
            else if(unmarried.isSelected()){s5="Unmarried";}
            String s6=tx4.getText();//Nationality
            String s7=tx5.getText();//Qualification
            String s8=tx6.getText();//Address
            String s10=tx7.getText();//Number
            String s11=tx8.getText();//Email
            Random rn =new Random();
                 int first4=(rn.nextInt()%9000);
                 int first=Math.abs(first4)+1000;
            String s9=Integer.toString(first);
            if(s1.equals("")||s2.equals("")||d.getDate()==null||s4.equals("")||s5.equals("")||s6.equals("")||s7.equals("")||s8.equals("") ||s10.equals("") ||s11.equals("")){
             JOptionPane.showMessageDialog(null, "Please Fill All The Fields");
            }
            else if(checkNo(s10)){JOptionPane.showMessageDialog(null, "Alphabets not allowed in Number field");}
            else if((s10.length())<10 || (s10.length())>10 ){JOptionPane.showMessageDialog(null, "Number should have exactly 10 values ");}
            else if(checkEmail(s11)){JOptionPane.showMessageDialog(null, "Email should contain .com or .co.in");}
            else if(checkEmail3(s11)){JOptionPane.showMessageDialog(null, "No Domain Name Found...\n Hint:xyz@gmail.com");}
            else if(checkEmail2(s11)){JOptionPane.showMessageDialog(null, " @ not present in email ");}

            else{
                
                 SimpleDateFormat sformat=new SimpleDateFormat("dd/MM/yyyy");
            String s3=sformat.format(d.getDate());
              
                try{
                    conn c1=new conn();
                    String q="insert into employeelogin values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"')";
                    c1.s.executeUpdate(q);
                    c1.c.close();
                    JOptionPane.showMessageDialog(null,"Administrator Added Successfully \n"+"user_name="+s1+"\n Password="+s9);
                    tx2.setText("");
                    tx3.setText("");
                    tx4.setText("");
                    tx5.setText("");
                    tx6.setText("");
                     tx7.setText("");
                      tx8.setText("");
                    d. setCalendar(null);
                }catch(Exception e){System.out.println(e);}
            }
        
      }else if(ae.getSource()==btn2){
         f.setVisible(false);
           new AdminOptionsDesign();
      }
   }
     public boolean checkNo(String z){
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
     public boolean checkEmail(String s){
         boolean b=true;
        String a=s;
        if(a.contains(".com") || a.contains(".co.in")){
         return false;
        }
     return true;
     }
     public boolean checkEmail2(String s){
         boolean b=true;
        String a=s;
        if( a.contains("@")){
         return false;
        }
     return true;
     }
     public boolean checkEmail3(String s){
         boolean b=true;
        String a=s;
        if( a.contains("gmail") || a.contains("yahoo") || a.contains("hotmail")){
         return false;
        }
     return true;
     }
   
}
public class AddEmployee {
   public static void main(String args[]){
    new AddAdministratorDesign();
   }
}
