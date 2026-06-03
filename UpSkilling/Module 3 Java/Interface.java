interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Guitar");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Piano");
    }
}

public class Interface {
    public static void main(String[] args) {

        Guitar g = new Guitar();
        g.play();

        Piano p = new Piano();
        p.play();
    }
}