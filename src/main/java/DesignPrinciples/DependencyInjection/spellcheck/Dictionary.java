package DesignPrinciples.DependencyInjection.spellcheck;

import java.util.List;

public interface Dictionary {
    List<String> words = null;

    public boolean isValidWord(String word);
}
