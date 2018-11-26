package console.drawing.command;

import console.drawing.canvas.Canvas;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Scanner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RectangleCommandTest {

    RectangleCommand rectangleCommand;

    @Mock
    Canvas canvas;

    @Test
    public void testExecute() {
        String userInput = "1 2 2 3";
        when(canvas.isCanvasDrawn()).thenReturn(true);

        rectangleCommand = new RectangleCommand(new Scanner(userInput));
        rectangleCommand.execute(canvas);
        verify(canvas,times(1)).drawRectangle(1,2,2,3);
    }
}
