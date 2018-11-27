package console.drawing.command;

import console.drawing.canvas.Canvas;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Scanner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class FillCommandTest {

    FillCommand fillCommand;

    @Mock
    Canvas canvas;

    @Test
    public void testExecute() {
        String userInput = "2 3 c";
        new Scanner(userInput);
        when(canvas.isCanvasDrawn()).thenReturn(true);
        when(canvas.width()).thenReturn(4);
        when(canvas.height()).thenReturn(4);

        fillCommand = new FillCommand(new Scanner(userInput));
        fillCommand.execute(canvas);
        verify(canvas,times(1)).fill(2,3,'c');
        verify(canvas,times(1)).render();
    }
}
