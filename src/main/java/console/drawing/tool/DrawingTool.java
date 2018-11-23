package console.drawing.tool;

import console.drawing.canvas.Canvas;
import console.drawing.command.Command;

public class DrawingTool {

    private Canvas canvas;

    public void draw(Command command){
        command.execute(canvas);
    }
}
