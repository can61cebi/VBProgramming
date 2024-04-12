import java.util.Scanner;

public class palindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = input.nextLine();

        System.out.printIn("Non alphanumeric: " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        String filtered = filter(s);
        String reversed = reverse(filtered);

        return filtered.equalsIgnoreCase(reversed);
    }

    public static String filter (String s){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static String reverse(String s){
        StringBuilder stringBuilder = new StringBuilder();
        stringbuilder.reverse();
        return stringbuilder.toString();
    }
}
