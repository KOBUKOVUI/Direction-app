import javax.swing.*;
import java.awt.*;
public class MyButton extends JButton{
    public MyButton(int choice){
        switch (choice){
            case 1: 
                {
                    ImageIcon image1 = new ImageIcon(MyButton.class.getResource("up.png"));
                    this.setBorder(BorderFactory.createEmptyBorder());
                    this.setIcon(image1);
                    this.setBackground(Color.blue);
                    this.setPreferredSize(new Dimension(520,100));
                    break;
                }
            case 2: 
                {
                    ImageIcon image1 = new ImageIcon(MyButton.class.getResource("down.png"));
                    this.setBorder(null);
                    this.setIcon(image1);
                    this.setPreferredSize(new Dimension(520,100));
                    this.setBackground(Color.red);
                    break; 
                }
            case 3: 
                {
                    ImageIcon image1 = new ImageIcon(MyButton.class.getResource("right.png"));
                    this.setBorder(null);
                    this.setIcon(image1);
                    this.setBackground(Color.green);
                    this.setPreferredSize(new Dimension(100,520));
                    break;
                }
            case 4: 
                {
                    ImageIcon image1 = new ImageIcon(MyButton.class.getResource("left.png"));
                    this.setBorder(null);
                    this.setIcon(image1);
                    this.setBackground(Color.yellow);
                    this.setPreferredSize(new Dimension(100,520));
                    break; 
                }
        }

    }
}
