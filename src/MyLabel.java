import javax.swing.*;
import java.awt.*;
public class MyLabel extends JLabel{
    public MyLabel(String content){
        this.setText(content);
        this.setFont(new Font("Arial", Font.ITALIC, 40));
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
    }
}
