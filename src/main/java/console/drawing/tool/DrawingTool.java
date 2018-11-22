package console.drawing.tool;

import console.drawing.command.Command;

public class DrawingTool {

    public void draw(Command command){
        command.execute();
    }
}
