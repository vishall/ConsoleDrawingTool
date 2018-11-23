package console.drawing.helper;

import static console.drawing.helper.InputCommand.INVALID;
import static console.drawing.helper.InputCommand.values;

public class ConsoleInputCommandArgumentParser {

    public static InputCommand parse(String c)
    {
        for (InputCommand command : values()) {
            if (command.getCommandCharacter().equals(c)) {
                return command;
            }
        }
        return INVALID;
    }
}
