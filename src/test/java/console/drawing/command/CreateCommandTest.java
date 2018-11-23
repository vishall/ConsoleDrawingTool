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
public class CreateCommandTest {

    CreateCommand createCommand;

    @Mock
    Canvas canvas;

    @Before
    public void setUp(){
        createCommand = new CreateCommand(canvas,2,3);
    }

    @Test
    public void testExecute(){
        createCommand.execute();
        verify(canvas,times(1)).createCanvas();
    }
}
