import java.util.*;
/**
 * Write a description of class GumballMachineTwo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachineTwo extends GumballMachine
{

    protected List<Integer> denominations; //What coins are allowed in the machine.
    protected int balance; //Amount pending to meet the machine's requirement.
    
    /**
     * Constructor for objects of class GumballMachineTwo
     */
    public GumballMachineTwo(int size, int amount)
    {
        // initialise instance variables
        super(size,amount);
        
        denominations = new ArrayList<Integer>();
        denominations.add(25);
        denominations.add(50);
        
        this.balance = amount;
       
    }

    
    public void insertCoin(int coin)
    {
        /*
         * Machine 2 needs 50 cents per gumball.
         * It can take either one 50 cent coin or two 25 cent coins.
         * Check if coin is present in denomination.
         * Update the balance for a valid coin and check if requirement is met.
         */
        if(this.denominations.contains(coin))
            this.balance -= coin;
        else
            System.out.println("invalid coin");
            
        if(this.balance <= 0)
        {
            this.has_amount = true ;
            System.out.println("Requirement met. Turn crank!");
        }
  
    }
    
    public void turnCrank()
    {
        if ( this.has_amount )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_amount = false ;
                this.balance = this.amount;
                System.out.println( "Thanks for your Money.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your Money." ) ;
            }
        }
        else 
        {
            System.out.println( "Crank turned.Not engough money." ) ;
        }        
    }
}
