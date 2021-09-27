public interface Observable {
    void subscribeObserver(Observer user);
    void unsubscribeObserver(Observer user);
    void notifyAllUsers();
}
