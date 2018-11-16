public class OddEvenProcessor implements Chain {

    private Chain nextInChain;

    public OddEvenProcessor(){
        this.nextInChain = null;
    }
    public void setNext(Chain nextInChain){
        this.nextInChain = nextInChain;
    }

    public void process(int number){

        if(number % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        if(this.nextInChain != null)
            this.nextInChain.process(number);

    }
}
