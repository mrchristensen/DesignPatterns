package DesignPatterns.Proxy.ProxyLazyLoading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Part2Implementation implements Part2Interface {
    String[][] myArray;
    public Part2Implementation(int row, int col) {
        myArray = new String[row][col];
    }

    public Part2Implementation(String fileName) {
        load(fileName);
    }

    @Override
    public void set(int row, int col, String value) {
        myArray[row][col] = value;
    }

    @Override
    public String get(int row, int col) {
        return myArray[row][col];
    }

    public void save(String fileName){
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(myArray);
        } catch (Exception e) {
            //Bad swallowing, I know - just trying to keep it simple and use the stack overflow stuff
        }
    }

    public void load(String fileName){
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream iis = new ObjectInputStream(fis);
            myArray = (String[][]) iis.readObject();
        } catch (Exception e) {
            //Bad swallowing, I know - just trying to keep it simple and use the stack overflow stuff
        }
    }

}
