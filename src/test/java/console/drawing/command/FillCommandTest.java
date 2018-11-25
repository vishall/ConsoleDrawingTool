package console.drawing.command;

import console.drawing.canvas.Canvas;
import console.drawing.validations.Validations;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class FillCommandTest {

    FillCommand fillCommand;

    @Mock
    Canvas canvas;

    @Before
    public void setUp() {
        int x = 2;
        int y = 3;
        char color = 'c';
        fillCommand = new FillCommand(x, y, color);
    }

    @Test
    public void testExecute() {
        when(canvas.width()).thenReturn(4);
        when(canvas.height()).thenReturn(4);
        fillCommand.execute(canvas);
        verify(canvas,times(1)).fill(2,3,'c');
        verify(canvas,times(1)).render();
    }
}
