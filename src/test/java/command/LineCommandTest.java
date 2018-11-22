package command;

import console.drawing.command.LineCommand;
import org.junit.Before;
import org.junit.Test;

public class LineCommandTest {

    LineCommand lineCommand;

    @Before
    public void setUp(){
        lineCommand = new LineCommand();
    }

    @Test
    public void testExecute(){
        lineCommand.execute();
    }
}
