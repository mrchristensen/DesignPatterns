package DesignPatterns.DAO.dataaccess.sqlite;

import DesignPatterns.DAO.dataaccess.DAOFactory;
import DesignPatterns.DAO.dataaccess.DatabaseInitializationDAO;
import DesignPatterns.DAO.dataaccess.ExpenseDAO;

public class SqliteDAOFactory implements DAOFactory {

    @Override
    public DatabaseInitializationDAO getDatabaseInitializationDAO() {
        return new SqliteDatabaseInitializationDAO();
    }

    @Override
    public ExpenseDAO getExpenseDAO() {
        return new SqliteExpenseDAO();
    }
}
