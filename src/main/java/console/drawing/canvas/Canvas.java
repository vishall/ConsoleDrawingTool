package console.drawing.canvas;

public class Canvas {

    private int w, h;
    private final char[][] canvasArray;
    private final static char MARKER = 'x';

    public Canvas(int w,int h)
    {
        this.w = w;
        this.h = h;
        canvasArray = new char[w][h];

        for (int i = 0; i < this.w; i++) {
            for (int j = 0; j < this.h; j++)
                canvasArray[i][j] = ' ';
        }
    }

    public void drawLine(int x1, int y1,int x2, int y2){
        boolean isHorizontalLine = isHorizantalLine(y1, y2);
        int lineLength = getLineLength(x1, y1,x2, y2,isHorizontalLine);
        if(isHorizontalLine){
            for(int i = 0; i <= lineLength; i++) {
                canvasArray[x1+i-1][y1-1] = MARKER;
            }
        } else {
            for(int i = 0; i <= lineLength; i++) {
                canvasArray[x1-1][y1+i-1] = MARKER;
            }
        }
    }

    public void drawRectangle(int x1, int y1,int x2, int y2) {
        //horizontal lines
        drawLine(x1, y1 , x2, y1);
        drawLine(x1, y2 , x2, y2);

        //vertical lines
        drawLine(x1, y1 , x1, y2);
        drawLine(x2, y1 , x2, y2);
    }

    public void render(){
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

    private int getLineLength(int x1, int y1, int x2, int y2,boolean isHorizontalLine) {
        int lineLength = 0;
        if(isHorizontalLine){
            lineLength = x2 - x1;
        } else {
            lineLength = y2 - y1;
        }
        return lineLength;
    }

    private boolean isHorizantalLine(int y1, int y2){
        return y1 == y2;
    }

    private int getRectangleWidth(int x1, int x2){
        return x2 - x1;
    }

    private int getRectangleHeight(int y1, int y2){
        return y2 - y1;
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
}
