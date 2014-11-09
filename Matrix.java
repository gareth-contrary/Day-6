public class Matrix {

	private int[][] matrix;

	public Matrix(int x, int y) {
		int xCount = 0;
		for (xCount = 0; xCount < x; xCount++){
			int yCount = 0;
			for (yCount = 0; yCount < y; yCount++) {
					matrix[x][y] = 1;
			}	
		}
	}
}