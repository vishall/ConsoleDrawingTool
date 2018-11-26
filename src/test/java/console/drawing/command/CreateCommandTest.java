package console.drawing.command;

import console.drawing.canvas.Canvas;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Scanner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CreateCommandTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    CreateCommand createCommand;
    @Mock
    Canvas canvas;

    @Test
    public void testExecute() {
        String userInput = "2 3";
        createCommand = new CreateCommand(new Scanner(userInput));
        createCommand.execute(canvas);
        verify(canvas, times(1)).drawCanvas(2,3);
    }

}
