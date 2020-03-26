
package DesignPatterns.DependencyInjection.spellcheck.Dictionary;

import java.io.IOException;
import java.util.Set;


public class MockDictionary implements Dictionary {

	private Set<String> words;

	public MockDictionary() {
	}

	public void setDictionary(String fileName) throws IOException {
    }

	public boolean isValidWord(String word) {
		return true;
	}
}

