/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline.reservation.system;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;

class ViewFlightsDesign extends JFrame implements ActionListener{
    JFrame f;
    JPanel p,p1,p2;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34;
    JTextField tx1;
    JPasswordField tp1;
    JButton btn1,btn2,btn3,btn4,btn5;
    Font f1,f2,f3,f4,f5,f6;
    JComboBox cb1;
    JDateChooser d;
    JTable t;
    JScrollPane sp;
    public ViewFlightsDesign(){
     f=new JFrame("Airline  Reservation System"); 
         f.setLayout(null);
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
         
         l7=new JLabel("View Flights By");
        l7.setBounds(130,1,300,50);
        l7.setForeground(new Color(10,10,10));
        l7.setFont(f3);
        p1.add(l7);
        

        l4=new JLabel(" Destination:");
        l4.setBounds(30,100,300,50);
        l4.setForeground(new Color(10,10,10));
        l4.setFont(f5);
        p1.add(l4);
        
        l5=new JLabel("Date:");
        l5.setBounds(30,200,200,50);
        l5.setForeground(new Color(10,10,10));
        l5.setFont(f5);
        p1.add(l5);
        
         String str1[]={"Select","Bengaluru","Chennai","Mumbai","Dehli","Kolkata"};
        cb1=new JComboBox(str1);
        cb1.setBounds(135,113,200,25);
        cb1.setFont(f4);
        p1.add(cb1);
        
        d=new JDateChooser();
        d.setBounds(135,213,200,25);
        d.setFont(f4);
        p1.add(d);
        
        btn1=new JButton("Check");
        btn1.setBounds(350,113,100,25);
        btn1.setFont(f4);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        btn1.setFocusable(false);
        btn1.setBorderPainted(false);
        btn1.addActionListener(this);
        p1.add(btn1);
        
        btn2=new JButton("Check");
        btn2.setBounds(350,213,100,25);
        btn2.setFont(f4);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
        btn2.setFocusable(false);
        btn2.setBorderPainted(false);
        btn2.addActionListener(this);
        p1.add(btn2);
        
        btn4=new JButton("Back");
        btn4.setBounds(130,300,200,25);
        btn4.setFont(f4);
        btn4.setBackground(Color.BLACK);
        btn4.setForeground(Color.WHITE);
        btn4.setFocusable(false);
        btn4.setBorderPainted(false);
        btn4.addActionListener(this);
        p1.add(btn4);
        
         p2=new JPanel();
         p2.setBounds(60,100,1220,550);
         p2.setLayout(null);
         p2.setVisible(false);
         p2.setOpaque(true);
         p2.setBackground(new Color(225,225,225,75));
         f.add(p2);
         
          l15=new JLabel("Search Result");
        l15.setBounds(500,5,300,60);
        l15.setForeground(new Color(10,10,10));
        l15.setFont(f3);
        p2.add(l15);
        
          t=new JTable();
        t.setBackground(Color.WHITE);
        t.setBounds(25,150,1150,300);
        t.setFont(f4);
        t.setEnabled(false);
        t.setRowHeight(t.getRowHeight()+20);
        JTableHeader header = t.getTableHeader();
        header.setPreferredSize(new Dimension(100, 0));
        
        sp=new JScrollPane(t);
        sp.setBounds(25,150,1150,300);
        sp.setBackground(Color.WHITE);
        p2.add(sp);
        
         btn3=new JButton("Back");
        btn3.setBounds(500,480,200,25);
        btn3.setFont(f4);
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.WHITE);
        btn3.setFocusable(false);
        btn3.setBorderPainted(false);
        p2.add(btn3);
        btn3.addActionListener(this);
        
        
        
        l16=new JLabel("Date");
        l16.setFont(f5);
        l16.setBounds(70,95,50,30);
        p2.add(l16);
        
         l17=new JLabel("Flight");
        l17.setFont(f5);
        l17.setBounds(180,95,50,30);
        p2.add(l17);
        
        l18=new JLabel("code");
        l18.setFont(f5);
        l18.setBounds(180,115,50,30);
        p2.add(l18);
        
        l19=new JLabel("Departure");
        l19.setFont(f5);
        l19.setBounds(270,95,150,30);
        p2.add(l19);
        
        l20=new JLabel("At");
        l20.setFont(f5);
        l20.setBounds(300,115,50,30);
        p2.add(l20);
        
         l21=new JLabel("Departure");
        l21.setFont(f5);
        l21.setBounds(390,95,150,30);
        p2.add(l21);
        
        l22=new JLabel("Time");
        l22.setFont(f5);
        l22.setBounds(410,115,50,30);
        p2.add(l22);
        
         l23=new JLabel("Arrival");
        l23.setFont(f5);
        l23.setBounds(520,95,150,30);
        p2.add(l23);
        
        l24=new JLabel("At");
        l24.setFont(f5);
        l24.setBounds(525,115,50,30);
        p2.add(l24);
        
         l25=new JLabel("Arrival");
        l25.setFont(f5);
        l25.setBounds(630,95,150,30);
        p2.add(l25);
        
        l26=new JLabel("Time");
        l26.setFont(f5);
        l26.setBounds(635,115,50,30);
        p2.add(l26);
        
         l27=new JLabel("Duration");
        l27.setFont(f5);
        l27.setBounds(730,95,150,30);
        p2.add(l27);
        
         l28=new JLabel("Price");
        l28.setFont(f5);
        l28.setBounds(860,95,150,30);
        p2.add(l28);
        
         l29=new JLabel("Available");
        l29.setFont(f5);
        l29.setBounds(940,95,150,30);
        p2.add(l29);
        
        l30=new JLabel("Seats");
        l30.setFont(f5);
        l30.setBounds(950,115,50,30);
        p2.add(l30);
        
         l31=new JLabel("Class");
        l31.setFont(f5);
        l31.setBounds(1060,95,150,30);
        p2.add(l31);
        
        l32=new JLabel("Type");
        l32.setFont(f5);
        l32.setBounds(1060,115,50,30);
        p2.add(l32);
        
        f.add(l1);
        f.setSize(sz.width,sz.height);
        f.setVisible(true);
       
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btn1){
        String s1=cb1.getSelectedItem().toString();
        if(s1.equals("Select")){
         JOptionPane.showMessageDialog(null, "Please Select Valid Destination");
        }else{
          try{
              conn c1=new conn();
              String l= "select * from  flightschedule where ArriAt='"+s1+"'";
                ResultSet rst= c1.s.executeQuery(l);
                t.setModel(DbUtils.resultSetToTableModel(rst));
                t.getColumnModel().getColumn(1).setPreferredWidth(30);
                 t.getColumnModel().getColumn(3).setPreferredWidth(30);
                 t.getColumnModel().getColumn(5).setPreferredWidth(30);
                 t.getColumnModel().getColumn(7).setPreferredWidth(30);
                 t.getColumnModel().getColumn(8).setPreferredWidth(30);
                 DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
                 cr.setHorizontalAlignment(JLabel.CENTER);
                 t.getColumnModel().getColumn(0).setCellRenderer(cr);
                 t.getColumnModel().getColumn(1).setCellRenderer(cr);
                 t.getColumnModel().getColumn(2).setCellRenderer(cr);
                 t.getColumnModel().getColumn(3).setCellRenderer(cr);
                 t.getColumnModel().getColumn(4).setCellRenderer(cr);
                 t.getColumnModel().getColumn(5).setCellRenderer(cr);
                 t.getColumnModel().getColumn(6).setCellRenderer(cr);
                 t.getColumnModel().getColumn(7).setCellRenderer(cr);
                 t.getColumnModel().getColumn(8).setCellRenderer(cr);
                 t.getColumnModel().getColumn(9).setCellRenderer(cr);
                 String l1= "select * from  flightschedule where ArriAt='"+s1+"'";
                  ResultSet rct= c1.s.executeQuery(l1);
               if(rct.next()){
                     p1.setVisible(false);
                     p2.setVisible(true);
                
             
                }else{JOptionPane.showMessageDialog(null, "No Flights Found For Given Desitination ");}
          }catch(Exception  e){JOptionPane.showMessageDialog(null, e);}
        
        }
      }
      else if(ae.getSource()==btn2){
            
            
            if(d.getDate()==null){ JOptionPane.showMessageDialog(null, "Please Select  Date");}
            else{
                 try{
                      SimpleDateFormat sformat=new SimpleDateFormat("dd/MM/yyyy");
            String sl3=sformat.format(d.getDate());
              conn c1=new conn();
              String l= "select * from  flightschedule where date='"+sl3+"'";
                ResultSet rst= c1.s.executeQuery(l);
                t.setModel(DbUtils.resultSetToTableModel(rst));
                 t.getColumnModel().getColumn(1).setPreferredWidth(30);
                 t.getColumnModel().getColumn(3).setPreferredWidth(30);
                 t.getColumnModel().getColumn(5).setPreferredWidth(30);
                 t.getColumnModel().getColumn(7).setPreferredWidth(30);
                 t.getColumnModel().getColumn(8).setPreferredWidth(30);
                 DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
                 cr.setHorizontalAlignment(JLabel.CENTER);
                 t.getColumnModel().getColumn(0).setCellRenderer(cr);
                 t.getColumnModel().getColumn(1).setCellRenderer(cr);
                 t.getColumnModel().getColumn(2).setCellRenderer(cr);
                 t.getColumnModel().getColumn(3).setCellRenderer(cr);
                 t.getColumnModel().getColumn(4).setCellRenderer(cr);
                 t.getColumnModel().getColumn(5).setCellRenderer(cr);
                 t.getColumnModel().getColumn(6).setCellRenderer(cr);
                 t.getColumnModel().getColumn(7).setCellRenderer(cr);
                 t.getColumnModel().getColumn(8).setCellRenderer(cr);
                 t.getColumnModel().getColumn(9).setCellRenderer(cr);
                 String l1= "select * from  flightschedule where date='"+sl3+"'";
                  ResultSet rct= c1.s.executeQuery(l1);
               if(rct.next()){
                     p1.setVisible(false);
                     p2.setVisible(true);
                
             
                }else{JOptionPane.showMessageDialog(null, "No Flights Found For given date");}
          }catch(Exception  e){JOptionPane.showMessageDialog(null, e);}
            }
      }
      else if(ae.getSource()==btn3){
         p2.setVisible(false);
         p1.setVisible(true);
      }else if(ae.getSource()==btn4){
         f.setVisible(false);
          new EmployeeOptionDesign();
      }
    }
}
public class ViewFlights {
    public static void main(String args[]){
         new ViewFlightsDesign();
    }
}
