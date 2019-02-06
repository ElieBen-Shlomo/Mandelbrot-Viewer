import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainClass extends JFrame {
	
	static int x;
	static int y;
	static JuliaPlot Jplot = new JuliaPlot(0,0);
	
	
	
	public static void main(String[] args) {
		
		JFrame win = new JFrame();
		win.setSize(900, 750);
		win.setTitle("Mandelbrot Set Plotter");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MandelPlot plot = new MandelPlot();
		win.add(plot);
		
		win.getContentPane().addMouseMotionListener(new MouseAdapter() {
			public void mouseMoved(MouseEvent e) {
				System.out.println("Mouse clicked: " + e.getX() + ", " + e.getY());
				x=e.getX();
				y=e.getY();
				Repaint();
			}
		});
		win.setVisible(true);
		
		JFrame win2 = new JFrame();
		win2.setTitle("Julia Set");
		win2.setSize(1000,800);
		win2.setVisible(true);
		win2.add(Jplot);
		
		CompNum z = new CompNum();
		z= CompNum.declare(-1.3, 0.2);
		System.out.println(IterateMandel.iterate(z,1000));
		
	}
	
	public static void Repaint() {
		Jplot.a=x;
		Jplot.b=y;
		Jplot.repaint();
	}

	
	
	

}
