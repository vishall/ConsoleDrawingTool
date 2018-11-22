package console.drawing.main;

import console.drawing.command.Command;
import console.drawing.helper.CommandMapper;
import console.drawing.helper.CommandParser;
import console.drawing.helper.InputCommand;
import console.drawing.tool.DrawingTool;

import java.util.Scanner;

public class CanvasDrawing {

       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           InputCommand inputCommand;
           CommandMapper commandMapper = new CommandMapper();
           DrawingTool drawingTool = new DrawingTool();
            try {
                while (true){
                    System.out.print("enter command:");
                    inputCommand = CommandParser.parse(scanner.next());
                    if(inputCommand == InputCommand.QUIT){
                        break;
                    }
                    Command command = commandMapper.getCommand(scanner,inputCommand);
                    drawingTool.draw(command);
                }
            } catch (Exception ex) {

            } finally {
                scanner.close();
            }
            System.exit(0);
        }
}
