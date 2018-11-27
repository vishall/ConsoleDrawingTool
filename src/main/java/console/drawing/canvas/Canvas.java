package console.drawing.canvas;

// Class responsible to draw canvas and line rectangle on it and fill canvas
public class Canvas {

    private final static char BLANK = ' ';
    private final static char MARKER = 'x';
    public static Canvas canvas;
    private char[][] canvasArray;
    private int w, h;

    private Canvas() {

    }

    // canvas instance is shared among all commands and created for create command
    public static Canvas getInstance() {
        if (canvas == null) {
            canvas = new Canvas();
        }
        return canvas;
    }

    // verify whether canvas is drawn based on whether canvasArray intialized
    public boolean isCanvasDrawn() {
        return canvasArray != null;
    }

    // draw canvas with given width and height
    public void drawCanvas(int w, int h) {
        if (w < 1 || h < 1) {
            throw new IllegalArgumentException("Canvas dimensions must be positive integers.");
        }
        this.w = w;
        this.h = h;
        canvasArray = new char[w][h];
        for (int i = 0; i < this.w; i++) {
            for (int j = 0; j < this.h; j++)
                canvasArray[i][j] = BLANK;
        }
        render();
    }

    // draw line with given coordinates
    public void drawLine(int x1, int y1, int x2, int y2) {
        boolean isHorizontalLine = isHorizantalLine(y1, y2);
        int lineLength = getLineLength(x1, y1, x2, y2, isHorizontalLine);
        // draw line horizontal or vertical based on calculated length
        if (isHorizontalLine) {
            for (int i = 0; i <= lineLength; i++) {
                canvasArray[x1 + i - 1][y1 - 1] = MARKER;
            }
        } else {
            for (int i = 0; i <= lineLength; i++) {
                canvasArray[x1 - 1][y1 + i - 1] = MARKER;
            }
        }
    }


    // draw rectangle with given coordinates and using line drawing logic
    public void drawRectangle(int x1, int y1, int x2, int y2) {
        //horizontal lines
        drawLine(x1, y1, x2, y1);
        drawLine(x1, y2, x2, y2);

        //vertical lines
        drawLine(x1, y1, x1, y2);
        drawLine(x2, y1, x2, y2);
    }

    // recursive function to fill canvas
    public void fill(int x, int y, char c) {
        // check if given cordinate is on canvas and is not yet filled
        if (x <= 0 || y <= 0 || x > w || y > h || canvasArray[x - 1][y - 1] != BLANK)
            return;

        canvasArray[x - 1][y - 1] = c;

        // call fill command for adjacent cordinates
        fill(x + 1, y, c);
        fill(x - 1, y, c);
        fill(x, y + 1, c);
        fill(x, y - 1, c);
    }


    // renders canvas based on values in canvasArray
    public void render() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append('\n');

        //top of canvas
        for (int i = 0; i < w + 2; i++)
            strBuilder.append('-');

        strBuilder.append('\n');

        // for each row draw | and then fill canvas with canvasArray values populated by all commands
        for (int i = 0; i < h; i++) {
            strBuilder.append('|');
            for (int j = 0; j < w; j++)
                strBuilder.append(canvasArray[j][i]);
            strBuilder.append('|');
            strBuilder.append('\n');
        }

        //bottom of canvas
        for (int i = 0; i < w + 2; i++)
            strBuilder.append('-');

        strBuilder.append('\n');
        System.out.println(strBuilder.toString());
    }

    public int width() {
        return this.w;
    }

    public int height() {
        return this.h;
    }

    public char[][] getCanvasArray() {
        return canvasArray;
    }

    private int getLineLength(int x1, int y1, int x2, int y2, boolean isHorizontalLine) {
        int lineLength = 0;
        if (isHorizontalLine) {
            // calculate line length with x-coordinates
            lineLength = x2 - x1;
        } else {
            // calculate line length with y-coordinates
            lineLength = y2 - y1;
        }
        return lineLength;
    }

    // line is horizontal when given both y-coordinates are same
    private boolean isHorizantalLine(int y1, int y2) {
        return y1 == y2;
    }

}
