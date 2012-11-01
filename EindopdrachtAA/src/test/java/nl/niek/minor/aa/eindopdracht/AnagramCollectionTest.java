package nl.niek.minor.aa.eindopdracht;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnagramCollectionTest
{
	private static final String	BANAAN	= "banaan";
	private static final String	NANAAB	= "nanaab";
	private static final String	NABAAN	= "nabaan";
	private static final String	AAANNB	= "aaannb";
	
	private AnagramCollection collection;

	@Before
	public void setUp() throws Exception
	{
		collection = new AnagramCollection(BANAAN);
		collection.addAnagram(NABAAN);
		collection.addAnagram(NANAAB);
		collection.addAnagram(AAANNB);
	}
	
	@Test
	public void testConstruction()
	{
		Assert.assertTrue(collection.size() == 3);
		Assert.assertEquals(BANAAN, collection.getFirstWord());
		Assert.assertTrue(collection.contains(NABAAN));
		Assert.assertTrue(collection.contains(NANAAB));
		Assert.assertTrue(collection.contains(AAANNB));
	}
	
	@Test
	public void testAddDuplicateString()
	{
		AnagramCollection duplicateCollection = new AnagramCollection(BANAAN);
		duplicateCollection.addAnagram(NABAAN);
		duplicateCollection.addAnagram(NANAAB);
		duplicateCollection.addAnagram(AAANNB);
		duplicateCollection.addAnagram(AAANNB);
		duplicateCollection.addAnagram(AAANNB);
		
		AnagramCollection expected = new AnagramCollection(BANAAN);
		expected.addAnagram(NANAAB);
		expected.addAnagram(AAANNB);
		expected.addAnagram(NABAAN);
		
		Assert.assertTrue(duplicateCollection.size() == 3);
		Assert.assertTrue(duplicateCollection.contains(AAANNB));
	}
}
