package console.drawing.command;

import console.drawing.canvas.Canvas;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LineCommandTest {

    LineCommand lineCommand;

    @Mock
    Canvas canvas;

    @Before
    public void setUp(){
        lineCommand = new LineCommand();
    }

    @Test
    public void testExecute(){
        lineCommand.execute(canvas);
    }
}
