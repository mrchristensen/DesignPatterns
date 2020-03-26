package DesignPatterns.DependencyInjection.spellcheck.Source;

import java.io.IOException;

public class MockSource implements DocumentSource {

    @Override
    public String getContent(String uri) throws IOException {
        return "test";
    }
}
