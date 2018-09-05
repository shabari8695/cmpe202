
public class GumballMachine
{

    protected int num_gumballs;
    protected int amount; //cost of a gumball
    protected boolean has_amount; //renamed has_quarter to has_amount
    public GumballMachine( int size, int amount )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.amount = amount;
        this.has_amount = false;
    }

    //renamed insertQuarter to insertCoin
    public void insertCoin(int coin)
    {
        if ( coin == this.amount )
            this.has_amount = true ;
        else 
            this.has_amount = false ;
    }
    
    public void turnCrank()
    {
        if ( this.has_amount )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_amount = false ;
                System.out.println( "Thanks for your Money.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your Money." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert the amount specified on the machine." ) ;
        }        
    }
}
