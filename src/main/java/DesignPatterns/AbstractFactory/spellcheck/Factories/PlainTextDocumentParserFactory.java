
package DesignPatterns.AbstractFactory.spellcheck.Factories;

import DesignPatterns.AbstractFactory.spellcheck.Factories.AbstractParserFactory;
import DesignPatterns.AbstractFactory.spellcheck.Parser;
import DesignPatterns.AbstractFactory.spellcheck.PlainTextParser;

public class PlainTextDocumentParserFactory implements AbstractParserFactory {

    @Override
    public Parser createParser() {
        return new PlainTextParser();
    }
}

