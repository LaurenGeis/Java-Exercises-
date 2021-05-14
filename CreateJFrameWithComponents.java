import javax.swing.*;
//write an application that creates a new Jframe w/ components
public class CreateJFrameWithComponents
{
    public static void main(String[] args)
    {
        JFrameWithComponents aFrame = new JFrameWithComponents();
            final int WIDTH = 350;
            final int HEIGHT = 100;
            aFrame.setSize(WIDTH, HEIGHT);
            aFrame.setVisible(true);
    }

}