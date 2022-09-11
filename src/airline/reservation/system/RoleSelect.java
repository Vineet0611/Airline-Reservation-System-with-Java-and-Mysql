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
class Role extends JFrame implements ActionListener{
    JFrame f;
    JPanel p;
    JLabel l1,l2,l3,l4,l5;
     Font f1,f2,f3,f4,f5,f6,f7;
     JButton btn1,btn2;
    
    public Role(){
       f=new JFrame("Airline Reservation System");
        
        //-----------------------------------Panel-0---------------------Search ticket Frame
        f1=new Font("Castellar",Font.BOLD,45);
        f2=new Font("Harrington",Font.BOLD,25);
        f3=new Font("Cooper",Font.PLAIN,30);
        f4=new Font("Cooper",Font.PLAIN,15);
        f5=new Font("Cooper",Font.PLAIN,18);
        f6=new Font("Cooper",Font.PLAIN,13); 
         f7=new Font(Font.MONOSPACED,Font.PLAIN,150);
        p=new JPanel();
        p.setBounds(300,100,700,500);
        p.setLayout(null);
        p.setOpaque(true);
        p.setBackground(new Color(255, 255,255,75));
        f.add(p);
        
          Dimension sz=Toolkit.getDefaultToolkit().getScreenSize();
        l1=new JLabel("");
        //l1.setIcon(new ImageIcon("C:\\Users\\vineet mendon\\Desktop\\website templates\\vin3.jpg"));
        l1.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/reservation/system/image/vin4.jpg")));
        l1.setBounds(0,0,sz.width,sz.height);
        
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
        
        l4=new JLabel("️👤️");
        l4.setBounds(110,0,400,400);
        l4.setForeground(new Color(102, 4, 20));
        l4.setFont(f7);
        p.add(l4);
        
        l5=new JLabel("️👤️");
        l5.setBounds(400,0,400,400);
        l5.setForeground(new Color(2, 28, 27));
        l5.setFont(f7);
        p.add(l5);
        
          btn1=new JButton("Admin");
        btn1.setBounds(90,300,200,25);
        btn1.setFont(f4);
        btn1.setBackground(new Color(102, 4, 20));
        btn1.setForeground(Color.WHITE);
        btn1.setFocusable(false);
        btn1.setBorderPainted(false);
        btn1.addActionListener(this);
        p.add(btn1);
        
        btn2=new JButton("Employee");
        btn2.setBounds(380,300,200,25);
        btn2.setFont(f4);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        btn2.setFocusable(false);
        btn2.setBorderPainted(false);
        btn2.addActionListener(this);
        p.add(btn2);
        
        f.add(l1);
        f.setSize(sz.width,sz.height);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btn1){
            f.setVisible(false);
            new AdminDesign();
        }
        else if(ae.getSource()==btn2){
           f.setVisible(false);
           new EmployeeLoginDesign();
        }
    }

}
public class RoleSelect {
    public static void main(String args[]){
        new Role();
    }
    
}
