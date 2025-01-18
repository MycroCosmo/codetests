import java.util.Scanner;

public class Main {
    static int[][] ingre;
    static int N;
    static int minDifference = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        ingre = new int[N][2];
        for (int i = 0; i < N; i++) {
            ingre[i][0] = sc.nextInt();
            ingre[i][1] = sc.nextInt();
        }

        recur(0, 1, 0, 0);

        System.out.println(minDifference);
    }

    public static void recur(int index, int S, int B, int count) {
        if (index == N) {
            if (count > 0) {
                minDifference = Math.min(minDifference, Math.abs(S - B));
            }
            return;
        }

        recur(index + 1, S * ingre[index][0], B + ingre[index][1], count + 1);

        recur(index + 1, S, B, count);
    }
}
