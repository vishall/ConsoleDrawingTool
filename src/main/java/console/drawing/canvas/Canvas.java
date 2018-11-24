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

    public void drawLine(int startXCoordinate, int startYCoordinate,int lineLength, boolean isHorizontalLine){
        if(isHorizontalLine){
            for(int i = 0; i <= lineLength; i++) {
                canvasArray[startXCoordinate+i-1][startYCoordinate-1] = MARKER;
            }
        } else {
            for(int i = 0; i <= lineLength; i++) {
                canvasArray[startXCoordinate-1][startYCoordinate+i-1] = MARKER;
            }
        }
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
