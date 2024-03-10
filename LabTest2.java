package labtest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LabTest2 {
	StringManipulatorClass2 s2 = new StringManipulatorClass2();
	
	@Test
	public void testCapitalizeAllSmallWords(){
		assertEquals("I Am A Positive Person",s2.capitalizeWords("i am a positive person"));
	}
	@Test
	public void testCapitalizeAllCapitalWords(){
		assertEquals("I Am A Positive Person",s2.capitalizeWords("I Am A Positive Person"));
	}
	@Test
	public void testCapitalizeSpecialChar(){
		assertEquals("I Am A %$#$^^$% Person",s2.capitalizeWords("I am a %$#$^^$% person"));
	}
	
	@Test 
	public void testRemoveNonAlphabetic(){
		assertEquals("Iamaperson",s2.removeNonAlphabetic("I am a!@#$%^&*()_-+= person"));
	}
	@Test 
	public void testRemoveNonAlphabeticSpace(){
		assertEquals("",s2.removeNonAlphabetic("    "));
	}
	
	@Test
	public void testcontainsSubstringMatch(){
		assertEquals(true,s2.containsSubstring("Positive","Pos"));
	}
	@Test
	public void testcontainsSubstringMismatch(){
		assertEquals(false,s2.containsSubstring("Positive","Abc"));
	}
	@Test
	public void testcontainsSubstringNumMatch(){
		assertEquals(true,s2.containsSubstring("26 is my id","26"));
	}
	@Test
	public void testcontainsSubstringNumMismatch(){
		assertEquals(false,s2.containsSubstring("26 is my id","4645"));
	}
	@Test
	public void testcontainsSubstringSpecialCharMatch(){
		assertEquals(true,s2.containsSubstring("!@#$%^&* is my id","!@#$%^&*"));
	}
	@Test
	public void testcontainsSubstringSpecialCharMismatch(){
		assertEquals(false,s2.containsSubstring("!@#$%^&*is my id","%&&*%&%&*"));
	}
	@Test
	public void testcontainsSubstringSpaceMatch(){
		assertEquals(true,s2.containsSubstring("26 is my id"," "));
	}
	@Test
	public void testMergeStringsWithSpace(){
		assertEquals("Positive Person",s2.MergeStrings("Positive"," Person"));
	}
	@Test
	public void testMergeStringsWithoutSpace(){
		assertEquals("PositivePerson",s2.MergeStrings("Positive","Person"));
	}
	
}
