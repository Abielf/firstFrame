import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;

public class FirstFrame implements ActionListener{

    private int count=0;
    private JPanel panel;
    private JLabel label;
    private JFrame frame;


   FirstFrame(){
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel("Number of Clicks: 0");

        JButton button= new JButton("This be a button");
        button.addActionListener(this);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("this is the title");
        frame.setSize(300, 300);
        frame.setVisible(true);

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);


    }


    public static void main (String[] args){
        FirstFrame gui = new FirstFrame();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of Clicks: "+count);
    }

}