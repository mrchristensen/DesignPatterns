
package DesignPatterns.DependencyInjection.spellcheck;

import DesignPatterns.DependencyInjection.spellcheck.Dictionary.Dictionary;
import DesignPatterns.DependencyInjection.spellcheck.Parser.DocumentParser;
import DesignPatterns.DependencyInjection.spellcheck.Source.DocumentSource;
import com.google.inject.Inject;
import java.io.IOException;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;


public class SpellingChecker {

    private final DocumentSource documentSource;
    private final DocumentParser documentParser;
    private final Dictionary dictionary;

    @Inject
    public SpellingChecker(DocumentSource documentSource, DocumentParser documentParser, Dictionary dictionary) {
        this.documentSource = documentSource;
        this.documentParser = documentParser;
        this.dictionary = dictionary;
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

    public void setDictionary(String dictionary) throws IOException {
        this.dictionary.setDictionary(dictionary);
    }
}

