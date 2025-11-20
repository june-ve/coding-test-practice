import java.util.Scanner;

class Main {

    static boolean[] isEurekaNumber = new boolean[1001];

    private static void preprocess() {
        // K보다 작은 삼각수 구하기
        int[] triNums = new int[50];
        int triNumCount = 0;
        for (int i = 1; ; i++) {
            int triNum = i * (i + 1) / 2;
            if (triNum >= 1000) break;
            triNums[triNumCount++] = triNum;
        }

        // isEurekaNumber인지
        boolean[] isSumOfTriNum = new boolean[1000];
        for (int i = 0; i < triNumCount; i++) {
            for (int j = 0; j < triNumCount; j++) {
                int sum = triNums[i] + triNums[j];
                if (sum < 1000) isSumOfTriNum[sum] = true;
            }
        }
        for (int i = 1; i < 1000; i++) {
            if (!isSumOfTriNum[i]) continue;
            for (int j = 0; j < triNumCount; j++) {
                int sum = i + triNums[j];
                if (sum <= 1000) isEurekaNumber[sum] = true;
            }
        }
    }

    public static void main(String[] args) {
        preprocess();
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int K = sc.nextInt();
            System.out.println(isEurekaNumber[K] ? "1" : "0");
        }
    }
}
