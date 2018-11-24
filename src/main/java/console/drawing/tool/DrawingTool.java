package console.drawing.tool;

import console.drawing.canvas.Canvas;
import console.drawing.command.Command;
import console.drawing.command.CreateCommand;

public class DrawingTool {

    private Canvas canvas;

    public void draw(Command command){

        if(command instanceof CreateCommand) {
            CreateCommand createCommand = (CreateCommand) command;
            canvas = new Canvas(createCommand.getW(), createCommand.getH());
        }

        command.execute(canvas);
    }

    public Canvas getCanvas() {
        return canvas;
    }
}
