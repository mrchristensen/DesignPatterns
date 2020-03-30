package DesignPatterns.DecoratorPattern;

public class AllCapsDecorator extends Decorator {
    public AllCapsDecorator(StringSource stringSource) {
        super(stringSource);
    }

    @Override
    public String next() {
        return  stringSource.next().toUpperCase();
    }


}
