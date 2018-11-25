package console.drawing.canvas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CanvasTest {

    Canvas canvas;

    @Before
    public void setUp(){
        int w = 3;
        int h = 4;
        canvas = new Canvas(w,h);
    }

    @Test
    public void testRenderCanvas(){
        canvas.render();
    }

    @Test
    public void testDrawLine(){
        canvas.drawLine(1,2,2,2);
        char[][] canvasArray = canvas.getCanvasArray();
        assertEquals(canvasArray[0][1],'x');
        assertEquals(canvasArray[1][1],'x');
    }

    @Test
    public void testDrawRectangle(){
        canvas.drawRectangle(2,1,3,2);
        char[][] canvasArray = canvas.getCanvasArray();
        assertEquals(canvasArray[1][0],'x');
        assertEquals(canvasArray[1][1],'x');
        assertEquals(canvasArray[2][0],'x');
        assertEquals(canvasArray[2][1],'x');
    }

    @Test
    public void testFill(){
        canvas = new Canvas(2,3);
        canvas.drawLine(1,2,2,2);
        canvas.fill(1,1,'c');
        char[][] canvasArray = canvas.getCanvasArray();
        assertEquals(canvasArray[0][0],'c');
        assertEquals(canvasArray[1][0],'c');
    }

}
