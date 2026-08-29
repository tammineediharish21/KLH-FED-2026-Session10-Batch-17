import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side :") ;
        double side = sc.nextDouble();

        System.out.println("Enter radius :");
        double radius = sc.nextDouble();

        System.out.println("Enter base :");
        double base = sc.nextDouble();
        
        System.out.println("Enter Height :");
        double Height = sc.nextDouble();

        System.out.println("Area of square = " + (side * side ));
        System.out.println("Area of circle = " + ( 3.14 * radius * radius));
        System.out.println("Area of Triangle = " + (0.5 * base * Height ));

    }
}