import javax.swing.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainClass extends JFrame {

	static JuliaPlot JuliaSet = new JuliaPlot(0,0);

	public static void main(String[] args) {
		
		JFrame win = new JFrame();
		win.setSize(900, 750);
		win.setTitle("Mandelbrot Set Plotter");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MandelPlot MandelbrotSet = new MandelPlot();
		win.add(MandelbrotSet);
		win.getContentPane().addMouseMotionListener(new MouseAdapter() {
			public void mouseMoved(MouseEvent e) {
				Repaint(e.getX(), e.getY());
			}
		});

		JFrame win2 = new JFrame();
		win2.setTitle("Julia Set");
		win2.setSize(1000,800);
		win2.add(JuliaSet);

		win.setVisible(true);
		win2.setVisible(true);
	}
	
	public static void Repaint(int x_coordinate, int y_coordinate) {
		JuliaSet.setXY_coordinate(x_coordinate,y_coordinate);
		JuliaSet.repaint();
	}

}
