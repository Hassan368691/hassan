
package banking.manegment.application;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class signupone extends JFrame implements ActionListener{
    
    Long random;
    JTextField nametextfield,fathertextfield,dobtextfield,gendertextfield,matrailtextfield,emailtextfield,addresstextfield,citytextfield,statetextfield,pincodetextfield;
    JButton next;
    JRadioButton married,unmarried,male,Female;
    JDateChooser dateChooser;
    
    signupone(){
        
        setLayout(null);
        
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L)+ 1000L);
        
        
        JLabel formno = new JLabel("Application Form No." + random);
        formno.setFont(new Font("Raleway",Font.BOLD, 30));
        formno.setBounds(120,20,600,40);
        add(formno);
        
        JLabel PersonalDetail = new JLabel(" page1.Personaldetail..");
        PersonalDetail.setFont(new Font("Raleway",Font.BOLD, 20));
        PersonalDetail.setBounds(250,80,200,30);
        add(PersonalDetail);
        
        JLabel Name = new JLabel(" NAME:");
        Name.setFont(new Font("Raleway",Font.BOLD, 20));
        Name.setBounds(100,140,100,30);
        add(Name);
        
        nametextfield = new JTextField();
        nametextfield.setFont(new Font("Raleway", Font.BOLD,20));
        nametextfield.setBounds(300,140,300,30);
        add(nametextfield);
        
        JLabel Father = new JLabel(" Father's NAME:");
        Father.setFont(new Font("Raleway",Font.BOLD, 20));
        Father.setBounds(100,190,200,30);
        add(Father);
        
        fathertextfield = new JTextField();
        fathertextfield.setFont(new Font("Raleway",Font.BOLD,20));
        fathertextfield.setBounds(300, 190, 300, 30);
        add(fathertextfield);
        
        JLabel dob = new JLabel(" Date Of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
       dateChooser  = new JDateChooser();
       dateChooser.setBounds(300,240,300,30);
       add(dateChooser);
        
        
        
        
         JLabel GEN = new JLabel("Gender:");
        GEN.setFont(new Font("Raleway",Font.BOLD, 20));
        GEN.setBounds(100,290,200,30);
        add(GEN);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        Female = new JRadioButton("Female");
        Female.setBounds(450,290,120,30);
        Female.setBackground(Color.WHITE);
        add(Female);
        
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(Female);
        
        
        JLabel Email = new JLabel("Email:");
        Email.setFont(new Font("Raleway",Font.BOLD, 20));
        Email.setBounds(100,340,200,30);
        add(Email);
        
        emailtextfield = new JTextField();
        emailtextfield.setFont(new Font("Raleway",Font.BOLD,20));
        emailtextfield.setBounds(300, 340, 300, 30);
        add(emailtextfield);
        
        JLabel Matrail = new JLabel("Matrail Status:");
        Matrail.setFont(new Font("Raleway",Font.BOLD, 20));
        Matrail.setBounds(100,390,200,30);
        add(Matrail);
        
        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("UNMarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        ButtonGroup maturial = new ButtonGroup();
        maturial.add(married);
        maturial.add(unmarried);
        
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);
        
        addresstextfield = new JTextField();
        addresstextfield.setFont(new Font("Raleway",Font.BOLD,20));
        addresstextfield.setBounds(300, 440, 300, 30);
        add(addresstextfield);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);
        
        citytextfield = new JTextField();
        citytextfield.setFont(new Font("Raleway",Font.BOLD,20));
        citytextfield.setBounds(300, 490, 300, 30);
        add(citytextfield);
        
        JLabel state = new JLabel("State:");
        state .setFont(new Font("Raleway",Font.BOLD, 20));
        state .setBounds(100,540,200,30); 
        add(state );
        
        statetextfield = new JTextField();
        statetextfield.setFont(new Font("Raleway",Font.BOLD,20));
        statetextfield.setBounds(300, 540, 300, 30);
        add(statetextfield);
        
         JLabel pincode = new JLabel("Pincode:");
         pincode .setFont(new Font("Raleway",Font.BOLD, 20));
         pincode .setBounds(100,590,200,30);
         add(pincode);
         
        pincodetextfield = new JTextField();
        pincodetextfield.setFont(new Font("Raleway",Font.BOLD,20));
        pincodetextfield.setBounds(300, 590, 300, 30);
        add(pincodetextfield);
        
        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,15));
        next.setBounds(630,660,80,30);
        next.addActionListener(this);
        add(next);
        
    
       getContentPane().setBackground(Color.WHITE);
       


        
      setSize(850,800);
      setLocation(350,20);
       setVisible(true);
    }
    public void  actionPerformed(ActionEvent ae){
           String formno = "" , random;
           String name = nametextfield.getText();
           String father  = fathertextfield.getText();
           String dob  = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
           String gender = null;
           if (male.isSelected()){
               gender = "male";
           }else if(Female.isSelected()){
              gender = "Female";
           }
           String email = emailtextfield.getText();
           String matrial = null;
           if (married.isSelected()){
               matrial = "married";
           }else if(unmarried.isSelected()){
               matrial = "unmarried";
           }
           String address = addresstextfield.getText();
           String city = citytextfield.getText();
           String state = statetextfield.getText();
           String pincode = pincodetextfield.getText();
           
          try{
              if (name.equals("")){
              JOptionPane.showMessageDialog(null, "Name is required Enter the Name");
            }
              else
              
              
            {conn c = new conn();
              String query = "insert into Signup values('"+formno+"', '"+name+"', '"+father+"', '"+dob+"', '"+gender+"', '"+matrial+"', '"+email+"', '"+address+"', '"+city+"', '"+state+"','"+pincode+"')";  
              c.s.executeUpdate(query);}
              setVisible(false);
              new signuptwo(formno).setVisible(true);
          }
          catch(Exception e){
          System.out.println(e);
          }
              
          }
    public static void main(String args[]) {
        new signupone();
           
       }
    
    }

