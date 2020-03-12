package DesignPatterns.DAO.dataaccess;

public class FactoryHolder {
    // static variable single_instance of type Singleton
    private static FactoryHolder single_instance = null;

    // variable of type String
    private static DAOFactory factory;

    // private constructor restricted to this class itself
    public FactoryHolder(DAOFactory factory) {
        FactoryHolder.factory = factory;
    }

    // static method to create instance of Singleton class
    public static FactoryHolder getInstance() {
        return single_instance;
    }

    public static void setFactory(DAOFactory factory){
        single_instance = new FactoryHolder(factory);
    }

    public static DAOFactory getFactory() {
        return factory;
    }
}
