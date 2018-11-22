package command;

import console.drawing.command.FillCommand;
import org.junit.Before;
import org.junit.Test;

public class FillCommandTest {

    FillCommand fillCommand;

    @Before
    public void setUp(){
        fillCommand = new FillCommand();
    }

    @Test
    public void testExecute(){
        fillCommand.execute();
    }
}
