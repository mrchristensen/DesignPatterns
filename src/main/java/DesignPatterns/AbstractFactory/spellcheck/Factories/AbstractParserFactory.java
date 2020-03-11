package DesignPatterns.AbstractFactory.spellcheck.Factories;

import DesignPatterns.AbstractFactory.spellcheck.Parser;

public interface AbstractParserFactory {
    public Parser createParser();
}
