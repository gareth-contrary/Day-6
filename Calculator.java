public class Calculator {
	private int x;
	private int y;

	public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
			return x;
	}

	public int getY() {
			return y;
	}

	public void add(int x, int y) {
		int result = x + y;
		System.out.println("Equals: " + result);
	}

	public void subtract(int x, int y) {
		int result = x - y;
		System.out.println("Equals: " + result);
	}

	public void multiply(int x, int y) {
		int result = x * y;
		System.out.println("Equals: " + result);
	}

	public void divide(int x, int y) {
		double a = (double) x;
		double b = (double) y;
		double result = a / b;
		System.out.println("Equals: " + result);
	}

	public void modulus(int x, int y) {
		int result = x % y;
		System.out.println("Equals: " + result);
	}
}