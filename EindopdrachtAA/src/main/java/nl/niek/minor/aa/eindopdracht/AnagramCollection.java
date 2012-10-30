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

	public void addAnagram(final String anagram)
	{
		anagrams.add(anagram);
	}

	@Override
	public String toString()
	{
		return "Word: " + firstWord + " Anagrams: " + anagrams.toString();
	}
}
