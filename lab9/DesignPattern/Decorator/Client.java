public class Client{
	public static void main(String args[]){
		Component bacon = new BaconDecorator(new Bacon());
		System.out.print(bacon.print());
	}
}