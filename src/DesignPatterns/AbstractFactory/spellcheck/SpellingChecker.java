
package DesignPatterns.AbstractFactory.spellcheck;

import java.io.IOException;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;


public class SpellingChecker {

    private final DocumentSource documentSource;
    private final DocumentParser documentParser;
    private final AbstractDictionaryFactory dictionaryFactory;

    public SpellingChecker(DocumentSource documentSourceFactory, DocumentParser documentParserFactory, AbstractDictionaryFactory dictionaryFactory) {
        this.documentSource = documentSourceFactory;
        this.documentParser = documentParserFactory;
        this.dictionaryFactory = dictionaryFactory;
    }

    public SortedMap<String, Integer> check(String uri) throws IOException {

		// download the document content
		//
		String content = documentSource.getContent(uri);

		// extract words from the content
		//
		List<String> words = documentParser.parse(content);

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

