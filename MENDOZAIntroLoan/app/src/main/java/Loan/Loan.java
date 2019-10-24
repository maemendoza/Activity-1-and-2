package Loan;

import java.util.Scanner;
public class Loan {

  public static void main(String[] args) {
   double LoanAmount, InterestPerYear, MonthlyPay, InterestPerMonth;
   double IntPerMonth2nd = 0;
   double MonthlyPay2nd = 0;
   double Counting = 0;
   
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("|=======================|");
    System.out.println("|       Money Loan      |");
    System.out.println("|=======================|");
    
    System.out.print("Loan Amount:$");
    LoanAmount = myObj.nextDouble();
    System.out.print("Interest Per Year:");
    InterestPerYear = myObj.nextDouble();
    System.out.print("Monthly Payment:$");
    MonthlyPay = myObj.nextDouble();
    
    double InterestRate = InterestPerYear/100;
  
  do
  {
    InterestPerMonth = InterestRate / 12;
    IntPerMonth2nd = LoanAmount * InterestPerMonth;
    MonthlyPay2nd = MonthlyPay - InterestPerMonth;
    
    if(MonthlyPay < IntPerMonth2nd)
    {
      System.out.println("The monthly payment is less than the first month's interest payment loan amount could not be repaid.");
    }
    
    else
    {
     LoanAmount = LoanAmount - MonthlyPay2nd;
     Counting++;
     
    }
  } 
 
  
   while (LoanAmount > 0);  
  
    System.out.println();
    System.out.println("Months To Paid: " + Counting++);
  }
}
