import ship.Ship;

import java.util.ArrayList;
import java.util.List;

public class PlayingField {
    private String[][] field;
    private Player player;
    private List<Ship> ships;

    public PlayingField(Player player) {
        this.player = player;
        ships = new ArrayList<>();
    }

    public String[][] getPlayingField() {

        return field;
    }

    public void printField() {
        for (String[] row: field) {
            for (String cell: row) {
                //System.out.println(cell.);
            }
        }

    }
}
