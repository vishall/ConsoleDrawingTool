package console.drawing.canvas;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CanvasTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    Canvas canvas;

    @Before
    public void setUp() {
        canvas = Canvas.getInstance();
    }

    @Test
    public void testIsCanvasDrawnWhenCanvasDrawn() {
        canvas.drawCanvas(3,3);
        assertNotNull(canvas.getCanvasArray());
    }

    @Test
    public void testGetInstance() {
        assertSame(Canvas.getInstance(),Canvas.getInstance());
    }

    @Test
    public void testRenderCanvas() {
        canvas.render();
    }

    @Test
    public void testDrawLine() {
        canvas.drawCanvas(3,4);
        canvas.drawLine(1, 2, 2, 2);
        char[][] canvasArray = canvas.getCanvasArray();
        assertEquals(canvasArray[0][1], 'x');
        assertEquals(canvasArray[1][1], 'x');
    }

    @Test
    public void testDrawRectangle() {
        canvas.drawCanvas(3,4);
        canvas.drawRectangle(2, 1, 3, 2);
        char[][] canvasArray = canvas.getCanvasArray();
        assertEquals(canvasArray[1][0], 'x');
        assertEquals(canvasArray[1][1], 'x');
        assertEquals(canvasArray[2][0], 'x');
        assertEquals(canvasArray[2][1], 'x');
    }

    @Test
    public void testFill() {
        canvas.drawCanvas(2,3);
        canvas.drawLine(1, 2, 2, 2);
        canvas.fill(1, 1, 'c');
        char[][] canvasArray = canvas.getCanvasArray();
        assertEquals(canvasArray[0][0], 'c');
        assertEquals(canvasArray[1][0], 'c');
    }

    @Test
    public void testCanvasCreation() {
        canvas.drawCanvas(1,2);
        char[][] canvasArray = canvas.getCanvasArray();
        assertEquals(canvasArray[0][0], ' ');
        assertEquals(canvasArray[0][1], ' ');
    }

    @Test
    public void testCanvasCreationWithInvalidWidth() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Canvas dimensions must be positive integers.");
        canvas.drawCanvas(-1,2);
    }

    @Test
    public void testCanvasCreationWithInvalidHeight() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Canvas dimensions must be positive integers.");
        canvas.drawCanvas(1,-2);
    }

}
