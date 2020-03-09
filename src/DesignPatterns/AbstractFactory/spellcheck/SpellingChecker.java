
package DesignPatterns.AbstractFactory.spellcheck;

import DesignPatterns.AbstractFactory.spellcheck.Factories.AbstractDictionaryFactory;
import DesignPatterns.AbstractFactory.spellcheck.Factories.AbstractDocumentSourceFactory;
import DesignPatterns.AbstractFactory.spellcheck.Factories.AbstractParserFactory;

import java.io.IOException;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;


public class SpellingChecker {

    private final AbstractDocumentSourceFactory documentSourceFactory;
    private final AbstractParserFactory documentParserFactory;
    private final AbstractDictionaryFactory dictionaryFactory;

    public SpellingChecker(AbstractDocumentSourceFactory documentSourceFactory, AbstractParserFactory documentParserFactory, AbstractDictionaryFactory dictionaryFactory) {
        this.documentSourceFactory = documentSourceFactory;
        this.documentParserFactory = documentParserFactory;
        this.dictionaryFactory = dictionaryFactory;
    }

    public SortedMap<String, Integer> check(String uri) throws IOException {

		// download the document content
		//
		String content = documentSourceFactory.createDocumentSource().getContent(uri);

		// extract words from the content
		//
		List<String> words = documentParserFactory.createParser().parse(content);

		// find spelling mistakes
		//
		SortedMap<String, Integer> mistakes = new TreeMap<>();

		Dictionary dictionary = dictionaryFactory.createDictionary("src/DesignPatterns/AbstractFactory/dict.txt");
        for (String word : words) {
            if (!dictionary.isValidWord(word)) {
                if (mistakes.containsKey(word)) {
                    int oldCount = mistakes.get(word);
                    mistakes.put(word, oldCount + 1);
                } else {
                    mistakes.put(word, 1);
                }
            }
        }

		return mistakes;
	}
}

