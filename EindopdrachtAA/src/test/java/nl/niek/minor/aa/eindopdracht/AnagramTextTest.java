package nl.niek.minor.aa.eindopdracht;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnagramTextTest
{
	private static final String	TEST_INPUT					= "banaan appel nanaab bannaa nabaan soep";
	private static final String	TEST_INPUT_SPECIALTOKENS	= "banaan, appel. nanaab bannaa nabaan=- soep";

	private AnagramText			text;

	@Before
	public void setUp() throws Exception
	{
		text = new AnagramText(TEST_INPUT);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIllegalConstruction()
	{
		@SuppressWarnings("unused")
		AnagramText test = new AnagramText(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec eleifend, massa ac fermentum faucibus, urna tortor tincidunt purus, non venenatis neque quam eu eros. Vestibulum sagittis erat vel odio ullamcorper condimentum. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Pellentesque condimentum, risus feugiat placerat aliquet, lacus risus elementum tortor, a rutrum elit ipsum sed leo. Donec iaculis mattis leo a sodales. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Pellentesque sed posuere erat. Etiam non dolor ut nisl semper pharetra. Suspendisse potenti. Integer tristique elementum imperdiet. Cras vehicula, lorem id congue sollicitudin, tortor tortor elementum enim, et consequat massa massa nec orci. Donec a dui et eros condimentum viverra eget dapibus massa. Fusce volutpat orci eget augue egestas vel hendrerit augue dictum. Vestibulum ornare dolor non lacus consequat ac tempus nunc mollis.");
	}
	
	@Test
	public void testSpecialTokens()
	{
		AnagramText test = new AnagramText(TEST_INPUT_SPECIALTOKENS);
		
		String expected1 = "banaan";
		String expected2 = "appel";
		String expected3 = "nanaab";
		String expected4 = "bannaa";
		String expected5 = "nabaan";
		String expected6 = "soep";

		Assert.assertEquals(expected1, test.getNextWord());
		Assert.assertEquals(expected2, test.getNextWord());
		Assert.assertEquals(expected3, test.getNextWord());
		Assert.assertEquals(expected4, test.getNextWord());
		Assert.assertEquals(expected5, test.getNextWord());
		Assert.assertEquals(expected6, test.getNextWord());
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
