import java.util.Scanner;

public class exercise1 {
	public static void main(String[] args) {

		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
    		int x = sc.nextInt();
		System.out.print("Enter a number: ");
		sc = new Scanner(System.in);
    		int y = sc.nextInt();
    		System.out.print("Enter the function you wish to perfor: 1 for multiply, 2 for divide, 3 for modulo, 4 for addition, or 5 for subtraction: ");
    		sc = new Scanner(System.in);
    		int choice = sc.nextInt();

    		Calculator myCalc = new Calculator(x, y);

 		switch (choice) {

			case 1:
			myCalc.multiply(x, y);
			break;

			case 2:
			myCalc.divide(x, y);
			break;

			case 3:
			myCalc.modulus(x, y);
			break;

			case 4:
			myCalc.add(x, y);
			break;

			case 5:
			myCalc.subtract(x, y);
			break;

			default:
			System.out.println("Invalid choice.");
			break;
		}
	}
}
