import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Point2D;
import java.lang.Math;

public class JuliaPlot extends JPanel {
	
	int x;
	int y;
	int a; int b;
	
	JuliaPlot(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	
	public void paintComponent(Graphics g) {
	//a & b are pixel coordinates used to plot Julia set
	Graphics2D g2d = (Graphics2D) g;
	CompNum z0 = Conv.PixelToComplex(a,b);
	
	for (int i =0;i<1300;++i) {
		for(int j =0;j<900;++j) {
			x=i;
			y=j;
			CompNum z = Conv.PixelToComplex(i, j);
			int k = IterateJulia.iterate(z,z0, 100);
			if (k==100) {
				g2d.setColor(new Color(1,1,1));
				g2d.drawLine(x,y,x,y);
			} else {
				g2d.setColor(new Color(5*k%256,10*k%256,1000*k%256));
				g2d.drawLine(x,y,x,y);
				
			}
			
		}
	}
	
	}
	
	
	
	
	

}
