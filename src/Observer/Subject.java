package Observer;

import java.util.ArrayList;
import java.util.List;

abstract class Subject {
    List<ObserverInterface> observers = new ArrayList<>();

    public void attach(ObserverInterface observer){
        observers.add(observer);
    }

    void detach(ObserverInterface observer){
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    void notify(Flight flight){
        for (ObserverInterface observer : observers) {
            observer.update(flight);
        }
    }


}
