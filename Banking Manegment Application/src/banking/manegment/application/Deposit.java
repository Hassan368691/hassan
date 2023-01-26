
package banking.manegment.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;



public class Deposit extends JFrame implements ActionListener  {
    
    JButton deposit,back;
    JTextField amount;
    String pinnumber;
    
    Deposit(String pinnumber){
        this.pinnumber = pinnumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 800);
        add(image);   
        
        JLabel text  = new JLabel("Enter the button you wnt the desopit");
        text.setFont(new Font ("Raleway", Font.BOLD,20));
        text.setBounds(160, 300, 400, 35);
        text.setForeground(Color.WHITE);
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD,22));
        amount.setBounds(180, 350, 320, 30);
        image.add(amount);
        
        deposit = new JButton("Desopit");
        deposit.setBounds(355, 410, 150,35);
        deposit.addActionListener(this);
        deposit.addActionListener(this);
        image.add(deposit);
        
        back = new JButton("Back");
        back.setBounds(355, 450, 150,35);
        back.addActionListener(this);
        back.addActionListener(this);
        image.add(back);
       
        
    
    
    setSize(900,800);
    setVisible(true);
    setLocation(400,0);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == deposit){
            String number = amount.getText();
            Date date = new Date();
            if (number.equals("")){
            JOptionPane.showMessageDialog(null, "please enter the amount you want to desopit");
            }else {
              try{  
            conn conn  = new conn();
            String query = "insert into bank   values('"+pinnumber+"','"+date+"','"+deposit+"','"+number+"')";
            conn.s.executeLargeUpdate(query);
            JOptionPane.showMessageDialog(null, "Rs "+number+ "Desopit successfully");
            setVisible(false);
            new Transaction1(pinnumber).setVisible(true); 
              }catch(Exception e){
                  System.out.println(e);
              }
            }
            
        }else if(ae.getSource() == back){
            
        
            new Transaction1(pinnumber).setVisible(true);
        }
    
    
    }
    public static void main(String args[]) {
        new Deposit("");
    }
            
    
}
    

