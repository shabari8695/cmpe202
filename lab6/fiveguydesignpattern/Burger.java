import java.util.*;
/**
 * Write a description of class Burger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Burger
{
    // instance variables - replace the example below with your own
    private List<IBurgerItem> components;

    /**
     * Constructor for objects of class Burger
     */
    public Burger()
    {
        // initialise instance variables
        components = new ArrayList<IBurgerItem>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addComponent(IBurgerItem item)
    {
        // put your code here
        components.add(item);
    }
    
    public List<IBurgerItem> finishedBurger()
    {
        return components;
    }
}
