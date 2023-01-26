package banking.manegment.application;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public  class Loginn extends JFrame implements ActionListener{
    
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Loginn(){
        setLayout(null);
        setTitle("Banking Application");
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
        Image i2 = il.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("osward", Font.BOLD,38));
        text.setBounds(250 ,40, 400, 40);
        add(text);
        
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Railway", Font.BOLD,25));
        cardno.setBounds(150 ,150, 150, 30);
        add(cardno);
        
        cardTextField  = new JTextField();
        cardTextField.setBounds(300,150,250,30);
        add(cardTextField);
        
        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Railway", Font.BOLD,25));
        pin.setBounds(200 ,220, 250, 30);
        add(pin);
        
        pinTextField  = new JPasswordField();
        pinTextField.setBounds(300,220,250,30);
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 500);
        setVisible(true);
        setLocation(350, 200);
    }
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()== clear){
        cardTextField.setText("");
        pinTextField.setText("");
    }else if(ae.getSource()==login){
        conn conn  = new conn();
        String cardnumber = cardTextField.getText();
        String pinnumber = pinTextField.getText();
        String query = "Select * from Login where CardNumber = '"+cardnumber+"'and pinnumber  = '"+pinnumber+"'";
        try{
            ResultSet rs = conn.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                new Transaction1(pinnumber).setVisible(true);
            }else{
            JOptionPane.showMessageDialog(null, "incorrect cardnumber or pin Try Again");
            }
        
        }catch (Exception e){
            System.out.println(e);
        
        }
        
    }else if(ae.getSource() == signup){
       setVisible(false);
       new signupone().setVisible(true);
    }
    
    }
    public static void main(String args[]) {
        new Loginn();
    }
   

   
}
    

