package console.drawing.command;

import console.drawing.canvas.Canvas;
import console.drawing.validations.Validations;

public class FillCommand implements Command {

    private int x;
    private int y;
    private char color;

    public FillCommand(int x, int y, char color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void execute(Canvas canvas) {
        Validations.verifyCanvas(canvas);
        Validations.verifyFillCoordinates(canvas,x,y);
        canvas.fill(x,y,color);
    }
}
