import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            String option = input[0];
            int num = 0;

            if (input.length > 1) {
                num = Integer.parseInt(input[1]);
            }

            switch (option) {
                case "add":
                    if (!list.contains(num)) {
                        list.add(num);
                    }
                    break;
                case "remove":
                    list.remove(Integer.valueOf(num));
                    break;
                case "check":
                    sb.append(list.contains(num) ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    if (list.contains(num)) {
                        list.remove(Integer.valueOf(num));
                    } else {
                        list.add(num);
                    }
                    break;
                case "all":
                    list.clear();
                    for (int j = 1; j <= 20; j++) {
                        list.add(j);
                    }
                    break;
                case "empty":
                    list.clear();
                    break;
            }
        }

        System.out.print(sb.toString());
        br.close();
    }
}
