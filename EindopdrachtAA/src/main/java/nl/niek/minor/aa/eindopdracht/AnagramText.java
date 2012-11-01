package nl.niek.minor.aa.eindopdracht;

import java.util.StringTokenizer;

public class AnagramText
{
	private static final int	STRING_SIZE_LIMIT	= 200;

	private static final String	WORD_DELIMITERS		= ",.;:!?=-()* ";

	private StringTokenizer		tokenizer;

	/**
	 * A wrapping class for looping through every word of the given text. Keeps
	 * track of a cursor to determine the next word.
	 * 
	 * @param text
	 */
	public AnagramText(String text)
	{
		checkArgsOk(text);

		tokenizer = new StringTokenizer(text, WORD_DELIMITERS);
	}

	/**
	 * Get the next word. AnagramText class keeps track of a cursor. Every time
	 * this method is called, the cursor moves to the next word.
	 * 
	 * @return
	 */
	public String getNextWord()
	{
		String word = null;

		if (tokenizer.hasMoreTokens())
		{
			word = tokenizer.nextToken();
		}

		return word;
	}

	private void checkArgsOk(String string)
	{
		if (string == null)
		{
			throw new IllegalArgumentException("String cannot be null.");
		}
		if (string.length() > STRING_SIZE_LIMIT)
		{
			throw new IllegalArgumentException(
					"String is too large. Keep under " + STRING_SIZE_LIMIT + " letters.");
		}
	}
}
