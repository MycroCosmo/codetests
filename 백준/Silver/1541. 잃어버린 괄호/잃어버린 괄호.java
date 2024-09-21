import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        String[] minusParts = exp.split("-"); // 55, 50+40

        int result = 0;
        String[] plusParts = minusParts[0].split("\\+");
        for (String p : plusParts) {
            result += Integer.parseInt(p);
        }

        for (int i = 1; i < minusParts.length; i++) {
            plusParts = minusParts[i].split("\\+");
            for (String p : plusParts) {
                result -= Integer.parseInt(p);
            }
        }

        System.out.println(result);
    }
}
