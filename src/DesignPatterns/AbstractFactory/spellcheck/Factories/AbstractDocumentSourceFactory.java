package DesignPatterns.AbstractFactory.spellcheck.Factories;

import DesignPatterns.AbstractFactory.spellcheck.DocumentSource;

public interface AbstractDocumentSourceFactory {
    public DocumentSource createDocumentSource();
}
