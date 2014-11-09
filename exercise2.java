import java.util.Scanner;

public class exercise2 {
	public static void main(String[] args) {

		System.out.print("How long is your first array? ");
		Scanner sc = new Scanner(System.in);
		int arrayLength = sc.nextInt();
		int[] src;
		src = new int[arrayLength];
		int count = 0;
		while ( count < arrayLength) {
			System.out.print("Enter a number: ");
			sc = new Scanner(System.in);
			src[count] = sc.nextInt();
			count++;
		}

		System.out.print("How long is your second array? ");
		sc = new Scanner(System.in);
		arrayLength = sc.nextInt();
		int[] dst;
		dst = new int[arrayLength];
		count = 0;
		while ( count < arrayLength) {
			System.out.print("Enter a number: ");
			sc = new Scanner(System.in);
			dst[count] = sc.nextInt();
			count++;
		}
		
		ArrayCopier myArrayCopier = new ArrayCopier(src, dst);
		myArrayCopier.copy(src, dst);
		for(count = 0; count < dst.length; count++) { 
			System.out.print(dst[count] + ", ");
		}
		
	}
}