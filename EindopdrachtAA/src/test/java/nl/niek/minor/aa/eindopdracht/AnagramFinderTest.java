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
	public void testParseAnagramsCorrectInput()
	{
		finder = new AnagramFinder(TEST_INPUT);

		List<AnagramCollection> output = finder.parseAnagrams();

		Assert.assertTrue(output.size() == 1);
		Assert.assertTrue(output.get(0).equals(testInputCorrectResult));
	}
}
