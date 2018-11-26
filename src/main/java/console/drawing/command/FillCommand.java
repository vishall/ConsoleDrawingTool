package console.drawing.command;

import console.drawing.canvas.Canvas;
import console.drawing.validations.Validations;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static javax.swing.UIManager.getInt;

public class FillCommand implements Command {

    private int x;
    private int y;
    private char color;

    public FillCommand(Scanner scanner) {
        this.x = parseInt(scanner.next());
        this.y = parseInt(scanner.next());
        this.color = scanner.next().charAt(0);
    }

    public void execute(Canvas canvas) {
        Validations.verifyCanvas(canvas);
        Validations.verifyFillCoordinates(canvas,x,y);
        canvas.fill(x,y,color);
    }
}
