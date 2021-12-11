import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author Thienbao Ngo
 *
 * This is a test class that tests the isPrime Method, checking whether or not it is working properly.
 */
class PrimeNumberMethodTest {

	/**
	 *{@summary}
	 * 
	 * This is the test in question, checking to see if isPrime() is working right.
	 */
	void test() {
		
		boolean flag = PrimeNumberMethod.isPrime(2);
		
		assertEquals(flag,true);
	}

}
