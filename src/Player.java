public class Player {
    private String name;
    private PlayingField playingField;
    private boolean alive;

    public Player(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return alive;
    }

}
