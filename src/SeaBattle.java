import java.util.Scanner;

public class SeaBattle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player 1 name: ");
        String player1Name = scanner.next();
        System.out.print("Enter player 2 name: ");
        String player2Name = scanner.next();
        System.out.println(player1Name + " and " + player2Name + " - You are welcome!");

        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);

        PlayingField playingField1 = new PlayingField(player1);
        PlayingField playingField2 = new PlayingField(player2);

        while (player1.isAlive() && player2.isAlive()) {


        }

    }

}
