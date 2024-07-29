import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial:");
        int n = sc.nextInt();
        int fact = 1;
        for (int i  = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

        sc.close();
    }
}


