package DesignPatterns.DAO.view.expense;

import DesignPatterns.DAO.model.Expense;
import DesignPatterns.DAO.view.IView;

import java.util.List;

public interface IExpenseView extends IView {
    void displayOptions();
    void displayExpenses(List<Expense> expenses);
    void displayEditNamePrompt();
    void displayEditDayPrompt();
    void displayEditAmountPrompt();
    void displayEditExpensePrompt(List<Expense> expenses);
    void displaySavePrompt(Expense expense);
    void displayDeleteExpensePrompt(List<Expense> expenses);
    void displayMessage(String message);
    void pop();
}
