package console.drawing.command;

import console.drawing.canvas.Canvas;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class FillCommandTest {

    FillCommand fillCommand;

    @Mock
    Canvas canvas;

    @Before
    public void setUp(){
        fillCommand = new FillCommand();
    }

    @Test
    public void testExecute(){
        fillCommand.execute(canvas);
    }
}
