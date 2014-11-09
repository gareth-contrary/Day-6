public class ArrayCopier {

	private int[] src;
	private int[] dst;

	public ArrayCopier(int[] src, int[] dst) {
		this.src = src;
		this.dst = dst;
	}

	public void copy(int[] src, int[] dst) {
		int count = 0;
		if (src.length == dst.length) {
			for(count = 0; count < src.length; count++) {
				dst[count] = src[count];
			}
		} else {
			for(count = 0; count < dst.length; count++) {
				if (count >= src.length) { dst[count] = 0; }
				else { dst[count] = src[count]; }
			}
		}
	}

}