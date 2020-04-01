package DesignPatterns.StatePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine();

        while(true){
            System.out.println(gumballMachine.toString());

            String input = acceptInput();

            switch (input){
                case "1":
                    System.out.println("How many gumballs do you want to add?");
                    input = acceptInput();
                    int num = Integer.parseInt(input);
                    if(num > 0){
                        gumballMachine.addGumballs(num);
                    }
                    else{
                        System.out.println("Error: You can't add less than zero gumballs");
                    }
                    break;
                case "2":
                    gumballMachine.insertQuarter();
                    break;
                case "3":
                    gumballMachine.removeQuarter();
                    break;
                case "4":
                    gumballMachine.turnHandle();
                    break;
                default:
                    System.out.println("Error: Invalid input");
            }
        }
    }

    static String acceptInput(){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            return in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }
}
