package console.drawing.main;

import console.drawing.command.Command;
import console.drawing.helper.CommandMapper;
import console.drawing.helper.ConsoleInputCommandArgumentParser;
import console.drawing.helper.InputCommand;
import console.drawing.tool.DrawingTool;

import java.util.Scanner;

public class CanvasDrawing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputCommand inputCommand = InputCommand.INVALID;
        CommandMapper commandMapper = new CommandMapper();
        DrawingTool drawingTool = new DrawingTool();
        do {
            System.out.print("enter command:");
            try {
                inputCommand = ConsoleInputCommandArgumentParser.parse(scanner.next());
                Command command = commandMapper.getCommand(scanner, inputCommand);
                drawingTool.draw(command);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                scanner.nextLine();
            }
        }
        while (inputCommand != InputCommand.QUIT);
        scanner.close();
        System.exit(0);
    }
}
