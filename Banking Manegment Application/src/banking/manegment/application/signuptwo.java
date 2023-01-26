
package banking.manegment.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class signuptwo extends JFrame implements ActionListener{
    
    
    JTextField pan, CNIC;
    JButton next;
    JRadioButton EYES,ENO,SYES,SNO;
    JComboBox religion,category,occupation,income,education;
    String formno;
    
    
    signuptwo(String fromno){
        this.formno = formno;
        setLayout(null);
        setTitle("NEW APPLICATION ACCOUNT FORM - PAGE 2");
        
        JLabel addtionalDetail = new JLabel(" page2.Additional detail..");
        addtionalDetail.setFont(new Font("Raleway",Font.BOLD, 20));
        addtionalDetail.setBounds(250,80,200,30);
        add(addtionalDetail);
        
        JLabel Name = new JLabel(" Religion:");
        Name.setFont(new Font("Raleway",Font.BOLD, 20));
        Name.setBounds(100,140,100,30);
        add(Name);
        String valreligion[] = {"Muslim","Hindu","Sikh","christian"};
        religion = new JComboBox(valreligion);
        religion.setBounds(300,140,300,30);
        add(religion);
        
        JLabel Father = new JLabel(" Category:");
        Father.setFont(new Font("Raleway",Font.BOLD, 20));
        Father.setBounds(100,190,200,30);
        add(Father);
        
        String valcate[] = {"General","Sc","other",};
        category = new JComboBox(valcate);
        category.setBounds(300, 190, 300, 30);
        add(category);
        
        JLabel dob = new JLabel(" Income:");
        dob.setFont(new Font("Raleway",Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String valincome[] = {"null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
        income = new JComboBox(valincome);
        income.setBounds(300,240,300,30);
        add(income);
        
        
         JLabel GEN = new JLabel("Educational");
        GEN.setFont(new Font("Raleway",Font.BOLD, 20));
        GEN.setBounds(100,290,200,30);
        add(GEN);
        
        JLabel Email = new JLabel("Qualifiaction:");
        Email.setFont(new Font("Raleway",Font.BOLD, 20));
        Email.setBounds(100,315,200,30);
        add(Email);
        
        String eduactionvalue[] = {"NON-Graduation","Graduation","FSC","Matric","others"};
        education = new JComboBox(eduactionvalue);
        education.setBounds(300,315,300,30);
        add(education);
        
        JLabel Matrail = new JLabel("Occupation:");
        Matrail.setFont(new Font("Raleway",Font.BOLD, 20));
        Matrail.setBounds(100,390,200,30);
        add(Matrail);
        
        String occupationvalue[] = {"Salired","Self-Empolyed","Business","Student","others"};
        occupation = new JComboBox(occupationvalue);
        occupation.setBounds(300,390,400,30);
        add(occupation);
        
       
        
        JLabel address = new JLabel("PAN Number:");
        address.setFont(new Font("Raleway",Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(300, 440, 300, 30);
        add(pan);
        
        JLabel city = new JLabel("CNIC:");
        city.setFont(new Font("Raleway",Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);
        
        CNIC = new JTextField();
        CNIC.setFont(new Font("Raleway",Font.BOLD,20));
        CNIC.setBounds(300, 490, 300, 30);
        add(CNIC);
        
        JLabel state = new JLabel("Senior citizen:");
        state .setFont(new Font("Raleway",Font.BOLD, 20));
        state .setBounds(100,540,200,30); 
        add(state );
        
         SYES = new JRadioButton("YES");
        SYES.setBounds(300,540,100,30);
        SYES.setBackground(Color.WHITE);
        add(SYES);
        
        SNO = new JRadioButton("NO");
        SNO.setBounds(450,540,100,30);
        SNO.setBackground(Color.WHITE);
        add(SNO);
        
        ButtonGroup maturial = new ButtonGroup();
        maturial.add(SYES);
        maturial.add(SNO);
        
        
         JLabel pincode = new JLabel("Existing Account:");
         pincode .setFont(new Font("Raleway",Font.BOLD, 20));
         pincode .setBounds(100,590,200,30);
         add(pincode);
         
        EYES = new JRadioButton("YES");
        EYES.setBounds(300,590,100,30);
        EYES.setBackground(Color.WHITE);
        add(EYES);
        
        ENO = new JRadioButton("NO");
        ENO.setBounds(450,590,100,30);
        ENO.setBackground(Color.WHITE);
        add(ENO);
        
        ButtonGroup Ematurial = new ButtonGroup();
        Ematurial.add(EYES);
        Ematurial.add(ENO);
        
        
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
           String sreligion = (String) religion.getSelectedItem();
           String scategory  =(String) category.getSelectedItem();
           String sincome  =  (String) income.getSelectedItem();
           String seducation = (String) education.getSelectedItem();
           String soccupation = (String) occupation.getSelectedItem();
           String Seniorcitizen = null;
           if (SYES.isSelected()){
               Seniorcitizen = "YES";
           }else if(SNO.isSelected()){
              Seniorcitizen = "NO";
           }
          
           String existingaccount = null;
           if (EYES.isSelected()){
               existingaccount = "YES";
           }else if(ENO.isSelected()){
               existingaccount = "ENO";
           }
           String span = (String) pan.getText();
           String sCNIC = (String) CNIC.getText();
          
          try{   
            {conn c = new conn();
              String query = "insert into Signup2 values('"+formno+"', '"+sreligion+"', '"+soccupation+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+span+"', '"+sCNIC+"', '"+ Seniorcitizen+"', '"+existingaccount+"')";  
              c.s.executeUpdate(query);}
            
            
            setVisible(false);
          new signupthree(formno).setVisible(true);
          }
          
          catch(Exception e){
          System.out.println(e);
          }
              
          }
            public static void main(String args[]) {
        
    }
       }
   

