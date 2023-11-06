package chapter2.observerpattern.Java;

public interface Subject {

    public void registerObservers(Observer o);
    public void unRegisterObservers(Observer o);
    public void notifyObservers();
}
