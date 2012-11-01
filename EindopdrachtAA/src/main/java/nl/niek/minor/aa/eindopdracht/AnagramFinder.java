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
	}

	/**
	 * Default constructor.
	 */
	private AnagramFinder()
	{
		anagramCollections = new HashMap<String, AnagramCollection>();
	}

	public List<AnagramCollection> findAnagrams()
	{
		// for every word in the text
		// - put word letters in alphabetical order (makes a key)
		// if key is in map
		// - add the found word to the list at the key
		// else
		// - add key and add the word to the list of anagrams of that key

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
