import java.util.Scanner;

public class Two_Strings_EqualOrNot {
    public static void main(String[] args) {

        String num1 , num2;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter First String");
        num1 = r.nextLine();
        System.out.println("Enter Second String");
        num2 = r.nextLine();

        if (num1.equals(num2))
        System.out.println("String are Equals");
        else
            System.out.println("String are Not Equal");
    }
}
