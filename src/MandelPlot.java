import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Point2D;
import java.lang.Math;

public class MandelPlot extends JPanel {
	int x;
	int y;
	public void paintComponent(Graphics g) {
	Graphics2D g2d = (Graphics2D) g;
	
	for (int i =0;i<1300;++i) {
		for(int j =0;j<900;++j) {
			x=i;
			y=j;
			CompNum z = Conv.PixelToComplex(i, j);
			int k = IterateMandel.iterate(z, 100);
			if (k==100) {
				g2d.setColor(new Color(1,1,1));
				g2d.drawLine(x,y,x,y);
			} else {
				g2d.setColor(new Color(255,100*IterateMandel.iterate(z, k)%256,50*IterateMandel.iterate(z, k)%256));
				g2d.drawLine(x,y,x,y);
			}
			
		}
	}
	
	}
	
}

