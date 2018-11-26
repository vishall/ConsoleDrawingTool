package console.drawing.command;

import console.drawing.canvas.Canvas;
import console.drawing.validations.Validations;

public class RectangleCommand implements Command {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public RectangleCommand(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void execute(Canvas canvas) {
        Validations.verifyCanvas(canvas);
        canvas.drawRectangle(x1,y1,x2,y2);
    }
}
