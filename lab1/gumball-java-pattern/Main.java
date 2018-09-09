import java.util.*;

public class Main {

public static void main(String[] args) {
      List<Integer> coins = new ArrayList<Integer>();
      
      coins.add(25);
      
      GumballMachine gumballMachineOne = new GumballMachine(5,25,coins);
      System.out.println(gumballMachineOne);
      gumballMachineOne.insertCoin(25);
      gumballMachineOne.turnCrank();
      System.out.println(gumballMachineOne);
      gumballMachineOne.insertCoin(25);
      gumballMachineOne.turnCrank();
      gumballMachineOne.insertCoin(25);
      gumballMachineOne.turnCrank();
      System.out.println(gumballMachineOne);
      
      coins = new ArrayList<Integer>();
      coins.add(25);coins.add(50);
      
      GumballMachine gumballMachineTwo = new GumballMachine(5,50,coins);
      System.out.println(gumballMachineTwo);
      gumballMachineTwo.insertCoin(50);
      gumballMachineTwo.turnCrank();
      System.out.println(gumballMachineTwo);
      gumballMachineTwo.insertCoin(25);
      gumballMachineTwo.turnCrank();
      gumballMachineTwo.insertCoin(25);
      gumballMachineTwo.turnCrank();
      System.out.println(gumballMachineTwo);
      
      coins = new ArrayList<Integer>();
      coins.add(1);coins.add(5);coins.add(10);coins.add(25);coins.add(50);
      
      GumballMachine gumballMachineThree = new GumballMachine(5,50,coins);
      System.out.println(gumballMachineThree);
      gumballMachineThree.insertCoin(1);
      gumballMachineThree.turnCrank();
      System.out.println(gumballMachineThree);
      gumballMachineThree.insertCoin(5);
      gumballMachineThree.turnCrank();
      gumballMachineThree.insertCoin(25);
      gumballMachineThree.insertCoin(10);
      gumballMachineThree.insertCoin(10);
      gumballMachineThree.turnCrank();
      System.out.println(gumballMachineThree);
    }
}
