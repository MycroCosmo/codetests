import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.close();
        
        // 알파벳 빈도를 저장할 배열
        int[] alphabetCount = new int[26];
        
        // 대소문자 구분 없이 계산하기 위해 전부 대문자로 변환
        word = word.toUpperCase();
        
        // 각 알파벳 빈도 계산
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            alphabetCount[ch - 'A']++;
        }
        
        int maxCount = -1;
        char result = '?';
        
        // 가장 많이 사용된 알파벳 찾기
        for (int i = 0; i < 26; i++) {
            if (alphabetCount[i] > maxCount) {
                maxCount = alphabetCount[i];
                result = (char) (i + 'A');
            } else if (alphabetCount[i] == maxCount) {
                result = '?';
            }
        }
        
        // 결과 출력
        System.out.println(result);
    }
}
