import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int inputNumber = sc.nextInt();
            boolean printed = false;
            for (int B = 2; B <= 64; B++) {
                boolean isYes = true;  // 회문인 수임
                List<Integer> convertedNumber = new ArrayList<>();
                int tmpInputNumber = inputNumber;
                while (tmpInputNumber > 0) {
                    convertedNumber.add(0, tmpInputNumber % B);
                    tmpInputNumber /= B;
                }
                for (int i = 0; i < convertedNumber.size() / 2; i++) {
                    int pairIndex = convertedNumber.size() - i - 1;
                    if (!convertedNumber.get(i).equals(convertedNumber.get(pairIndex))) {
                        isYes = false;
                        break;
                    }
                }
                if (isYes) {
                    System.out.println(1);
                    printed = true;
                    break;
                }
            }
            if (!printed) System.out.println(0);
        }
    }
}
