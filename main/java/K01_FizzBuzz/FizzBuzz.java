package K01_FizzBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by andrzej on 04.09.17.
 */
public class FizzBuzz {


	public void printFizzBuzz(int minValue, int maxValue) {

		for (int i = minValue; i < maxValue ; i++) {
			System.out.println(checkIntForFizzBuzz(i));
		}
	}

	public String checkIntForFizzBuzz(int numberToCheck) {
		StringBuffer buffer = new StringBuffer();
		if (numberToCheck % 5 == 0 && numberToCheck % 3 == 0) {
			buffer.append("FizzBuzz");
		} else if (numberToCheck % 3 == 0) {
			buffer.append("Fizz");
		} else if (numberToCheck % 5 == 0) {
			buffer.append("Buzz");
		} else
			buffer.append(numberToCheck);

		return buffer.toString();
	}

	public void printFizzBuzzJava8(int minValue, int maxValue) {
		IntStream.rangeClosed(minValue, maxValue).forEach(s -> {
			String result = checkIntForFizzBuzz(s);
			System.out.println(result);
		});
	}

}
