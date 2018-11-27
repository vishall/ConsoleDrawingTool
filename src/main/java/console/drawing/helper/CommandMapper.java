package console.drawing.helper;

import console.drawing.command.*;

import java.util.Scanner;

public class CommandMapper {

    // creates actual command object based on given input command
    public Command getCommand(Scanner scanner, InputCommand inputCommand) {

        Command command = null;
        try {
            switch (inputCommand) {
                case CREATE:
                    command = new CreateCommand(scanner);
                    break;
                case LINE:
                    command = new LineCommand(scanner);
                    break;
                case RECTANGLE:
                    command = new RectangleCommand(scanner);
                    break;
                case FILL:
                    command = new FillCommand(scanner);
                    break;
                case QUIT:
                    command = new QuitCommand();
                    break;
                case INVALID:
                    command = new InvalidCommand();
                    break;
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Incorrect input argument provided.");
        }
        return command;
    }

}
