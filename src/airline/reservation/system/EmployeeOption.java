/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.reservation.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class EmployeeOptionDesign extends JFrame implements ActionListener{
     JFrame f;
    JPanel p1;
    JButton btn3,btn4,btn5,btn2,btn6,btn7,btn8,btn9,btn10;
    Font f1,f2,f3,f4,f5,f6,f7;
    JLabel l1,l2,l3;

   public EmployeeOptionDesign(){
       
    
        
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
         f7=new Font(Font.MONOSPACED,Font.PLAIN,15);
        
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
        p1.setBounds(465,130,400,450);
        p1.setLayout(null);
        p1.setVisible(true);
        p1.setOpaque(true);
        p1.setBackground(new Color(255, 255,255,75));
        
        btn2=new JButton("Payment Details");
        btn2.setBounds(70,350,250,25);
        btn2.setFont(f4);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        btn2.setFocusable(false);
        btn2.setBorderPainted(false);
        btn2.addActionListener(this);
        p1.add(btn2);
        
         btn3=new JButton("Book Ticket");
        btn3.setBounds(70,50,250,25);
        btn3.setFont(f4);
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.WHITE);
        btn3.setFocusable(false);
        btn3.setBorderPainted(false);
        btn3.addActionListener(this);
        p1.add(btn3);
        
        btn4=new JButton("Print Ticket");
        btn4.setBounds(70,100,250,25);
        btn4.setFont(f4);
        btn4.setBackground(Color.BLACK);
        btn4.setForeground(Color.WHITE);
        btn4.setFocusable(false);
        btn4.setBorderPainted(false);
        btn4.addActionListener(this);
        p1.add(btn4);
        
        btn5=new JButton("Update Ticket");
        btn5.setBounds(70,150,250,25);
        btn5.setFont(f4);
        btn5.setBackground(Color.BLACK);
        btn5.setForeground(Color.WHITE);
        btn5.setFocusable(false);
        btn5.setBorderPainted(false);
        btn5.addActionListener(this);
        p1.add(btn5);
        
        btn6=new JButton("Cancel Ticket");
        btn6.setBounds(70,200,250,25);
        btn6.setFont(f4);
        btn6.setBackground(Color.BLACK);
        btn6.setForeground(Color.WHITE);
        btn6.setFocusable(false);
        btn6.setBorderPainted(false);
        btn6.addActionListener(this);
        p1.add(btn6);
        
        btn7=new JButton("Passenger List");
        btn7.setBounds(70,250,250,25);
        btn7.setFont(f4);
        btn7.setBackground(Color.BLACK);
        btn7.setForeground(Color.WHITE);
        btn7.setFocusable(false);
        btn7.setBorderPainted(false);
        btn7.addActionListener(this);
        p1.add(btn7);
        
        btn8=new JButton("View Flights");
        btn8.setBounds(70,300,250,25);
        btn8.setFont(f4);
        btn8.setBackground(Color.BLACK);
        btn8.setForeground(Color.WHITE);
        btn8.setFocusable(false);
        btn8.setBorderPainted(false);
        btn8.addActionListener(this);
        p1.add(btn8);
        
       
        
        btn10=new JButton("Logout");
        btn10.setBounds(70,400,250,25);
        btn10.setFont(f4);
        btn10.setBackground(Color.BLACK);
        btn10.setForeground(Color.WHITE);
        btn10.setFocusable(false);
        btn10.setBorderPainted(false);
        btn10.addActionListener(this);
        p1.add(btn10);
        
        
        f.add(p1);
        f.add(l1);
        f.setSize(sz.width,sz.height);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   }
   @Override
   public void actionPerformed(ActionEvent ae){
   if(ae.getSource()==btn3){
     f.setVisible(false);
     new MainFrameDesign1();
   }else if(ae.getSource()==btn4){
       f.setVisible(false);
      new printTicketDesign();
   }else if(ae.getSource()==btn5){
       f.setVisible(false);
      new UpdateTicketDesign();
   }else if(ae.getSource()==btn6){
       f.setVisible(false);
     new CancelTicketDesign();
   }else if(ae.getSource()==btn2){
       f.setVisible(false);
     new PaymentDetailsDesign();
   }else if(ae.getSource()==btn7){
       f.setVisible(false);
     new PassengerListDesign();
   }else if(ae.getSource()==btn8){
       f.setVisible(false);
      new ViewFlightsDesign();
   }else if(ae.getSource()==btn10){
       f.setVisible(false);
      new EmployeeLoginDesign();
   }
   }
}
  
public class EmployeeOption {
    public static void main(String args[]){
      new EmployeeOptionDesign();
    }
}
