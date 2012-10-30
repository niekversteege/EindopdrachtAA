package nl.niek.minor.aa.eindopdracht;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AnagramFinder
{
	private File					file;
	private List<AnagramCollection>	anagramCollections;

	/**
	 * Create an AnagramFinder and immediately parse the given file for
	 * anagrams.
	 * 
	 * @param file
	 */
	public AnagramFinder(File file)
	{
		this();

		this.file = file;

		parseAnagrams();
	}

	/**
	 * Default constructor.
	 */
	public AnagramFinder()
	{
		anagramCollections = new ArrayList<AnagramCollection>();
	}

	public List<AnagramCollection> parseAnagrams()
	{
		// optional: parse the entire file into words?
		// check file size
		// find a word
		// check the entire text for anagrams of that word
		// remove all occurrences of the word and it's anagrams
		// find another word
		// TODO: possible recursive method, keep pointing it to a new place to
		// start
		
		return anagramCollections;
	}

	public void printAllAnagrams()
	{
		if (anagramCollections.size() > 0)
		{
			println("Anagrams found: ");

			for (AnagramCollection a : anagramCollections)
			{
				println(a.toString());
			}
		}
		else
		{
			println("No anagrams found.");
		}
	}

	public void setFile(final File file)
	{
		this.file = file;
	}

	public static void print(String string)
	{
		System.out.print(string);
	}

	public static void println(String string)
	{
		System.out.println(string);
	}
}
