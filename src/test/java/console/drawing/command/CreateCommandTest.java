package console.drawing.command;

import console.drawing.canvas.Canvas;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
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

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testExecute(){
        createCommand = new CreateCommand(2,3);
        createCommand.execute(canvas);
        verify(canvas,times(1)).render();
    }

    @Test
    public void testExecuteWithIncorrectInput(){
        createCommand = new CreateCommand(-2,3);
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Canvas dimensions must be positive integers");
        createCommand.execute(canvas);
        verify(canvas,times(1)).render();
    }

}
