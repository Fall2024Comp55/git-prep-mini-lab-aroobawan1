//comment one
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("robot.jpg", 300, 100);
		add(robot);
		GLabel label = new GLabel("How I feltt before knowing about github", 200, 300);
		add(label);
	}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}
