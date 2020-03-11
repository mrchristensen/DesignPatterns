package DesignPatterns.DAO.view.main;

import DesignPatterns.DAO.view.IView;

public interface IMainView extends IView {
    void displayOptions();
    void navigate(Class<?> clazz);
}
