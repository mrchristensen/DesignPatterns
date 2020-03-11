package DesignPatterns.DAO.view.factory;

import DesignPatterns.DAO.view.IView;

public interface IViewFactory {
    IView make(Class<?> clazz);
}
