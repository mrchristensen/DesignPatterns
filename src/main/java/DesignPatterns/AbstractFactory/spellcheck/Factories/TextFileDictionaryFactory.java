
package DesignPatterns.AbstractFactory.spellcheck.Factories;

import DesignPatterns.AbstractFactory.spellcheck.Dictionary;
import DesignPatterns.AbstractFactory.spellcheck.TextFileDictionary;

import java.io.IOException;

public class TextFileDictionaryFactory implements AbstractDictionaryFactory {

    @Override
    public Dictionary createDictionary(String fileName) throws IOException {
        return new TextFileDictionary(fileName);
    }
}

