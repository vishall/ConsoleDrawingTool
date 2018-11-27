package console.drawing.command;

import console.drawing.canvas.Canvas;

public class InvalidCommand implements Command {

    // throw exception for any other command provided other than expected
    public void execute(Canvas canvas) {
        throw new IllegalArgumentException("Please provide valid command(C/L/R/Q) with right number of arguments.");
    }
}