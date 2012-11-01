package nl.niek.minor.aa.eindopdracht;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramFinder
{
	public AnagramText						anagramText;
	public Map<String, AnagramCollection>	anagramCollections;

	/**
	 * Create an AnagramFinder and immediately parse the given String for
	 * anagrams.
	 * 
	 * @param string
	 */
	public AnagramFinder(String string)
	{
		this();

		anagramText = new AnagramText(string);

		parseAnagrams();
	}

	/**
	 * Default constructor.
	 */
	private AnagramFinder()
	{
		anagramCollections = new HashMap<String, AnagramCollection>();
	}

	public List<AnagramCollection> parseAnagrams()
	{
		// for every word in the text
		// - put word letters in alphabetical order (makes a key)
		// if key is in map
		// - add the found word to the list at the key
		// else
		// - add key and add the word to the list of anagrams of that key

		return new ArrayList<AnagramCollection>(anagramCollections.values());
	}
}
