
public class IterateMandel {

	public static int iterate(CompNum z, int n) {
		CompNum z0 = z;
		for (int i=0; i<n; i++) {
			z = CompNum.add(CompNum.mult(z, z), z0);
			if (CompNum.abs(z)>= 2) {
				return i;
			}
		}
		return n;
	}
}
