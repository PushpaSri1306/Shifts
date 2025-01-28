import java.util.*;
public class Shifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println("enter how many times it has to shift");
        int b = sc.nextInt();
        System.out.println(a<<b);
        System.out.println(a>>b);
        sc.close();
    }
}
