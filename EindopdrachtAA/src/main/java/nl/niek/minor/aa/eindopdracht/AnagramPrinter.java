package nl.niek.minor.aa.eindopdracht;

import java.util.List;

public class AnagramPrinter
{
	public static void printAllAnagrams(List<AnagramCollection> anagrams)
	{
		if (anagrams.size() > 0)
		{
			for (AnagramCollection a : anagrams)
			{
				println(a.toString());
			}
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