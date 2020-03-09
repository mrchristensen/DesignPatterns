package DesignPatterns.AbstractFactory.spellcheck;

import java.util.List;

public interface DocumentParser {
    public List<String> parse(String content);
}
