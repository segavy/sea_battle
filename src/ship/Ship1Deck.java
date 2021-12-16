package ship;

public class Ship1Deck implements Ship {
    private int x1, y1;
    private boolean alive;

    public Ship1Deck(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
        this.alive = true;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public boolean isAlive() {
        return alive;
    }

}
