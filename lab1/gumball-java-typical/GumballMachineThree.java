import java.util.*;
/**
 * Write a description of class GumballMachineThree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachineThree extends GumballMachineTwo
{
    /**
     * Constructor for objects of class GumballMachineThree
     */
    public GumballMachineThree(int size , int amount)
    {
        // initialise instance variables
        super(size,amount);
        
        this.denominations = new ArrayList<Integer>();
        this.denominations.add(1);
        this.denominations.add(5);
        this.denominations.add(10);
        this.denominations.add(25);
        this.denominations.add(50);
    }
}
