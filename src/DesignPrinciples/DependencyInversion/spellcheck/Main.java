
package DesignPrinciples.DependencyInversion.spellcheck;

import java.io.IOException;
import java.util.SortedMap;


public class Main {

	public static void main(String[] args) {
	
		try {
			DocumentSource documentSource = new URLDocumentSource();
			String content = args[0];
			SpellingChecker checker = new SpellingChecker(documentSource, new PlainTextDocumentParser(), new TextFileDictionary("src/DesignPrinciples/DependencyInversion/dict.txt"));
			SortedMap<String, Integer> mistakes = checker.check(content);
			System.out.println(mistakes);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

