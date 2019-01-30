import java.lang.Math;

public class CompNum {
	double RealPart;
	double Imagpart;
	
	public static CompNum declare(double x, double y) {
		CompNum u = new CompNum();
		u.RealPart=x;
		u.Imagpart=y;
		return u;
	}
	public static CompNum add(CompNum z, CompNum w) {
		CompNum u = new CompNum();
		u.RealPart = z.RealPart+w.RealPart;
		u.Imagpart = z.Imagpart+w.Imagpart;
		return u;
	}
	public static CompNum mult(CompNum z, CompNum w) {
		CompNum u = new CompNum();
		u.RealPart=z.RealPart*w.RealPart-z.Imagpart*w.Imagpart;
		u.Imagpart=z.RealPart*w.Imagpart+z.Imagpart*w.RealPart;
		return u;
	}
	/*\public static CompNum div(CompNum z, CompNum w) {
		CompNum u = new CompNum();
		u.RealPart = (z.RealPart*w.RealPart+z.Imagpart*w.Imagpart)/(w.RealPart*w.RealPart+w.Imagpart*w.Imagpart);
		u.Imagpart = (-z.RealPart*w.Imagpart+z.Imagpart*w.RealPart)/(w.RealPart*w.RealPart+w.Imagpart*w.Imagpart);
		return u;
	}*/
	public static double abs(CompNum z) {
		return Math.sqrt(z.RealPart*z.RealPart+z.Imagpart*z.Imagpart);
	}
	
	

}
