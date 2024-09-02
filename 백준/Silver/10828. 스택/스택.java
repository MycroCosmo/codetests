import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String order = input[0];

            switch (order) {
                case "push":
                    int value = Integer.parseInt(input[1]);
                    stack.push(value);
                    break;

                case "pop":
                    System.out.println(stack.isEmpty() ? -1 : stack.pop());
                    break;

                case "size":
                    System.out.println(stack.size());
                    break;

                case "empty":
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;

                case "top":
                    System.out.println(stack.isEmpty() ? -1 : stack.peek());
                    break;

                default:
                    break;
            }
        }
    }
}
