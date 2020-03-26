package DesignPatterns.DependencyInjection.spellcheck;

import DesignPatterns.DependencyInjection.spellcheck.Modules.MockSpellingCheckModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import java.io.IOException;
import java.util.SortedMap;

public class TestDriver {

    public static void main(String[] args) throws Exception {

        try {
            String content = "";

            Injector injector = Guice.createInjector(new MockSpellingCheckModule());
            SpellingChecker checker = injector.getInstance(SpellingChecker.class);

            SortedMap<String, Integer> mistakes = checker.check(content);

            if(mistakes.size() == 0){
                System.out.println("mistakes is empty, test is successful");
            }
            else{
                throw new Exception("Test failed");
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
