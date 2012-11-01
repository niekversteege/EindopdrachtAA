package nl.niek.minor.aa.eindopdracht;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnagramCollectionTest
{
	private AnagramCollection collection;

	@Before
	public void setUp() throws Exception
	{
		collection = new AnagramCollection("banaan");
		collection.addAnagram("nabaan");
		collection.addAnagram("nanaab");
		collection.addAnagram("aaannb");
	}

	@Test
	public void testEqualsObject()
	{
		AnagramCollection expected = new AnagramCollection("banaan");
		expected.addAnagram("nanaab");
		expected.addAnagram("aaannb");
		expected.addAnagram("nabaan");
		
		Assert.assertTrue(collection.equals(expected));
	}
	
	@Test
	public void testUnknownString()
	{
		AnagramCollection expected = new AnagramCollection("banaan");
		expected.addAnagram("nanaab");
		expected.addAnagram("bbbnnn");
		expected.addAnagram("nabaan");
		
		Assert.assertFalse(collection.equals(expected));
	}
	
	@Test
	public void testAddDuplicateString()
	{
		AnagramCollection duplicateCollection = new AnagramCollection("banaan");
		duplicateCollection.addAnagram("nabaan");
		duplicateCollection.addAnagram("nanaab");
		duplicateCollection.addAnagram("aaannb");
		duplicateCollection.addAnagram("aaannb");
		duplicateCollection.addAnagram("aaannb");
		
		AnagramCollection expected = new AnagramCollection("banaan");
		expected.addAnagram("nanaab");
		expected.addAnagram("aaannb");
		expected.addAnagram("nabaan");
		
		Assert.assertTrue(duplicateCollection.equals(expected));
	}
	
	@Test
	public void testNumberOfSTrings()
	{
		AnagramCollection expected = new AnagramCollection("banaan");
		expected.addAnagram("nanaab");
		expected.addAnagram("bbbnnn");
		
		Assert.assertFalse(collection.equals(expected));
	}

}
