package DesignPatterns.AbstractFactory.spellcheck;

import java.io.IOException;

public interface AbstractDictionaryFactory {
    public Dictionary createDictionary(String dictionary) throws IOException;
}
