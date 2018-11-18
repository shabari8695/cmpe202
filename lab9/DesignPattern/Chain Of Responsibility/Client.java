public class Client {
    public static void main(String args[]){
        Chain oddevenprocessor = new OddEvenProcessor();
        Chain primeprocessor = new PrimeProcessor();

        oddevenprocessor.setNext(primeprocessor);

        oddevenprocessor.process(5);
    }
}
