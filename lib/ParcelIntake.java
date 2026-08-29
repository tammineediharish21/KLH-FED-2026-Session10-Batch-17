import java.util.Scanner;

public class ParcelIntake {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String id = "P101";
        String recipient = "Harish";
        char size = 'L';
        double weight = 2.5;

        int base = (size == 'L') ? 30 : (size == 'M') ? 20 : 10;
        int surcharge = (int) Math.ceil(weight) * 2;
        int fee = base + surcharge;

        System.out.printf("Parcel : %s (%s)%n", id, recipient);
        System.out.printf("Size : %c Weight : %.1fkg%n", size, weight);
        System.out.printf("Fee : Rs %d%n", fee);
    }
}