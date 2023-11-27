import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyFrame extends JFrame{
    MyButton buttonUp = new MyButton(1) ; 
    MyButton buttonDown = new MyButton(2); 
    MyButton buttonRight = new MyButton(3); 
    MyButton buttonLeft = new MyButton(4); 
    MyLabel labelShow = new MyLabel("Pick a direction"); 

    public MyFrame(){
        // create the frame
        this.setSize(720, 720);
        this.getContentPane().setBackground(Color.CYAN);
        this.setResizable(false);
        ImageIcon image1 = new ImageIcon(MyFrame.class.getResource("direction.png"));
        this.setIconImage(image1.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Direction game");
        this.setLayout(new BorderLayout());
        //add label to the frame 
        this.add(labelShow);
        //add button to the frame
        this.add(buttonUp, BorderLayout.NORTH);
        this.add(buttonLeft, BorderLayout.WEST); 
        this.add(buttonDown, BorderLayout.SOUTH); 
        this.add(buttonRight, BorderLayout.EAST);
        this.setVisible(true);
        getActionForButton();
    }    
    public void getActionForButton(){
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == buttonUp){
                    buttonUp.setVisible(true);
                    labelShow.setText("NORTH");
                }
                if(e.getSource() == buttonDown){
                    labelShow.setText("SOUTH");
                    buttonDown.setVisible(true);
                }
                if(e.getSource() == buttonRight){
                    labelShow.setText("EAST");
                    buttonRight.setVisible(true);
                }
                if(e.getSource() == buttonLeft){
                    labelShow.setText("WEST");
                    buttonLeft.setVisible(true);
                }
            }
        };
        buttonDown.addActionListener(actionListener);
        buttonRight.addActionListener(actionListener);
        buttonLeft.addActionListener(actionListener);
        buttonUp.addActionListener(actionListener); 
    }
}
