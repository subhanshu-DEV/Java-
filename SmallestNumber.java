import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b) {
            if (a < c) {
                System.out.println("Smallest number is " + a);
            } else {
                System.out.println("Smallest number is " + c);
            }
        } 
        else {
            if (b < c) {
                System.out.println("Smallest number is " + b);
            } else {
                System.out.println("Smallest number is " + c);
            }
        }

        sc.close();
    }
}