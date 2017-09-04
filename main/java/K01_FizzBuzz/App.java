package K01_FizzBuzz;

/**
 * Created by andrzej on 04.09.17.
 */
public class App {

	public static void main(String[] args) {
		FizzBuzz fizzBuzz = new FizzBuzz();

		//check if certain int returns fizz, buzz or fizzbuzz
		String s = fizzBuzz.checkIntForFizzBuzz(6);

		//old way using String buffer
		fizzBuzz.printFizzBuzz(0,100);

		//print from defined range of ints using java 8 IntStream
		fizzBuzz.printFizzBuzzJava8(0,100);
	}
}
