//ArmstrongNumber
import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int temp = num;
        int count = 0;

        // Count the number of digits
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        temp = num;
        int sum = 0;

        // Find the sum of each digit raised to 'count'
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is not an Armstrong Number.");
        }

        sc.close();
    }
}