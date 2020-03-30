package DesignPatterns.DecoratorPattern;

public class AddPunctuationDecorator extends Decorator {
    public AddPunctuationDecorator(StringSource stringSource) {
        super(stringSource);
    }

    @Override
    public String next() {
        return  stringSource.next().concat("!!!");
    }


}
