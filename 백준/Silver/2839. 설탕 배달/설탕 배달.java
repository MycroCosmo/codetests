import java.util.Scanner;

public class Main {

    public static int CalculatorSugarBag(int kilo) {
        int fiveKg= kilo / 5;

        while (fiveKg >= 0) {
            int remainingWeight = kilo - (fiveKg * 5);

            if (remainingWeight % 3 == 0) {
                int threeKg = remainingWeight / 3;
                return fiveKg + threeKg;
            }

            fiveKg--;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(CalculatorSugarBag(N));
    }
}
