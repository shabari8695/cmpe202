import java.util.*;

public class GumballMachine {
 
    State soldOutState;
    State noCoinState;
    State hasCoinState;
    State soldState;
 
    State state = soldOutState;
  int count = 0;
  int amount = 0;
  int balance = 0;
  
  List<Integer> denominations;
  
          public GumballMachine(int numberGumballs,int coin, List<Integer> coins) {
            soldOutState = new SoldOutState(this);
            noCoinState = new NoCoinState(this);
            hasCoinState = new HasCoinState(this);
            soldState = new SoldState(this);
          
            this.denominations = coins;
          
            this.amount = coin;
            this.balance = coin;
            this.count = numberGumballs;
            if (numberGumballs > 0) {
              state = noCoinState;
            }
        }

          public void insertCoin(int coin) {
            if(this.denominations.contains(coin))
              balance -= coin;
            
            if(balance <= 0)
              state.insertCoin();
        }
 
    public void ejectCoin() {
        state.ejectCoin();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        this.balance = this.amount;
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
