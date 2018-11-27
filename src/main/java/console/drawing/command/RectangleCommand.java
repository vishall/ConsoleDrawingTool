package console.drawing.command;

import console.drawing.canvas.Canvas;
import console.drawing.validations.Validations;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class RectangleCommand implements Command {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public RectangleCommand(Scanner scanner) {
        this.x1 = parseInt(scanner.next());
        this.y1 = parseInt(scanner.next());
        this.x2 = parseInt(scanner.next());
        this.y2 = parseInt(scanner.next());
    }

    public void execute(Canvas canvas) {
        Validations.verifyCanvas(canvas);
        Validations.verifyRectangleCoordinates(canvas, x1, y1, x2, y2);
        canvas.drawRectangle(x1, y1, x2, y2);
        canvas.render();
    }
}
