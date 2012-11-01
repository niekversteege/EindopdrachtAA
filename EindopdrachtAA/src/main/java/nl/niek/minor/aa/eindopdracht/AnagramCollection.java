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

	/**
	 * Get the whole list. Only intented for equals method.
	 * 
	 * @return
	 */
	protected final List<String> getAnagrams()
	{
		return anagrams;
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

	@Override
	public boolean equals(Object obj)
	{
		AnagramCollection collection = null;

		if (obj instanceof AnagramCollection)
		{
			collection = (AnagramCollection) obj;

			if (this.size() != collection.size())
			{
				return false;
			}

			List<String> objAnagrams = collection.getAnagrams();

			for (String s : objAnagrams)
			{
				if (!this.anagrams.contains(s))
				{
					return false;
				}
			}

			return true;
		}

		return false;
	}

	@Override
	public String toString()
	{
		return "Word: " + firstWord + " Anagrams: " + anagrams.toString();
	}
}
