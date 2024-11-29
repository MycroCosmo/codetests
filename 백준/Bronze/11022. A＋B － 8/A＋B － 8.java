import java.util.*;
class Main{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    int x,y;

    for(int i =0; i<T; i++){
    x= sc.nextInt();
    y= sc.nextInt();
    System.out.println("Case #"+ (i+1)+": "+x+" + "+y+" = " + (x+y));
    }
}
    }