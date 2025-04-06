package one.digitalinnovation.gof.observer;

// Interface Observable (Subject)
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}