package DesignPatterns.DependencyInjection.spellcheck.Parser;

import java.util.List;

public interface DocumentParser {
    public List<String> parse(String content);
}
