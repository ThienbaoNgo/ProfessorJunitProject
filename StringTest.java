import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runners.JUnit4;

/* 

 * Class: CMSC201  

 * Instructor: 

 * Description: (Give a brief description for each Program) 

 * Due: 12/13/21 

 * I pledge that I have completed the programming assignment independently. 

   I have not copied the code from a student or any source. 

   I have not given my code to any student. 

   Print your Name here: Thienbao Ngo

*/ 

//length, charAt, substring, and indexOf

/**
 * @author Thienbao
 *
 * This is a class that contains all the Junit tests that are going to check if the various string methods are working properly
 */
class StringTest {

	
	/**
	 * {@summary}
	 * This is one of the tests in question, checking to see if testLength() is working right.
	 */
	public void testLength() {
		
		String asserted = "Wow";
		
		asserted += ", boy oh boy.";
		
		assertEquals(asserted.length(),16);
	}
	
	/**
	 * {@summary}
	 * This is one of the tests in question, checking to see if charAt() is working right.
	 */
	public void testCharAt() {
		
		String asserted = "Haha, lol.";
		
		char testChar = asserted.charAt(4);
		
		assertEquals(testChar,',');
	}
	
	/**
	 * {@summary}
	 * This is one of the tests in question, checking to see if subString() is working right.
	 */
	public void testSubString() {
		
		String asserted = "Lalilulelo";
		
		assertEquals(asserted.substring(8),"lo");
	}
	
	/**
	 * {@summary}
	 * This is one of the tests in question, checking to see if testIndexOf() is working right.
	 */
	public void testIndexOf() {
		
		String asserted = "Lalilulelo";
		
		int charTest = asserted.indexOf("L");
		
		assertEquals(charTest,0);
	}

}
