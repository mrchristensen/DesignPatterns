package DesignPatterns.AbstractFactory.spellcheck.Factories;

import DesignPatterns.AbstractFactory.spellcheck.Dictionary;

import java.io.IOException;

public interface AbstractDictionaryFactory {
    public Dictionary createDictionary(String dictionary) throws IOException;
}
