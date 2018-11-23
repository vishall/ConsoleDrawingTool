package console.drawing.command;

import console.drawing.canvas.Canvas;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RectangleCommandTest {

    RectangleCommand rectangleCommand;

    @Mock
    Canvas canvas;

    @Before
    public void setUp(){
        rectangleCommand = new RectangleCommand();
    }

    @Test
    public void testExecute(){
        rectangleCommand.execute(canvas);
    }
}
