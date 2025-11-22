import java.util.Scanner;

class Main {

    static char[] chars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
    , 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q'
    , 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'
    , 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y'
    , 'z', '+', '/'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int inputNumber = sc.nextInt();
            boolean printed = false;
            for (int B = 2; B <= 64; B++) {
                boolean isYes = true;  // 회문인 수임
                String convertedNumber = "";
                int tmpInputNumber = inputNumber;
                while (tmpInputNumber > 0) {
                    convertedNumber = chars[tmpInputNumber % B] + convertedNumber;
                    tmpInputNumber /= B;
                }
//                System.out.printf("%d진법 : %s%n", B, convertedNumber);
                for (int i = 0; i < convertedNumber.length() / 2; i++) {
                    int pairIndex = convertedNumber.length() - i - 1;
//                    System.out.printf("i = %d, pairI = %d%n", i, pairIndex);
                    if (convertedNumber.charAt(i) != convertedNumber.charAt(pairIndex)) {
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
