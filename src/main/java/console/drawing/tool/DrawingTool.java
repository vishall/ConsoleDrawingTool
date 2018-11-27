package console.drawing.tool;

import console.drawing.canvas.Canvas;
import console.drawing.command.Command;
import console.drawing.command.CreateCommand;

public class DrawingTool {

    //canvas object intialized
    private Canvas canvas = Canvas.getInstance();

    //invokes execute command based on implementaion
    public void draw(Command command){
        command.execute(canvas);
    }

    public Canvas getCanvas() {
        return canvas;
    }
}
