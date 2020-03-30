package DesignPatterns.DecoratorPattern;

public abstract class Decorator implements StringSource {
    StringSource stringSource;

    public Decorator(StringSource stringSource) {
        this.stringSource = stringSource;
    }

    @Override
    abstract public String next();
}
