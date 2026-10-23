package Observer2;

public interface TourSubject {
    void subscribe(TourObserver o);
    void unsubscribe(TourObserver o);
    void notifyObservers();
}
