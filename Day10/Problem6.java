package Day10;

public class Problem6 {
    public static void main(String[] args) {
        Spotify s = new Spotify();
        s.play();
    }
}
interface Player {
    void play();
}
class Spotify implements Player {
    public void play() {
        System.out.println("Music Playing");
    }
}   