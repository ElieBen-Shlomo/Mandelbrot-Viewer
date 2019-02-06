import java.lang.Math;

public class CompNum {
	private double realPart;
	private double imagpart;

	CompNum(double realPart, double imagePart) {
	    this.realPart = realPart;
	    this.imagpart = imagePart;
    }

	public static CompNum add(CompNum z, CompNum w) {
	    return new CompNum(z.realPart +w.realPart, z.imagpart +w.imagpart);
	}
	public static CompNum mult(CompNum z, CompNum w) {
		return new CompNum(z.realPart *w.realPart -z.imagpart *w.imagpart, z.realPart *w.imagpart +z.imagpart *w.realPart);
	}

	public double getRealPart() {
	    return this.realPart;
    }

    public double getImagpart() {
	    return this.imagpart;
    }

	public static double abs(CompNum z) {
		return Math.sqrt(z.realPart *z.realPart +z.imagpart *z.imagpart);
	}
}
