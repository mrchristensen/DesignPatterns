package DesignPatterns.DependencyInjection.spellcheck.Modules;

import DesignPatterns.DependencyInjection.spellcheck.Dictionary.Dictionary;
import DesignPatterns.DependencyInjection.spellcheck.Dictionary.MockDictionary;
import DesignPatterns.DependencyInjection.spellcheck.Parser.DocumentParser;
import DesignPatterns.DependencyInjection.spellcheck.Parser.MockDocumentParser;
import DesignPatterns.DependencyInjection.spellcheck.Source.DocumentSource;
import DesignPatterns.DependencyInjection.spellcheck.Source.MockSource;
import com.google.inject.AbstractModule;

public class MockSpellingCheckModule extends AbstractModule {
    @Override
    protected void configure()
    {
        bind(DocumentParser.class).to(MockDocumentParser.class);
        bind(DocumentSource.class).to(MockSource.class);
        bind(Dictionary.class).to(MockDictionary.class);
    }
}
