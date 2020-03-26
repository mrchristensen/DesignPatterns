
package DesignPatterns.DependencyInjection.spellcheck.Dictionary;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class TextFileDictionary implements Dictionary {

	private Set<String> words;

	public TextFileDictionary() {

	}

	public void setDictionary(String fileName) throws IOException {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            words = new TreeSet<>();
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine().trim();
                words.add(word);
            }
        }
    }

	public boolean isValidWord(String word) {
		return words.contains(word);
	}
}

