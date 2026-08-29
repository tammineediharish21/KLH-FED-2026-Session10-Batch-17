public class Temperature {
    public static void main(String[] args) {

        int temp = 25;

        if (temp < 0)
            System.out.println("Freezing weather");
        else if (temp < 10)
            System.out.println("Very Cold weather");
        else if (temp < 20)
            System.out.println("Cold weather");
        else if (temp < 30)
            System.out.println("Normal in Temp");
        else if (temp < 40)
            System.out.println("Its Hot");
        else
            System.out.println("Its Very Hot");
    }
}