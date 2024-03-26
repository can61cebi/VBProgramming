import java.util.Scanner;
public class ExpectionHandling {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Iki tam say girin: ");;
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number2 != 0)
            System.out.println(number1+" / "+number2+" is "+(number1/number2));
        else
            System.out.println("Giridiginiz ikinci sayi (bolen) 0 olamaz.");
    }
}
