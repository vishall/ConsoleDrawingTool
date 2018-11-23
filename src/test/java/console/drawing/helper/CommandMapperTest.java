package console.drawing.helper;

import console.drawing.command.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Scanner;

import static org.junit.Assert.assertTrue;

public class CommandMapperTest {

    CommandMapper commandMapper;

    @Mock
    Scanner scanner;

    @Before
    public void setUp(){
        commandMapper = new CommandMapper();
    }

    @Test
    public void getCommandShouldReturnLineCommand(){
        InputCommand inputCommand = InputCommand.LINE;
        Command actuaCommand = commandMapper.getCommand(scanner,inputCommand);
        assertTrue(actuaCommand instanceof LineCommand);
    }

    @Test
    public void getCommandShouldReturnCreateCommand(){
        InputCommand inputCommand = InputCommand.CREATE;
        Command actuaCommand = commandMapper.getCommand(scanner,inputCommand);
        assertTrue(actuaCommand instanceof CreateCommand);
    }
    @Test
    public void getCommandShouldReturnRectangleCommand(){
        InputCommand inputCommand = InputCommand.RECTANGLE;
        Command actuaCommand = commandMapper.getCommand(scanner,inputCommand);
        assertTrue(actuaCommand instanceof RectangleCommand);
    }

    @Test
    public void getCommandShouldReturnFillCommand(){
        InputCommand inputCommand = InputCommand.FILL;
        Command actuaCommand = commandMapper.getCommand(scanner,inputCommand);
        assertTrue(actuaCommand instanceof FillCommand);
    }

    @Test
    public void getCommandShouldReturnQuitCommand(){
        InputCommand inputCommand = InputCommand.QUIT;
        Command actuaCommand = commandMapper.getCommand(scanner,inputCommand);
        assertTrue(actuaCommand instanceof QuitCommand);
    }

    @Test
    public void getCommandShouldReturnInvalidCommand(){
        InputCommand inputCommand = InputCommand.INVALID;
        Command actuaCommand = commandMapper.getCommand(scanner,inputCommand);
        assertTrue(actuaCommand instanceof InvalidCommand);
    }
}
