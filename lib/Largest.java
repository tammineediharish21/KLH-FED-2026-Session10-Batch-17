public class Largest {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 8;

        if (a > b && a > c)
            System.out.println("largest = " + a);
        else if (b  > c)
            System.out.println("largest = " + b);
        else
            System.out.println("largest = " + c);
    }
}