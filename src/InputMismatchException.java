import java.util.Scanner;
import java.util.*;

public class InputMismatchException {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.println("Enter an integer: ");
                int number = input.nextInt();
                System.out.println("Girilen sayi: " + number);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Tekrar deneyin.(" + "Incorrect Input: an integer is required)");
                input.nextLine();
            }
        } while (continueInput);
    }
}
//ClassNotFoundException
//        ArithmeticExpection
//IndexOutOfBoundsException