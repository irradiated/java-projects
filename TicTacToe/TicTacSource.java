import java.util.Random;
import java.util.Scanner;

public class TicTacSource {

    Random numgen = new Random();
    Scanner scan = new Scanner(System.in);
    char letter;

    public TicTacSource() {

        letter = 0;

    }

    public void drawBoard(String[] board) {

        System.out.print(board[6] + "|" + board[7] + "|" + board[8] + "\n"
                       + "-+-+-" + "\n"
                       + board[3] + "|" + board[4] + "|" + board[5] + "\n"
                       + "-+-+-" + "\n"
                       + board[0] + "|" + board[1] + "|" + board[2] + "\n");

    }

    public void inputPlayerLetter() {
        while (!(letter == 'X') || !(letter == 'O')) {
            System.out.print("Do you want to be X or O? ");
            letter = Character.toUpperCase(scan.next().charAt(0));
            if (letter == 'X') {
                return
            }
        }
    }
}