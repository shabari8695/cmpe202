package lambda;

import java.util.function.Function;

public class Client{
	public static void main(String args[]){
		Component bacon = new Bacon();
		Function<String, String> baconDecoratorFunction = input -> "{{{{{" + input + "}}}}}";
		String result = baconDecoratorFunction.apply(bacon.print());
		System.out.println(result);
	}
}