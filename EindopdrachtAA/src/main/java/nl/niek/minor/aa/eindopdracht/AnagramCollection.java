package nl.niek.minor.aa.eindopdracht;

import java.util.ArrayList;
import java.util.List;

/**
 * Store a word here and add it's anagrams as you find them.
 * 
 * @author Niek
 * 
 */
public class AnagramCollection
{
	private String			firstWord;
	private List<String>	anagrams;

	public AnagramCollection(String firstWord)
	{
		this.firstWord = firstWord;
		anagrams = new ArrayList<String>();
	}

	/**
	 * Add a new anagram. Ignores duplicates.
	 * 
	 * @param anagram
	 */
	public void addAnagram(final String anagram)
	{
		if (!anagrams.contains(anagram))
		{
			anagrams.add(anagram.toLowerCase());
		}
	}

	public boolean contains(final String anagram)
	{
		return anagrams.contains(anagram);
	}

	/**
	 * Get the number of anagrams in the list.
	 * 
	 * @return
	 */
	public final int size()
	{
		return anagrams.size();
	}

	/**
	 * Get the word that this object is storing anagrams for.
	 * 
	 * @return
	 */
	public final String getFirstWord()
	{
		return firstWord;
	}

	@Override
	public String toString()
	{
		return "Word: " + firstWord + " Anagrams: " + anagrams.toString();
	}
}
