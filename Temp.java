import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a temperature in celsius");
        int inTemp = scanner.nextInt();
        if (inTemp < 20) {
            System.out.println("Too cold!! Need a jumper!");
        }
        else if (inTemp>20 ||inTemp <= 25)
 	{
            System.out.println("Nice day! But don't forget to Slip, Slop, Slap");
        }
	else
	{
            System.out.println("Too Hot! Don't forget to stay hydrated!");
	}		
    }
}
