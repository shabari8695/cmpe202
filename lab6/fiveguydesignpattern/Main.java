
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{

    
    public static void main(String args[])
    {
   
    
        IBurgerItem bacon = new Bacon();
        IBurgerItem lettuce = new Lettuce();
        IBurgerItem gonion = new GOnion();
        IBurgerItem tomato = new Tomato();
        IBurgerItem jalagrilled = new JalaGrilled();
        
        
        
        IPrintReceipt userReceipt;
        IPrintReceipt packageReceipt;
        
        System.out.println("\f");
        
        userReceipt = new IPrintReceipt()
        {
            public void displayReceipt()
            {
               /* Add Burger component in user view */
               Burger burger = new Burger();
              
               burger.addComponent(bacon);
               burger.addComponent(lettuce);
               burger.addComponent(tomato);
               burger.addComponent(gonion);
               burger.addComponent(jalagrilled);
               
               System.out.println("Customer Receipt");
               System.out.println("LBB                      5.59");
               
               for(IBurgerItem item : burger.finishedBurger())
               {
                   System.out.println("  "+item.getName());
               }
               System.out.println("LTL CAJ                   2.79");
               System.out.println("Sub. Total:               8.38");
               System.out.println("\n");
            }
        };
        
        packageReceipt = new IPrintReceipt()
        {
            public void displayReceipt()
            {
               /* Add Burger component in user view */
               Burger burger = new Burger();
               
               burger.addComponent(lettuce);
               burger.addComponent(tomato);
               burger.addComponent(gonion);
               burger.addComponent(jalagrilled);
               burger.addComponent(bacon);
               System.out.println("Package Receipt");
               System.out.println("LBB");
               
               for(IBurgerItem item : burger.finishedBurger())
               {
                   System.out.println(item.getName());
               }
               
               System.out.println("LTL CAJ");
               
            }
        };
        
        userReceipt.displayReceipt();
        packageReceipt.displayReceipt();
        
    }
}
