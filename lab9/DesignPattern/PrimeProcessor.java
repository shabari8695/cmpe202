public class PrimeProcessor implements Chain {

    private Chain nextInChain;

    public PrimeProcessor(){
        this.nextInChain = null;
    }

    public void setNext(Chain nextInChain){
        this.nextInChain = nextInChain;
    }

    public boolean isprime(int num){
        boolean flag = true;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public void process(int number){

        if(isprime(number))
            System.out.println("Prime Number");
        else
            System.out.println("Non Prime Number");

        if(this.nextInChain != null)
            this.nextInChain.process(number);

    }
}
