package K02_Primes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 05.09.17.
 */
public class PrimesTest {

	private Primes primes;

	@Before
	public void setup() {
		primes = new Primes();
	}

	@Test
	public void isPrime() throws Exception {
		assertTrue(primes.isPrime(3));
		assertTrue(primes.isPrime(5));
		assertFalse(primes.isPrime(6));
		assertTrue(primes.isPrime(7));
	}
	//TODO parameterized tests 

}