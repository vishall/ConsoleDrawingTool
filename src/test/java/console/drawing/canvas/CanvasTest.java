package console.drawing.canvas;

import org.junit.Before;
import org.junit.Test;

public class CanvasTest {

    Canvas canvas;

    @Before
    public void setUp(){
        int w = 2;
        int h = 3;
        canvas = new Canvas(w,h);
    }

    @Test
    public void testRenderCanvas(){
        canvas.render();
    }
}
