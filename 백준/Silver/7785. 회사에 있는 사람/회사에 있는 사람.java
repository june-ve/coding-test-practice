import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> set = new TreeSet<>();

        while (N-- > 0) {
            String name = sc.next();
            if (sc.next().equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        String[] names = set.toArray(new String[set.size()]);
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}