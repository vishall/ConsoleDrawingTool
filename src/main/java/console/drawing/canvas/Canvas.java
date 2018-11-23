package console.drawing.canvas;

public class Canvas {

    private int w, h;
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
}
