package console.drawing.helper;

import console.drawing.command.*;

import java.util.Scanner;

public class CommandMapper {

    public Command getCommand(Scanner scanner, InputCommand inputCommand) {

        Command command = null;
        try {
            switch (inputCommand) {
                case CREATE:
                    command = new CreateCommand(getInt(scanner.next()), getInt(scanner.next()));
                    break;
                case LINE:
                    command = new LineCommand(getInt(scanner.next()), getInt(scanner.next()), getInt(scanner.next()), getInt(scanner.next()));
                    break;
                case RECTANGLE:
                    command = new RectangleCommand(getInt(scanner.next()), getInt(scanner.next()), getInt(scanner.next()), getInt(scanner.next()));
                    break;
                case FILL:
                    command = new FillCommand(getInt(scanner.next()), getInt(scanner.next()), scanner.next().charAt(0));
                    break;
                case QUIT:
                    command = new QuitCommand();
                    break;
                case INVALID:
                    command = new InvalidCommand();
                    break;
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Incorrect input argument provided");
        }
        return command;
    }

    private int getInt(String coordinate) {
        return Integer.parseInt(coordinate);
    }
}
