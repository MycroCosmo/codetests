
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // 버퍼에 남아있는 개행 문자 제거
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();
            boolean[] spell = new boolean[26];
            boolean isGroupWord = true;

            for (int j = 0; j < word.length(); j++) {
                int check = word.charAt(j) - 'a';

                if (spell[check]) {
                    if (j > 0 && word.charAt(j) != word.charAt(j - 1)) {
                        isGroupWord = false;
                        break;
                    }
                } else {
                    spell[check] = true;
                }
            }
            if (isGroupWord) {
                count++;
            }
        }
        System.out.println(count);
    }
}
