import java.util.Arrays;
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
        Member[] members = new Member[N];

        for (int i = 0; i < N; i++) {
            members[i] = new Member(sc.nextInt(), sc.next(), i);
        }
        Arrays.sort(members);

        for (Member m : members) {
            System.out.println(m.age + " " + m.name);
        }
    }
}
