// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        double numMonth = 30 * 12;
        double RoI = 0.0575; // Rate of Interest
        double top;
        double bottom;
        double monthly;

        top = 1 + RoI;
        top = Math.pow(top,numMonth);
        top = RoI * top;









        System.out.println();
    }
}

