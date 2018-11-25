package console.drawing.validations;

import console.drawing.canvas.Canvas;

public class Validations {

    public static boolean isValidLine(Canvas canvas, int x1, int y1, int x2, int y2){

        // if line is diagonal
        if (x1 != x2 && y1 != y2)
            return false;

        // if line is outside canvas
        if (x1 < 0 || y1 < 0 || x2 > canvas.width() || y2 > canvas.height())
            return false;

        return true;
    }


    public static boolean isValidRectangle(Canvas canvas, int x1, int y1, int x2, int y2){
        if (x1 < 0 || y1 < 0 || x2 > canvas.width() || y2 > canvas.height())
            return false;

        return true;
    }

    public static void verifyCanvas(Canvas canvas)
    {
        if (canvas == null)
            throw new IllegalStateException("Canvas must first be created.");
    }

    public static void verifyFillCoordinates(Canvas c,int x, int y){
        if (x <= 0 || y <= 0 || x > c.width()  || y > c.height()){
            throw new IllegalArgumentException("Coordinates to fill must be on canvas");
        }
    }
}
