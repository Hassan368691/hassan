
package banking.manegment.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class signupthree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton Submit,cancel;
    String formno;
    
    
    signupthree(String formno){
        
        this.formno = formno;
        setLayout(null);
        
        
        JLabel ad  = new JLabel("page 3:Appliaction Detail");
        ad.setFont(new Font("Raleway", Font.BOLD,22));
        ad.setBounds(280,40,400,40);
        add(ad);
         
        JLabel type  = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1 = new JRadioButton("Saving account");
        r1.setFont(new Font("Raleway", Font.BOLD,16));
        r1.setBounds(100,180,150,20);
        r1.setBackground(Color.WHITE);
        add(r1);
        
        r2 = new JRadioButton("Fixed Desopit Amount");
        r2.setFont(new Font("Raleway", Font.BOLD,16));
        r2.setBounds(340,180,150,20);
        r2.setBackground(Color.WHITE);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD,16));
        r3.setBounds(100,220,150,20);
        r3.setBackground(Color.WHITE);
        add(r3);
        
        r4 = new JRadioButton("Recurring Desopit Account");
        r4.setFont(new Font("Raleway", Font.BOLD,16));
        r4.setBounds(350,220,150,20);
        r4.setBackground(Color.WHITE);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        
        JLabel card  = new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number  = new JLabel("xxxx-xxxx-xxxx-4184");
        number.setFont(new Font("Raleway", Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel cnum  = new JLabel("your 16 digit card number");
        cnum.setFont(new Font("Raleway", Font.BOLD,12));
        cnum.setBounds(100,330,300,20);
        add(cnum);
        
        JLabel pin  = new JLabel("PIN Number:");
        pin.setFont(new Font("Raleway", Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        
        
        JLabel pnumber  = new JLabel("xxxx");
        pnumber.setFont(new Font("Raleway", Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        JLabel pinDetail  = new JLabel("your 4 digit code");
        pinDetail.setFont(new Font("Raleway", Font.BOLD,12));
        pinDetail.setBounds(100,400,300,20);
        add(pinDetail);
        
         JLabel servies  = new JLabel("Services Required:");
         servies.setFont(new Font("Raleway", Font.BOLD,22));
         servies.setBounds(100,450,400,30);
         add(servies);
         
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,14));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,14));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,14));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4 = new JCheckBox("Email&SMS Alert");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,14));
        c4.setBounds(350,550,220,30);
        add(c4);
        
        c5 = new JCheckBox("CheckBook");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,14));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,14));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7 = new JCheckBox("I Hereby declare that above the enter detailed are correct to the best of my Knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,8));
        c7.setBounds(100,650,600,30);
        add(c7);
        
        Submit  = new JButton("Submit");
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);
        Submit.setFont(new Font("Raleway",Font.BOLD,12));
        Submit.addActionListener(this);
        Submit.setBounds(250,670,100,30);
        add(Submit);
        
        cancel  = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,12));
        cancel.addActionListener(this);
        cancel.setBounds(420,670,100,30);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
       
        setSize(800,820);
        setLocation(350,0);
        setVisible(true);
       
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Submit){
            String accounttype = null;
            if(r1.isSelected()){
                accounttype = "saving account";
            }else if (r2.isSelected()){
                accounttype = "Fixed Desopit Account";
            }else if (r3.isSelected()){
                accounttype = "Current Account";
            }else if (r4.isSelected()){
                accounttype = "Recurring Desopit Account";
            }
            Random random = new Random();
            String CardNumber = "" + Math.abs((random.nextLong()% 90000000L) + 5040936000000000L);
            
            String pinnumber = "" + Math.abs((random.nextLong()% 9000L) + 1000L);
            
            String facility =  "";
            if(c1.isSelected()){
                facility = facility + "ATM Card";
            }else if (c2.isSelected()){
                facility = facility + "Internet Banking";
            }else if (c3.isSelected()){
                facility = facility + "Mobile Banking";
            }else if (c4.isSelected()){
                facility = facility + "Email&SMS Alert";
            }else if (c5.isSelected()){
                facility = facility + "CheckBook";
            }else if (c6.isSelected()){
                facility = facility + "E-Statement";
            }
            try{
                if(accounttype.equals("")){
                    JOptionPane.showMessageDialog(null, "Account type is Required");
                }else {
                    conn c = new conn();
                    String query1 = "insert into signup3 values('"+formno+"','"+accounttype+"','"+CardNumber+"','"+pinnumber+"','"+facility+"')";
                    String query2 = "insert into Login values('"+formno+"','"+CardNumber+"','"+pinnumber+"')";
                    c.s.executeUpdate(query1);
                    c.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null, "Card Number:" + CardNumber + "\n PIN:" + pinnumber);
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                }
            
            
            }catch (Exception e){
              System.out.println(e);  
            }
                    
            
        }else if (ae.getSource() == cancel){
            setVisible(false);
            new Loginn().setVisible(true);
            
            
        }
        }
        
        public static void main(String args[]) {
           new signupthree("");
    }
            
        }
    
    
        

    

