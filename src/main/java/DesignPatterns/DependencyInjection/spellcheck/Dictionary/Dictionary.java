package DesignPatterns.DependencyInjection.spellcheck.Dictionary;

import java.io.IOException;
import java.util.List;

public interface Dictionary {
    List<String> words = null;

    public void setDictionary(String dictionary) throws IOException;

    public boolean isValidWord(String word);
}
