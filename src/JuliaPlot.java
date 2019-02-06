import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class JuliaPlot extends JPanel {
    private final static int COLOUR_CONSTANT_1 = 5, COLOUR_CONSTANT_2 = 10, COLOUR_CONSTANT_3 = 1000;

	private int x_coordinate;
	private int y_coordinate;
	
	JuliaPlot(int x_coordinate, int y_coordinate){
		this.x_coordinate = x_coordinate;
		this.y_coordinate = y_coordinate;
	}

	public void paintComponent(Graphics g) {
	//x_coordinate & y_coordinate are pixel coordinates used to plot Julia set
	Graphics2D g2d = (Graphics2D) g;
	CompNum z0 = Conv.PixelToComplex(this.x_coordinate,this.y_coordinate);
	
        for (int i =0; i < Constants.SCREEN_WIDTH; i++) {
            for(int j =0; j < Constants.SCREEN_HEIGHT; j++) {
                CompNum z = Conv.PixelToComplex(i, j);
                int k = IterateJulia.iterate(z, z0, Constants.ITERATIONS);
                if (k == Constants.ITERATIONS) {
                    g2d.setColor(new Color(1,1,1));
                    g2d.drawLine(i,j,i,j);
                } else {
                    g2d.setColor(new Color(COLOUR_CONSTANT_1*k%256,COLOUR_CONSTANT_2*k%256,COLOUR_CONSTANT_3*k%256));
                    g2d.drawLine(i,j,i,j);
                }
            }
        }
	}

   public void setXY_coordinate(int x_coordinate, int y_coordinate) {
	    this.x_coordinate = x_coordinate;
	    this.y_coordinate = y_coordinate;
   }
}
