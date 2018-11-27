package console.drawing.helper;

// User input command enum
public enum InputCommand
{
    CREATE("C"),
    LINE("L"),
    RECTANGLE("R"),
    FILL("B"),
    QUIT("Q"),
    INVALID("I");

    private final String commandChar;

    InputCommand(String commandChar)
    {
        this.commandChar = commandChar;
    }

    public String getCommandCharacter()
    {
        return commandChar;
    }

}