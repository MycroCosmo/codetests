import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 국가의 수
        int K = sc.nextInt(); // 등수를 알고 싶은 국가 번호
        
        int[][] countries = new int[N][4]; // [국가 번호][금, 은, 동메달]
        
        for (int i = 0; i < N; i++) {
            countries[i][0] = sc.nextInt(); // 국가 번호
            countries[i][1] = sc.nextInt(); // 금메달
            countries[i][2] = sc.nextInt(); // 은메달
            countries[i][3] = sc.nextInt(); // 동메달
        }
        
        // K번 국가의 메달 정보를 찾는다
        int[] targetCountry = new int[4];
        for (int i = 0; i < N; i++) {
            if (countries[i][0] == K) {
                targetCountry = countries[i];
                break;
            }
        }
        
        int rank = 1; // 등수는 1등부터 시작
        
        // 다른 국가들과 비교하여 K번 국가의 순위를 구한다
        for (int i = 0; i < N; i++) {
            if (countries[i][0] == K) continue; // 자기 자신은 비교하지 않음
            
            if (countries[i][1] > targetCountry[1] || 
                (countries[i][1] == targetCountry[1] && countries[i][2] > targetCountry[2]) ||
                (countries[i][1] == targetCountry[1] && countries[i][2] == targetCountry[2] && countries[i][3] > targetCountry[3])) {
                rank++;
            }
        }
        
        System.out.println(rank);
    }
}
