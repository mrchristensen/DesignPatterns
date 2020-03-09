
package DesignPatterns.AbstractFactory.spellcheck;

import DesignPatterns.AbstractFactory.spellcheck.Factories.PlainTextDocumentParserFactory;
import DesignPatterns.AbstractFactory.spellcheck.Factories.TextFileDictionaryFactory;
import DesignPatterns.AbstractFactory.spellcheck.Factories.URLDocumentSourceFactory;

import java.io.IOException;
import java.util.SortedMap;


public class Main {

	public static void main(String[] args) {
	
		try {
			String content = args[0];
			SpellingChecker checker = new SpellingChecker(new URLDocumentSourceFactory(), new PlainTextDocumentParserFactory(), new TextFileDictionaryFactory());
			SortedMap<String, Integer> mistakes = checker.check(content);
			System.out.println("Mistakes:\n" + mistakes);
			System.out.println("Test: make sure output matches: \n" + "{be=1, doesn=1, funtion=1, t=2}");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

