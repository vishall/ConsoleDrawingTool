package console.drawing.validations;

import console.drawing.canvas.Canvas;

public class Validations {

    public static void verifyLineCoordinates(Canvas canvas, int x1, int y1, int x2, int y2){

        //if first point coordinates are greater than second point
        if(x1>x2 || y1>y2)
            throw new IllegalArgumentException("Coordinates of first point of line should be smaller than second point.");

        //if line is diagonal
        if (x1 != x2 && y1 != y2)
            throw new IllegalArgumentException("Line either must be horizontal or vertical.");

        //if line is outside canvas
        if (x1 <= 0 || y1 <= 0 || x2 > canvas.width() || y2 > canvas.height())
            throw new IllegalArgumentException("Line coordinates must be on canvas.");
    }


    public static boolean isValidRectangle(Canvas canvas, int x1, int y1, int x2, int y2){
        //if rectangle coordinates are within canvas
        if (x1 < 0 || y1 < 0 || x2 > canvas.width() || y2 > canvas.height())
            return false;

        return true;
    }

    public static void verifyCanvas(Canvas canvas)
    {
        if (!canvas.isCanvasDrawn())
            throw new IllegalStateException("Canvas must first be created.");
    }

    public static void verifyFillCoordinates(Canvas c,int x, int y){
        //if fill cordinates are within canvas
        if (x <= 0 || y <= 0 || x > c.width()  || y > c.height()){
            throw new IllegalArgumentException("Coordinates to fill must be on canvas");
        }
    }
}
