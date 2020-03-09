
package DesignPatterns.AbstractFactory.spellcheck;

import java.io.IOException;
import java.util.SortedMap;


public class Main {

	public static void main(String[] args) {
	
		try {
			String content = args[0];
			//pass in concrete factories
			SpellingChecker checker = new SpellingChecker(new URLDocumentSource(), new PlainTextDocumentParser(), new DictionaryFactory());
			SortedMap<String, Integer> mistakes = checker.check(content);
			System.out.println("Mistakes:\n" + mistakes);
			System.out.println("Test: make sure output matches: \n" + "{be=1, doesn=1, funtion=1, t=2}"); //Matt said that we can do it this way
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

