import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt(); // 첫번째 변
            int b = sc.nextInt(); // 두번쨰 변
            int c = sc.nextInt(); // 세번째 변

            if (a == 0 || b == 0 || c == 0) {
                break;
            }

            String result = (a + b <= c || a + c <= b || b + c <= a) ? "Invalid" :
                    (a == b && b == c) ? "Equilateral" : (a == b || b == c || a == c) ? "Isosceles" : "Scalene";

            System.out.println(result);
        }
    }
}
