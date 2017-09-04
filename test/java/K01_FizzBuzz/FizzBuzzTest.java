package K01_FizzBuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@Before
	public void setup(){
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void checkforInt() throws Exception{
		String forFizz = fizzBuzz.checkIntForFizzBuzz(3);
		String forBuzz = fizzBuzz.checkIntForFizzBuzz(5);
		String forFizzBuzz = fizzBuzz.checkIntForFizzBuzz(15);

		assertEquals("Fizz", forFizz);
		assertEquals("Buzz", forBuzz);
		assertEquals("FizzBuzz", forFizzBuzz);

	}

	@Test
	public void printWithinRange() throws Exception {
		fizzBuzz.printFizzBuzz(0,100);

	}


}