package console.drawing.validations;

import console.drawing.canvas.Canvas;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ValidationsTest {

    Canvas canvas;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    @Before
    public void setUp(){
        canvas = new Canvas(3,3);
    }
    @Test
    public void testisValidLine() {
        assertEquals(true, Validations.isValidLine(canvas,1,2,2,2));
        assertEquals(false, Validations.isValidLine(canvas,1,2,3,3));
        assertEquals(false, Validations.isValidLine(canvas,-1,2,3,3));
        assertEquals(false, Validations.isValidLine(canvas,1,-2,3,3));
        assertEquals(false, Validations.isValidLine(canvas,1,2,3,4));
        assertEquals(false, Validations.isValidLine(canvas,1,2,4,3));
    }

    @Test
    public void testVerifyCanvas() {
        canvas = null;
        expectedException.expect(IllegalStateException.class);
        expectedException.expectMessage("Canvas must first be created.");
        Validations.verifyCanvas(canvas);
    }

    @Test
    public void testisValidRectangle() {
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