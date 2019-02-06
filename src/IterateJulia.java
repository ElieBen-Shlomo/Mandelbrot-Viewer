
public class IterateJulia {
	
	public static int iterate(CompNum z, CompNum z0, int n) {
		for (int i = 0; i < n; i++) {
			z = CompNum.add(CompNum.mult(z, z),z0);
			if (CompNum.abs(z) >= 2) {
				return i;
			}
		}
		return n;
	}
}
