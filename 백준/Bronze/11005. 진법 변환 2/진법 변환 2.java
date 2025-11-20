import java.util.Scanner;

class Main {

    static char[] chars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q'
    , 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        String answer = "";

        while (N > 0) {
            answer = chars[N % B] + answer;
            N/=B;
        }
        System.out.println(answer);
    }
}
