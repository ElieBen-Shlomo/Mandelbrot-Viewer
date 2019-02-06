import java.lang.Math;

public class Conv {
	public static final int n = 250;
	
	public static CompNum PixelToComplex(int x, int y) {
		return new CompNum(((double)x)/n-2, -(((double)y)/n-1.5) );
	}

	// Not currently being used, but will be useful if we wish to implement a zooming functionality
    // in the Mandelbrot Viewer
	public static int ComplexToPixelX(CompNum z) {
		return (int) Math.round((z.getRealPart()+2)*n);
	}
	public static int ComplexToPixelY(CompNum z) {
		return (int) Math.round((-z.getImagpart()+1.5)*n);
	}

}
