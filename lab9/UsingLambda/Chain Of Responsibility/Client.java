import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Client{

    public static String oddeven(int num){
        if(num % 2 == 0)
            return "Even";
        else
            return "Odd";
    }

    public static String isprime(int num){
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

        if(flag)
            return "Prime";
        else
            return "Not Prime";
    }

    public static void main(String args[]){

        UnaryOperator<String> OddEvenProcessing = (String num) -> num+" is "+oddeven(Integer.parseInt(num))+" and ";
        UnaryOperator<String> PrimeProcessing = (String num) -> num+isprime(Integer.parseInt(num.replaceAll("[^0-9]", "")));

        Function<String,String> pipeline = OddEvenProcessing.andThen(PrimeProcessing);
        System.out.print(pipeline.apply("5"));
    }
}