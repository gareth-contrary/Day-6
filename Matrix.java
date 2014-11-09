import java.util.Scanner;

public class Matrix {

	private int[][] matrix;

	public Matrix(int x, int y) {
		int xCount = 0;
		for (xCount = 0; xCount < x; xCount++){
			int yCount = 0;
			for (yCount = 0; yCount < y; yCount++) {
					this.matrix[x][y] = 1;
			}	
		}
	}

	public void setElement(int x, int y, int value) {
		int xLength = this.matrix.length;
		int yLength = this.matrix[x].length;
		if (xLength < x || yLength < y) {
			System.out.println("Not a valid array index.");
		} else {
			this.matrix[x][y] = value;
		}
	}

	public void setRow(int x, Scanner sc) {
		int xLength = matrix.length;
		if (x >= xLength) {
			System.out.println("Array is too small!");
		} else {
			int yLength = matrix[x].length;
			for (int count = 0; sc.hasNextInt(); count++)
			if (count > yLength) {
				System.out.println("Array is too small!");
			} else {
				for(count = 0; count < yLength; count++) {
					matrix[x][count] = sc.nextInt();
				}
			}
		}
	}

	public void setColumn(int y, Scanner sc) {
		int yLength = matrix[0].length;
		if (y >= yLength) {
			System.out.println("Array is too small!");
		} else {
			int xLength = matrix.length;
			for (int count = 0; sc.hasNextInt(); count++)
			if (count > yLength) {
				System.out.println("Array is too small!");
			} else {
				for(count = 0; count < xLength; count++) {
					matrix[count][y] = sc.nextInt();
				}
			}
		}
	}	

	public String parseToString() {
		int xLength = matrix.length;
		int yLength = matrix[0].length;
		String result = null;
		for (int xCount = 0; xCount < xLength; xCount++) {
			result = "[";
			for(int yCount = 0; yCount <yLength; yCount++) {
				result = result + matrix[xCount][yCount];
				if (yCount != (yLength - 1)) {
					result= result + ", ";
				} 
			}
			if (xCount != (yLength - 1)) {
				result = result + "], ";
			} else { 
				result = result + "]";
			}
		}
		return result;
	}

	public void prettyPrint() {
		int xLength = matrix.length;
		int yLength = matrix[0].length;
		for (int xCount = 0; xCount < xLength; xCount++) {
			for(int yCount = 0; yCount <yLength; yCount++) {
				System.out.print(matrix[xCount][yCount]);
				if (yCount == (yLength - 1)) {
					System.out.print("\n");
				} else {
					System.out.print("\t");
				}
			}
		}
	}				
}