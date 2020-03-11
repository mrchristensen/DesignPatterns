package DesignPatterns.DAO.presenter.update_budget;

public interface IUpdateBudgetPresenter {
    void fetchAllBudgets();
    void budgetSelected(String selection);
    void editingOptionSelected(String option);
}
