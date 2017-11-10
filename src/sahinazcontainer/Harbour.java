/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sahinazcontainer;

/**
 *
 * @author rolflakaemper
 */
public class Harbour {
    public static final int ROWS = 60;
    public static final int COLUMNS = 42;
    public static final int MAXFILLHEIGHT = 3;
        protected int[][] streets = {
        {28,0,4,COLUMNS},
        {0,13,ROWS,2},
        {0,27,ROWS,2}
    };
    //
    protected int[][] data = new int[ROWS][COLUMNS];
    private int numberOfContainers = 0;
    
    // ------------------------------------------------------------------
    public Harbour(){
        init();
    }
    
    // ------------------------------------------------------------------
    private void init(){
        // first fill with random density
        for (int r = 0; r < ROWS; r++){
            for (int c = 0; c < COLUMNS; c++){
                data[r][c] = (int)(Math.random() * MAXFILLHEIGHT);
                numberOfContainers += data[r][c];
            }
        }
        //
        // cut out streets
        for (int[] street : streets) {
            for (int r = street[0]; r<street[0]+street[2]; r++){
                for (int c = street[1]; c<street[1]+street[3]; c++){
                    data[r][c] = 0;
                }
            }
        }
    }
    
    // ------------------------------------------------------------------
    public void visualize(){
        for (int r = 0; r<ROWS; r++){
            for (int c = 0; c<COLUMNS; c++){
                Visualizer.viz.drawHarbourField(r, c, this);
            }
        }
    }
    
}
