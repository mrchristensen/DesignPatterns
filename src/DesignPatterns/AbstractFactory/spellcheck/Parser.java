package DesignPatterns.AbstractFactory.spellcheck;

import java.util.List;

public interface Parser {
    public List<String> parse(String content);
}
