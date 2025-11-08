import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        while (p-- > 0) {
            int testNum = sc.nextInt();
            int[] heights = new int[20];
            for (int i = 0; i < 20; i++) {
                heights[i] = sc.nextInt();
            }

            int stepCount = 0;
            for (int i = 1; i < 20; i++) {
                for (int j = 0; j < i; j++) {
                    if (heights[j] > heights[i])
                        stepCount++;
                }
            }

            System.out.println(testNum + " " + stepCount);
        }
    }
}
