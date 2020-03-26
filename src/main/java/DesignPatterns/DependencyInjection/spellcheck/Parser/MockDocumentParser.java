
package DesignPatterns.DependencyInjection.spellcheck.Parser;

import java.util.ArrayList;
import java.util.List;


public class MockDocumentParser implements DocumentParser {

	public List<String> parse(String content) {
		List<String> words = new ArrayList<>();
		words.add("test");

		return words;
	}
}

