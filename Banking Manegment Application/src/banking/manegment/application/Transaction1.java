
package banking.manegment.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transaction1 extends JFrame implements ActionListener{
    
    JButton deposit,widraw,fastcash,pinchange,pin,Balance,exit;
    String pinnumber;
    
    Transaction1(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 800);
        add(image);
        
        JLabel text  = new JLabel("please select your Transaction");
        text.setFont(new Font ("Raleway", Font.BOLD,22));
        text.setBounds(180, 300, 700, 35);
        text.setForeground(Color.WHITE);
        image.add(text);
        
        deposit = new JButton("Desopit");
        deposit.setBounds(170, 370, 130,35);
        deposit.addActionListener(this);
        image.add(deposit);
        
        widraw = new JButton("Cash widraw");
        widraw.setBounds(355, 370, 130,35);
        widraw.addActionListener(this);
        image.add(widraw);
        
        fastcash = new JButton("Fastcash");
        fastcash.setBounds(170,400 , 130,35);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        pinchange = new JButton("Ministatement");
        pinchange.setBounds(355, 430, 130,35);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        pin = new JButton("pin change");
        pin.setBounds(170, 430, 130,35);
        pin.addActionListener(this);
        image.add(pin);
        
        Balance = new JButton("Balance Enquery");
        Balance.setBounds(355, 400, 130,35);
        Balance.addActionListener(this);
        image.add(Balance);
        
        exit = new JButton("Exit");
        exit.setBounds(355, 460, 130,30);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(900,800);
        setVisible(true);
        setUndecorated(true);
        setLocation(350,0);
    }
    
    public void actionPerformed(ActionEvent ae){
        
       if(ae.getSource() == exit){
       System.exit(0);
       }else if(ae.getSource() == deposit){
           setVisible(false);
           new Deposit(pinnumber).setVisible(true);
       }
       
    }
    public static void main(String args[]) {
      new Transaction1("");
    }
    
}
    

