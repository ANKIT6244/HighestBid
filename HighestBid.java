import java.util.Scanner;

public class HighestBid {
    public static void main(String[] args) {
        Scanner orgs = new Scanner(System.in);
        System.out.println("Enter your First Bid:");
        int A = orgs.nextInt();
        System.out.println("Enter your Second Bid:");
        int B = orgs.nextInt();
        System.out.println("Enter your Third Bid:");
        int C = orgs.nextInt();
        orgs.close();
        if (A > B && A > C) {
            System.out.println("Highest Bid is : " + A);
        } else if (B > C && B > A) {
            System.out.println("Highest Bid is: " + B);
        } else if (C > A && C > B) {
            System.out.println("Highest Bid is: " + C);
        }
    }
}
