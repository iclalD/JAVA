package PatikaDev;

import java.util.Scanner;
import java.util.Random;

public class MayinTarlasi {

    public static void printMap(String[][] map, int[][] mineSweeper) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (isMineMap(map, i, j)) {
                    System.out.print("[*] ");
                } else {
                    System.out.print("[" + mineSweeper[i][j] + "] ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isEmpty(String[][] map, int raw, int column) {
        return !map[raw][column].equals("*");
    }

    public static boolean isMine(int[][] map, int raw, int column) {
        return map[raw][column] == 9;
    }

    public static boolean isMineMap(String[][] map, int raw, int column) {
        return map[raw][column].equals("*");
    }

    public static int bombNumber(int[][] map, int raw, int column) {
        int bomb = 0;
        for (int i = 0; i < map.length; i++) {
            if ((i == raw - 1) || (i == raw) || (i == raw + 1)) {
                for (int k = 0; k < map[i].length; k++) {
                    if ((k == column - 1) || (k == column) || (k == column + 1)) {
                        if (isMine(map, i, k)) {
                            bomb++;
                        }
                    }
                }
            }
        }
        map[raw][column] = bomb;
        return map[raw][column];
    }

    public static boolean isNull(int[][] arr, int r, int c) {
        return arr[r][c] != 32;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Number of Raw: ");
        int raw = input.nextInt();
        System.out.print("Number of Column: ");
        int column = input.nextInt();

        int[][] mineSweeper = new int[raw][column];
        int mine = (raw * column) / 4;
        String[][] map = new String[raw][column];
        int[][] arr = new int[raw][column];
        int start = 1;
        int index = 0;

        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < column; j++) {
                map[i][j] = "[-]";
            }
        }

        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < mine; i++) {
            int a = random.nextInt(raw);
            for (int k = 0; k < 1; k++) {
                int b = random.nextInt(column);
                if (isEmpty(map, a, b)) {
                    map[a][b] = "*";
                    mineSweeper[a][b] = 9; //bombs
                } else {
                    i--;
                }
            }
        }

        System.out.println();

//              BOMB MAP
//        for (String[] i: map) {
//            for (String j: i) {
//                System.out.print("[" + j + "] ");
//            }
//            System.out.println();
//        }


        System.out.println("Welcome to the Mine Sweeper Game!");
        while (true) {
            System.out.print("Raw: ");
            int r = input.nextInt();
            System.out.print("Column: ");
            int c = input.nextInt();
            if (!(r < 4 && r > -1 && c < 4 && c > -1)) {
                System.out.println("Raw range: 0 - " + (raw - 1));
                System.out.println("Column range: 0 - " + (column - 1));
                continue;
            }


            if (isMine(mineSweeper, r, c)) {
                System.out.println("Bomb has been exploded, you lost the game!");
                printMap(map, mineSweeper);
                break;
            } else {
                if (isNull(arr, r, c)) {
                    mineSweeper[r][c] = bombNumber(mineSweeper, r, c);
                    arr[r][c] = 32;
                    index++;
                } else {
                    System.out.println("You already made that move!");
                    continue;
                }
            }
            System.out.println(mineSweeper[r][c]);
            System.out.println();
            if (start >= raw * column - mine) {
                System.out.println("Congrats, you won the game!");
                printMap(map, mineSweeper);
                break;
            }
            start++;
        }
    }
}
