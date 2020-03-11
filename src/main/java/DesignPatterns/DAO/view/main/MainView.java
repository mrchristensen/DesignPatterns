package DesignPatterns.DAO.view.main;

import DesignPatterns.DAO.presenter.main.IMainPresenter;
import DesignPatterns.DAO.presenter.main.MainPresenter;
import DesignPatterns.DAO.view.IView;
import DesignPatterns.DAO.view.Navigator;

import java.util.Scanner;

public class MainView implements IMainView, IView {
    private IMainPresenter _mainPresenter;

    @Override
    public void start(Object args) {
        _mainPresenter = new MainPresenter(this);

        Scanner scanner = new Scanner(System.in);
        displayOptions();
        String selection = scanner.nextLine();
        _mainPresenter.optionSelected(selection);
    }

    @Override
    public void displayOptions() {
        System.out.println("\n########## HOME ##########\n");
        System.out.println("1. Make a new budget");
        System.out.println("2. Update an existing budget");
        System.out.println("3. Quit");

        System.out.print("Your selection: ");
    }

    @Override
    public void navigate(Class<?> clazz) {
        Navigator.push(clazz, null);
    }
}
