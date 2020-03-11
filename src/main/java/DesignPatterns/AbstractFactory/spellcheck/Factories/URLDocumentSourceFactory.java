
package DesignPatterns.AbstractFactory.spellcheck.Factories;

import DesignPatterns.AbstractFactory.spellcheck.DocumentSource;
import DesignPatterns.AbstractFactory.spellcheck.URLDocumentSource;

public class URLDocumentSourceFactory implements AbstractDocumentSourceFactory {

    @Override
    public DocumentSource createDocumentSource() {
        return new URLDocumentSource();
    }
}

