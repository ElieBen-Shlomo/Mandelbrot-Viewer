import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class MandelPlot extends JPanel {
    private final static int COLOUR_CONSTANT_1 = 255, COLOUR_CONSTANT_2 = 100, COLOUR_CONSTANT_3 = 50;

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		for (int i = 0; i< Constants.SCREEN_WIDTH; i++) {
			for (int j = 0; j < Constants.SCREEN_HEIGHT; j++) {

				CompNum z = Conv.PixelToComplex(i, j);
				int k = IterateMandel.iterate(z, Constants.ITERATIONS);
				if (k == Constants.ITERATIONS) {
					g2d.setColor(new Color(1,1,1));
					g2d.drawLine(i,j,i,j);
				} else {
					g2d.setColor(new Color(COLOUR_CONSTANT_1,
                            COLOUR_CONSTANT_2*IterateMandel.iterate(z, k) % 256,
                            COLOUR_CONSTANT_3*IterateMandel.iterate(z, k) % 256));
					g2d.drawLine(i,j,i,j);
				}
			}
		}
	}
}

