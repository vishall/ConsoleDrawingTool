package console.drawing.command;

import console.drawing.canvas.Canvas;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CreateCommand implements Command {

    private int w;
    private int h;

    public CreateCommand(Scanner scanner) {
        this.w = parseInt(scanner.next());
        this.h = parseInt(scanner.next());
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public void execute(Canvas canvas) {
        canvas.drawCanvas(getW(), getH());
    }
}
