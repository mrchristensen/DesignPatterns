
package DesignPatterns.DependencyInjection.spellcheck.Parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;


public class PlainTextDocumentParser implements DocumentParser {

	public List<String> parse(String content) {

		content = content.toLowerCase();
		
		List<String> words = new ArrayList<>();

		Pattern wordPattern = Pattern.compile("\\p{Alpha}+");
		Pattern delimiterPattern = Pattern.compile("[^\\p{Alpha}]+");

		Scanner scanner = new Scanner(content);
		scanner.useDelimiter(delimiterPattern);

		while (scanner.hasNext(wordPattern)) {
			String word = scanner.next(wordPattern);
			words.add(word);
		}

		return words;
	}
}

