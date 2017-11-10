package sahinazcontainer;

import java.awt.Color;
import simplegui.SimpleGUI;

/**
 *
 * @author rolflakaemper
 */
public class Visualizer {

    private final static int FIELDMARGIN = 40;
    private final static int BOXHEIGHT = 5;
    private final static int BOXWIDTH = 20;
    private final static int BOXMARGIN = 2;
    private final SimpleGUI sg = new SimpleGUI(1200, 800);
    public static Visualizer viz = new Visualizer();

    // ------------------------------------------------------
    public Visualizer() {
        sg.setBackgroundColor(Color.WHITE);
        sg.setColorAndTransparency(Color.black, 1.0);
    }
    
    // ------------------------------------------------------
    public void drawHarbourField(int r, int c, Harbour h){
        if (h.data[r][c] > 0){
            int x = c * (BOXWIDTH + BOXMARGIN);
            int y = r * (BOXHEIGHT + BOXMARGIN);
            sg.drawFilledBox(x+FIELDMARGIN,y+FIELDMARGIN,BOXWIDTH, BOXHEIGHT);
        }
    }
}
