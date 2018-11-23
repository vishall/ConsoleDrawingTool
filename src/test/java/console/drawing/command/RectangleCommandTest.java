package console.drawing.command;

import org.junit.Before;
import org.junit.Test;

public class RectangleCommandTest {


    RectangleCommand rectangleCommand;

    @Before
    public void setUp(){
        rectangleCommand = new RectangleCommand();
    }

    @Test
    public void testExecute(){
        rectangleCommand.execute();
    }
}
