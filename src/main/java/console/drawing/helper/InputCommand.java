package console.drawing.helper;

public enum InputCommand
{
    CREATE("C"),
    LINE("L"),
    RECTANGLE("R"),
    FILL("B"),
    QUIT("Q"),
    INVALID("I");

    private final String c;

    InputCommand(String c)
    {
        this.c = c;
    }

    public String getCommandCharacter()
    {
        return c;
    }

}