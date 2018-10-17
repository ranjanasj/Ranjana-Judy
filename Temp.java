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
        else if (inTemp>20 ||inTemp <= 25)
 	{
            System.out.println("Nice day!");
        }
	else
	{
            System.out.println("Too Hot!");
	}		
    }
}
