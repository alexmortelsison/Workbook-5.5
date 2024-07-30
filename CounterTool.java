import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        System.out.print("\n 1. Pick a number to count by: ");
        int choice = scan.nextInt();

        System.out.print("\n2. Pick a number to start counting from: ");
        int skip = scan.nextInt();

        System.out.print("\n3. Pick a number to count to: ");
        int end = scan.nextInt();

        for (int i = choice; i <= end; i+=skip) {
            System.out.print(i + " ");
        }


        scan.close();
    }
}
