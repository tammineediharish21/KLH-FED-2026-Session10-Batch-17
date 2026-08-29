public class smallest {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 8;

        if (a < b && a < c)
            System.out.println("Smallest = " + a);
        else if (b < c)
            System.out.println("Smallest = " + b);
        else
            System.out.println("Smallest = " + c);
    }
}