package nl.niek.minor.aa.eindopdracht;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AnagramFinder
{
	private String					fileName;
	private List<AnagramCollection>	anagramCollections;

	public AnagramFinder()
	{
		anagramCollections = new ArrayList<AnagramCollection>();

		// optional: parse the entire file into words?
		// check file size
		// find a word
		// check the entire text for anagrams of that word
		// remove all occurrences of the word and it's anagrams
		// find another word
		// TODO: possible recursive method, keep pointing it to a new place to
		// start
	}
	
	public AnagramFinder(File file)
	{
		
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

	public static void print(String string)
	{
		System.out.print(string);
	}

	public static void println(String string)
	{
		System.out.println(string);
	}
}
