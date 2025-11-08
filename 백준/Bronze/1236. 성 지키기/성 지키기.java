import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        char[][] castle = new char[row][col];
        for (int i = 0; i < row; i++) {
            castle[i] = sc.next().toCharArray();
        }

        boolean[] filledRow = new boolean[row];
        boolean[] filledCol = new boolean[col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (castle[r][c] == 'X') {
                    filledRow[r] = true;
                    filledCol[c] = true;
                }
            }
        }

        int blankRowCount = row;
        for (int r = 0; r < row; r++) {
            if (filledRow[r])
                blankRowCount--;
        }

        int blankColCount = col;
        for (int c = 0; c < col; c++) {
            if (filledCol[c])
                blankColCount--;
        }

        System.out.println(Math.max(blankRowCount, blankColCount));
    }
}
