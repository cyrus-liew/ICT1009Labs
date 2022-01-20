import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter annual  interest rate
        System.out.println("Enter annual interest rate, for example, 8.25:");
        double intRate = input.nextDouble();
        System.out.println("Enter number of years as an integer:");
        double years = input.nextInt();
        // Enter Than amount
        System.out.println("Enter loan amount, for example, 120000. 95:");
        double amount = input.nextDouble();

        Loan newLoan = new Loan(intRate, years, amount);
        System.out.println("The loan was created.");
        System.out.println("The monthly payment is " + Math.round(newLoan.monthlyPayment() * 100.00) / 100.00);
        System.out.println("The total payment is " + Math.round(newLoan.totalPayment() * 100.00) / 100.00);
    }
  }

class Loan{
      private double intRate;
      private double amount;
      private double years;

      public Loan(){
          this.intRate = 1;
          this.years = 1;
          this.amount = 1;
      }

      public Loan(double intRate, double years, double amount){
          this.intRate = intRate;
          this.years = years;
          this.amount = amount;
      }

      public double monthlyPayment(){
          double numMonth = years * 12;
          double monthlyRate = (intRate / 12) / 100;
          double dividend = 1 - (1 / Math.pow((1 + monthlyRate), numMonth));
          double payment = (amount * monthlyRate) / dividend;
          return payment;
      }

      public double totalPayment(){
          double monthlyPayment = monthlyPayment();
          double totalPayment = monthlyPayment * years * 12;
          return totalPayment;
      }
  }