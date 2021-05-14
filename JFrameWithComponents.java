import javax.swing.*;
import java.awt.*;

public class JFrameWithComponents extends JFrame
{
    JLabel label = new JLabel("Name?");
    //sets # of characters that will display from input
    JTextField field = new JTextField(12);
    //Displays text on the JButton
    JButton button = new JButton("Ok");
    //We haven't written what will happen when OK is pressed yet. 


    public JFrameWithComponents()
    {
        super("Frame with Components");
        //exit program when JFrame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //add the lable, field and button to the frame
        setLayout(new FlowLayout());
        add(label);
        add(field);
        add(button);
    }

}

