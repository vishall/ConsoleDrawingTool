package console.drawing.helper;

import console.drawing.command.Command;
import console.drawing.command.CreateCommand;

import java.util.Scanner;

public class CommandMapper {

    public Command getCommand(Scanner scanner, InputCommand inputCommand) {

        Command command =  null;

        switch (inputCommand) {
            case CREATE:
                command = new CreateCommand(scanner.nextInt(),scanner.nextInt());
                break;
            case LINE:
                break;
            case RECTANGLE:
                break;
            case FILL:
                break;
            case QUIT:
                break;
            case INVALID:
                break;
        }
        return command;

    }
}
