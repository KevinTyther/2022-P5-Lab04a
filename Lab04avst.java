// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, 90 Point Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        double numMonth = 30 * 12;
        double RoI = (annualRate / 100) / 12; //Rate of interest
        double top;
        double bottom;
        double monthly;
        double totalPayment;
        double totalInterest;

        top = 1 + RoI;
        top = Math.pow(top,numMonth);
        top = RoI * top;
        bottom = 1 + RoI;
        bottom = Math.pow(bottom,numMonth);
        bottom = bottom - 1;
        monthly = top / bottom;
        monthly = monthly * principal;

        totalPayment = monthly * numMonth;
        totalInterest = totalPayment - principal;

        monthly = (double)(Math.round(monthly * 100)) / 100;
        totalPayment = (double)((Math.round(totalPayment * 100)) / 100);


        System.out.println("Principal:" + "\t\t\t" + principal);
        System.out.println("Annual Rate:" + "\t\t" + annualRate +"%");
        System.out.println("Number of Years:" + "\t" + numYears);
        System.out.println("Monthly Payment:" + "\t" + monthly);
        System.out.println("Total Payment:" + "\t\t" + totalPayment);
        System.out.println("Total Interest:" + "\t\t" + totalInterest);









        System.out.println();
    }
}

