package console.drawing.helper;

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