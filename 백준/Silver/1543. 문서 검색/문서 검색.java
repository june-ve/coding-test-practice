import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        String replaced = doc.replace(word, "");
        int diff = doc.length() - replaced.length();
        int count = diff / word.length();

        System.out.println(count);
    }
}
