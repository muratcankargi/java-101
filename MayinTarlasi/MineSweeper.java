package MayinTarlasi;

import java.util.*;

public class MineSweeper {
    static void Run() {
        Scanner input = new Scanner(System.in);


        int row, col;
        Object[][] board, mineCoord;
        int mine;
        while (true) {
            System.out.print("Satır sayısı : ");
            row = input.nextInt();

            System.out.print("Sütun sayısı : ");
            col = input.nextInt();
            if (row <= 0 || col <= 0) {
                System.out.println("Geçersiz Koordinat!");
            } else {
                board = new Object[row][col];
                mineCoord = new Object[row][col];
                break;
            }

        }
        mine = (row * col) / 4;

        mineLocator(mine, mineCoord, board);

        printMine(mineCoord);

        valueAssignment(board, mineCoord);

        int x, y;
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        do {
            System.out.print("Satır giriniz : ");
            x = input.nextInt();
            System.out.print("Sütun giriniz : ");
            y = input.nextInt();

        } while (isEnd(x, y, board, mineCoord));

        input.close();
    }

    static void valueAssignment(Object[][] board, Object[][] mineCoord) {
        //mayın dışındaki yerlerin sayılarını belirleme ve diziye atama

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (mineCoord[i][j] == "*") {
                    board[i][j] = mineCoord[i][j];
                } else {
                    int count = 0;
                    if ((i + 1) < board.length && mineCoord[i + 1][j] == "*")
                        count++;
                    if ((i - 1) >= 0 && mineCoord[i - 1][j] == "*")
                        count++;
                    if (((j + 1) < board[i].length) && (mineCoord[i][j + 1] == "*"))
                        count++;
                    if ((j - 1) >= 0 && mineCoord[i][j - 1] == "*")
                        count++;
                    if ((i + 1) < board.length && (j + 1) < board.length && mineCoord[i + 1][j + 1] == "*")
                        count++;
                    if ((i + 1) < board[i].length && (j - 1) >= 0 && mineCoord[i + 1][j - 1] == "*")
                        count++;
                    if ((i - 1) >= 0 && (j + 1) < board[i].length && mineCoord[i - 1][j + 1] == "*")
                        count++;
                    if ((i - 1) >= 0 && (j - 1) >= 0 && mineCoord[i - 1][j - 1] == "*")
                        count++;

                    board[i][j] = count;
                }
            }
        }
    }

    static void mineLocator(int mine, Object[][] mineCoord, Object[][] board) {
        //mayın yerleri belirleme
        Random rnd = new Random();
        int mineRow, mineCol;
        for (int i = 0; i < mine; i++) {
            mineRow = rnd.nextInt(mineCoord.length);
            mineCol = rnd.nextInt(mineCoord[0].length);
            mineCoord[mineRow][mineCol] = "*";
        }

        System.out.println("Mayınların Konumu");
        for (int i = 0; i < mineCoord.length; i++) {
            for (int j = 0; j < mineCoord[i].length; j++) {
                if (mineCoord[i][j] == "*") {
                    board[i][j] = "*";
                } else {
                    mineCoord[i][j] = "-";
                }
                System.out.print(mineCoord[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("===========================");
    }

    static void printMine(Object[][] mineCoord) {
        for (Object[] a : mineCoord) {
            for (Object value : a) {
                if (value == "*")
                    System.out.print("- ");
                else
                    System.out.print(value + " ");
            }
            System.out.println("");
        }
    }

    static boolean isEnd(int x, int y, Object[][] board, Object[][] mineCord) {
        int count = 0;
        System.out.println("===========================");
        //girilen sayıların sınırlarının kontrolü,
        if ((x < board.length && x >= 0) && (y < board[0].length && y >= 0)) {
            if (board[x][y] != "*") {
                mineCord[x][y] = board[x][y];

                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board[i].length; j++) {
                        if (mineCord[i][j] == "*")
                            System.out.print("- ");
                        else
                            System.out.print(mineCord[i][j] + " ");

                        if (mineCord[i][j] == "-")
                            count++;

                    }
                    System.out.println("");
                }

                if (count == 0) {
                    System.out.println("Oyunu Kazandınız!");
                    return false;
                }
                return true;
            } else {
                System.out.println("Game Over!");
                return false;
            }


        } else {
            System.out.println("Koordinat sınırlarına dikkat ediniz!");
            return true;
        }


    }

}
