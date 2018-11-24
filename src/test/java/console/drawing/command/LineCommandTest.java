package console.drawing.command;

import console.drawing.canvas.Canvas;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

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
    }

    @Test
    public void testExecute(){
        lineCommand = new LineCommand(1,2,2,2);
        lineCommand.execute(canvas);
        verify(canvas,times(1)).render();
        verify(canvas,times(1)).drawLine(1,2,2,2);
    }
}
