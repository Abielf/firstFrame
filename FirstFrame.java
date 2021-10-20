import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.*;

import java.awt.BorderLayout;

public class FirstFrame implements ActionListener{

    //Good to practice to declare private variables out here
    private int count=0;
    private JPanel panel;
    private JLabel label;
    private JFrame frame;
    private JPasswordField fieldPass;
    private JLabel passwordL;
    private JLabel userL;
    private JTextField fieldUser;
    private JLabel success;


   FirstFrame(){
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel("Number of Clicks: 0");


        fieldPass= new JPasswordField(20);
        passwordL = new JLabel("Password:");
        userL = new JLabel("User:");
        fieldUser = new JTextField(20);


        JButton button= new JButton("This be a button");
        button.addActionListener(this);

        JButton buttonLog=new JButton("Log in");
        buttonLog.addActionListener(this);
        success = new JLabel("No Access");

        //setbounds parameters are xpos, ypos, width, height
        //x and y pos are from top left
        userL.setBounds(10,15,80,25);
        fieldUser.setBounds(100, 15, 100, 25);

        fieldPass.setBounds(100, 45, 100, 25);
        passwordL.setBounds(10,45,80,25);

        label.setBounds(10, 130, 200, 25);
        button.setBounds(10,160,150,30);

        success.setBounds(10,100,100,25);
        buttonLog.setBounds(30, 70, 150, 30);

        //frame construction
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("this is the title");
        frame.setSize(250, 250);
        frame.setVisible(true);

        //Look up setborder parameters, borders in general
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        //lookup layouts for design purposes
        //new GridLayout(0,1) was one in sample
        panel.setLayout(null);
        
        panel.add(button);
        panel.add(passwordL);
        panel.add(fieldPass);
        panel.add(fieldUser);
        panel.add(userL);
        panel.add(label);
        panel.add(buttonLog);
        panel.add(success);



    }


    public static void main (String[] args){
        //makes an instance of a new frame
        //each instance will form on run of program
        //BUT, terminating one terminates the other. Fascinating. 
        //need to toy with the .setDefaultCloseOperation
        FirstFrame first = new FirstFrame();
    }

//method that tells the button what to do, called when button is clicked
//Acts a little like react, overriding the label with different text.
//Connected directly to the .addActionListener()
//Q: is this one method connected to all buttons that use .addActionListener?
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of Clicks: "+count);
        String user=fieldUser.getText();
        String password= fieldPass.getText();
        if(user.equals("Abe")&&password.equals("Password123!")){
            success.setText("You're in!");
        }
    }

}