import java.util.Scanner;

public class testLoanClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Enter Loan Amount: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate,numberOfYears,loanAmount);

        System.out.printf("The Loan is create on %s\n" + "Monthly Payment: %.2f\n" + "The Total Payment: %.2f\n",loan.getLoanDate(),loan.getMonthlyPayment(),loan.getTotalPayment());
    }

}