package DesignPatterns.DAO.view.update_budget;

import DesignPatterns.DAO.model.Budget;
import DesignPatterns.DAO.view.IView;

import java.util.List;

public interface IUpdateBudgetView extends IView {
    void displayAllBudgets(List<Budget> budgets);
    void displayEditingOptions();
    void displayMessage(String message);
    void navigate(Class<?> clazz, Object args);
    void pop();
}
