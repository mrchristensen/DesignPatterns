package DesignPatterns.DependencyInjection.spellcheck.Modules;

import DesignPatterns.DependencyInjection.spellcheck.Dictionary.Dictionary;
import DesignPatterns.DependencyInjection.spellcheck.Dictionary.TextFileDictionary;
import DesignPatterns.DependencyInjection.spellcheck.Parser.DocumentParser;
import DesignPatterns.DependencyInjection.spellcheck.Parser.PlainTextDocumentParser;
import DesignPatterns.DependencyInjection.spellcheck.Source.DocumentSource;
import DesignPatterns.DependencyInjection.spellcheck.Source.URLDocumentSource;
import com.google.inject.AbstractModule;

public class SpellingCheckModule extends AbstractModule {
    @Override
    protected void configure()
    {
        bind(DocumentParser.class).to(PlainTextDocumentParser.class);
        bind(DocumentSource.class).to(URLDocumentSource.class);
        bind(Dictionary.class).to(TextFileDictionary.class);
    }
}
