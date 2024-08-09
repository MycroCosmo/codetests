
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] x = new int[N]; //몸무게
        int[] y = new int[N]; // 키
        int[] ranks = new int[N]; //순서
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            ranks[i]=1; //랭크 초기화
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i != j) {
                    if (x[i] < x[j] && y[i] < y[j]) {
                        ranks[i]++;
                    }
                }
            }
        }
    for(int rank : ranks) {
        System.out.print(rank+" ");
    }

        sc.close();
    }
}
