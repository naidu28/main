import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class ScatterPlot extends JPanel {
public static final int SIZE = 100; // Number of points in plot
public static final int WIDTH = 200; // Width of plot (pixels)
public static final int HEIGHT = 200; // Height of plot (pixels)
public static final int DIAMETER = 5; // Diameter of points (pixels)
private Point[] data;
private Color[] colors;
// Initialize the points
public ScatterPlot(Point[] data) {
this.data = data;
super.setPreferredSize(new Dimension(WIDTH, HEIGHT));
super.setBackground(Color.white);
}
// Display all the points in black and a center point in red
public void paintComponent(Graphics page) {
super.paintComponent(page);
computeColors(); // we need to code here



for (int i=0; i<data.length; i++) {
page.setColor(colors[i]);
page.fillOval(data[i].x, data[i].y, DIAMETER, DIAMETER);
}

page.setColor(new Color(255, 0, 0));
page.fillOval(100, 100, DIAMETER, DIAMETER);
}
// Write the computeColors method here
private void computeColors() {
    int center = (WIDTH/2)*(HEIGHT/2); //(Y)
    colors = new Color[data.length];
    for (int i = 0; i < data.length; i++) {
        int x = data[i].x; // there is error here (it says change to length
        int y = data[i].y; // there is error here )it says change to length
        int loc = x*y;
        double multiplier;
        if (center > loc) {
        	multiplier = ((double)loc)/center;
        } else {
        	multiplier = ((double)center)/loc;
        }

        colors[i] = new Color((int)(255*multiplier), (int)(255*multiplier), (int)(255*multiplier));
    }

}
        

// Make a ScatterPlot and put it in a frame
public static void main(String[] args) {
JFrame frame = new JFrame("Scatter");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Random random = new Random();
Point[] points = new Point[SIZE];
for (int i=0; i<points.length; i++) {
int x = random.nextInt(WIDTH-DIAMETER);
int y = random.nextInt(HEIGHT-DIAMETER);
points[i] = new Point(x,y);
}
ScatterPlot panel = new ScatterPlot(points);
frame.getContentPane().add(panel);
frame.pack();
frame.setVisible(true);
}
}