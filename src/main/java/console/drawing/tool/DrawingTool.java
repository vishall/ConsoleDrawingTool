package console.drawing.tool;

import console.drawing.canvas.Canvas;
import console.drawing.command.Command;
import console.drawing.command.CreateCommand;

public class DrawingTool {

    private Canvas canvas = Canvas.getInstance();

    public void draw(Command command){
        command.execute(canvas);
    }

    public Canvas getCanvas() {
        return canvas;
    }
}
