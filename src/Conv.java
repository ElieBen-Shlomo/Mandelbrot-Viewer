import java.lang.Math;

public class Conv {
	public static final int mandelPlotValue = 150;
	public static final int juliaPlotValue = 300;
	public static final int n=250;
	
	public static CompNum PixelToComplex(int x, int y) {
		return CompNum.declare(((double)x)/n-2,-(((double)y)/n-1.5) );
	}
	public static int ComplexToPixelX(CompNum z) {
		return (int) Math.round((z.RealPart+2)*n);
	}
	public static int ComplexToPixelY(CompNum z) {
		return (int) Math.round((-z.Imagpart+1.5)*n);
	}

}
