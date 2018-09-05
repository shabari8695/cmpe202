

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5,25);
    
        System.out.println(gumballMachine);

        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        
        
        GumballMachineOne gumballMachineOne = new GumballMachineOne(10,25);
        
        System.out.println(gumballMachineOne);
        
        gumballMachineOne.insertCoin( 25 );
        gumballMachineOne.turnCrank();
        gumballMachineOne.insertCoin( 10 );
        gumballMachineOne.turnCrank();
        
        GumballMachineTwo gumballMachineTwo = new GumballMachineTwo(10,50);
        
        System.out.println(gumballMachineTwo);
        gumballMachineTwo.insertCoin(25);
        gumballMachineTwo.insertCoin(5);
        gumballMachineTwo.turnCrank();
        gumballMachineTwo.insertCoin(25);
        gumballMachineTwo.turnCrank();
        gumballMachineTwo.insertCoin(50);
        gumballMachineTwo.turnCrank();
        gumballMachineTwo.insertCoin(25);
        gumballMachineTwo.turnCrank();
        gumballMachineTwo.insertCoin(50);
        gumballMachineTwo.turnCrank();
        
       
        GumballMachineThree gumballMachineThree = new GumballMachineThree(10,50);
        
        System.out.println(gumballMachineThree);
        gumballMachineTwo.insertCoin(25);
        gumballMachineTwo.insertCoin(5);
        gumballMachineTwo.turnCrank();
        gumballMachineTwo.insertCoin(25);
        gumballMachineTwo.turnCrank();
        System.out.println(gumballMachineThree);
    }
}
