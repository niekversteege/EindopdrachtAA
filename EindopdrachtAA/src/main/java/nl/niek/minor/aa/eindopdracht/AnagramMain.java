package nl.niek.minor.aa.eindopdracht;

public class AnagramMain
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		AnagramFinder finder = new AnagramFinder(AnagramUtil.getDefaultText());
		AnagramUtil.printAllAnagrams(finder.findAnagrams());
	}

}
