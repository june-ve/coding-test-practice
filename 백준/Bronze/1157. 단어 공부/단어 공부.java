import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toUpperCase();
        int[] lettersCount = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                lettersCount[ch - 'A']++;
            }
        }

        int maxCount = -1;
        char maxAlphabet = '?';
        for (int i = 0; i < 26; i++) {
            if (lettersCount[i] > maxCount) {
                maxCount = lettersCount[i];
                maxAlphabet = (char)(i + 'A');
            } else if (lettersCount[i] == maxCount) {
                maxAlphabet = '?';
            }
        }

        System.out.println(maxAlphabet);
    }
}
