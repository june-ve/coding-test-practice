import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wordA = sc.next();
        String wordB = sc.next();

        int[] countA = new int[26];
        int[] countB = new int[26];

        for (int i = 0; i < wordA.length(); i++) {
            countA[wordA.charAt(i) - 'a']++;
        }
        for(int i = 0; i < wordB.length(); i++) {
            countB[wordB.charAt(i) - 'a']++;
        }

        int answer = 0;
        for (int i = 0; i < 26; i++) {
            if (countA[i] > countB[i]) {
                answer += countA[i] - countB[i];
            } else if (countA[i] < countB[i]) {
                answer += countB[i] - countA[i];
            }
        }

        System.out.println(answer);
    }
}
