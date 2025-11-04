import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currentTime = sc.nextLine();
        String saltTime = sc.nextLine();

        String[] currentSplited = currentTime.split(":");
        String[] saltSplited = saltTime.split(":");
        int[] currentSplitedInt = new int[3];
        int[] saltSplitedInt = new int[3];

        for (int i = 0; i < 3; i++) {
            currentSplitedInt[i] = Integer.parseInt(currentSplited[i]);
            saltSplitedInt[i] = Integer.parseInt(saltSplited[i]);
        }

        int[] time = new int[3];
        for (int i = 2; i >= 0; i--) {
            time[i] = saltSplitedInt[i] - currentSplitedInt[i];
            if (time[i] < 0 && i != 0) {
                time[i] += 60;
                saltSplitedInt[i - 1] -= 1;
            } else if (time[i] <= 0 && i == 0) {
                time[i] += 24;
            }
        }

        String answer = "";
        for (int i = 0; i < 3; i++) {
            if (time[i] < 10) {
                answer += "0";
            }
            answer += time[i];
            if (i != 2)
                 answer += ":";
        }
        System.out.println(answer);
    }
}
