/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.reservation.system;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author vineet mendon
 */

class WelcomeFrame{
    JFrame f;
    JLabel l,l1,l2,l3,l4;
    JProgressBar pb;
    Font f1,f2,f3;
    
     public WelcomeFrame(){
      f=new JFrame("Airline Reservation System");
      
      f1=new Font("Castellar",Font.BOLD,45);
        f2=new Font("Harrington",Font.BOLD,30);
         f3=new Font("Harrington",Font.BOLD,25);
      
       Dimension sz=Toolkit.getDefaultToolkit().getScreenSize();
        l1=new JLabel("");
        l1.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/reservation/system/image/vin5.jpg")));
        l1.setBounds(0,0,sz.width,sz.height);
        
          ImageIcon icon1 =new ImageIcon((ClassLoader.getSystemResource("airline/reservation/system/image/vin9.png")));
        Image newimg = icon1.getImage().getScaledInstance(64,64, java.awt.Image.SCALE_SMOOTH);
        icon1=new ImageIcon(newimg);
        f.setIconImage(newimg);
        
        l4=new JLabel("Airline Reservation System");
        l4.setBounds(280,10,800,50);
        l4.setForeground(new Color(102, 4, 20));
        l4.setFont(f1);
        f.add(l4);
        
        l2=new JLabel(" FLY SAFE AIRWAYS ");
        l2.setBounds(420,100,600,50);
        l2.setForeground(new Color(102, 4, 20));
        l2.setFont(f1);
        f.add(l2);
        l3=new JLabel("Welcome To");
        l3.setBounds(600,60,400,40);
        l3.setForeground(new Color(102, 4, 20));
        l3.setFont(f2);
        f.add(l3);
        
        l3=new JLabel("Explore  The  World  With  Us");
        l3.setBounds(500,145,450,40);
        l3.setForeground(new Color(102, 4, 20));
        l3.setFont(f3);
        f.add(l3);
        
        l=new JLabel("Loading...");
        l.setBounds(620,550,450,40);
        l.setForeground(new Color(102, 4, 20));
        l.setFont(f2);
        f.add(l);
        
         pb = new JProgressBar();
         pb.setValue(0);
         pb.setStringPainted(true);
         pb.setBounds(180,600,1000,40);
         pb.setForeground(new Color(102, 4, 20));
         pb.setBorderPainted(false);
         f.add(pb);
         
         
        f.add(l1);
        f.setSize(sz.width,sz.height);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         int i = 0;
        try {
            while (i <= 100) {
                // fill the menu bar
                pb.setValue(i + 10);
 
                // delay the thread
                Thread.sleep(1500);
                i += 20;
            }
            f.setVisible(false);
              new Role();
        }
        catch (Exception e) {
        }
        
     }
}
public class Welcome {
    public static void main(String args[]){
        new WelcomeFrame();
    }
    
}
