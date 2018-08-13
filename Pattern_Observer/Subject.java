package Pattern_Observer;

public interface Subject {
    void register(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
