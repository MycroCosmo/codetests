import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean isVPS = true;

            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);

                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty()) {
                        isVPS = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) {
                isVPS = false;
            }

            System.out.println(isVPS ? "YES" : "NO");
        }
    }
}
