package console.drawing.helper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsoleInputCommandArgumentParserTest {

    ConsoleInputCommandArgumentParser consoleInputCommandArgumentParser;

    @Before
    public void setUp() {
        consoleInputCommandArgumentParser = new ConsoleInputCommandArgumentParser();
    }

    @Test
    public void parseShouldReturnInputCommandAsCreate() {
        InputCommand inputCommand = consoleInputCommandArgumentParser.parse("C");
        assertEquals(inputCommand, InputCommand.CREATE);
    }

    @Test
    public void parseShouldReturnInputCommandAsLine() {
        InputCommand inputCommand = consoleInputCommandArgumentParser.parse("L");
        assertEquals(inputCommand, InputCommand.LINE);
    }

    @Test
    public void parseShouldReturnInputCommandAsRectangle() {
        InputCommand inputCommand = consoleInputCommandArgumentParser.parse("R");
        assertEquals(inputCommand, InputCommand.RECTANGLE);
    }

    @Test
    public void parseShouldReturnInputCommandAsFill() {
        InputCommand inputCommand = consoleInputCommandArgumentParser.parse("B");
        assertEquals(inputCommand, InputCommand.FILL);
    }

    @Test
    public void parseShouldReturnInputCommandAsQuit() {
        InputCommand inputCommand = consoleInputCommandArgumentParser.parse("Q");
        assertEquals(inputCommand, InputCommand.QUIT);
    }

    @Test
    public void parseShouldReturnInputCommandAsInvalid() {
        InputCommand inputCommand = consoleInputCommandArgumentParser.parse("A");
        assertEquals(inputCommand, InputCommand.INVALID);
    }
}
