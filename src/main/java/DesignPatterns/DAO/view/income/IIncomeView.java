package DesignPatterns.DAO.view.income;

import DesignPatterns.DAO.model.Income;
import DesignPatterns.DAO.view.IView;

public interface IIncomeView extends IView {
    void displayOptions();
    void displayIncome(Income income);
    void displayEditProjectedIncomePrompt(String month, int year);
    void displayEditActualIncomePrompt(String month, int year);
    void displaySavePrompt(Income income);
    void displayMessage(String message);
    void pop();
}
