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

        // 행에 대해서.
        int blankRowCount = 0;
        for (int i = 0; i < row; i++) {
            boolean isFilled = false;
            for (int j = 0; j < col; j++) {
                if (castle[i][j] == 'X') {
                    isFilled = true;
                    break;
                }
            }
            if (!isFilled)
                blankRowCount++;
        }

        // 열에 대해서.
        int blankColCount = 0;
        for (int i = 0; i < col; i++) {
            boolean isFilled = false;
            for (int j = 0; j < row; j++) {
                if (castle[j][i] == 'X') {
                    isFilled = true;
                    break;
                }
            }
            if (!isFilled)
                blankColCount++;
        }

        System.out.println(Math.max(blankRowCount, blankColCount));
    }
}
