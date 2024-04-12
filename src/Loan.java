public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan() {
        this(2.5,1,1000);
    }

    public Loan(double anuualInterestRate, int numberOfYears, double LoanAmount) {
        this.annualInterestRate=annualInterestRate;
        this.numberOfYears=numberOfYears;
        this.loanAmount=loanAmount;
        loanDate=new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate=annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears=numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount=loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate/1200;
        double monthlyPayment=loanAmount*monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate, numberOfYears)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment=getMonthlyPayment()*numberOfYears*12;
        return totalPayment;
    }

}