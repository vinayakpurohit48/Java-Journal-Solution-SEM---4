import java.applet.*;
import java.awt.*;

public class HelloWorldApplet extends Applet {
    public void paint(Graphics g) {
		
        g.setColor(Color.yellow);
        g.fillOval(200, 200, 300, 300);
        
        g.setColor(Color.black);
        g.fillOval(255, 275, 30, 30);
        g.fillOval(330, 275, 30, 30);
        
        g.fillArc(150, 175, 100, 100, 180, 180);
    }
}


/*
<applet code="HelloWorldApplet.class",height="500",width="500">

</applet>
*/