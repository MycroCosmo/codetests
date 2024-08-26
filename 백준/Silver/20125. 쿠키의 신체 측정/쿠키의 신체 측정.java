import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();  // 버퍼 제거

        char[][] a = new char[N][N];
        int heartX = -1, heartY = -1;

        // 쿠키 배열 입력 받기
        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();
            for (int j = 0; j < N; j++) {
                a[i][j] = input.charAt(j);
            }
        }

        // 심장 위치 찾기
        for (int i = 0; i < N && heartX == -1; i++) {
            for (int j = 0; j < N; j++) {
                if (a[i][j] == '*' && i + 1 < N && a[i + 1][j] == '*') {
                    heartX = i + 1;
                    heartY = j;
                    break;
                }
            }
        }

        // 심장을 찾은 후 각 부위 길이 계산
        int leftArm = 0, rightArm = 0, waist = 0, leftLeg = 0, rightLeg = 0;

        // 왼쪽 팔 길이 계산
        for (int j = heartY - 1; j >= 0; j--) {
            if (a[heartX][j] == '*') {
                leftArm++;
            } else {
                break;
            }
        }

        // 오른쪽 팔 길이 계산
        for (int j = heartY + 1; j < N; j++) {
            if (a[heartX][j] == '*') {
                rightArm++;
            } else {
                break;
            }
        }

        // 허리 길이 계산
        for (int i = heartX + 1; i < N; i++) {
            if (a[i][heartY] == '*') {
                waist++;
            } else {
                break;
            }
        }

        // 왼쪽 다리 길이 계산
        for (int i = heartX + waist + 1; i < N; i++) {
            if (a[i][heartY - 1] == '*') {
                leftLeg++;
            } else {
                break;
            }
        }

        // 오른쪽 다리 길이 계산
        for (int i = heartX + waist + 1; i < N; i++) {
            if (a[i][heartY + 1] == '*') {
                rightLeg++;
            } else {
                break;
            }
        }

        // 결과 출력
        System.out.println((heartX + 1) + " " + (heartY + 1));
        System.out.println(leftArm + " " + rightArm + " " + waist + " " + leftLeg + " " + rightLeg);
    }
}
