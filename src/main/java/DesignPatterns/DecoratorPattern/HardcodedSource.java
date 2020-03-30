package DesignPatterns.DecoratorPattern;

public class HardcodedSource implements StringSource {

    @Override
    public String next() {
        return "This is a hardcoded string";
    }
}
