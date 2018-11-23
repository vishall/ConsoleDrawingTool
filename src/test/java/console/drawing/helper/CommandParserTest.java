package console.drawing.helper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandParserTest {

    CommandParser commandParser;

    @Before
    public void setUp(){
        commandParser = new CommandParser();
    }

    @Test
    public void parseShouldReturnInputCommandAsCreate(){
        InputCommand inputCommand = commandParser.parse("C");
        assertEquals(inputCommand,InputCommand.CREATE);
    }

    @Test
    public void parseShouldReturnInputCommandAsLine(){
        InputCommand inputCommand = commandParser.parse("L");
        assertEquals(inputCommand,InputCommand.LINE);
    }

    @Test
    public void parseShouldReturnInputCommandAsRectangle(){
        InputCommand inputCommand = commandParser.parse("R");
        assertEquals(inputCommand,InputCommand.RECTANGLE);
    }
    @Test
    public void parseShouldReturnInputCommandAsFill(){
        InputCommand inputCommand = commandParser.parse("B");
        assertEquals(inputCommand,InputCommand.FILL);
    }

    @Test
    public void parseShouldReturnInputCommandAsQuit(){
        InputCommand inputCommand = commandParser.parse("Q");
        assertEquals(inputCommand,InputCommand.QUIT);
    }

    @Test
    public void parseShouldReturnInputCommandAsInvalid(){
        InputCommand inputCommand = commandParser.parse("A");
        assertEquals(inputCommand,InputCommand.INVALID);
    }
}
