
import java.applet.Applet;
import java.awt.Graphics;

public class AppletDemo extends Applet {
    public void paint(Graphics g) {
        g.drawString("Welcome to Java Applet", 50, 50);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Java Applet");
    }
}

