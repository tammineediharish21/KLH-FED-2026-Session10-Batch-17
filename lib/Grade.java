public class Grade {
    public static void main(String[] args) {

        char grade = 'A';

        if (grade == 'A')
            System.out.println("Excellent");
        else if (grade == 'B')
            System.out.println("Very Good");
        else if (grade == 'C')
            System.out.println("Good");
        else if (grade == 'D')
            System.out.println("Average");
        else if (grade == 'F')
            System.out.println("Fail");
        else
            System.out.println("Invalid Grade");
    }
}  