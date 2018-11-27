package console.drawing.tool;

import console.drawing.canvas.Canvas;
import console.drawing.command.Command;

// Class acts intermediate between command class and receiver Canvas class
public class DrawingTool {

    //canvas object intialized
    private Canvas canvas = Canvas.getInstance();

    //invokes execute command based on command
    public void draw(Command command) {
        command.execute(canvas);
    }

    public Canvas getCanvas() {
        return canvas;
    }
}
