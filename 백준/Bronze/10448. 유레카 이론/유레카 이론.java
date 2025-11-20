import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int answer = 0;
            int K = sc.nextInt();
            List<Integer> triNums = new ArrayList<>();
            int n = 1;
            while ((n * (n + 1)/2) < K) {
                triNums.add(n * (n + 1) / 2);
                n++;
            }
            for (int a = 0; a < triNums.size(); a++) {
                int numA = triNums.get(a);
                for (int b = 0; b < triNums.size(); b++) {
                    int numB = triNums.get(b);
                    for (int c = 0; c < triNums.size(); c++) {
                        int numC = triNums.get(c);
                        if (numA + numB + numC == K) {
                            answer = 1;
                            break;
                        }
                    }
                }
            }

            System.out.println(answer);
        }
    }
}
