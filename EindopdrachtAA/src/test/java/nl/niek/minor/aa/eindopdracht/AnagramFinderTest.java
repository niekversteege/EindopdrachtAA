package nl.niek.minor.aa.eindopdracht;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnagramFinderTest
{
	private static final String	TEST_INPUT	= "banaan appel nanaab bannaa nabaan soep";

	private AnagramCollection	testInputCorrectResult;

	private AnagramFinder		finder;

	@Before
	public void setUp() throws Exception
	{
		testInputCorrectResult = new AnagramCollection("banaan");
		testInputCorrectResult.addAnagram("nanaab");
		testInputCorrectResult.addAnagram("bannaa");
		testInputCorrectResult.addAnagram("nabaan");
	}

	@Test
	public void testFindAnagramsCorrectInput()
	{
		finder = new AnagramFinder(TEST_INPUT);

		List<AnagramCollection> output = finder.findAnagrams();

		Assert.assertTrue(output.size() == 1);
	}
	
	@Test
	public void testAlphabetizeLetters()
	{
		finder = new AnagramFinder("");
		
		final String rawValue = new String("cdgeabjfhi");
		final String expected = new String("abcdefghij");
		
		Assert.assertEquals(expected, finder.alphabetizeLetters(rawValue));
	}
}
