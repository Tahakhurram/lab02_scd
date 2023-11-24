import java.util.*;
public class q4 {
    public static void main(String[] args) {
       
        
        int[][] letterK = new int[10][10];

        
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                if (col == 0 || col == 1 || (row == col && col >= 2) || (row + col == 9 && col >= 2)) {
                    letterK[row][col] = 1;
                }
            }
        }

        //letter K
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                if (letterK[row][col] == 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    
        
      System.out.println();
     
        int[][] letterI = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 || i == 9 || j == 4) {
                    letterI[i][j] = 1;
                }
            }
        }

        //letter I
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (letterI[i][j] == 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

     System.out.println();
     
    
int[][] letterN = new int[10][10];

        for (int i = 0; i < 10; i++) {
            letterN[i][0] = 1;
            letterN[i][i] = 1;
            letterN[i][9] = 1;
        }

        //letter N
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (letterN[i][j] == 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

     System.out.println();
     

       int[][] letterG = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 || i == 9 || (i == 5 && j >= 1) || (i >= 1 && i <= 4 && j == 0) || (i == 4 && j == 9)) {
                    letterG[i][j] = 1;
                }
            }
        }

        //letter G
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (letterG[i][j] == 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
