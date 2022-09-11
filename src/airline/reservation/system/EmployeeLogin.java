/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.reservation.system;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
class EmployeeLoginDesign extends JFrame implements ActionListener {
    JFrame f;
    JPanel p;
    Font f1,f2,f3,f4,f5,f6;
     
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextField tx1;
    JButton btn1,btn2;
    JPasswordField tp1;
   public EmployeeLoginDesign(){
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
        
         p=new JPanel();
        p.setBounds(465,150,400,420);
        p.setLayout(null);
        p.setVisible(true);
        p.setOpaque(true);
        p.setBackground(new Color(255, 255,255,75));
     
        l7=new JLabel("Employee");
        l7.setBounds(120,30,300,50);
        l7.setForeground(new Color(10,10,10));
        l7.setFont(f3);
        p.add(l7);
        
        l4=new JLabel("Login");
        l4.setBounds(150,70,300,50);
        l4.setForeground(new Color(10,10,10));
        l4.setFont(f3);
        p.add(l4);
        
        l5=new JLabel("Username");
        l5.setBounds(70,120,300,50);
        l5.setForeground(new Color(10,10,10));
        l5.setFont(f5);
        p.add(l5);
        
        tx1=new JTextField();
        tx1.setBounds(70,160,250,30);
        tx1.setFont(f5);
        p.add(tx1);
        
        l6=new JLabel("Password");
        l6.setBounds(70,190,300,50);
        l6.setForeground(new Color(10,10,10));
        l6.setFont(f5);
        p.add(l6);
        
        tp1=new JPasswordField();
        tp1.setBounds(70,230,250,30);
        tp1.setFont(f5);
        p.add(tp1);
        
        btn1=new JButton("Login");
        btn1.setBounds(70,290,250,25);
        btn1.setFont(f4);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        btn1.setFocusable(false);
        btn1.setBorderPainted(false);
        btn1.addActionListener(this);
        p.add(btn1);
        
        btn2=new JButton("Back");
        btn2.setBounds(70,350,250,25);
        btn2.setFont(f4);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        btn2.setFocusable(false);
        btn2.setBorderPainted(false);
        btn2.addActionListener(this);
        p.add(btn2);
        f.add(p);
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
              String q1="select * from employeelogin where name='"+s1+"' and pin='"+s2+"'";
              ResultSet rs=c1.s.executeQuery(q1);
              if(rs.next()){
                  tx1.setText("");
                  tp1.setText("");
                  f.setVisible(false);
                  new EmployeeOptionDesign();
              }
              else{JOptionPane.showMessageDialog(null,"Incorrect Login Credentials");}
          }catch(Exception e){
              System.out.println(e);
          }
          }
      }
      else if(ae.getSource()==btn2){
          f.setVisible(false);
          new Role();
      }
   }
}
public class EmployeeLogin {
    public static void main(String args[]){
     new EmployeeLoginDesign();
    }
    
}
