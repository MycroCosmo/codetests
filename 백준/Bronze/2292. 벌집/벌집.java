import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int count = 1; // 현재 위치한 껍질 (층) 번호
        int range = 1; // 각 껍질의 마지막 방 번호

        while (N > range) {
            range += 6 * count;
            count++;
        }

        System.out.println(count);
    }
}
