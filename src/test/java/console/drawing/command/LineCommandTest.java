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

        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 2;
        lineCommand = new LineCommand(x1,y1,x2,y2);
    }

    @Test
    public void testExecute(){
        lineCommand.execute(canvas);
    }
}
