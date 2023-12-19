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
        int Z = 0;
        if (A > B && A > C) {
            Z = A;
        } else if (B > C && B > A) {
            Z = B;
        } else if (C > A && C > B) {
            Z = C;
        }
        System.out.println("Highest Bid is: " + Z);
    }
}
