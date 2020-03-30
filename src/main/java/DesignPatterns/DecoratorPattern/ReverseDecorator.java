package DesignPatterns.DecoratorPattern;

public class ReverseDecorator extends Decorator {
    public ReverseDecorator(StringSource stringSource) {
        super(stringSource);
    }

    @Override
    public String next() {
        String input = stringSource.next();
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1 = input1.reverse();

        // print reversed String
        return input1.toString();
    }


}
