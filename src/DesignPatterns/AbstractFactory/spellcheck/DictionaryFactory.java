
package DesignPatterns.AbstractFactory.spellcheck;

import java.io.IOException;

public class DictionaryFactory implements AbstractDictionaryFactory {

    @Override
    public Dictionary createDictionary(String fileName) throws IOException {
        return new TextFileDictionary(fileName);
    }
}

