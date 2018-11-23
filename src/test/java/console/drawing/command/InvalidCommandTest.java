package console.drawing.command;

import console.drawing.canvas.Canvas;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class InvalidCommandTest {

    InvalidCommand invalidCommand;

    @Mock
    Canvas canvas;

    @Before
    public void setUp(){
        invalidCommand = new InvalidCommand();
    }

    @Test
    public void testExecute(){
        invalidCommand.execute(canvas);
    }
}
