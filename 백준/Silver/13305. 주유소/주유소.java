import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] distance = new int[N-1];
        int[] prices = new int[N];
        
        for(int i = 0; i < N-1; i++) {
            distance[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            prices[i] = sc.nextInt();
        }
        
        long totalCost = 0;
        long minPrice = prices[0];
        
        for(int i = 0; i < N-1; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            totalCost += minPrice * distance[i];
        }
        
        System.out.println(totalCost);
    }
}
