import java.util.List;

public class User implements Observer{

    private String nick;

    public User(String nick){
        this.nick = nick;
    }
    @Override
    public void update(List<String> video) {
        System.out.println("Dear " + this.nick + " channel updated a video" + video);
    }
}
