import java.util.Scanner;

public class exercise3 {
	public static void main(String[] args) {

		Matrix myMatrix = new Matrix(4, 4);
		System.out.println(myMatrix.matrix[1][3]);
		myMatrix.setElement(1, 3, 9);
		System.out.println(myMatrix.matrix[1][3]);
		
		System.out.print("Enter row 1, type any letter to terminate: ");
		Scanner sc = new Scanner(System.in);
		myMatrix.setRow(1, sc);

		System.out.print("Enter column 3: ");
		sc = new Scanner(System.in);
		myMatrix.setColumn(3, sc);
	}
}