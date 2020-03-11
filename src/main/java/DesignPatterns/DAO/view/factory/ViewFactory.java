package DesignPatterns.DAO.view.factory;

import DesignPatterns.DAO.view.IView;
import DesignPatterns.DAO.view.expense.ExpenseView;
import DesignPatterns.DAO.view.income.IncomeView;
import DesignPatterns.DAO.view.main.MainView;
import DesignPatterns.DAO.view.new_budget.NewBudgetView;
import DesignPatterns.DAO.view.update_budget.UpdateBudgetView;

public class ViewFactory implements IViewFactory {
    @Override
    public IView make(Class<?> clazz) {
        if (clazz == MainView.class) {
            return new MainView();
        } else if (clazz == NewBudgetView.class) {
            return new NewBudgetView();
        } else if (clazz == UpdateBudgetView.class) {
            return new UpdateBudgetView();
        } else if (clazz == IncomeView.class) {
            return new IncomeView();
        } else if (clazz == ExpenseView.class) {
            return new ExpenseView();
        }
        return null;
    }
}
