import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String gameType = sc.next();
        sc.nextLine();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.nextLine());
        }
        int playersPerGroup = 0;
        switch (gameType) {
            case "Y":
                playersPerGroup = 2;
                break;
            case "F":
                playersPerGroup = 3;
                break;
            case "O":
                playersPerGroup = 4;
                break;
            default:
                return;  // 유효하지 않은 게임 타입일 경우 프로그램 종료

        }

        // 가능한 그룹 수 계산
        int possibleGroups = set.size() / (playersPerGroup - 1);
        System.out.println(possibleGroups);
    }
}
