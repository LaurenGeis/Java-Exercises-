import javax.swing.*;

public class JDemoFrame
{
    public static void main(String[] args)
    {
        //create a JFrame with title and demensions
        JFrame aFrame = new JFrame("This is a frame");
        final int WIDTH = 300;
        final int HEIGHT = 250;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
        //add in operation that will close the program if window  is closed
        //if this isn't done, the program will continue to infinitely execute.
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}