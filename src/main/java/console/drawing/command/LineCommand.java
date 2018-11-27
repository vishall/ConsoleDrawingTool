package console.drawing.command;

import console.drawing.canvas.Canvas;

import java.util.Scanner;

import static console.drawing.validations.Validations.verifyCanvas;
import static console.drawing.validations.Validations.verifyLineCoordinates;
import static java.lang.Integer.parseInt;

public class LineCommand implements Command {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LineCommand(Scanner scanner) {
        this.x1 = parseInt(scanner.next());
        this.y1 = parseInt(scanner.next());
        this.x2 = parseInt(scanner.next());
        this.y2 = parseInt(scanner.next());
    }

    public void execute(Canvas canvas) {
        verifyCanvas(canvas);
        verifyLineCoordinates(canvas, x1, y1, x2, y2);
        canvas.drawLine(x1, y1, x2, y2);
        canvas.render();
    }
}
