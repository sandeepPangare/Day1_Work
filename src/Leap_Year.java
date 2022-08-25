import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {

        int year;

        Scanner r =new Scanner(System.in);
        System.out.println("Enter a Year");
        year=r.nextInt();

        if ((year%400 == 0) || (year%4 == 0 && year%100 != 0)) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }
}
