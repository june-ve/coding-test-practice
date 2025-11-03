import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wordA = sc.next();
        String wordB = sc.next();

        int[] countA = getCount(wordA);
        int[] countB = getCount(wordB);

        int answer = 0;
        for (int i = 0; i < 26; i++) {
            answer += Math.abs(countA[i] - countB[i]);
        }

        System.out.println(answer);
    }

    private static int[] getCount(String word) {
        int[] count = new int[26];
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
        }
        return count;
    }
}
