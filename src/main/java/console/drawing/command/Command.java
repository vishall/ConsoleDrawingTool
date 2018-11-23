package console.drawing.command;

import console.drawing.canvas.Canvas;

public interface Command {

    public void execute(Canvas canvas);
}
