package DesignPatterns.DAO;

import DesignPatterns.DAO.dataaccess.DatabaseInitializationDAO;
import DesignPatterns.DAO.dataaccess.FactoryHolder;
import DesignPatterns.DAO.dataaccess.sqlite.SqliteDAOFactory;
import DesignPatterns.DAO.view.Navigator;
import DesignPatterns.DAO.view.main.MainView;

public class Main {
    public static void main(String[] args) {
        //Create factory that initializes DAO
        FactoryHolder.setFactory(new SqliteDAOFactory());

        DatabaseInitializationDAO initializationDAO = FactoryHolder.getFactory().getDatabaseInitializationDAO();
        boolean databaseInitialized = initializationDAO.initialize();

        if (databaseInitialized) {
            System.out.println("database initialized");
            Navigator.push(MainView.class, null);
        }
    }
}
