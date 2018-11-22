package command;

import console.drawing.command.InvalidCommand;
import org.junit.Before;
import org.junit.Test;

public class InvalidCommandTest {

    InvalidCommand invalidCommand;

    @Before
    public void setUp(){
        invalidCommand = new InvalidCommand();
    }

    @Test
    public void testExecute(){
        invalidCommand.execute();
    }
}
