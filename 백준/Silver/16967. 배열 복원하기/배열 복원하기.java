import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt(); // 2
        int W = sc.nextInt(); // 4
        int X = sc.nextInt(); // 1
        int Y = sc.nextInt(); // 1

        int[][] A = new int[H][W];      // 2 * 4
        int[][] B = new int[H + X][W + Y];   // 3 * 5

        // B 배열 입력
        for (int i = 0; i < H + X; i++) {
            for (int j = 0; j < W + Y; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // A 배열 초기화 (겹치지 않는 부분)
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                A[i][j] = B[i][j];
            }
        }

        // 겹치는 부분 처리
        for (int i = X; i < H; i++) { // i는 X 이상 H 미만
            for (int j = Y; j < W; j++) { // j는 Y 이상 W 미만
                A[i][j] = B[i][j] - A[i - X][j - Y];
            }
        }

        // 결과 출력
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
