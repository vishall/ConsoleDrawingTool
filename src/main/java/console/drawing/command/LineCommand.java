package console.drawing.command;

import console.drawing.canvas.Canvas;
import console.drawing.validations.Validations;

public class LineCommand implements Command {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LineCommand(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void execute(Canvas canvas) {
        Validations.verifyCanvas(canvas);
        Validations.isValidLine(canvas, x1, y1,x2, y2);
        boolean isHorizontalLine = isHorizantalLine(y1, y2);
        int lineLength = getLineLength(x1, y1,x2, y2,isHorizontalLine);
        canvas.drawLine(x1,y1,lineLength,isHorizontalLine);
        canvas.render();
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
}
