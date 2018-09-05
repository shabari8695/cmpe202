
/**
 * Write a description of class GumballMachineOne here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachineOne extends GumballMachine
{
    // instance variables - replace the example below with your own
    
    public GumballMachineOne(int size, int amount)
    {
        // initialise instance variables
        super(size,amount);
        //System.out.println(this.num_gumballs);
    }

    
    public void insertCoin(int coin)
    {
        /*
         * The first machine takes only one 25 cent coin.
         * Assuming the user will not enter values less than 25 while testing.
         */
        if ( coin == this.amount )
            this.has_amount = true ;
        else
        {
            this.has_amount = false ;
            System.out.println("Invalid coin");
        }
    }
}
