package DesignPatterns.DecoratorPattern;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringSource hardcodedSource = new HardcodedSource();
        StringSource fileSource = new FileSource();

        System.out.println("Default text: " + hardcodedSource.next());
        System.out.println("Default text: " + fileSource.next());

        StringSource allCaps = new AllCapsDecorator(hardcodedSource);
        System.out.println("All caps: " + allCaps.next());

        StringSource punctuation = new AddPunctuationDecorator(hardcodedSource);
        System.out.println("With Punctuation: " + punctuation.next());

        StringSource reverse = new ReverseDecorator(fileSource);
        System.out.println("Reverse: " + reverse.next());

        StringSource allCapsReverse = new AllCapsDecorator(new ReverseDecorator(fileSource));
        System.out.println("All caps and reverse: " + allCapsReverse.next());

    }
}
