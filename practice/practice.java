import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        while(n != 0) {
            fact = n * fact;
            n--;
        }
        System.out.print(fact);
    }
}