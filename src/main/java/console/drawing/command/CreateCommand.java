package console.drawing.command;

import console.drawing.canvas.Canvas;

public class CreateCommand implements Command {

    private int w;
    private int h;

    public CreateCommand(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public void execute(Canvas canvas) {
        canvas.render();
    }
}
