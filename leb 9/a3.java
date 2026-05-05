//Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void. Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override the play() method to play the respective sports


interface Playable {
    void play();
}

class Football implements Playable {
    public void play() {
        System.out.println("Playing Football");
    }
    public static void main(String[] args) {
        Football football = new Football();
        football.play();
    }
}
class Volleyball implements Playable {
    public void play() {
        System.out.println("Playing Volleyball");
    }
    public static void main(String[] args) {
        Volleyball volleyball = new Volleyball();
        volleyball.play();
    }
}
public class a3 {
    public static void main(String[] args) {
        Playable football = new Football();

        Playable volleyball = new Volleyball();
        football.play();
        volleyball.play();

    }
}
