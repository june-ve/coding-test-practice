import java.util.Scanner;

class Main {
    private static void swapCandy(char[][] map, int r1, int c1, int r2, int c2) {
        char tmp = map[r1][c1];
        map[r1][c1] = map[r2][c2];
        map[r2][c2] = tmp;
    }

    private static int findMaxRow(char[][] map) {
        int N = map.length;
        int maxRow = 0;
        for (int i = 0; i < N; i++) {
            int prevNum = map[i][0];
            int streak = 1;
            for (int j = 1; j < N; j++) {
                if (map[i][j] == prevNum) {
                    streak++;
                } else {
                    maxRow = Math.max(maxRow, streak);
                    prevNum = map[i][j];
                    streak = 1;
                }
            }
            maxRow = Math.max(maxRow, streak);
        }
        return maxRow;
    }

    private static int findMaxColumn(char[][] map) {
        int N = map.length;
        int maxColumn = 0;
        for (int c = 0; c < N; c++) {
            int prevNum = map[0][c];
            int streak = 1;
            for (int r = 1; r < N; r++) {
                if (map[r][c] == prevNum) {
                    streak++;
                } else {
                    maxColumn = Math.max(streak, maxColumn);
                    prevNum = map[r][c];
                    streak = 1;
                }
            }
            maxColumn = Math.max(maxColumn, streak);
        }
        return maxColumn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[][] map = new char[N][N];
        for (int i = 0; i < N; i++) {
            map[i] = sc.next().toCharArray();
        }


        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 오른쪽
                if (j + 1 < N && map[i][j] != map[i][j + 1]) {
                    swapCandy(map, i, j, i, j + 1);
                    answer = Math.max(answer, Math.max(findMaxRow(map), findMaxColumn(map)));
                    swapCandy(map, i, j, i, j + 1);
                }
                // 아래쪽
                if (i + 1 < N && map[i][j] != map[i + 1][j]) {
                    swapCandy(map, i, j, i + 1, j);
                    answer = Math.max(answer, Math.max(findMaxRow(map), findMaxColumn(map)));
                    swapCandy(map, i, j, i + 1, j);
                }
            }
        }
        System.out.println(answer);
    }
}
