package DesignPatterns.DAO.dataaccess;

public interface DAOFactory {
    //make singleton
//    private static AbstractDAOFactory instance;

//    public static AbstractDAOFactory getInstance() {
//        if (instance == null) {
//            instance = new AbstractDAOFactory();
//        }
//
//        return instance;
//    }

//    public static AbstractDAOFactory getInstance();

    DatabaseInitializationDAO getDatabaseInitializationDAO();

    ExpenseDAO getExpenseDAO();

    }
