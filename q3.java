import java.util.Random;

public class q3 {
    public static void main(String[] args) {
        int[][] board = new int[10][10];
        int x = 0; // Initial position of the pointer

        while (x < 100) {
            System.out.println("Current Position: " + x);

            //Roll dice to get a random no.
            int diceRoll = rollDice();

            //Move pointer
            x += diceRoll;

            if (x >= 100) {
                System.out.println("You reached end!");
                break;
            }

            // Update the board to mark the visited cell
            int row = x / 10;
            int col = x % 10;
            board[row][col] = 1;

            // Print the board with the current position
            printBoard(board);
        }
    }

    // Method to roll a six-sided dice and return the result
    private static int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    // Method to print the board with the current position
    private static void printBoard(int[][] board) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (board[i][j] == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}