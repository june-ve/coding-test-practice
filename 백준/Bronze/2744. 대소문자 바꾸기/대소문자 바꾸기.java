import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String answer = "";
        for (int i = 0; i < input.length(); i++) {
            if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                answer += (char) (input.charAt(i) + 32);
            } else if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                answer += (char) (input.charAt(i) - 32);
            }
        }
        System.out.println(answer);
    }
}
