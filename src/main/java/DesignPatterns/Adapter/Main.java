package DesignPatterns.Adapter;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        ContactManager contactManager = new ContactManager();

        //create contact manager, add contacts and pass that contact manager object to TableContractManager
        contactManager.addContact(new Contact("Bob", "Marley", "", "bob@gmail.com"));
        contactManager.addContact(new Contact("Jimi", "Hendricks", "(801)344-1879", "theman@yahoo.com"));
        contactManager.addContact(new Contact("Keith", "Richards", "(403)218-1771", "richyboi@comcast.com"));
        contactManager.addContact(new Contact("Jimmy", "Page", "(145)781-7613", "ddb@gmail.com"));

        TableContactManager tableContactManager = new TableContactManager(contactManager);
        PrintWriter outFile = new PrintWriter(System.out, true);
        Table table = new Table(outFile, tableContactManager);
        table.display();
        outFile.close();
        //close the writter
    }
}
