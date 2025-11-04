import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        int count = 0;
        int startIndex = 0;
        while (true) {
            startIndex = doc.indexOf(word, startIndex);
            if (startIndex < 0)
                break;
            count++;
            startIndex += word.length();
        }

        System.out.println(count);
    }
}
