package DesignPatterns.DependencyInjection.spellcheck.Source;

import java.io.IOException;

public interface DocumentSource {
    String getContent(String uri) throws IOException;
}
