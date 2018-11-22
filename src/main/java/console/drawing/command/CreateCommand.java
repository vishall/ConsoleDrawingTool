package console.drawing.command;

import console.drawing.canvas.Canvas;



public class CreateCommand implements Command{

    private int w;
    private int h;
    private Canvas canvas;

    public CreateCommand(Canvas canvas,int w, int h)
    {
        this.canvas = canvas;
        this.w = w;
        this.h = h;
    }

    public void execute(){
        canvas.createCanvas();
    }
}
