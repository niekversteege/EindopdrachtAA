package nl.niek.minor.aa.eindopdracht;

import java.util.List;

public class AnagramUtil
{
	public static void printAllAnagrams(List<AnagramCollection> anagrams)
	{
		if (anagrams != null && anagrams.size() > 0)
		{
			println("Anagrams found: ");
			for (AnagramCollection a : anagrams)
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

	/**
	 * Get a default text for demonstration/testing purposes.
	 * 
	 * @return
	 */
	public static String getDefaultText()
	{
		return "banaan, appel, nanaab, bannaa, nabaan, passievrucht, tomatensoep, tomaat, peer, erep, tomaat, tomaat, tamaot, vruchtpassie.";
	}
}