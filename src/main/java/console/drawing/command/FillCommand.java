package console.drawing.command;

import console.drawing.canvas.Canvas;

public class FillCommand implements Command {

    private int x;
    private int y;
    private String color;

    public FillCommand(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void execute(Canvas canvas) {

    }
}
