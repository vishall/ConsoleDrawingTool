package console.drawing.command;

import console.drawing.canvas.Canvas;

public class CreateCommand implements Command {

    private int w;
    private int h;

    public CreateCommand(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public void execute(Canvas canvas) {
        if (w < 1 || h < 1) {
            throw new IllegalArgumentException("Canvas dimensions must be positive integers");
        }
        if (canvas == null) {
            canvas = new Canvas(w, h);
        }
        canvas.render();
    }
}
