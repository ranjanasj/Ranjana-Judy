import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a temperature in celsius");
        int inTemp = scanner.nextInt();
        if (inTemp < 20) {
            System.out.println("Too cold!!");
        }
        else {
            System.out.println("Nice day!");
        }
    }
}
