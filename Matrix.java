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
			
}