import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Observable{

    private List<String> videos = new ArrayList<>();
    private List<Observer> users = new ArrayList<>();

    public void addVideo(String video){
        this.videos.add(video);
        notifyAllUsers();
    }

    public void removeVideo(String video){
        this.videos.remove(video);
        notifyAllUsers();
    }

    @Override
    public void subscribeObserver(Observer observer) {
        this.users.add(observer);
    }

    @Override
    public void unsubscribeObserver(Observer observer) {
        this.users.remove(observer);
    }

    @Override
    public void notifyAllUsers() {
        for(Observer observer:users){
            observer.update(this.videos);
        }
    }
}
