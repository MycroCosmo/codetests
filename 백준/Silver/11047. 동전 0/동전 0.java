import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer[] moneyType = new Integer[N];

        for (int i = 0; i < N; i++) {
            moneyType[i] = sc.nextInt();
        }

        Arrays.sort(moneyType, Collections.reverseOrder());
        int answer = 0;

        for (int type : moneyType) {
            answer += K / type;
            K = K % type;
        }

        System.out.println(answer);
    }
}
