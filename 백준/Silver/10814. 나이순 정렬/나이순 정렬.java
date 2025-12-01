import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Member implements Comparable<Member> {
    int age;
    String name;
    int order;

    Member(int age, String name, int order) {
        this.age = age;
        this.name = name;
        this.order = order;
    }

    @Override
    public int compareTo(Member o) {
        if (age == o.age)
            return order - o.order;
        return age - o.age;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Member> members = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            members.add(new Member(age, name, i));
        }
        members.sort(Comparator.naturalOrder());

        for (Member m : members) {
            System.out.printf("%d %s%n", m.age, m.name);
        }
    }
}
