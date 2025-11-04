import java.util.Scanner;

class Main {
    private static int calculateTimeInSecond(String[] time) {
        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);
        int second = Integer.parseInt(time[2]);
        
        return hour * 3600 + minute * 60 + second;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] currentTime = sc.nextLine().split(":");
        String[] saltTime = sc.nextLine().split(":");

        int currentTimeInSecond = calculateTimeInSecond(currentTime);
        int saltTimeInSecond = calculateTimeInSecond(saltTime);

        int needTimeInSecond = saltTimeInSecond - currentTimeInSecond;
        if (needTimeInSecond <= 0)
            needTimeInSecond += 24 * 3600;

        int needHour = needTimeInSecond / 3600;
        int needMinute = (needTimeInSecond % 3600) / 60;
        int needSecond = needTimeInSecond % 60;

        System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);
    }
}
