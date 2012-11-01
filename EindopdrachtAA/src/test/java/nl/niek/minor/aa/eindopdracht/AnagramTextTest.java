package nl.niek.minor.aa.eindopdracht;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnagramTextTest
{
	private static final String	TEST_INPUT	= "banaan appel nanaab bannaa nabaan soep";
	
	private AnagramText			text;

	@Before
	public void setUp() throws Exception
	{
		text = new AnagramText(TEST_INPUT);
	}

	@Test
	public void testGetNextWord()
	{
		String expected1 = "banaan";
		String expected2 = "appel";
		String expected3 = "nanaab";
		String expected4 = "bannaa";
		String expected5 = "nabaan";
		String expected6 = "soep";
		
		Assert.assertEquals(expected1, text.getNextWord());
		Assert.assertEquals(expected2, text.getNextWord());
		Assert.assertEquals(expected3, text.getNextWord());
		Assert.assertEquals(expected4, text.getNextWord());
		Assert.assertEquals(expected5, text.getNextWord());
		Assert.assertEquals(expected6, text.getNextWord());
	}
}
