import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int[] lettersCount = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                lettersCount[ch - 'a']++;
            } else if ('A' <= ch && ch <= 'Z') {
                lettersCount[ch - 'A']++;
            }
        }

        int max = 0;
        int maxIdx = -1;
        for (int i = 0; i < 26; i++) {
            if (lettersCount[i] > max) {
                max = lettersCount[i];
                maxIdx = i;
            }
        }
        int maxCount = 0;
        for (int i = 0; i < 26; i++) {
            if (lettersCount[i] == max) {
                maxCount++;
            }
        }

        if (maxCount > 1) {
            System.out.println("?");
        } else {
            System.out.println((char)(maxIdx + 'A'));
        }
    }
}
