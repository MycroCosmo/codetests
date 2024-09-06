
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. K개의 정수 1개 입력
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        // 2. 0일 경우 최근수 삭제 아닌경우 해당 수 사용
        for (int i = 0; i < K; i++) {
            int input = sc.nextInt();
            if (input != 0) {
                stack.push(input);
            } else {
                stack.pop();
            }
        }
        // 3. 입력후 남아있는 값의 합 출력
        if (!stack.isEmpty()) {
            for (int num : stack) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
