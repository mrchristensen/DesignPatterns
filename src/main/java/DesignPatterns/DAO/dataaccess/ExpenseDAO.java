package DesignPatterns.DAO.dataaccess;

import DesignPatterns.DAO.model.Expense;

import java.util.List;

public interface ExpenseDAO {
    List<Expense> getAllExpenses(String budgetId);
    boolean createExpense(Expense expense);
    boolean updateExpense(Expense expense);
    boolean deleteExpense(String id);
}
