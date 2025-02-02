import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*This is a resort expense calculator. Base price for a room is $200, weekend 
prices add $100, breakfast is $20, a round of golf is $75.*/

public class JResortCalculator extends JFrame implements ItemListener
{
    /*Declare the named constants and their prices, also include a variable
    to hold the total price of the stay. Initialize it to the value of base price*/
    final int BASE_PRICE = 200;
    final int WEEKEND_PREMIUM = 100;
    final int BREAKFAST_PREMIUM = 20;
    final int GOLF_PREMIUM = 75;
    int totalPrice = BASE_PRICE;

    //Declare 3 JCheckBox objects, each starts unchecked, or deselected 
    JCheckBox weekendBox = new JCheckBox
        ("Weekend Premium $" + WEEKEND_PREMIUM, false);
    JCheckBox breakfastBox = new JCheckBox
        ("Breakfast Premium $" + BREAKFAST_PREMIUM, false);
    JCheckBox golfBox = new JCheckBox
        ("Golf Premium $" + GOLF_PREMIUM, false);

    /*Include JLables to hold user instructions and information and JTextField
    to display the total price*/
    JLabel resortLabel = new JLabel("Resort Price Calculator");
    JLabel priceLabel = new JLabel("The price for  your stay is");
    JTextField totPrice = new JTextField(4);
    JLabel optionExplainLabel = new JLabel
        ("Base price for your room is $" + BASE_PRICE + ".");
    JLabel optionExplainJLabel2 = new JLabel
        ("Check the option you want.");

    /*Begin the class constructor. Include instructions to set the title by
    by passing it to the JFrame parent class constructor, to set the default
    close operation, and to set the layout manager. Then add necessary components
    to the JFrame.*/
        public JResortCalculator()
            {
                super ("ResortPriceEstimator");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //This closes porgram when exiting JFrame, it shouldn't keep running
                setLayout(new FlowLayout());
                //setting layout of JFrame
                add(resortLabel);
                add(optionExplainLabel);
                add(optionExplainJLabel2);
                add(weekendBox);
                add(breakfastBox);
                add(golfBox);
                add(priceLabel);
                add(totPrice);

                /*Set the text of the totPrice JTextField to display a $ sign
                 and the totalPrice value. Register the class as a listener 
                 for events generated by each of the 3 JCheckBoxes.*/
                 totPrice.setText("$" + totalPrice);
                 weekendBox.addItemListener(this);
                 breakfastBox.addItemListener(this);
                 golfBox.addItemListener(this);     
                //End of the constructor
            }

    /*Begin the itemStateChanged() method that executes when the user selects
     or deselects a JCheckBox.*/
     @Override
     public void itemStateChanged(ItemEvent event)
     {
        /*These methods determine which JCheckBox is the source of the current 
        ItemEvent and whether the event was generated by selecting or deselecting a JCheckBox*/
        Object source =event.getSource();
        int select = event.getStateChange();
        /* Write a nested if statement that tests whether the source is
         equivalent to the weekendBox, the breakfastBox or, by default, the goldfBox.*/
         if(source == weekendBox)
            if(select == ItemEvent.SELECTED)
                totalPrice += WEEKEND_PREMIUM;
            else
                totalPrice -= WEEKEND_PREMIUM;
        else if(source == breakfastBox)
        {   
            if(select == ItemEvent.SELECTED)
                totalPrice += BREAKFAST_PREMIUM;
            else
                totalPrice -= BREAKFAST_PREMIUM;
        }
        else // if(source  == golfBox) by default 
            if (select == ItemEvent.SELECTED)
                totalPrice += GOLF_PREMIUM;
            else
                totalPrice -= GOLF_PREMIUM;
            totPrice.setText("$" + totalPrice);
    
        } 
    /*Finally, add a main() Method that creates an instance of the JFrame and 
    sets its size and visibility.*/
    public static void main (String[] args)
    {
        JResortCalculator aFrame = new JResortCalculator();
        final int WIDTH = 300;
        final int HEIGHT = 200;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }     
     

}