import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double p = sc.nextDouble();      

        System.out.print("Enter Rate of interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time in years: ");
        double t = sc.nextDouble();

        double simpleInterest = (p * r * t) / 100;
        System.out.println("Calculated Simple Interest: " + simpleInterest);
    }
}

      