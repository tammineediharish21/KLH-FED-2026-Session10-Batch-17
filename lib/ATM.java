import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount :");
        int n = sc.nextInt();

        System.out.println("2000 notes = " + n / 2000);
        n = n % 2000;

        System.out.println("500 notes = " + n / 500);
        n = n % 500;

        System.out.println("200 notes = " + n / 200);
        n = n % 200;

        System.out.println("100 notes = " + n / 100); 
    }
}