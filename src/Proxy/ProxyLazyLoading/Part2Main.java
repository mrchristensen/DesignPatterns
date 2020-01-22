package Proxy.ProxyLazyLoading;

public class Part2Main {
    public static void main(String[] args) {
        //"Write a program that creates an instance of the Array2D implementing class you created in step 2, populates
        // it with values, and saves it to a file.  This file will be used in the next step."
        Part2Implementation part2 = new Part2Implementation(2,2);
        part2.set(0,0, "Top left");
        part2.set(0,1, "Top right");
        part2.set(1,0, "Bottom left");
        part2.set(1,1, "Bottom right");

        part2.save("test");

        Part2Proxy part2Lazy = new Part2Proxy("test");
        System.out.println("Created the proxy");

        //Implementation
        System.out.println("\nImplementation:");
        System.out.println(part2.get(0,0));
        System.out.println(part2.get(0,1));
        System.out.println(part2.get(1,0));
        System.out.println(part2.get(1,1));

        //Proxy (should print out it's loaded after printing the implementation stuff, even though we created it before)
        System.out.println("\nProxy:");
        System.out.println(part2Lazy.get(0,0));
        System.out.println(part2Lazy.get(0,1));
        System.out.println(part2Lazy.get(1,0));
        System.out.println(part2Lazy.get(1,1));
    }
}
