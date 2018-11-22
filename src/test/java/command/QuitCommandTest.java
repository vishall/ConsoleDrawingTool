package command;

import console.drawing.command.QuitCommand;
import org.junit.Before;
import org.junit.Test;

public class QuitCommandTest {

    QuitCommand quitCommand;

    @Before
    public void setUp(){
        quitCommand = new QuitCommand();
    }

    @Test
    public void testExecute(){
        quitCommand.execute();
    }
}
