package console.drawing.command;

import console.drawing.canvas.Canvas;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class InvalidCommandTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    InvalidCommand invalidCommand;

    @Mock
    Canvas canvas;

    @Before
    public void setUp() {
        invalidCommand = new InvalidCommand();
    }

    @Test
    public void testExecute() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Please provide valid command(C/L/R/Q) with right number of arguments.");
        invalidCommand.execute(canvas);
    }
}
