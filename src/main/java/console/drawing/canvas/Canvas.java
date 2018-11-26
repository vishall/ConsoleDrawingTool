package console.drawing.canvas;

public class Canvas {

    private final static char BLANK = ' ';
    private final static char MARKER = 'x';
    private char[][] canvasArray;
    private int w, h;

    public static Canvas canvas;

    private Canvas() {

    }

    public static Canvas getInstance() {
        if(canvas == null) {
            canvas = new Canvas();
        }
        return canvas;
    }

    public boolean isCanvasDrawn() {
        return canvasArray != null;
    }

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

    public void drawLine(int x1, int y1, int x2, int y2) {
        boolean isHorizontalLine = isHorizantalLine(y1, y2);
        int lineLength = getLineLength(x1, y1, x2, y2, isHorizontalLine);
        if (isHorizontalLine) {
            for (int i = 0; i <= lineLength; i++) {
                canvasArray[x1 + i - 1][y1 - 1] = MARKER;
            }
        } else {
            for (int i = 0; i <= lineLength; i++) {
                canvasArray[x1 - 1][y1 + i - 1] = MARKER;
            }
        }
        canvas.render();
    }

    public void drawRectangle(int x1, int y1, int x2, int y2) {
        //horizontal lines
        drawLine(x1, y1, x2, y1);
        drawLine(x1, y2, x2, y2);

        //vertical lines
        drawLine(x1, y1, x1, y2);
        drawLine(x2, y1, x2, y2);

        canvas.render();
    }

    public void fill(int x, int y, char c) {
        if (x <= 0 || y <= 0 || x > w || y > h || canvasArray[x - 1][y - 1] != BLANK)
            return;

        canvasArray[x - 1][y - 1] = c;

        fill(x + 1, y, c);
        fill(x - 1, y, c);
        fill(x, y + 1, c);
        fill(x, y - 1, c);
        canvas.render();
    }

    public void render() {
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < w + 2; i++)
            strBuilder.append('-');

        strBuilder.append('\n');

        for (int i = 0; i < h; i++) {
            strBuilder.append('|');
            for (int j = 0; j < w; j++)
                strBuilder.append(canvasArray[j][i]);
            strBuilder.append('|');
            strBuilder.append('\n');
        }

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
            lineLength = x2 - x1;
        } else {
            lineLength = y2 - y1;
        }
        return lineLength;
    }

    private boolean isHorizantalLine(int y1, int y2) {
        return y1 == y2;
    }

    private int getRectangleWidth(int x1, int x2) {
        return x2 - x1;
    }

    private int getRectangleHeight(int y1, int y2) {
        return y2 - y1;
    }

}
