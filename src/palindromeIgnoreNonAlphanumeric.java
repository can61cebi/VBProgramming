import java.util.Scanner;
public class string {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a String");
        String s =input.nextLine();

        System.out.println("Non alphanumeric :"+isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String s1 = filter(s);
        String s2 = reverse(s1);
        return s2.equals(s1);
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



    public static String reverse(String s) {
        StringBuilder stringbuilder=new StringBuilder(s);
        stringbuilder.reverse();
        return stringbuilder.toString();
    }
}