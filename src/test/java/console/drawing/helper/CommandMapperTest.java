package console.drawing.helper;

import console.drawing.command.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Scanner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class CommandMapperTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    private CommandMapper commandMapper;

    @Before
    public void setUp() {
        commandMapper = new CommandMapper();
    }

    @Test
    public void getCommandShouldReturnLineCommand() {
        String userInput = "1 2 3 2";
        InputCommand inputCommand = InputCommand.LINE;
        Command actuaCommand = commandMapper.getCommand(new Scanner(userInput), inputCommand);
        assertTrue(actuaCommand instanceof LineCommand);
    }

    @Test
    public void getCommandShouldReturnCreateCommand() {
        String userInput = "2 3";
        InputCommand inputCommand = InputCommand.CREATE;
        Command actuaCommand = commandMapper.getCommand(new Scanner(userInput), inputCommand);
        assertTrue(actuaCommand instanceof CreateCommand);
    }

    @Test
    public void getCommandShouldReturnRectangleCommand() {
        String userInput = "1 3 4 1";
        InputCommand inputCommand = InputCommand.RECTANGLE;
        Command actuaCommand = commandMapper.getCommand(new Scanner(userInput), inputCommand);
        assertTrue(actuaCommand instanceof RectangleCommand);
    }

    @Test
    public void getCommandShouldReturnFillCommand() {
        String userInput = "2 3 c";
        InputCommand inputCommand = InputCommand.FILL;
        Command actuaCommand = commandMapper.getCommand(new Scanner(userInput), inputCommand);
        assertTrue(actuaCommand instanceof FillCommand);
    }

    @Test
    public void getCommandShouldReturnQuitCommand() {
        String userInput = "";
        InputCommand inputCommand = InputCommand.QUIT;
        Command actuaCommand = commandMapper.getCommand(new Scanner(userInput), inputCommand);
        assertTrue(actuaCommand instanceof QuitCommand);
    }

    @Test
    public void getCommandShouldReturnInvalidCommand() {
        String userInput = "";
        InputCommand inputCommand = InputCommand.INVALID;
        Command actuaCommand = commandMapper.getCommand(new Scanner(userInput), inputCommand);
        assertTrue(actuaCommand instanceof InvalidCommand);
    }

    @Test
    public void getCommandThrowsException() {
        String userInput = "A 3 4 1";
        InputCommand inputCommand = InputCommand.RECTANGLE;
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Incorrect input argument provided");
        commandMapper.getCommand(new Scanner(userInput), inputCommand);
    }
}
