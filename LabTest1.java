package labtest;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LabTest1 {
	StringManipulatorClass1 s1 = new StringManipulatorClass1();
	
	@Test
	public void testStringLengthWithValue(){
		assertEquals(4,s1.calculateStringLength("Fima"));
	}
	
	@Test
	public void testStringLengthWithSpace(){
		assertEquals(0,s1.calculateStringLength(""));
	}
	
	@Test
	public void testReverseString(){
		assertEquals("abba",s1.reverseString("abba"));
	}
	
	@Test
	public void testReverseStringWithSpace(){
		assertEquals("  ",s1.reverseString("  "));
	}
	
	@Test
	public void testReverseStringWithSpecial(){
		assertEquals("#*#*#",s1.reverseString("#*#*#"));
	}
	
	@Test
	public void testToLowerCase(){
		assertEquals("be positive",s1.toLowerCase("Be Positive"));
	}
	
	@Test
	public void testToLowerCaseSpecial(){
		assertEquals("be positive#*%",s1.toLowerCase("Be Positive#*%"));
	}
	
	@Test
	public void testToLowerCaseSpace(){
		assertEquals("   ",s1.toLowerCase("   "));
	}
	
	@Test
	public void testCountOccurrences(){
		assertEquals(2,s1.countOccurrences("Bangladesh",'a'));
	}
	@Test
	public void testCountOccurrencesZero(){
		assertEquals(0,s1.countOccurrences("Bangladesh",'i'));
	}


	
}
