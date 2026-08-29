import java.util.Scanner;

public class salary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter basic salary : ");
        double basic = sc.nextDouble();

        double hra,da,gross;


        if(basic <= 10000) {
            hra = basic * 0.20;
            da = basic * 0.80;
        }
         else if (basic <= 20000 ) {
            hra = basic * 0.25;
            da = basic *  0.90;
         }       
         else {
            hra = basic * 0.30;
            da = basic * 0.95;
            }
         
            gross = basic + hra + da;
            
            System.out.println("Hdr = " + hra);
            System.out.println("Da = " + da);
            System.out.println("Gross  salary = " + gross);

    }
}