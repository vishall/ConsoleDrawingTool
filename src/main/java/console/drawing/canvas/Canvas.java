package console.drawing.canvas;

public class Canvas {

    int w, h;
    private final char[][] canvasArray;

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

    public void render(){

    }
}
