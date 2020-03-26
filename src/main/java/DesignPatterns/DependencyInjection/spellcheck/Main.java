
package DesignPatterns.DependencyInjection.spellcheck;

import DesignPatterns.DependencyInjection.spellcheck.Modules.SpellingCheckModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import java.io.IOException;
import java.util.SortedMap;


public class Main {

	public static void main(String[] args) {
	
		try {
			String content = args[0];

			Injector injector = Guice.createInjector(new SpellingCheckModule());
			SpellingChecker checker = injector.getInstance(SpellingChecker.class);
			checker.setDictionary("src/main/java/DesignPatterns/DependencyInjection/dict.txt");

			SortedMap<String, Integer> mistakes = checker.check(content);
			System.out.println(mistakes);

//			DocumentSource documentSource = new URLDocumentSource();
//			String content = args[0];
//			SpellingChecker checker = new SpellingChecker(documentSource, new PlainTextDocumentParser(), new TextFileDictionary("src/main/java/DesignPatterns/DependencyInjection/dict.txt"));
//			SortedMap<String, Integer> mistakes = checker.check(content);
//			System.out.println(mistakes);

		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

