package nl.niek.minor.aa.eindopdracht;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramFinder
{
	public AnagramText						anagramText;
	public Map<String, AnagramCollection>	anagramCollections;

	/**
	 * Create an AnagramFinder for the given text.
	 * 
	 * @param string
	 */
	public AnagramFinder(String string)
	{
		this();

		anagramText = new AnagramText(string);
		
		AnagramUtil.println("Finding anagrams in: " + string);
	}

	/**
	 * Default constructor.
	 */
	private AnagramFinder()
	{
		anagramCollections = new HashMap<String, AnagramCollection>();
	}

	/**
	 * Get the list of anagrams found in the text given at construction.
	 * 
	 * @return
	 */
	public List<AnagramCollection> findAnagrams()
	{
		String currentWord = anagramText.getNextWord();

		while (currentWord != null)
		{
			final String key = alphabetizeLetters(currentWord);

			if (anagramCollections.containsKey(key))
			{
				anagramCollections.get(key).addAnagram(currentWord);
			}
			else
			{
				AnagramCollection newCollection = new AnagramCollection(
						currentWord);
				anagramCollections.put(key, newCollection);
			}

			currentWord = anagramText.getNextWord();
		}

		return makeList();
	}

	/**
	 * Remove any AnagramCollections that have no anagrams.
	 * 
	 * @return
	 */
	private ArrayList<AnagramCollection> makeList()
	{
		ArrayList<AnagramCollection> collectionValues = new ArrayList<AnagramCollection>(
				anagramCollections.values());
		ArrayList<AnagramCollection> retVal = new ArrayList<AnagramCollection>();

		for (AnagramCollection a : collectionValues)
		{
			if (a.size() > 0)
			{
				retVal.add(a);
			}
		}

		return retVal;
	}

	/**
	 * Put the characters of the given String in alphabetical order. Returns a
	 * new String.
	 * 
	 * @param word
	 * @return
	 */
	public String alphabetizeLetters(String word)
	{
		char[] characters = word.toCharArray();
		Arrays.sort(characters);
		return new String(characters);
	}
}
