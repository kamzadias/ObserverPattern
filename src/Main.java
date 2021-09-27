public class Main {

    public static void main(String[] args) {
		User subscriber = new User("Bob");
		User subscriber1 = new User("Dias");

	    YouTubeChannel PewDiePie = new YouTubeChannel();

	    PewDiePie.addVideo("Minecraft");
		PewDiePie.addVideo("YouTube Rewind 2021");
		PewDiePie.subscribeObserver(subscriber);
		PewDiePie.addVideo("Jake Paul");
	    PewDiePie.removeVideo("Jake Paul");

		YouTubeChannel EeOneGuy = new YouTubeChannel();

		EeOneGuy.addVideo("5 minut nazad");
		EeOneGuy.addVideo("Comments in reality");
	    EeOneGuy.subscribeObserver(subscriber1);
	    EeOneGuy.addVideo("WarZone");
		EeOneGuy.removeVideo("5 minut nazad");

    }
}
