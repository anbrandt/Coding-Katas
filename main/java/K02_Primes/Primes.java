package K02_Primes;

/**
 * Created by andrzej on 04.09.17.
 */
public class Primes {


	public void printPrimesWithinRange(int minValue, int maxValue) {

		for (int i = minValue; i < maxValue; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;

	}


}
