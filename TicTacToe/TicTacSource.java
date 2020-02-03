import java.util.Random;

public class TicTacSource {
    public TicTacSource() {

    }

    public void drawBoard(String[] board) {
        System.out.print(board[7] + "|" + board[8] + "|" + board[9] + "\n"
                       + "-+-+-" + "\n"
                       + board[4] + "|" + board[5] + "|" + board[6] + "\n"
                       + "-+-+-" + "\n"
                       + board[1] + "|" + board[2] + "|" + board[3] + "\n");
    }
}