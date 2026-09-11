import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;


// this class creates a panel and performs the actual drawing
class DrawPanel extends JPanel {
	public void paintComponent( Graphics graphic ) {
	
	super.paintComponent( graphic );

	int width = getWidth();
	int height = getHeight();

	graphic.drawLine(0, 0, width, height);
	graphic.drawLine(0, height, width, 0);
	}
}


// this class makes the window for our drawing
public class GUIActivity {
	public static void main(String[] args) {
		DrawPanel drawPanel = new DrawPanel();
		JFrame window = new JFrame();

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		window.add(drawPanel);
		window.setSize(640, 640);
		window.setVisible(true);

	}
}