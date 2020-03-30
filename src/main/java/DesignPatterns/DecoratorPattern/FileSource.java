package DesignPatterns.DecoratorPattern;

import java.io.*;

public class FileSource implements StringSource {

    @Override
    public String next() {
        InputStream is = null;
        try {
            is = new FileInputStream("src/main/java/DesignPatterns/DecoratorPattern/text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader buf = new BufferedReader(new InputStreamReader(is));

        String line = null;
        try {
            line = buf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();

        while(line != null){
            sb.append(line).append("\n");
            try {
                line = buf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return sb.toString();
    }
}
