package console.drawing.validations;

import console.drawing.canvas.Canvas;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ValidationsTest {

    Canvas canvas;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    @Before
    public void setUp(){
        canvas = Canvas.getInstance();
    }

    @Test
    public void testAVerifyCanvas() {
        canvas.drawCanvas(3,3);
        Validations.verifyCanvas(canvas);
    }

    @Test
    public void testVerifyLineCoordinates() {
        canvas.drawCanvas(3,3);
        Validations.verifyLineCoordinates(canvas,1,2,2,2);
    }

    @Test
    public void testVerifyLineCoordinatesWithLineOutsideCanvas() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Line coordinates must be on canvas.");
        Validations.verifyLineCoordinates(canvas,1,2,4,2);
    }

    @Test
    public void testVerifyLineCoordinatesWithDiagonalLine() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Line either must be horizontal or vertical.");
        Validations.verifyLineCoordinates(canvas,1,1,2,2);
    }

    @Test
    public void testVerifyLineCoordinatesWithIncorrectCordinates() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Coordinates of first point of line should be smaller than second point.");
        Validations.verifyLineCoordinates(canvas,4,2,2,1);
    }

    @Test
    public void testisValidRectangle() {
        canvas.drawCanvas(3,3);
        assertEquals(true, Validations.isValidRectangle(canvas,1,1,2,2));
        assertEquals(false, Validations.isValidRectangle(canvas,-1,1,2,2));
        assertEquals(false, Validations.isValidRectangle(canvas,1,-1,2,2));
        assertEquals(false, Validations.isValidRectangle(canvas,1,1,4,2));
        assertEquals(false, Validations.isValidRectangle(canvas,1,1,2,4));
    }

    @Test
    public void testVerifyFillCoordinates() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Coordinates to fill must be on canvas");
        Validations.verifyFillCoordinates(canvas,0,1);
    }
}